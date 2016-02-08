package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.InstallLocationStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 18.01.2016.
 */
public class InstallLocationProcessor {
    private static final Logger logger = LoggerFactory.getLogger(InstallLocationProcessor.class);
    private List<File> jsons;
    private InstallLocationStatistics installLocationStatistics;


    public InstallLocationProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static InstallLocationProcessor ofFiles(List<File> jsons) {
        return new InstallLocationProcessor(jsons);
    }

    public InstallLocationStatistics process() {

        installLocationStatistics = new InstallLocationStatistics();
        Map<String, PercentagePair> stats = new HashMap<String, PercentagePair>();

        int installLocationTagFound = 0;
        int manifestFound = 0;
        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f,ApkData.class);

            if (data != null && data.getAndroidManifest() != null) {

                manifestFound++;
                String installLocation = data.getAndroidManifest().getInstallLocation();

                if (installLocation != null) {
                    installLocationTagFound++;
                } else {
                    installLocation = "internalOnly";
                }
                if (stats.containsKey(installLocation)) {
                    PercentagePair percentagePair = stats.get(installLocation);
                    Integer value = percentagePair.getCount().intValue();
                    percentagePair.setCount(++value);
                } else {
                    stats.put(installLocation, new PercentagePair(1, null));
                }
            }
        }
        installLocationStatistics.setAnalyzedApks(manifestFound);
        installLocationStatistics.setInstallLocationTagFoundInApks(installLocationTagFound);
        setInstallLocations(stats, manifestFound);

        return installLocationStatistics;
    }

    private void setInstallLocations(Map<String, PercentagePair> map, Integer wholeData) {

        logger.info("Started processing Install Locations chart");

        if (wholeData == null) {
            throw new IllegalArgumentException("wholeData");
        }
        if (map == null) {
            throw new IllegalArgumentException("topLibraries");
        }

        for (Map.Entry<String, PercentagePair> entry : map.entrySet()) {
            PercentagePair percentagePair = entry.getValue();
            Integer number = percentagePair.getCount().intValue();
            BigDecimal percentage = PercentageHelper.getPercentage(number.doubleValue(), wholeData);

            percentagePair.setPercentage(percentage);
        }
        installLocationStatistics.setInstallLocationTable(SortingHelper.sortByValue(map));

        logger.info("Finished processing Install Locations chart");
    }

}
