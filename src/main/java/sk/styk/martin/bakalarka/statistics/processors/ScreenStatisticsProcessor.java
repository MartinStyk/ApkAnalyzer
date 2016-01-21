package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.PercentagePair;
import sk.styk.martin.bakalarka.statistics.data.ScreenStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class ScreenStatisticsProcessor {

    private List<File> jsons;
    private ScreenStatistics screenStatistics;
    private static final Logger logger = LoggerFactory.getLogger(ScreenStatisticsProcessor.class);

    private enum Type {
        RESIZEABLE,
        SMALL,
        NORMAL,
        LARGE,
        XLARGE,
        ANY_DENSITY
    }


    public ScreenStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static ScreenStatisticsProcessor ofFiles(List<File> jsons) {
        return new ScreenStatisticsProcessor(jsons);
    }

    public ScreenStatistics process() {

        screenStatistics = new ScreenStatistics();

        Map<String, PercentagePair> resizeableMap = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> smallMap = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> normalMap = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> largeMap = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> xlargeMap = new HashMap<String, PercentagePair>();
        Map<String, PercentagePair> anyDensityMap = new HashMap<String, PercentagePair>();
        int manifestFound = 0;
        int numResizeable = 0;
        int numSmall = 0;
        int numNormal = 0;
        int numLarge = 0;
        int numXlarge = 0;
        int numAnyDensity = 0;

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

                //resizeable
                Boolean resizealbe = manifestData.getSupportsScreensResizeable();

                if (resizealbe != null) {
                    numResizeable++;
                } else {
                    //default value
                    resizealbe = true;
                }
                if (resizeableMap.containsKey(resizealbe.toString())) {
                    PercentagePair percentagePair = resizeableMap.get(resizealbe.toString());
                    Integer oldValue = percentagePair.getCount();
                    percentagePair.setCount(++oldValue);
                } else {
                    resizeableMap.put(resizealbe.toString(), new PercentagePair(1, null));
                }


                //small
                Boolean small = manifestData.getSupportsScreensSmall();

                if (small != null) {
                    numSmall++;
                } else {
                    //default value
                    small = true;
                }
                if (smallMap.containsKey(small.toString())) {
                    PercentagePair percentagePair = smallMap.get(small.toString());
                    Integer oldValue = percentagePair.getCount();
                    percentagePair.setCount(++oldValue);
                } else {
                    smallMap.put(small.toString(), new PercentagePair(1, null));
                }

                //normal
                Boolean normal = manifestData.getSupportsScreensNormal();

                if (normal != null) {
                    numNormal++;
                } else {
                    //default value
                    normal = true;
                }
                if (normalMap.containsKey(normal.toString())) {
                    PercentagePair percentagePair = normalMap.get(normal.toString());
                    Integer oldValue = percentagePair.getCount();
                    percentagePair.setCount(++oldValue);
                } else {
                    normalMap.put(normal.toString(), new PercentagePair(1, null));
                }

                //large
                Boolean large = manifestData.getSupportsScreensLarge();

                if (large != null) {
                    numLarge++;
                } else {
                    //default value
                    large = true;
                }
                if (largeMap.containsKey(large.toString())) {
                    PercentagePair percentagePair = largeMap.get(large.toString());
                    Integer oldValue = percentagePair.getCount();
                    percentagePair.setCount(++oldValue);
                } else {
                    largeMap.put(large.toString(), new PercentagePair(1, null));
                }

                //xlarge
                Boolean xlarge = manifestData.getSupportsScreensXlarge();

                if (xlarge != null) {
                    numXlarge++;
                } else {
                    //default value
                    xlarge = true;
                }
                if (xlargeMap.containsKey(xlarge.toString())) {
                    PercentagePair percentagePair = xlargeMap.get(xlarge.toString());
                    Integer oldValue = percentagePair.getCount();
                    percentagePair.setCount(++oldValue);
                } else {
                    xlargeMap.put(xlarge.toString(), new PercentagePair(1, null));
                }

                //xlarge
                Boolean anyDensity = manifestData.getSupportsScreensAnyDensity();

                if (anyDensity != null) {
                    numAnyDensity++;
                } else {
                    //default value
                    anyDensity = true;
                }
                if (anyDensityMap.containsKey(anyDensity.toString())) {
                    PercentagePair percentagePair = anyDensityMap.get(anyDensity.toString());
                    Integer oldValue = percentagePair.getCount();
                    percentagePair.setCount(++oldValue);
                } else {
                    anyDensityMap.put(anyDensity.toString(), new PercentagePair(1, null));
                }

            }
        }

        screenStatistics.setAnalyzedApks(manifestFound);
        screenStatistics.setSupportsScreensResizeableObtained
                (new PercentagePair(numResizeable, PercentageHelper.getPercentage(numResizeable, manifestFound)));
        screenStatistics.setSupportsScreensSmallObtained
                (new PercentagePair(numSmall, PercentageHelper.getPercentage(numSmall, manifestFound)));
        screenStatistics.setSupportsScreensNormalObtained
                (new PercentagePair(numNormal, PercentageHelper.getPercentage(numNormal, manifestFound)));
        screenStatistics.setSupportsScreensLargeObtained
                (new PercentagePair(numLarge, PercentageHelper.getPercentage(numLarge, manifestFound)));
        screenStatistics.setSupportsScreensXlargeObtained
                (new PercentagePair(numXlarge, PercentageHelper.getPercentage(numXlarge, manifestFound)));
        screenStatistics.setSupportsScreensAnyDensityObtained
                (new PercentagePair(numAnyDensity, PercentageHelper.getPercentage(numAnyDensity, manifestFound)));

        setTop(resizeableMap, manifestFound, Type.RESIZEABLE);
        setTop(smallMap, manifestFound, Type.SMALL);
        setTop(normalMap, manifestFound, Type.NORMAL);
        setTop(largeMap, manifestFound, Type.LARGE);
        setTop(xlargeMap, manifestFound, Type.XLARGE);
        setTop(anyDensityMap, manifestFound, Type.ANY_DENSITY);

        return screenStatistics;
    }

    private void setTop(Map<String, PercentagePair> map, int total, Type type) {

        logger.info("Started processing screen chart for " + type.toString());

        if (map == null) {
            throw new IllegalArgumentException("map");
        }

        for (Map.Entry<String, PercentagePair> entry : map.entrySet()) {
            PercentagePair pair = entry.getValue();
            Integer count = pair.getCount();
            pair.setPercentage(PercentageHelper.getPercentage(count.doubleValue(), total));
        }

        switch (type) {
            case RESIZEABLE:
                screenStatistics.setSupportsScreensResizeable(SortingHelper.sortByValue(map));
                break;
            case SMALL:
                screenStatistics.setSupportsScreensSmall(SortingHelper.sortByValue(map));
                break;
            case NORMAL:
                screenStatistics.setSupportsScreensNormal(SortingHelper.sortByValue(map));
                break;
            case LARGE:
                screenStatistics.setSupportsScreensLarge(SortingHelper.sortByValue(map));
                break;
            case XLARGE:
                screenStatistics.setSupportsScreensXlarge(SortingHelper.sortByValue(map));
                break;
            case ANY_DENSITY:
                screenStatistics.setSupportsScreensAnyDensity(SortingHelper.sortByValue(map));
                break;
        }

        logger.info("Finished processing screen chart for " + type.toString());
    }

}
