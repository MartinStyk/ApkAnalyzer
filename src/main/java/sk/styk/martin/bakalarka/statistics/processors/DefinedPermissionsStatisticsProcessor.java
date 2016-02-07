package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.DefinedPermissionsStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class DefinedPermissionsStatisticsProcessor extends TopListProcessorBase {
    private static final Logger logger = LoggerFactory.getLogger(DefinedPermissionsStatisticsProcessor.class);
    private List<File> jsons;
    private DefinedPermissionsStatistics permissionsStatistics;


    public DefinedPermissionsStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static DefinedPermissionsStatisticsProcessor ofFiles(List<File> jsons) {
        return new DefinedPermissionsStatisticsProcessor(jsons);
    }

    public DefinedPermissionsStatistics process() {

        permissionsStatistics = new DefinedPermissionsStatistics();
        Map<String, Integer> topProtectionLevel = new HashMap<String, Integer>();
        List<Double> permissionsNumbersList = new ArrayList<Double>();
        List<Double> permissionsNumbersListNonZero = new ArrayList<Double>();
        int manifestFound = 0;

        for (int i = 0; i < jsons.size(); i++) {
            if (i % StatisticsProcessor.PRINT_MESSAGE_INTERVAL == 0) {
                logger.info("Loading json number " + i);
            }

            File f = jsons.get(i);
            ApkData data = JsonUtils.fromJson(f);
            AndroidManifestData manifestData = null;


            if (data != null && data.getAndroidManifest() != null) {

                manifestFound++;
                manifestData = data.getAndroidManifest();

                List<String> permissionsList = manifestData.getPermissions();
                List<String> protectonLevelList = manifestData.getPermissionsProtectionLevel();

                if (permissionsList != null) {
                    int listSize = permissionsList.size();
                    permissionsNumbersList.add(new Double(listSize));
                    if (listSize != 0) {
                        permissionsNumbersListNonZero.add(new Double(listSize));
                    }

                    for (String perm : protectonLevelList) {
                        if (topProtectionLevel.containsKey(perm)) {
                            Integer oldValue = topProtectionLevel.get(perm);
                            topProtectionLevel.put(perm, ++oldValue);
                        } else {
                            topProtectionLevel.put(perm, 1);
                        }
                    }

                }

            }
        }

        permissionsStatistics.setAnalyzedApks(manifestFound);
        setValues(manifestFound, permissionsNumbersList, false);
        setValues(manifestFound, permissionsNumbersListNonZero, true);
        permissionsStatistics.setTopProtectionLevel(getTopValuesMap(topProtectionLevel, permissionsNumbersList.size(), "permissions protection level"));

        return permissionsStatistics;
    }

    private void setValues(int manifestFound, List<Double> permissionsNumbersList, boolean isNonZero) {

        if (permissionsNumbersList == null) {
            throw new NullPointerException("permissionsNumbersList null");
        }

        logger.info("Started processing permissions");

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(permissionsNumbersList.size(), manifestFound), permissionsNumbersList);

        if (isNonZero) {
            permissionsStatistics.setPermissionsNonZero(mathStatistics);
        } else {
            permissionsStatistics.setPermissions(mathStatistics);
        }
        logger.info("Finished processing permissions");
    }

    protected Logger getLogger() {
        return logger;
    }

}
