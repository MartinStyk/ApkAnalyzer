package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.compare.data.ComparisonResult;
import sk.styk.martin.bakalarka.compare.data.MetadataCompareResult;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Martin Styk on 07.01.2016.
 */
public class SimilarityEvaluator {

    private SimilarityThreshold similarityThreshold;

    public void basicEvaluate(ComparisonResult comparisonResult, SimilarityThreshold similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        basicEvaluate(comparisonResult);
    }

    public boolean basicEvaluate(ComparisonResult comparisonResult) {

        if (comparisonResult == null) {
            throw new IllegalArgumentException("comparisonResult is null");
        }

        MetadataCompareResult metadataResult = comparisonResult.getMetadataCompareResult();

        if (metadataResult == null) {
            comparisonResult.setSimilar(false);
            return false;
        }

        if (similarityThreshold == null) {
            similarityThreshold = new SimilarityThreshold();
        }

        Boolean fileSize = compareRatios(metadataResult.getFileSizeDifferencePercentage(), similarityThreshold.getMaxFilesizeRatioDifference());
        Boolean activities = compareRatios(metadataResult.getNumberOfActivitiesDifferencePercentage(), similarityThreshold.getMaxActivitiesRatioDifference());
        Boolean services = compareRatios(metadataResult.getNumberOfServicesDifferencePercentage(), similarityThreshold.getMaxServicesRatioDifference());
        Boolean receivers = compareRatios(metadataResult.getNumberOfBroadcastReceiversDifferencePercentage(), similarityThreshold.getMaxReceiversRatioDifference());
        Boolean providers = compareRatios(metadataResult.getNumberOfContentProvidersDifferencePercentage(), similarityThreshold.getMaxProvidersRatioDifference());
        Boolean layout = compareRatios(metadataResult.getNumberOfDifferentLayoutsDifferencePercentage(), similarityThreshold.getMaxDifferentLayoutsRatioDifference());
        Boolean drawable = compareRatios(metadataResult.getNumberOfDifferentDrawablesDifferencePercentage(), similarityThreshold.getMaxDifferentDrawablesRatioDifference());

        boolean result = evaluateBooleans(Arrays.asList(fileSize, activities, services, receivers, providers, layout, drawable));

        comparisonResult.setSimilar(result);

        return result;

    }

    public void fullEvaluate(ComparisonResult comparisonResult, SimilarityThreshold similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        fullEvaluate(comparisonResult);
    }

    public boolean fullEvaluate(ComparisonResult comparisonResult) {
//TODO
        return basicEvaluate(comparisonResult);

    }


    private Boolean compareRatios(Integer current, Integer threshold) {
        if (current == null)
            return null;
        return current < threshold;
    }

    private Boolean evaluateBooleans(List<Boolean> booleans) {
        int allSize = booleans.size();
        int falseSize = 0;
        int nullSize = 0;
        int trueSize = 0;
        boolean result;
        for (Boolean b : booleans) {
            if (b == null)
                nullSize++;
            else if (!b)
                falseSize++;
            else if (b)
                trueSize++;
        }

        int allSize2 = allSize - nullSize;

        return ((trueSize * 100) / allSize2) > similarityThreshold.getMinBooleanEvaluationThreshold();

    }


    public SimilarityThreshold getSimilarityThreshold() {
        return similarityThreshold;
    }

    public void setSimilarityThreshold(SimilarityThreshold similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }
}
