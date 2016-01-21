package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.PercentagePair;
import sk.styk.martin.bakalarka.statistics.data.SdkStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class SdkStatisticsProcessor {
    private List<File> jsons;
    private SdkStatistics sdkStatistics;
    private static final Logger logger = LoggerFactory.getLogger(SdkStatisticsProcessor.class);

    private enum Type {
        MIN,
        MAX,
        TARGET
    }


    public SdkStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static SdkStatisticsProcessor ofFiles(List<File> jsons) {
        return new SdkStatisticsProcessor(jsons);
    }

    public SdkStatistics process() {

        sdkStatistics = new SdkStatistics();

        Map<String, PercentagePair> topMinSdk = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> topTargetSdk = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> topMaxSdk = new HashMap<String, PercentagePair>();
        int manifestFound = 0;
        int usesSdkFound = 0;

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

                boolean usesSdkTagFound = false;

                //min Sdk
                String minSkd = manifestData.getUsesMinSdkVersion();

                if (minSkd != null && !minSkd.isEmpty()) {

                    usesSdkTagFound = true;

                    if (topMinSdk.containsKey(minSkd)) {
                        PercentagePair percentagePair = topMinSdk.get(minSkd);
                        Integer oldValue = percentagePair.getCount();
                        percentagePair.setCount(++oldValue);

                    } else {
                        topMinSdk.put(minSkd, new PercentagePair(1, null));
                    }
                }


                //target Sdk
                String targetSkd = manifestData.getUsesTargetSdkVersion();

                if (targetSkd != null && !targetSkd.isEmpty()) {

                    usesSdkTagFound = true;

                    if (topTargetSdk.containsKey(targetSkd)) {
                        PercentagePair percentagePair = topTargetSdk.get(targetSkd);
                        Integer oldValue = percentagePair.getCount();
                        percentagePair.setCount(++oldValue);

                    } else {
                        topTargetSdk.put(targetSkd, new PercentagePair(1, null));
                    }
                }


                //max Sdk
                String maxSdk = manifestData.getUsesMaxSdkVersion();

                if (maxSdk != null && !maxSdk.isEmpty()) {

                    usesSdkTagFound = true;


                    if (topMaxSdk.containsKey(maxSdk)) {
                        PercentagePair percentagePair = topMaxSdk.get(maxSdk);
                        Integer oldValue = percentagePair.getCount();
                        percentagePair.setCount(++oldValue);

                    } else {
                        topMaxSdk.put(maxSdk, new PercentagePair(1, null));
                    }
                }

                //number of apks with uses sdk tag
                if (usesSdkTagFound) {
                    usesSdkFound++;
                }
            }
        }

        sdkStatistics.setAnalyzedApks(manifestFound);
        sdkStatistics.setApksWithGeneralUsesSdkTagObtained(new PercentagePair(usesSdkFound, PercentageHelper.getPercentage(usesSdkFound, manifestFound)));
        sdkStatistics.setApksWithMinSdkTagObtained(new PercentagePair(topMinSdk.size(), PercentageHelper.getPercentage(topMinSdk.size(), manifestFound)));
        sdkStatistics.setApksWithMaxSdkTagObtained(new PercentagePair(topMaxSdk.size(), PercentageHelper.getPercentage(topMaxSdk.size(), manifestFound)));
        sdkStatistics.setApksWithTargetSdkTagObtained(new PercentagePair(topTargetSdk.size(), PercentageHelper.getPercentage(topTargetSdk.size(), manifestFound)));

        setTop(topMinSdk, Type.MIN);
        setTop(topTargetSdk, Type.TARGET);
        setTop(topMaxSdk, Type.MAX);

        return sdkStatistics;
    }

    private void setTop(Map<String, PercentagePair> topSdk, Type type) {

        logger.info("Started processing chart for " + type.toString());

        if (topSdk == null) {
            throw new IllegalArgumentException("topSdk");
        }

        for (Map.Entry<String, PercentagePair> entry : topSdk.entrySet()) {
            PercentagePair pair = entry.getValue();
            Integer count = pair.getCount();
            pair.setPercentage(PercentageHelper.getPercentage(count.doubleValue(), topSdk.size()));
        }

        switch (type) {
            case MAX:
                sdkStatistics.setTopMaxSdk(SortingHelper.sortByValue(topSdk));
                break;
            case TARGET:
                sdkStatistics.setTopTargetSdk(SortingHelper.sortByValue(topSdk));
                break;
            case MIN:
                sdkStatistics.setTopMinSdk(SortingHelper.sortByValue(topSdk));
                break;
        }

        logger.info("Finished processing chart for " + type.toString());
    }

}
