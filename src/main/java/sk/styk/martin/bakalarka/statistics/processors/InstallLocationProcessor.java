package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.InstallLocationStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 18.01.2016.
 */
public class InstallLocationProcessor {
    private List<File> jsons;
    private InstallLocationStatistics installLocationStatistics;
    private static final Logger logger = LoggerFactory.getLogger(InstallLocationProcessor.class);


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
        Map<String, Integer> stats = new HashMap<String, Integer>();

        int installLocationTagFound = 0;
        int manifestFound = 0;
        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);

            if (data != null && data.getAndroidManifest() != null) {

                manifestFound++;
                String installLocation = data.getAndroidManifest().getInstallLocation();

                if (installLocation != null) {
                    installLocationTagFound++;
                } else {
                    installLocation = "internalOnly";
                }
                if (stats.containsKey(installLocation)) {
                    Integer value = stats.get(installLocation);
                    stats.put(installLocation, ++value);
                } else {
                    stats.put(installLocation, 1);
                }
            }
        }
        installLocationStatistics.setAnalyzedApks(manifestFound);
        installLocationStatistics.setInstallLocationTagFoundInApks(installLocationTagFound);
        installLocationStatistics.setInstallLocationTable(stats);
        installLocationStatistics.setInstallLocationAutoPercentage(PercentageHelper.getPercentage(stats.get("auto"), manifestFound));
        installLocationStatistics.setInstallLocationInternalOnlyPercentage(PercentageHelper.getPercentage(stats.get("internalOnly"), manifestFound));
        installLocationStatistics.setInstallLocationPreferExternalPercentage(PercentageHelper.getPercentage(stats.get("preferExternal"), manifestFound));

        return installLocationStatistics;
    }

}
