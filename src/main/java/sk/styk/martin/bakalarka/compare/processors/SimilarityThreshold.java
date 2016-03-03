package sk.styk.martin.bakalarka.compare.processors;

/**
 * Created by Martin Styk on 07.01.2016.
 */
public class SimilarityThreshold {

    private static final int MAX_FILESIZE_RATIO_DIFFERENCE = 50;
    private static final int MAX_ACTIVITIES_RATIO_DIFFERENCE = 50;
    private static final int MAX_SERVICES_RATIO_DIFFERENCE = 50;
    private static final int MAX_PROVIDERS_RATIO_DIFFERENCE = 50;
    private static final int MAX_RECEIVERS_RATIO_DIFFERENCE = 50;
    private static final int MAX_DIFFERENT_DRAWABLES_RATIO_DIFFERENCE = 50;
    private static final int MAX_DIFFERENT_LAYOUTS_RATIO_DIFFERENCE = 50;
    private static final int MIN_BOOLEAN_EVALUATION_THRESHOLD = 50;
    private static final int MIN_IDENTICAL_DRAWABLES_IN_APK_JACCARD_INDEX = 50;
    private static final double MIN_IDENTICAL_LAYOUTS_IN_APK_JACCARD_INDEX = 0.5;
    private static final double MIN_IDENTICAL_OTHERS_IN_APK_JACCARD_INDEX = 50;
    private static final double MIN_IDENTICAL_ALL_IN_APK_JACCARD_INDEX = 50;


    private Integer maxFilesizeRatioDifference;
    private Integer maxActivitiesRatioDifference;
    private Integer maxServicesRatioDifference;
    private Integer maxProvidersRatioDifference;
    private Integer maxReceiversRatioDifference;
    private Integer maxDifferentDrawablesRatioDifference;
    private Integer maxDifferentLayoutsRatioDifference;
    private Integer minBooleanEvaluationThreshold;
    private Double minIdenticalDrawablesInApkJaccardIndex;
    private Double minIdenticalLayoutsInApkJaccardIndex;
    private Double minIdenticalOthersInApkJaccardIndex;
    private Double minIdenticalAllInApkJaccardIndex;


    public Integer getMaxFilesizeRatioDifference() {
        return maxFilesizeRatioDifference == null ? MAX_FILESIZE_RATIO_DIFFERENCE : maxFilesizeRatioDifference;
    }

    public void setMaxFilesizeRatioDifference(Integer maxFilesizeRatioDifference) {
        this.maxFilesizeRatioDifference = maxFilesizeRatioDifference;
    }

    public Integer getMaxActivitiesRatioDifference() {
        return maxActivitiesRatioDifference == null ? MAX_ACTIVITIES_RATIO_DIFFERENCE : maxActivitiesRatioDifference;
    }

    public void setMaxActivitiesRatioDifference(Integer maxActivitiesRatioDifference) {
        this.maxActivitiesRatioDifference = maxActivitiesRatioDifference;
    }

    public Integer getMaxServicesRatioDifference() {
        return maxServicesRatioDifference == null ? MAX_SERVICES_RATIO_DIFFERENCE : maxServicesRatioDifference;
    }

    public void setMaxServicesRatioDifference(Integer maxServicesRatioDifference) {
        this.maxServicesRatioDifference = maxServicesRatioDifference;
    }

    public Integer getMaxProvidersRatioDifference() {
        return maxProvidersRatioDifference == null ? MAX_PROVIDERS_RATIO_DIFFERENCE : maxProvidersRatioDifference;
    }

    public void setMaxProvidersRatioDifference(Integer maxProvidersRatioDifference) {
        this.maxProvidersRatioDifference = maxProvidersRatioDifference;
    }

    public Integer getMaxReceiversRatioDifference() {
        return maxReceiversRatioDifference == null ? MAX_RECEIVERS_RATIO_DIFFERENCE : maxReceiversRatioDifference;
    }

    public void setMaxReceiversRatioDifference(Integer maxReceiversRatioDifference) {
        this.maxReceiversRatioDifference = maxReceiversRatioDifference;
    }

    public Integer getMaxDifferentDrawablesRatioDifference() {
        return maxDifferentDrawablesRatioDifference == null ? MAX_DIFFERENT_DRAWABLES_RATIO_DIFFERENCE : maxDifferentDrawablesRatioDifference;
    }

    public void setMaxDifferentDrawablesRatioDifference(Integer maxDifferentDrawablesRatioDifference) {
        this.maxDifferentDrawablesRatioDifference = maxDifferentDrawablesRatioDifference;
    }

    public Integer getMaxDifferentLayoutsRatioDifference() {
        return maxDifferentLayoutsRatioDifference == null ? MAX_DIFFERENT_LAYOUTS_RATIO_DIFFERENCE : maxDifferentLayoutsRatioDifference;
    }

    public void setMaxDifferentLayoutsRatioDifference(Integer maxDifferentLayoutsRatioDifference) {
        this.maxDifferentLayoutsRatioDifference = maxDifferentLayoutsRatioDifference;
    }

    public Integer getMinBooleanEvaluationThreshold() {
        return minBooleanEvaluationThreshold == null ? MIN_BOOLEAN_EVALUATION_THRESHOLD : minBooleanEvaluationThreshold;
    }

    public void setMinBooleanEvaluationThreshold(Integer maxBooleanEvaluationThreshold) {
        this.minBooleanEvaluationThreshold = maxBooleanEvaluationThreshold;
    }

    public Double getMinIdenticalDrawablesInApkJaccardIndex() {
        return minIdenticalDrawablesInApkJaccardIndex == null ? MIN_IDENTICAL_DRAWABLES_IN_APK_JACCARD_INDEX : minIdenticalDrawablesInApkJaccardIndex;
    }

    public void setMinIdenticalDrawablesInApkJaccardIndex(Double minIdenticalDrawablesInApkJaccardIndex) {
        this.minIdenticalDrawablesInApkJaccardIndex = minIdenticalDrawablesInApkJaccardIndex;
    }

    public Double getMinIdenticalLayoutsInApkJaccardIndex() {
        return minIdenticalLayoutsInApkJaccardIndex == null ? MIN_IDENTICAL_LAYOUTS_IN_APK_JACCARD_INDEX : minIdenticalLayoutsInApkJaccardIndex;
    }

    public void setMinIdenticalLayoutsInApkJaccardIndex(Double minIdenticalLayoutsInApkJaccardIndex) {
        this.minIdenticalLayoutsInApkJaccardIndex = minIdenticalLayoutsInApkJaccardIndex;
    }

    public Double getMinIdenticalOthersInApkJaccardIndex() {
        return minIdenticalOthersInApkJaccardIndex == null ? MIN_IDENTICAL_OTHERS_IN_APK_JACCARD_INDEX : minIdenticalOthersInApkJaccardIndex;
    }

    public void setMinIdenticalOthersInApkJaccardIndex(Double minIdenticalOthersInApkJaccardIndex) {
        this.minIdenticalOthersInApkJaccardIndex = minIdenticalOthersInApkJaccardIndex;
    }

    public Double getMinIdenticalAllInApkJaccardIndex() {
        return minIdenticalAllInApkJaccardIndex == null ? MIN_IDENTICAL_ALL_IN_APK_JACCARD_INDEX : minIdenticalAllInApkJaccardIndex;
    }

    public void setMinIdenticalAllInApkJaccardIndex(Double minIdenticalAllInApkJaccardIndex) {
        this.minIdenticalAllInApkJaccardIndex = minIdenticalAllInApkJaccardIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimilarityThreshold that = (SimilarityThreshold) o;

        if (maxFilesizeRatioDifference != null ? !maxFilesizeRatioDifference.equals(that.maxFilesizeRatioDifference) : that.maxFilesizeRatioDifference != null)
            return false;
        if (maxActivitiesRatioDifference != null ? !maxActivitiesRatioDifference.equals(that.maxActivitiesRatioDifference) : that.maxActivitiesRatioDifference != null)
            return false;
        if (maxServicesRatioDifference != null ? !maxServicesRatioDifference.equals(that.maxServicesRatioDifference) : that.maxServicesRatioDifference != null)
            return false;
        if (maxProvidersRatioDifference != null ? !maxProvidersRatioDifference.equals(that.maxProvidersRatioDifference) : that.maxProvidersRatioDifference != null)
            return false;
        if (maxReceiversRatioDifference != null ? !maxReceiversRatioDifference.equals(that.maxReceiversRatioDifference) : that.maxReceiversRatioDifference != null)
            return false;
        if (maxDifferentDrawablesRatioDifference != null ? !maxDifferentDrawablesRatioDifference.equals(that.maxDifferentDrawablesRatioDifference) : that.maxDifferentDrawablesRatioDifference != null)
            return false;
        if (maxDifferentLayoutsRatioDifference != null ? !maxDifferentLayoutsRatioDifference.equals(that.maxDifferentLayoutsRatioDifference) : that.maxDifferentLayoutsRatioDifference != null)
            return false;
        if (minBooleanEvaluationThreshold != null ? !minBooleanEvaluationThreshold.equals(that.minBooleanEvaluationThreshold) : that.minBooleanEvaluationThreshold != null)
            return false;
        if (minIdenticalDrawablesInApkJaccardIndex != null ? !minIdenticalDrawablesInApkJaccardIndex.equals(that.minIdenticalDrawablesInApkJaccardIndex) : that.minIdenticalDrawablesInApkJaccardIndex != null)
            return false;
        if (minIdenticalLayoutsInApkJaccardIndex != null ? !minIdenticalLayoutsInApkJaccardIndex.equals(that.minIdenticalLayoutsInApkJaccardIndex) : that.minIdenticalLayoutsInApkJaccardIndex != null)
            return false;
        if (minIdenticalOthersInApkJaccardIndex != null ? !minIdenticalOthersInApkJaccardIndex.equals(that.minIdenticalOthersInApkJaccardIndex) : that.minIdenticalOthersInApkJaccardIndex != null)
            return false;
        return !(minIdenticalAllInApkJaccardIndex != null ? !minIdenticalAllInApkJaccardIndex.equals(that.minIdenticalAllInApkJaccardIndex) : that.minIdenticalAllInApkJaccardIndex != null);

    }

    @Override
    public int hashCode() {
        int result = maxFilesizeRatioDifference != null ? maxFilesizeRatioDifference.hashCode() : 0;
        result = 31 * result + (maxActivitiesRatioDifference != null ? maxActivitiesRatioDifference.hashCode() : 0);
        result = 31 * result + (maxServicesRatioDifference != null ? maxServicesRatioDifference.hashCode() : 0);
        result = 31 * result + (maxProvidersRatioDifference != null ? maxProvidersRatioDifference.hashCode() : 0);
        result = 31 * result + (maxReceiversRatioDifference != null ? maxReceiversRatioDifference.hashCode() : 0);
        result = 31 * result + (maxDifferentDrawablesRatioDifference != null ? maxDifferentDrawablesRatioDifference.hashCode() : 0);
        result = 31 * result + (maxDifferentLayoutsRatioDifference != null ? maxDifferentLayoutsRatioDifference.hashCode() : 0);
        result = 31 * result + (minBooleanEvaluationThreshold != null ? minBooleanEvaluationThreshold.hashCode() : 0);
        result = 31 * result + (minIdenticalDrawablesInApkJaccardIndex != null ? minIdenticalDrawablesInApkJaccardIndex.hashCode() : 0);
        result = 31 * result + (minIdenticalLayoutsInApkJaccardIndex != null ? minIdenticalLayoutsInApkJaccardIndex.hashCode() : 0);
        result = 31 * result + (minIdenticalOthersInApkJaccardIndex != null ? minIdenticalOthersInApkJaccardIndex.hashCode() : 0);
        result = 31 * result + (minIdenticalAllInApkJaccardIndex != null ? minIdenticalAllInApkJaccardIndex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SimilarityThreshold{" +
                "maxFilesizeRatioDifference=" + maxFilesizeRatioDifference +
                ", maxActivitiesRatioDifference=" + maxActivitiesRatioDifference +
                ", maxServicesRatioDifference=" + maxServicesRatioDifference +
                ", maxProvidersRatioDifference=" + maxProvidersRatioDifference +
                ", maxReceiversRatioDifference=" + maxReceiversRatioDifference +
                ", maxDifferentDrawablesRatioDifference=" + maxDifferentDrawablesRatioDifference +
                ", maxDifferentLayoutsRatioDifference=" + maxDifferentLayoutsRatioDifference +
                ", minBooleanEvaluationThreshold=" + minBooleanEvaluationThreshold +
                ", minIdenticalDrawablesInApkJaccardIndex=" + minIdenticalDrawablesInApkJaccardIndex +
                ", minIdenticalLayoutsInApkJaccardIndex=" + minIdenticalLayoutsInApkJaccardIndex +
                ", minIdenticalOthersInApkJaccardIndex=" + minIdenticalOthersInApkJaccardIndex +
                ", minIdenticalAllInApkJaccardIndex=" + minIdenticalAllInApkJaccardIndex +
                '}';
    }
}
