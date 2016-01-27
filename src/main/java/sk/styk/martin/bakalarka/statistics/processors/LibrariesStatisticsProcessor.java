package sk.styk.martin.bakalarka.statistics.processors;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.utils.files.JsonUtils;
import sk.styk.martin.bakalarka.statistics.data.LibrariesStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;
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
public class LibrariesStatisticsProcessor {
    private List<File> jsons;
    private LibrariesStatistics librariesStatistics;
    private static final Logger logger = LoggerFactory.getLogger(LibrariesStatisticsProcessor.class);


    public LibrariesStatisticsProcessor(List<File> jsons) {
        if (jsons == null || jsons.isEmpty())
            throw new IllegalArgumentException("jsons");

        this.jsons = jsons;
    }

    public static LibrariesStatisticsProcessor ofFiles(List<File> jsons) {
        return new LibrariesStatisticsProcessor(jsons);
    }

    public LibrariesStatistics process() {

        librariesStatistics = new LibrariesStatistics();
        Map<String, Integer> topLibraries = new HashMap<String, Integer>();
        List<Double> librariesNumbersList = new ArrayList<Double>();
        List<Double> librariesNumbersListNonZero = new ArrayList<Double>();
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

                List<String> librariesList = manifestData.getUsesLibrary();

                if (librariesList != null) {
                    int listSize = librariesList.size();
                    librariesNumbersList.add(new Double(listSize));
                    if (listSize != 0) {
                        librariesNumbersListNonZero.add(new Double(listSize));
                    }

                    for (String perm : librariesList) {
                        if (topLibraries.containsKey(perm)) {
                            Integer oldValue = topLibraries.get(perm);
                            topLibraries.put(perm, ++oldValue);
                        } else {
                            topLibraries.put(perm, 1);
                        }
                    }

                }

            }
        }


        setValues(manifestFound, librariesNumbersList, false);
        setValues(manifestFound, librariesNumbersListNonZero, true);
        setTopLibraries(topLibraries, librariesNumbersList.size());

        return librariesStatistics;
    }

    private void setValues(int manifestFound, List<Double> librariesNumbersList, boolean isNonZero) {

        if (librariesNumbersList == null) {
            throw new NullPointerException("librariesNumbersList null");
        }

        logger.info("Started processing libraries");

        double[] array = ConversionHelper.toDoubleArray(librariesNumbersList);

        Double mean = StatUtils.mean(array);
        Double median = StatUtils.percentile(array, 50);
        double[] modus = StatUtils.mode(array);
        Double minimum = StatUtils.min(array);
        Double maximum = StatUtils.max(array);
        Double variance = StatUtils.variance(array);
        Double deviation = Math.sqrt(variance);

        if (!isNonZero) {

            librariesStatistics.setAnalyzedApks(manifestFound);
            librariesStatistics.setNumberOfApksWithLibrariesTagObtained(librariesNumbersList.size());

            librariesStatistics.setLibrariesArithmeticMean(new BigDecimal(mean));
            librariesStatistics.setLibrariesModus(ConversionHelper.toIntegerList(modus));
            librariesStatistics.setLibrariesMedian(median.intValue());
            librariesStatistics.setLibrariesMax(maximum.intValue());
            librariesStatistics.setLibrariesMin(minimum.intValue());
            librariesStatistics.setLibrariesVariance(new BigDecimal(variance));
            librariesStatistics.setLibrariesDeviation(new BigDecimal(deviation));

        } else {
            librariesStatistics.setNumberOfApksWithLibrariesTagObtainedNonZero(librariesNumbersList.size());

            librariesStatistics.setLibrariesArithmeticMeanNonZero(new BigDecimal(mean));
            librariesStatistics.setLibrariesModusNonZero(ConversionHelper.toIntegerList(modus));
            librariesStatistics.setLibrariesMedianNonZero(median.intValue());
            librariesStatistics.setLibrariesMaxNonZero(maximum.intValue());
            librariesStatistics.setLibrariesMinNonZero(minimum.intValue());
            librariesStatistics.setLibrariesVarianceNonZero(new BigDecimal(variance));
            librariesStatistics.setLibrariesDeviationNonZero(new BigDecimal(deviation));
        }
        logger.info("Finished processing libraries");
    }

    private void setTopLibraries(Map<String, Integer> topLibraries, Integer wholeData) {

        logger.info("Started processing libraries chart");

        if (wholeData == null) {
            throw new IllegalArgumentException("wholeData");
        }
        if (topLibraries == null) {
            throw new IllegalArgumentException("topLibraries");
        }

        Map<String, PercentagePair> result = new HashMap<String, PercentagePair>();

        for (Map.Entry<String, Integer> entry : topLibraries.entrySet()) {
            String name = entry.getKey();
            Integer number = entry.getValue();
            BigDecimal percentage = PercentageHelper.getPercentage(number.doubleValue(), wholeData);

            PercentagePair percentageEntry = new PercentagePair(number, percentage);

            result.put(name, percentageEntry);
        }
        librariesStatistics.setTopLibraries(SortingHelper.sortByValue(result));

        logger.info("Finished processing libraries chart");
    }

}


