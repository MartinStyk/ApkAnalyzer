package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.Pair;
import sk.styk.martin.bakalarka.statistics.data.FeaturesStatistics;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class FeaturesStatisticsProcessor {
    private List<File> jsons;
    private FeaturesStatistics featuresStatistics;
    private static final Logger logger = LoggerFactory.getLogger(FeaturesStatisticsProcessor.class);


    public FeaturesStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static FeaturesStatisticsProcessor ofFiles(List<File> jsons) {
        return new FeaturesStatisticsProcessor(jsons);
    }

    public FeaturesStatistics process() {

        featuresStatistics = new FeaturesStatistics();
        Map<String, Integer> topFeatures = new HashMap<String, Integer>();
        List<Double> featuresNumbersList = new ArrayList<Double>();
        List<Double> featuresNumbersListNonZero = new ArrayList<Double>();
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

                List<String> featuresList = manifestData.getUsesFeature();

                if (featuresList != null) {
                    int listSize = featuresList.size();
                    featuresNumbersList.add(new Double(listSize));
                    if (listSize != 0) {
                        featuresNumbersListNonZero.add(new Double(listSize));
                    }

                    for (String perm : featuresList) {
                        if (topFeatures.containsKey(perm)) {
                            Integer oldValue = topFeatures.get(perm);
                            topFeatures.put(perm, ++oldValue);
                        } else {
                            topFeatures.put(perm, 1);
                        }
                    }

                }

            }
        }


        setValues(manifestFound, featuresNumbersList, false);
        setValues(manifestFound, featuresNumbersListNonZero, true);
        setTopFeatures(topFeatures, featuresNumbersList.size());

        return featuresStatistics;
    }

    private void setValues(int manifestFound, List<Double> featuresNumbersList, boolean isNonZero) {

        if (featuresNumbersList == null) {
            throw new NullPointerException("featuresNumbersList null");
        }

        logger.info("Started processing features");

        double[] array = ConversionHelper.toDoubleArray(featuresNumbersList);

        Double mean = StatUtils.mean(array);
        Double median = StatUtils.percentile(array, 50);
        double[] modus = StatUtils.mode(array);
        Double minimum = StatUtils.min(array);
        Double maximum = StatUtils.max(array);
        Double variance = StatUtils.variance(array);
        Double deviation = Math.sqrt(variance);

        if (!isNonZero) {

            featuresStatistics.setAnalyzedApks(manifestFound);
            featuresStatistics.setNumberOfApksWithFeaturesTagObtained(featuresNumbersList.size());

            featuresStatistics.setFeaturesArithmeticMean(new BigDecimal(mean));
            featuresStatistics.setFeaturesModus(ConversionHelper.toIntegerList(modus));
            featuresStatistics.setFeaturesMedian(median.intValue());
            featuresStatistics.setFeaturesMax(maximum.intValue());
            featuresStatistics.setFeaturesMin(minimum.intValue());
            featuresStatistics.setFeaturesVariance(new BigDecimal(variance));
            featuresStatistics.setFeaturesDeviation(new BigDecimal(deviation));

        } else {
            featuresStatistics.setNumberOfApksWithFeaturesTagObtainedNonZero(featuresNumbersList.size());

            featuresStatistics.setFeaturesArithmeticMeanNonZero(new BigDecimal(mean));
            featuresStatistics.setFeaturesModusNonZero(ConversionHelper.toIntegerList(modus));
            featuresStatistics.setFeaturesMedianNonZero(median.intValue());
            featuresStatistics.setFeaturesMaxNonZero(maximum.intValue());
            featuresStatistics.setFeaturesMinNonZero(minimum.intValue());
            featuresStatistics.setFeaturesVarianceNonZero(new BigDecimal(variance));
            featuresStatistics.setFeaturesDeviationNonZero(new BigDecimal(deviation));
        }
        logger.info("Finished processing features");
    }

    private void setTopFeatures(Map<String, Integer> topFeatures, Integer wholeData) {

        logger.info("Started processing features chart");

        if (wholeData == null) {
            throw new IllegalArgumentException("wholeData");
        }
        if (topFeatures == null) {
            throw new IllegalArgumentException("topFeatures");
        }

        Map<String, Pair<Integer, BigDecimal>> result = new HashMap<String, Pair<Integer, BigDecimal>>();

        for (Map.Entry<String, Integer> entry : topFeatures.entrySet()) {
            String name = entry.getKey();
            Integer number = entry.getValue();
            BigDecimal percentage = PercentageHelper.getPercentage(number.doubleValue(), wholeData);

            Pair<Integer, BigDecimal> percentageEntry = new Pair<Integer, BigDecimal>(number, percentage);

            result.put(name, percentageEntry);
        }
        featuresStatistics.setTopFeatures(SortingHelper.sortByValue(result));

        logger.info("Finished processing features chart");
    }

}
