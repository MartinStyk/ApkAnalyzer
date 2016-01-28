package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.analyze.data.CertificateData;
import sk.styk.martin.bakalarka.statistics.data.CertificateStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class CertificateStatisticsProcessor extends TopListProcessorBase {
    private List<File> jsons;
    private CertificateStatistics certificateStatistics;
    private static final Logger logger = LoggerFactory.getLogger(CertificateStatisticsProcessor.class);

    private enum Type {
        VERSION,
        ALGORITHM,
        NUMBER
    }

    public CertificateStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static CertificateStatisticsProcessor ofFiles(List<File> jsons) {
        return new CertificateStatisticsProcessor(jsons);
    }

    public CertificateStatistics process() {

        certificateStatistics = new CertificateStatistics();

        Map<Integer, PercentagePair> numberMap = new HashMap<Integer, PercentagePair>();
        Map<Integer, PercentagePair> versionMap = new HashMap<Integer, PercentagePair>();
        Map<String, PercentagePair> algorithmMap = new HashMap<String, PercentagePair>();

        int certificateFound = 0;
        int appsWithCertificateObtained = 0;
        int versionsObtained = 0;
        int algorithmObtained = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);
            List<CertificateData> certificateData = null;


            if (data != null && data.getCertificateDatas() != null) {

                certificateData = data.getCertificateDatas();

                //sometimes apk contains 0 certificates, its considered as not obtained certificate
                if (certificateData.size() > 0) {
                    appsWithCertificateObtained++;
                } else {
                    continue;
                }

                //number
                Integer num = certificateData.size();
                if (numberMap.containsKey(num)) {
                    PercentagePair percentagePair = numberMap.get(num);
                    Integer oldValue = percentagePair.getCount().intValue();
                    percentagePair.setCount(++oldValue);

                } else {
                    numberMap.put(num, new PercentagePair(1, null));
                }

                for (CertificateData cData : certificateData) {
                    certificateFound++;

                    //version
                    Integer version = cData.getVersion();
                    if (version != null) {
                        versionsObtained++;
                        if (versionMap.containsKey(version)) {
                            PercentagePair percentagePair = versionMap.get(version);
                            Integer oldValue = percentagePair.getCount().intValue();
                            percentagePair.setCount(++oldValue);

                        } else {
                            versionMap.put(version, new PercentagePair(1, null));
                        }
                    }
                    //version
                    String algorithm = cData.getSignAlgorithm();
                    if (algorithm != null && !algorithm.isEmpty()) {
                        algorithmObtained++;
                        if (algorithmMap.containsKey(algorithm)) {
                            PercentagePair percentagePair = algorithmMap.get(algorithm);
                            Integer oldValue = percentagePair.getCount().intValue();
                            percentagePair.setCount(++oldValue);

                        } else {
                            algorithmMap.put(algorithm, new PercentagePair(1, null));
                        }
                    }
                }

            }
        }

        certificateStatistics.setAnalyzedApks(appsWithCertificateObtained);
        certificateStatistics.setSignAlgorithmObtained(new PercentagePair(algorithmObtained, PercentageHelper.getPercentage(algorithmObtained, certificateFound)));
        certificateStatistics.setVersionObtained(new PercentagePair(versionsObtained, PercentageHelper.getPercentage(versionsObtained, certificateFound)));

        certificateStatistics.setNumberOfCertificates(getTopValuesMap(numberMap, appsWithCertificateObtained, Type.NUMBER.toString()));
        certificateStatistics.setVersionMap(getTopValuesMap(versionMap, certificateFound, Type.VERSION.toString()));
        certificateStatistics.setSignAlgorithmMap(getTopValuesMap(algorithmMap, certificateFound, Type.ALGORITHM.toString()));

        return certificateStatistics;
    }

    protected Logger getLogger() {
        return logger;
    }

}
