package sk.styk.martin.bakalarka.compare.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * Creates threshold values for 2 APK to be consider as similar
 * We expect low number of different threshold criteria. Keep them in memory and don`t create new for each pair.
 *
 * Created by Martin Styk on 03.03.2016.
 */
public class SimilarityThresholdFactory {

    private static final Logger logger = LoggerFactory.getLogger(SimilarityThresholdFactory.class);

    private static HashMap<String, SimilarityThreshold> ourInstancesPrepared = new HashMap<String, SimilarityThreshold>();

    static {
        ourInstancesPrepared.put("default", new SimilarityThreshold());
    }

    /**
     * Get similarity threshold criteria for given properties file
     * @param propertiesFile file with values
     * @return
     */
    public static SimilarityThreshold getInstance(File propertiesFile) {
        SimilarityThreshold toReturn = ourInstancesPrepared.get(propertiesFile.getAbsolutePath());
        if (toReturn != null) {
            return toReturn;
        }
        SimilarityThreshold newlyAdded = loadFromProps(propertiesFile);
        if (newlyAdded == null) {
            return ourInstancesPrepared.get("default");
        } else {
            ourInstancesPrepared.put(propertiesFile.getAbsolutePath(), newlyAdded);
            return newlyAdded;
        }
    }

    private SimilarityThresholdFactory() {
    }

    /**
     * Load values from properties file
     * @param propFile file with values
     * @return appropriate instance of SimilarityThreshold
     */
    private static SimilarityThreshold loadFromProps(File propFile) {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(propFile);
            prop.load(input);

            SimilarityThreshold similarityThreshold = new SimilarityThreshold();

            similarityThreshold.setMaxFilesizeRatioDifference(Integer.parseInt(prop.getProperty("maxFilesizeRatioDifference")));
            similarityThreshold.setMaxActivitiesRatioDifference(Integer.parseInt(prop.getProperty("maxActivitiesRatioDifference")));
            similarityThreshold.setMaxServicesRatioDifference(Integer.parseInt(prop.getProperty("maxServicesRatioDifference")));
            similarityThreshold.setMaxProvidersRatioDifference(Integer.parseInt(prop.getProperty("maxProvidersRatioDifference")));
            similarityThreshold.setMaxReceiversRatioDifference(Integer.parseInt(prop.getProperty("maxReceiversRatioDifference")));
            similarityThreshold.setMaxDifferentDrawablesRatioDifference(Integer.parseInt(prop.getProperty("maxDifferentDrawablesRatioDifference")));
            similarityThreshold.setMaxDifferentLayoutsRatioDifference(Integer.parseInt(prop.getProperty("maxDifferentLayoutsRatioDifference")));
            similarityThreshold.setMinBooleanEvaluationThreshold(Integer.parseInt(prop.getProperty("minBooleanEvaluationThreshold")));
            similarityThreshold.setMinIdenticalDrawablesInApkJaccardIndex(Double.parseDouble(prop.getProperty("minIdenticalDrawablesInApkJaccardIndex")));
            similarityThreshold.setMinIdenticalLayoutsInApkJaccardIndex(Double.parseDouble(prop.getProperty("minIdenticalLayoutsInApkJaccardIndex")));
            similarityThreshold.setMinIdenticalOthersInApkJaccardIndex(Double.parseDouble(prop.getProperty("minIdenticalOthersInApkJaccardIndex")));
            similarityThreshold.setMinIdenticalAllInApkJaccardIndex(Double.parseDouble(prop.getProperty("minIdenticalAllInApkJaccardIndex")));

            return similarityThreshold;

        } catch (IOException ex) {
            logger.error("Cannot read properties from file" + propFile + ". Exception :" + ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
