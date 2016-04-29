package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.compare.data.ComparisonResult;
import sk.styk.martin.bakalarka.compare.data.HashCompareResult;
import sk.styk.martin.bakalarka.compare.data.MetadataCompareResult;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Evaluates 2 APKs similarity
 *
 * Created by Martin Styk on 07.01.2016.
 */
public class SimilarityEvaluator {

    private SimilarityThreshold similarityThreshold;
    private SimilarityType basicEvaluateResult;

    /**
     * Evaluates similarity on limited set of attributes
     * @param comparisonResult result of compare of 2 APKS
     * @return type of similarity
     */
    public SimilarityType basicEvaluate(ComparisonResult comparisonResult) {

        if (comparisonResult == null) {
            throw new IllegalArgumentException("comparisonResult is null");
        }

        MetadataCompareResult metadataResult = comparisonResult.getMetadataCompareResult();

        if (metadataResult == null) {
            comparisonResult.setSimilar(SimilarityType.NOT_SIMILAR);
            return SimilarityType.NOT_SIMILAR;
        }

        if (similarityThreshold == null) {
            similarityThreshold = SimilarityThresholdFactory.getInstance(new File("similarity.properties"));
        }

        Boolean fileSize = compareRatios(metadataResult.getFileSizeDifference(), similarityThreshold.getMaxFilesizeRatioDifference());
        Boolean activities = compareRatios(metadataResult.getNumberOfActivitiesDifference(), similarityThreshold.getMaxActivitiesRatioDifference());
        Boolean services = compareRatios(metadataResult.getNumberOfServicesDifference(), similarityThreshold.getMaxServicesRatioDifference());
        Boolean receivers = compareRatios(metadataResult.getNumberOfBroadcastReceiversDifference(), similarityThreshold.getMaxReceiversRatioDifference());
        Boolean providers = compareRatios(metadataResult.getNumberOfContentProvidersDifference(), similarityThreshold.getMaxProvidersRatioDifference());
        Boolean layout = compareRatios(metadataResult.getNumberOfDifferentLayoutsDifference(), similarityThreshold.getMaxDifferentLayoutsRatioDifference());
        Boolean drawable = compareRatios(metadataResult.getNumberOfDifferentDrawablesDifference(), similarityThreshold.getMaxDifferentDrawablesRatioDifference());

        boolean evaluateResult = evaluateBooleans(Arrays.asList(fileSize, activities, services, receivers, providers, layout, drawable), similarityThreshold.getMinBooleanEvaluationThreshold());
        Boolean certificateEvaluate = metadataResult.getCertificateSame();
        Boolean versionEvaluate = metadataResult.getVersionCode() == null ? null : metadataResult.getVersionCode().getSame();

        if (evaluateResult == false) {
            basicEvaluateResult = SimilarityType.NOT_SIMILAR;
        } else if (certificateEvaluate == null && versionEvaluate == null) {
            basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_UNDETERMINED_VERSION;
        } else if (certificateEvaluate == null && Boolean.TRUE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_SAME_VERSION;
        } else if (certificateEvaluate == null && Boolean.FALSE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_DIFFERENT_VERSION;
        } else if (Boolean.TRUE.equals(certificateEvaluate) && versionEvaluate == null) {
            basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_UNDETERMINED_VERSION;
        } else if (Boolean.TRUE.equals(certificateEvaluate) && Boolean.TRUE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_SAME_VERSION;
        } else if (Boolean.TRUE.equals(certificateEvaluate) && Boolean.FALSE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_DIFFERENT_VERSION;
        } else if (Boolean.FALSE.equals(certificateEvaluate) && versionEvaluate == null) {
            basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_UNDETERMINED_VERSION;
        } else if (Boolean.FALSE.equals(certificateEvaluate) && Boolean.TRUE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_SAME_VERSION;
        } else if (Boolean.FALSE.equals(certificateEvaluate) && Boolean.FALSE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_DIFFERENT_VERSION;
        }
        comparisonResult.setSimilar(basicEvaluateResult);
        return basicEvaluateResult;

    }

    /**
     * Evaluates similarity on full set of attributes
     * @param comparisonResult result of compare of 2 APKS
     * @return type of similarity
     */
    public SimilarityType fullEvaluate(ComparisonResult comparisonResult) {

        if (comparisonResult == null) {
            throw new IllegalArgumentException("comparisonResult is null");
        }
        if (basicEvaluateResult != null && basicEvaluateResult.equals(SimilarityType.NOT_SIMILAR)) {
            comparisonResult.setSimilar(SimilarityType.NOT_SIMILAR);
            return SimilarityType.NOT_SIMILAR;
        }

        HashCompareResult hashCompareResult = comparisonResult.getHashCompareResult();

        if (hashCompareResult == null) {
            SimilarityType isSimilar = basicEvaluateResult == null ? basicEvaluate(comparisonResult) : basicEvaluateResult;
            comparisonResult.setSimilar(isSimilar);
            return isSimilar;
        }

        if (similarityThreshold == null) {
            similarityThreshold = new SimilarityThreshold();
        }

        Boolean drawables = compareRatios(hashCompareResult.getJaccardIndexDrawables(), similarityThreshold.getMinIdenticalDrawablesInApkJaccardIndex(), true);
        Boolean layouts = compareRatios(hashCompareResult.getJaccardIndexLayouts(), similarityThreshold.getMinIdenticalLayoutsInApkJaccardIndex(), true);
        Boolean others = compareRatios(hashCompareResult.getJaccardIndexOthers(), similarityThreshold.getMinIdenticalOthersInApkJaccardIndex(), true);
        Boolean all = compareRatios(hashCompareResult.getJaccardIndexAll(), similarityThreshold.getMinIdenticalAllInApkJaccardIndex(), true);

        boolean result = evaluateBooleans(Arrays.asList(drawables, layouts, others, all), 85);//85 means all obtained got to match

        Boolean certificateEvaluate = comparisonResult.getMetadataCompareResult() == null ? null : comparisonResult.getMetadataCompareResult().getCertificateSame();
        Boolean versionEvaluate = null;

        if (comparisonResult.getMetadataCompareResult() != null && comparisonResult.getMetadataCompareResult().getVersionCode() != null) {
            versionEvaluate = comparisonResult.getMetadataCompareResult().getVersionCode().getSame();
        }

        if (result == false) {
            basicEvaluateResult = SimilarityType.NOT_SIMILAR;
        } else if (certificateEvaluate == null && versionEvaluate == null) {
            basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_UNDETERMINED_VERSION;
        } else if (certificateEvaluate == null && Boolean.TRUE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_SAME_VERSION;
        } else if (certificateEvaluate == null && Boolean.FALSE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_UNDETERMINED_CERTIFICATE_DIFFERENT_VERSION;
        } else if (Boolean.TRUE.equals(certificateEvaluate) && versionEvaluate == null) {
            basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_UNDETERMINED_VERSION;
        } else if (Boolean.TRUE.equals(certificateEvaluate) && Boolean.TRUE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_SAME_VERSION;
        } else if (Boolean.TRUE.equals(certificateEvaluate) && Boolean.FALSE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_SAME_CERTIFICATE_DIFFERENT_VERSION;
        } else if (Boolean.FALSE.equals(certificateEvaluate) && versionEvaluate == null) {
            basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_UNDETERMINED_VERSION;
        } else if (Boolean.FALSE.equals(certificateEvaluate) && Boolean.TRUE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_SAME_VERSION;
        } else if (Boolean.FALSE.equals(certificateEvaluate) && Boolean.FALSE.equals(versionEvaluate)) {
            basicEvaluateResult = SimilarityType.SIMILAR_DIFFERENT_CERTIFICATE_DIFFERENT_VERSION;
        }
        comparisonResult.setSimilar(basicEvaluateResult);
        return basicEvaluateResult;
    }

    private Boolean compareRatios(PercentagePair percentagePair, Number threshold) {
        return compareRatios(percentagePair, threshold, false);
    }

    private Boolean compareRatios(PercentagePair percentagePair, Number threshold, boolean isMinCriterium) {
        if (percentagePair == null)
            return null;
        return compareRatios(percentagePair.getPercentage(), threshold, isMinCriterium);
    }

    private Boolean compareRatios(BigDecimal percent, Number threshold, boolean isMinCriterium) {
        if (percent == null)
            return null;

        return isMinCriterium ? threshold.doubleValue() < percent.doubleValue() : percent.doubleValue() < threshold.doubleValue();
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

        return allSize2 > 0 ? (((trueSize * 100) / allSize2) > threshold) : Boolean.valueOf(false);

    }


    public SimilarityThreshold getSimilarityThreshold() {
        return similarityThreshold;
    }

    public void setSimilarityThreshold(SimilarityThreshold similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }
}
