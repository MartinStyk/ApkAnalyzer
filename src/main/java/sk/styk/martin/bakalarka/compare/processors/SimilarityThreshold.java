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


    private Integer maxFilesizeRatioDifference;
    private Integer maxActivitiesRatioDifference;
    private Integer maxServicesRatioDifference;
    private Integer maxProvidersRatioDifference;
    private Integer maxReceiversRatioDifference;
    private Integer maxDifferentDrawablesRatioDifference;
    private Integer maxDifferentLayoutsRatioDifference;
    private Integer minBooleanEvaluationThreshold;


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
        return maxProvidersRatioDifference== null ? MAX_PROVIDERS_RATIO_DIFFERENCE : maxProvidersRatioDifference;
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
}
