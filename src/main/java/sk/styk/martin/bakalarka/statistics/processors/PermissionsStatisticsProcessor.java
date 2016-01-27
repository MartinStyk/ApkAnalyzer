package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.PermissionsStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class PermissionsStatisticsProcessor {
    private List<File> jsons;
    private PermissionsStatistics permissionsStatistics;
    private static final Logger logger = LoggerFactory.getLogger(PermissionsStatisticsProcessor.class);


    public PermissionsStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static PermissionsStatisticsProcessor ofFiles(List<File> jsons) {
        return new PermissionsStatisticsProcessor(jsons);
    }

    public PermissionsStatistics process() {

        permissionsStatistics = new PermissionsStatistics();
        Map<String, Integer> topPermissions = new HashMap<String, Integer>();
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

                List<String> permissionsList = manifestData.getUsesPermissions();

                if (permissionsList != null) {
                    int listSize = permissionsList.size();
                    permissionsNumbersList.add(new Double(listSize));
                    if (listSize != 0) {
                        permissionsNumbersListNonZero.add(new Double(listSize));
                    }

                    for (String perm : permissionsList) {
                        if (topPermissions.containsKey(perm)) {
                            Integer oldValue = topPermissions.get(perm);
                            topPermissions.put(perm, ++oldValue);
                        } else {
                            topPermissions.put(perm, 1);
                        }
                    }

                }

            }
        }

        permissionsStatistics.setAnalyzedApks(manifestFound);
        setValues(manifestFound, permissionsNumbersList, false);
        setValues(manifestFound, permissionsNumbersListNonZero, true);
        setTopPermissions(topPermissions, permissionsNumbersList.size());

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

    private void setTopPermissions(Map<String, Integer> topPermissions, Integer wholeData) {

        logger.info("Started processing permissions chart");

        if (wholeData == null) {
            throw new IllegalArgumentException("wholeData");
        }
        if (topPermissions == null) {
            throw new IllegalArgumentException("topPermissions");
        }

        Map<String, PercentagePair> result = new HashMap<String, PercentagePair>();

        for (Map.Entry<String, Integer> entry : topPermissions.entrySet()) {
            String name = entry.getKey();
            Integer number = entry.getValue();
            BigDecimal percentage = PercentageHelper.getPercentage(number.doubleValue(), wholeData);

            PercentagePair percentageEntry = new PercentagePair(number, percentage);

            result.put(name, percentageEntry);
        }
        permissionsStatistics.setTopPermissions(SortingHelper.sortByValue(result));

        logger.info("Finished processing permissions chart");
    }

}
