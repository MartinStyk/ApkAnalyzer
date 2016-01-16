package sk.styk.martin.bakalarka.statistics.data;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FeaturesStatistics {

    //features
    private Integer numberOfApksWithFeaturesObtained;
    private Integer numberOfFeaturesArithmeticMean;
    private Integer numberOfFeaturesModus;
    private Integer numberOFeaturesMedian;
    private Map<String,Integer> topFeatures;

    private Integer numberOfFeaturesArithmeticMeanNonZero;
    private Integer numberOfFeaturesModusNonZero;
    private Integer numberOFeaturesMedianNonZero;

    public Integer getNumberOfApksWithFeaturesObtained() {
        return numberOfApksWithFeaturesObtained;
    }

    public void setNumberOfApksWithFeaturesObtained(Integer numberOfApksWithFeaturesObtained) {
        this.numberOfApksWithFeaturesObtained = numberOfApksWithFeaturesObtained;
    }

    public Integer getNumberOfFeaturesArithmeticMean() {
        return numberOfFeaturesArithmeticMean;
    }

    public void setNumberOfFeaturesArithmeticMean(Integer numberOfFeaturesArithmeticMean) {
        this.numberOfFeaturesArithmeticMean = numberOfFeaturesArithmeticMean;
    }

    public Integer getNumberOfFeaturesModus() {
        return numberOfFeaturesModus;
    }

    public void setNumberOfFeaturesModus(Integer numberOfFeaturesModus) {
        this.numberOfFeaturesModus = numberOfFeaturesModus;
    }

    public Integer getNumberOFeaturesMedian() {
        return numberOFeaturesMedian;
    }

    public void setNumberOFeaturesMedian(Integer numberOFeaturesMedian) {
        this.numberOFeaturesMedian = numberOFeaturesMedian;
    }

    public Map<String, Integer> getTopFeatures() {
        return topFeatures;
    }

    public void setTopFeatures(Map<String, Integer> topFeatures) {
        this.topFeatures = topFeatures;
    }

    public Integer getNumberOfFeaturesArithmeticMeanNonZero() {
        return numberOfFeaturesArithmeticMeanNonZero;
    }

    public void setNumberOfFeaturesArithmeticMeanNonZero(Integer numberOfFeaturesArithmeticMeanNonZero) {
        this.numberOfFeaturesArithmeticMeanNonZero = numberOfFeaturesArithmeticMeanNonZero;
    }

    public Integer getNumberOfFeaturesModusNonZero() {
        return numberOfFeaturesModusNonZero;
    }

    public void setNumberOfFeaturesModusNonZero(Integer numberOfFeaturesModusNonZero) {
        this.numberOfFeaturesModusNonZero = numberOfFeaturesModusNonZero;
    }

    public Integer getNumberOFeaturesMedianNonZero() {
        return numberOFeaturesMedianNonZero;
    }

    public void setNumberOFeaturesMedianNonZero(Integer numberOFeaturesMedianNonZero) {
        this.numberOFeaturesMedianNonZero = numberOFeaturesMedianNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeaturesStatistics that = (FeaturesStatistics) o;

        if (numberOfApksWithFeaturesObtained != null ? !numberOfApksWithFeaturesObtained.equals(that.numberOfApksWithFeaturesObtained) : that.numberOfApksWithFeaturesObtained != null)
            return false;
        if (numberOfFeaturesArithmeticMean != null ? !numberOfFeaturesArithmeticMean.equals(that.numberOfFeaturesArithmeticMean) : that.numberOfFeaturesArithmeticMean != null)
            return false;
        if (numberOfFeaturesModus != null ? !numberOfFeaturesModus.equals(that.numberOfFeaturesModus) : that.numberOfFeaturesModus != null)
            return false;
        if (numberOFeaturesMedian != null ? !numberOFeaturesMedian.equals(that.numberOFeaturesMedian) : that.numberOFeaturesMedian != null)
            return false;
        if (topFeatures != null ? !topFeatures.equals(that.topFeatures) : that.topFeatures != null) return false;
        if (numberOfFeaturesArithmeticMeanNonZero != null ? !numberOfFeaturesArithmeticMeanNonZero.equals(that.numberOfFeaturesArithmeticMeanNonZero) : that.numberOfFeaturesArithmeticMeanNonZero != null)
            return false;
        if (numberOfFeaturesModusNonZero != null ? !numberOfFeaturesModusNonZero.equals(that.numberOfFeaturesModusNonZero) : that.numberOfFeaturesModusNonZero != null)
            return false;
        return !(numberOFeaturesMedianNonZero != null ? !numberOFeaturesMedianNonZero.equals(that.numberOFeaturesMedianNonZero) : that.numberOFeaturesMedianNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = numberOfApksWithFeaturesObtained != null ? numberOfApksWithFeaturesObtained.hashCode() : 0;
        result = 31 * result + (numberOfFeaturesArithmeticMean != null ? numberOfFeaturesArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfFeaturesModus != null ? numberOfFeaturesModus.hashCode() : 0);
        result = 31 * result + (numberOFeaturesMedian != null ? numberOFeaturesMedian.hashCode() : 0);
        result = 31 * result + (topFeatures != null ? topFeatures.hashCode() : 0);
        result = 31 * result + (numberOfFeaturesArithmeticMeanNonZero != null ? numberOfFeaturesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (numberOfFeaturesModusNonZero != null ? numberOfFeaturesModusNonZero.hashCode() : 0);
        result = 31 * result + (numberOFeaturesMedianNonZero != null ? numberOFeaturesMedianNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FeaturesStatistics{" +
                "numberOfApksWithFeaturesObtained=" + numberOfApksWithFeaturesObtained +
                ", numberOfFeaturesArithmeticMean=" + numberOfFeaturesArithmeticMean +
                ", numberOfFeaturesModus=" + numberOfFeaturesModus +
                ", numberOFeaturesMedian=" + numberOFeaturesMedian +
                ", topFeatures=" + topFeatures +
                ", numberOfFeaturesArithmeticMeanNonZero=" + numberOfFeaturesArithmeticMeanNonZero +
                ", numberOfFeaturesModusNonZero=" + numberOfFeaturesModusNonZero +
                ", numberOFeaturesMedianNonZero=" + numberOFeaturesMedianNonZero +
                '}';
    }
}
