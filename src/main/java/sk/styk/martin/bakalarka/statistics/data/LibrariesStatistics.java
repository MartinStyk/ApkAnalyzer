package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class LibrariesStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;
    /**
     * number of apks with libraries tag found in manifest
     */

    //libraries
    private Integer numberOfApksWithLibrariesTagObtained;
    private BigDecimal librariesArithmeticMean;
    private List<Integer> librariesModus;
    private Integer librariesMedian;
    private Integer librariesMax;
    private Integer librariesMin;
    private BigDecimal librariesVariance;
    private BigDecimal librariesDeviation;

    private Integer numberOfApksWithLibrariesTagObtainedNonZero;
    private BigDecimal librariesArithmeticMeanNonZero;
    private List<Integer> librariesModusNonZero;
    private Integer librariesMedianNonZero;
    private Integer librariesMaxNonZero;
    private Integer librariesMinNonZero;
    private BigDecimal librariesVarianceNonZero;
    private BigDecimal librariesDeviationNonZero;

    private Map<String, PercentagePair> topLibraries;

    public Integer getNumberOfApksWithLibrariesTagObtained() {
        return numberOfApksWithLibrariesTagObtained;
    }

    public void setNumberOfApksWithLibrariesTagObtained(Integer numberOfApksWithLibrariesTagObtained) {
        this.numberOfApksWithLibrariesTagObtained = numberOfApksWithLibrariesTagObtained;
    }

    public BigDecimal getLibrariesArithmeticMean() {
        return librariesArithmeticMean;
    }

    public void setLibrariesArithmeticMean(BigDecimal librariesArithmeticMean) {
        this.librariesArithmeticMean = librariesArithmeticMean;
    }

    public List<Integer> getLibrariesModus() {
        return librariesModus;
    }

    public void setLibrariesModus(List<Integer> librariesModus) {
        this.librariesModus = librariesModus;
    }

    public Integer getLibrariesMedian() {
        return librariesMedian;
    }

    public void setLibrariesMedian(Integer librariesMedian) {
        this.librariesMedian = librariesMedian;
    }

    public Integer getLibrariesMax() {
        return librariesMax;
    }

    public void setLibrariesMax(Integer librariesMax) {
        this.librariesMax = librariesMax;
    }

    public Integer getLibrariesMin() {
        return librariesMin;
    }

    public void setLibrariesMin(Integer librariesMin) {
        this.librariesMin = librariesMin;
    }

    public BigDecimal getLibrariesVariance() {
        return librariesVariance;
    }

    public void setLibrariesVariance(BigDecimal librariesVariance) {
        this.librariesVariance = librariesVariance;
    }

    public BigDecimal getLibrariesDeviation() {
        return librariesDeviation;
    }

    public void setLibrariesDeviation(BigDecimal librariesDeviation) {
        this.librariesDeviation = librariesDeviation;
    }

    public Map<String, PercentagePair> getTopLibraries() {
        return topLibraries;
    }

    public void setTopLibraries(Map<String, PercentagePair> topLibraries) {
        this.topLibraries = topLibraries;
    }

    public Integer getNumberOfApksWithLibrariesTagObtainedNonZero() {
        return numberOfApksWithLibrariesTagObtainedNonZero;
    }

    public void setNumberOfApksWithLibrariesTagObtainedNonZero(Integer numberOfApksWithLibrariesTagObtainedNonZero) {
        this.numberOfApksWithLibrariesTagObtainedNonZero = numberOfApksWithLibrariesTagObtainedNonZero;
    }

    public BigDecimal getLibrariesArithmeticMeanNonZero() {
        return librariesArithmeticMeanNonZero;
    }

    public void setLibrariesArithmeticMeanNonZero(BigDecimal librariesArithmeticMeanNonZero) {
        this.librariesArithmeticMeanNonZero = librariesArithmeticMeanNonZero;
    }

    public List<Integer> getLibrariesModusNonZero() {
        return librariesModusNonZero;
    }

    public void setLibrariesModusNonZero(List<Integer> librariesModusNonZero) {
        this.librariesModusNonZero = librariesModusNonZero;
    }

    public Integer getLibrariesMedianNonZero() {
        return librariesMedianNonZero;
    }

    public void setLibrariesMedianNonZero(Integer librariesMedianNonZero) {
        this.librariesMedianNonZero = librariesMedianNonZero;
    }

    public Integer getLibrariesMaxNonZero() {
        return librariesMaxNonZero;
    }

    public void setLibrariesMaxNonZero(Integer librariesMaxNonZero) {
        this.librariesMaxNonZero = librariesMaxNonZero;
    }

    public Integer getLibrariesMinNonZero() {
        return librariesMinNonZero;
    }

    public void setLibrariesMinNonZero(Integer librariesMinNonZero) {
        this.librariesMinNonZero = librariesMinNonZero;
    }

    public BigDecimal getLibrariesVarianceNonZero() {
        return librariesVarianceNonZero;
    }

    public void setLibrariesVarianceNonZero(BigDecimal librariesVarianceNonZero) {
        this.librariesVarianceNonZero = librariesVarianceNonZero;
    }

    public BigDecimal getLibrariesDeviationNonZero() {
        return librariesDeviationNonZero;
    }

    public void setLibrariesDeviationNonZero(BigDecimal librariesDeviationNonZero) {
        this.librariesDeviationNonZero = librariesDeviationNonZero;
    }

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibrariesStatistics that = (LibrariesStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (numberOfApksWithLibrariesTagObtained != null ? !numberOfApksWithLibrariesTagObtained.equals(that.numberOfApksWithLibrariesTagObtained) : that.numberOfApksWithLibrariesTagObtained != null)
            return false;
        if (librariesArithmeticMean != null ? !librariesArithmeticMean.equals(that.librariesArithmeticMean) : that.librariesArithmeticMean != null)
            return false;
        if (librariesModus != null ? !librariesModus.equals(that.librariesModus) : that.librariesModus != null)
            return false;
        if (librariesMedian != null ? !librariesMedian.equals(that.librariesMedian) : that.librariesMedian != null)
            return false;
        if (librariesMax != null ? !librariesMax.equals(that.librariesMax) : that.librariesMax != null) return false;
        if (librariesMin != null ? !librariesMin.equals(that.librariesMin) : that.librariesMin != null) return false;
        if (librariesVariance != null ? !librariesVariance.equals(that.librariesVariance) : that.librariesVariance != null)
            return false;
        if (librariesDeviation != null ? !librariesDeviation.equals(that.librariesDeviation) : that.librariesDeviation != null)
            return false;
        if (numberOfApksWithLibrariesTagObtainedNonZero != null ? !numberOfApksWithLibrariesTagObtainedNonZero.equals(that.numberOfApksWithLibrariesTagObtainedNonZero) : that.numberOfApksWithLibrariesTagObtainedNonZero != null)
            return false;
        if (librariesArithmeticMeanNonZero != null ? !librariesArithmeticMeanNonZero.equals(that.librariesArithmeticMeanNonZero) : that.librariesArithmeticMeanNonZero != null)
            return false;
        if (librariesModusNonZero != null ? !librariesModusNonZero.equals(that.librariesModusNonZero) : that.librariesModusNonZero != null)
            return false;
        if (librariesMedianNonZero != null ? !librariesMedianNonZero.equals(that.librariesMedianNonZero) : that.librariesMedianNonZero != null)
            return false;
        if (librariesMaxNonZero != null ? !librariesMaxNonZero.equals(that.librariesMaxNonZero) : that.librariesMaxNonZero != null)
            return false;
        if (librariesMinNonZero != null ? !librariesMinNonZero.equals(that.librariesMinNonZero) : that.librariesMinNonZero != null)
            return false;
        if (librariesVarianceNonZero != null ? !librariesVarianceNonZero.equals(that.librariesVarianceNonZero) : that.librariesVarianceNonZero != null)
            return false;
        if (librariesDeviationNonZero != null ? !librariesDeviationNonZero.equals(that.librariesDeviationNonZero) : that.librariesDeviationNonZero != null)
            return false;
        return !(topLibraries != null ? !topLibraries.equals(that.topLibraries) : that.topLibraries != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (numberOfApksWithLibrariesTagObtained != null ? numberOfApksWithLibrariesTagObtained.hashCode() : 0);
        result = 31 * result + (librariesArithmeticMean != null ? librariesArithmeticMean.hashCode() : 0);
        result = 31 * result + (librariesModus != null ? librariesModus.hashCode() : 0);
        result = 31 * result + (librariesMedian != null ? librariesMedian.hashCode() : 0);
        result = 31 * result + (librariesMax != null ? librariesMax.hashCode() : 0);
        result = 31 * result + (librariesMin != null ? librariesMin.hashCode() : 0);
        result = 31 * result + (librariesVariance != null ? librariesVariance.hashCode() : 0);
        result = 31 * result + (librariesDeviation != null ? librariesDeviation.hashCode() : 0);
        result = 31 * result + (numberOfApksWithLibrariesTagObtainedNonZero != null ? numberOfApksWithLibrariesTagObtainedNonZero.hashCode() : 0);
        result = 31 * result + (librariesArithmeticMeanNonZero != null ? librariesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (librariesModusNonZero != null ? librariesModusNonZero.hashCode() : 0);
        result = 31 * result + (librariesMedianNonZero != null ? librariesMedianNonZero.hashCode() : 0);
        result = 31 * result + (librariesMaxNonZero != null ? librariesMaxNonZero.hashCode() : 0);
        result = 31 * result + (librariesMinNonZero != null ? librariesMinNonZero.hashCode() : 0);
        result = 31 * result + (librariesVarianceNonZero != null ? librariesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (librariesDeviationNonZero != null ? librariesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (topLibraries != null ? topLibraries.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibrariesStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", numberOfApksWithLibrariesTagObtained=" + numberOfApksWithLibrariesTagObtained +
                ", librariesArithmeticMean=" + librariesArithmeticMean +
                ", librariesModus=" + librariesModus +
                ", librariesMedian=" + librariesMedian +
                ", librariesMax=" + librariesMax +
                ", librariesMin=" + librariesMin +
                ", librariesVariance=" + librariesVariance +
                ", librariesDeviation=" + librariesDeviation +
                ", numberOfApksWithLibrariesTagObtainedNonZero=" + numberOfApksWithLibrariesTagObtainedNonZero +
                ", librariesArithmeticMeanNonZero=" + librariesArithmeticMeanNonZero +
                ", librariesModusNonZero=" + librariesModusNonZero +
                ", librariesMedianNonZero=" + librariesMedianNonZero +
                ", librariesMaxNonZero=" + librariesMaxNonZero +
                ", librariesMinNonZero=" + librariesMinNonZero +
                ", librariesVarianceNonZero=" + librariesVarianceNonZero +
                ", librariesDeviationNonZero=" + librariesDeviationNonZero +
                ", topLibraries=" + topLibraries +
                '}';
    }
}