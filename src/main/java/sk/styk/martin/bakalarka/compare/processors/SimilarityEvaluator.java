package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.compare.data.ComparisonResult;
import sk.styk.martin.bakalarka.compare.data.HashCompareResult;
import sk.styk.martin.bakalarka.compare.data.MetadataCompareResult;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Martin Styk on 07.01.2016.
 */
public class SimilarityEvaluator {

    private SimilarityThreshold similarityThreshold;
    private Boolean basicEvaluateResult;

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

        basicEvaluateResult = evaluateBooleans(Arrays.asList(fileSize, activities, services, receivers, providers, layout, drawable),similarityThreshold.getMinBooleanEvaluationThreshold());

        comparisonResult.setSimilar(basicEvaluateResult);

        return basicEvaluateResult;

    }


    public boolean fullEvaluate(ComparisonResult comparisonResult) {

        if (comparisonResult == null) {
            throw new IllegalArgumentException("comparisonResult is null");
        }
        if (basicEvaluateResult != null && basicEvaluateResult == false) {
            return false;
        }
        HashCompareResult compareResult = comparisonResult.getHashCompareResult();

        if (compareResult == null) {
            boolean isSimilar = basicEvaluateResult == null ? basicEvaluate(comparisonResult) : basicEvaluateResult;
            comparisonResult.setSimilar(isSimilar);
            return isSimilar;
        }

        if (similarityThreshold == null) {
            similarityThreshold = new SimilarityThreshold();
        }

        HashCompareResult hashCompareResult = comparisonResult.getHashCompareResult();

        Boolean drawables = compareRatios(hashCompareResult.getIdenticalDrawablesRatio(), similarityThreshold.getMinIdenticalDrawablesInApkRatio(), true);
        Boolean layouts = compareRatios(hashCompareResult.getIdenticalLayoutsRatio(), similarityThreshold.getMinIdenticalLayoutsInApkRatio(), true);
        Boolean others = compareRatios(hashCompareResult.getIdenticalOthersRatio(), similarityThreshold.getMinIdenticalOthersInApkRatio(), true);

        boolean result =  evaluateBooleans(Arrays.asList(drawables, layouts, others),similarityThreshold.getMinBooleanEvaluationThreshold());
        comparisonResult.setSimilar(result);
        return result;
    }

    private Boolean compareRatios(Integer current, Integer threshold) {
        return compareRatios(current, threshold, false);
    }

    private Boolean compareRatios(Integer current, Integer threshold, boolean isMinCriterium) {
        if (current == null)
            return null;
        return isMinCriterium ? threshold < current : current < threshold;
    }

    private Boolean evaluateBooleans(List<Boolean> booleans, int threshold) {
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

        return ((trueSize * 100) / allSize2) > threshold;

    }


    public SimilarityThreshold getSimilarityThreshold() {
        return similarityThreshold;
    }

    public void setSimilarityThreshold(SimilarityThreshold similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }
}
