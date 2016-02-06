package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.PermissionsStatistics;
import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
import sk.styk.martin.bakalarka.utils.data.RecordPair;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class PermissionsStatisticsProcessor extends TopListProcessorBase {
    private static final Logger logger = LoggerFactory.getLogger(PermissionsStatisticsProcessor.class);
    private List<File> jsons;
    private PermissionsStatistics permissionsStatistics;


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

        requestMaxValues("perms");
        RecordPair permsRecordPair = null;

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
                    Integer listSize = permissionsList.size();
                    permissionsNumbersList.add(new Double(listSize));
                    if (listSize != 0) {
                        permissionsNumbersListNonZero.add(new Double(listSize));
                    }
                    permsRecordPair = processMaxExtreme("perms", listSize.longValue(), data.getFileName());

                    for (String perm : permissionsList) {
                        String low = perm.toLowerCase();
                        if (topPermissions.containsKey(low)) {
                            Integer oldValue = topPermissions.get(low);
                            topPermissions.put(low, ++oldValue);
                        } else {
                            topPermissions.put(low, 1);
                        }
                    }

                }

            }
        }

        permissionsStatistics.setAnalyzedApks(manifestFound);
        setValues(manifestFound, permissionsNumbersList, false, permsRecordPair);
        setValues(manifestFound, permissionsNumbersListNonZero, true, permsRecordPair);
        permissionsStatistics.setTopPermissions(getTopValuesMapInteger(topPermissions, permissionsNumbersList.size(), "permissions"));

        return permissionsStatistics;
    }

    private void setValues(int manifestFound, List<Double> permissionsNumbersList, boolean isNonZero, RecordPair max) {

        if (permissionsNumbersList == null) {
            throw new NullPointerException("permissionsNumbersList null");
        }

        logger.info("Started processing permissions");

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(permissionsNumbersList.size(), manifestFound), permissionsNumbersList, null, max);

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
