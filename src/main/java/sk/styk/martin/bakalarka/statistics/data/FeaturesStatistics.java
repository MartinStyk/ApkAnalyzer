package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FeaturesStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;
    /**
     * number of apks with features tag found in manifest
     */

    //features
    private Integer numberOfApksWithFeaturesTagObtained;
    private BigDecimal featuresArithmeticMean;
    private List<Integer> featuresModus;
    private Integer featuresMedian;
    private Integer featuresMax;
    private Integer featuresMin;
    private BigDecimal featuresVariance;
    private BigDecimal featuresDeviation;

    private Integer numberOfApksWithFeaturesTagObtainedNonZero;
    private BigDecimal featuresArithmeticMeanNonZero;
    private List<Integer> featuresModusNonZero;
    private Integer featuresMedianNonZero;
    private Integer featuresMaxNonZero;
    private Integer featuresMinNonZero;
    private BigDecimal featuresVarianceNonZero;
    private BigDecimal featuresDeviationNonZero;

    private Map<String, PercentagePair> topFeatures;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public Integer getNumberOfApksWithFeaturesTagObtained() {
        return numberOfApksWithFeaturesTagObtained;
    }

    public void setNumberOfApksWithFeaturesTagObtained(Integer numberOfApksWithFeaturesTagObtained) {
        this.numberOfApksWithFeaturesTagObtained = numberOfApksWithFeaturesTagObtained;
    }

    public BigDecimal getFeaturesArithmeticMean() {
        return featuresArithmeticMean;
    }

    public void setFeaturesArithmeticMean(BigDecimal featuresArithmeticMean) {
        this.featuresArithmeticMean = featuresArithmeticMean;
    }

    public List<Integer> getFeaturesModus() {
        return featuresModus;
    }

    public void setFeaturesModus(List<Integer> featuresModus) {
        this.featuresModus = featuresModus;
    }

    public Integer getFeaturesMedian() {
        return featuresMedian;
    }

    public void setFeaturesMedian(Integer featuresMedian) {
        this.featuresMedian = featuresMedian;
    }

    public Integer getFeaturesMax() {
        return featuresMax;
    }

    public void setFeaturesMax(Integer featuresMax) {
        this.featuresMax = featuresMax;
    }

    public Integer getFeaturesMin() {
        return featuresMin;
    }

    public void setFeaturesMin(Integer featuresMin) {
        this.featuresMin = featuresMin;
    }

    public BigDecimal getFeaturesVariance() {
        return featuresVariance;
    }

    public void setFeaturesVariance(BigDecimal featuresVariance) {
        this.featuresVariance = featuresVariance;
    }

    public BigDecimal getFeaturesDeviation() {
        return featuresDeviation;
    }

    public void setFeaturesDeviation(BigDecimal featuresDeviation) {
        this.featuresDeviation = featuresDeviation;
    }

    public Integer getNumberOfApksWithFeaturesTagObtainedNonZero() {
        return numberOfApksWithFeaturesTagObtainedNonZero;
    }

    public void setNumberOfApksWithFeaturesTagObtainedNonZero(Integer numberOfApksWithFeaturesTagObtainedNonZero) {
        this.numberOfApksWithFeaturesTagObtainedNonZero = numberOfApksWithFeaturesTagObtainedNonZero;
    }

    public BigDecimal getFeaturesArithmeticMeanNonZero() {
        return featuresArithmeticMeanNonZero;
    }

    public void setFeaturesArithmeticMeanNonZero(BigDecimal featuresArithmeticMeanNonZero) {
        this.featuresArithmeticMeanNonZero = featuresArithmeticMeanNonZero;
    }

    public List<Integer> getFeaturesModusNonZero() {
        return featuresModusNonZero;
    }

    public void setFeaturesModusNonZero(List<Integer> featuresModusNonZero) {
        this.featuresModusNonZero = featuresModusNonZero;
    }

    public Integer getFeaturesMedianNonZero() {
        return featuresMedianNonZero;
    }

    public void setFeaturesMedianNonZero(Integer featuresMedianNonZero) {
        this.featuresMedianNonZero = featuresMedianNonZero;
    }

    public Integer getFeaturesMaxNonZero() {
        return featuresMaxNonZero;
    }

    public void setFeaturesMaxNonZero(Integer featuresMaxNonZero) {
        this.featuresMaxNonZero = featuresMaxNonZero;
    }

    public Integer getFeaturesMinNonZero() {
        return featuresMinNonZero;
    }

    public void setFeaturesMinNonZero(Integer featuresMinNonZero) {
        this.featuresMinNonZero = featuresMinNonZero;
    }

    public BigDecimal getFeaturesVarianceNonZero() {
        return featuresVarianceNonZero;
    }

    public void setFeaturesVarianceNonZero(BigDecimal featuresVarianceNonZero) {
        this.featuresVarianceNonZero = featuresVarianceNonZero;
    }

    public BigDecimal getFeaturesDeviationNonZero() {
        return featuresDeviationNonZero;
    }

    public void setFeaturesDeviationNonZero(BigDecimal featuresDeviationNonZero) {
        this.featuresDeviationNonZero = featuresDeviationNonZero;
    }

    public Map<String, PercentagePair> getTopFeatures() {
        return topFeatures;
    }

    public void setTopFeatures(Map<String, PercentagePair> topFeatures) {
        this.topFeatures = topFeatures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeaturesStatistics that = (FeaturesStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (numberOfApksWithFeaturesTagObtained != null ? !numberOfApksWithFeaturesTagObtained.equals(that.numberOfApksWithFeaturesTagObtained) : that.numberOfApksWithFeaturesTagObtained != null)
            return false;
        if (featuresArithmeticMean != null ? !featuresArithmeticMean.equals(that.featuresArithmeticMean) : that.featuresArithmeticMean != null)
            return false;
        if (featuresModus != null ? !featuresModus.equals(that.featuresModus) : that.featuresModus != null)
            return false;
        if (featuresMedian != null ? !featuresMedian.equals(that.featuresMedian) : that.featuresMedian != null)
            return false;
        if (featuresMax != null ? !featuresMax.equals(that.featuresMax) : that.featuresMax != null) return false;
        if (featuresMin != null ? !featuresMin.equals(that.featuresMin) : that.featuresMin != null) return false;
        if (featuresVariance != null ? !featuresVariance.equals(that.featuresVariance) : that.featuresVariance != null)
            return false;
        if (featuresDeviation != null ? !featuresDeviation.equals(that.featuresDeviation) : that.featuresDeviation != null)
            return false;
        if (numberOfApksWithFeaturesTagObtainedNonZero != null ? !numberOfApksWithFeaturesTagObtainedNonZero.equals(that.numberOfApksWithFeaturesTagObtainedNonZero) : that.numberOfApksWithFeaturesTagObtainedNonZero != null)
            return false;
        if (featuresArithmeticMeanNonZero != null ? !featuresArithmeticMeanNonZero.equals(that.featuresArithmeticMeanNonZero) : that.featuresArithmeticMeanNonZero != null)
            return false;
        if (featuresModusNonZero != null ? !featuresModusNonZero.equals(that.featuresModusNonZero) : that.featuresModusNonZero != null)
            return false;
        if (featuresMedianNonZero != null ? !featuresMedianNonZero.equals(that.featuresMedianNonZero) : that.featuresMedianNonZero != null)
            return false;
        if (featuresMaxNonZero != null ? !featuresMaxNonZero.equals(that.featuresMaxNonZero) : that.featuresMaxNonZero != null)
            return false;
        if (featuresMinNonZero != null ? !featuresMinNonZero.equals(that.featuresMinNonZero) : that.featuresMinNonZero != null)
            return false;
        if (featuresVarianceNonZero != null ? !featuresVarianceNonZero.equals(that.featuresVarianceNonZero) : that.featuresVarianceNonZero != null)
            return false;
        if (featuresDeviationNonZero != null ? !featuresDeviationNonZero.equals(that.featuresDeviationNonZero) : that.featuresDeviationNonZero != null)
            return false;
        return !(topFeatures != null ? !topFeatures.equals(that.topFeatures) : that.topFeatures != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (numberOfApksWithFeaturesTagObtained != null ? numberOfApksWithFeaturesTagObtained.hashCode() : 0);
        result = 31 * result + (featuresArithmeticMean != null ? featuresArithmeticMean.hashCode() : 0);
        result = 31 * result + (featuresModus != null ? featuresModus.hashCode() : 0);
        result = 31 * result + (featuresMedian != null ? featuresMedian.hashCode() : 0);
        result = 31 * result + (featuresMax != null ? featuresMax.hashCode() : 0);
        result = 31 * result + (featuresMin != null ? featuresMin.hashCode() : 0);
        result = 31 * result + (featuresVariance != null ? featuresVariance.hashCode() : 0);
        result = 31 * result + (featuresDeviation != null ? featuresDeviation.hashCode() : 0);
        result = 31 * result + (numberOfApksWithFeaturesTagObtainedNonZero != null ? numberOfApksWithFeaturesTagObtainedNonZero.hashCode() : 0);
        result = 31 * result + (featuresArithmeticMeanNonZero != null ? featuresArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (featuresModusNonZero != null ? featuresModusNonZero.hashCode() : 0);
        result = 31 * result + (featuresMedianNonZero != null ? featuresMedianNonZero.hashCode() : 0);
        result = 31 * result + (featuresMaxNonZero != null ? featuresMaxNonZero.hashCode() : 0);
        result = 31 * result + (featuresMinNonZero != null ? featuresMinNonZero.hashCode() : 0);
        result = 31 * result + (featuresVarianceNonZero != null ? featuresVarianceNonZero.hashCode() : 0);
        result = 31 * result + (featuresDeviationNonZero != null ? featuresDeviationNonZero.hashCode() : 0);
        result = 31 * result + (topFeatures != null ? topFeatures.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FeaturesStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", numberOfApksWithFeaturesTagObtained=" + numberOfApksWithFeaturesTagObtained +
                ", featuresArithmeticMean=" + featuresArithmeticMean +
                ", featuresModus=" + featuresModus +
                ", featuresMedian=" + featuresMedian +
                ", featuresMax=" + featuresMax +
                ", featuresMin=" + featuresMin +
                ", featuresVariance=" + featuresVariance +
                ", featuresDeviation=" + featuresDeviation +
                ", numberOfApksWithFeaturesTagObtainedNonZero=" + numberOfApksWithFeaturesTagObtainedNonZero +
                ", featuresArithmeticMeanNonZero=" + featuresArithmeticMeanNonZero +
                ", featuresModusNonZero=" + featuresModusNonZero +
                ", featuresMedianNonZero=" + featuresMedianNonZero +
                ", featuresMaxNonZero=" + featuresMaxNonZero +
                ", featuresMinNonZero=" + featuresMinNonZero +
                ", featuresVarianceNonZero=" + featuresVarianceNonZero +
                ", featuresDeviationNonZero=" + featuresDeviationNonZero +
                ", topFeatures=" + topFeatures +
                '}';
    }
}