package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.analyze.data.AndroidManifestData;
import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.statistics.data.FeaturesStatistics;
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
public class FeaturesStatisticsProcessor extends TopListProcessorBase {
    private static final Logger logger = LoggerFactory.getLogger(FeaturesStatisticsProcessor.class);
    private List<File> jsons;
    private FeaturesStatistics featuresStatistics;


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

        requestMaxValues("features");
        RecordPair recordPair = null;

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

                    recordPair = processMaxExtreme("features", listSize, data.getFileName());

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


        featuresStatistics.setAnalyzedApks(manifestFound);
        setValues(manifestFound, featuresNumbersList, false, recordPair);
        setValues(manifestFound, featuresNumbersListNonZero, true, recordPair);
        featuresStatistics.setTopFeatures(getTopValuesMapInteger(topFeatures, featuresNumbersList.size(), "features"));

        return featuresStatistics;
    }

    private void setValues(int manifestFound, List<Double> featuresNumbersList, boolean isNonZero, RecordPair maxRecordPair) {

        if (featuresNumbersList == null) {
            throw new NullPointerException("featuresNumbersList null");
        }

        logger.info("Started processing features");

        MathStatistics mathStatistics = new MathStatistics(new PercentagePair(featuresNumbersList.size(), manifestFound), featuresNumbersList, null, maxRecordPair);

        if (isNonZero) {
            featuresStatistics.setFeaturesNonZero(mathStatistics);
        } else {
            featuresStatistics.setFeatures(mathStatistics);
        }

        logger.info("Finished processing features");
    }

    protected Logger getLogger() {
        return logger;
    }

}
