package sk.styk.martin.bakalarka.statistics.data;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class LibrariesStatistics {

    //libraries
    private Integer numberOfApksWithLibrariesObtained;
    private Integer numberOfLibrariesArithmeticMean;
    private Integer numberOfLibrariesModus;
    private Integer numberOLibrariesMedian;
    private Map<String,Integer> topLibraries;

    private Integer numberOfLibrariesArithmeticMeanNonZero;
    private Integer numberOfLibrariesModusNonZero;
    private Integer numberOLibrariesMedianNonZero;

    public Integer getNumberOfApksWithLibrariesObtained() {
        return numberOfApksWithLibrariesObtained;
    }

    public void setNumberOfApksWithLibrariesObtained(Integer numberOfApksWithLibrariesObtained) {
        this.numberOfApksWithLibrariesObtained = numberOfApksWithLibrariesObtained;
    }

    public Integer getNumberOfLibrariesArithmeticMean() {
        return numberOfLibrariesArithmeticMean;
    }

    public void setNumberOfLibrariesArithmeticMean(Integer numberOfLibrariesArithmeticMean) {
        this.numberOfLibrariesArithmeticMean = numberOfLibrariesArithmeticMean;
    }

    public Integer getNumberOfLibrariesModus() {
        return numberOfLibrariesModus;
    }

    public void setNumberOfLibrariesModus(Integer numberOfLibrariesModus) {
        this.numberOfLibrariesModus = numberOfLibrariesModus;
    }

    public Integer getNumberOLibrariesMedian() {
        return numberOLibrariesMedian;
    }

    public void setNumberOLibrariesMedian(Integer numberOLibrariesMedian) {
        this.numberOLibrariesMedian = numberOLibrariesMedian;
    }

    public Map<String, Integer> getTopLibraries() {
        return topLibraries;
    }

    public void setTopLibraries(Map<String, Integer> topLibraries) {
        this.topLibraries = topLibraries;
    }

    public Integer getNumberOfLibrariesArithmeticMeanNonZero() {
        return numberOfLibrariesArithmeticMeanNonZero;
    }

    public void setNumberOfLibrariesArithmeticMeanNonZero(Integer numberOfLibrariesArithmeticMeanNonZero) {
        this.numberOfLibrariesArithmeticMeanNonZero = numberOfLibrariesArithmeticMeanNonZero;
    }

    public Integer getNumberOfLibrariesModusNonZero() {
        return numberOfLibrariesModusNonZero;
    }

    public void setNumberOfLibrariesModusNonZero(Integer numberOfLibrariesModusNonZero) {
        this.numberOfLibrariesModusNonZero = numberOfLibrariesModusNonZero;
    }

    public Integer getNumberOLibrariesMedianNonZero() {
        return numberOLibrariesMedianNonZero;
    }

    public void setNumberOLibrariesMedianNonZero(Integer numberOLibrariesMedianNonZero) {
        this.numberOLibrariesMedianNonZero = numberOLibrariesMedianNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibrariesStatistics that = (LibrariesStatistics) o;

        if (numberOfApksWithLibrariesObtained != null ? !numberOfApksWithLibrariesObtained.equals(that.numberOfApksWithLibrariesObtained) : that.numberOfApksWithLibrariesObtained != null)
            return false;
        if (numberOfLibrariesArithmeticMean != null ? !numberOfLibrariesArithmeticMean.equals(that.numberOfLibrariesArithmeticMean) : that.numberOfLibrariesArithmeticMean != null)
            return false;
        if (numberOfLibrariesModus != null ? !numberOfLibrariesModus.equals(that.numberOfLibrariesModus) : that.numberOfLibrariesModus != null)
            return false;
        if (numberOLibrariesMedian != null ? !numberOLibrariesMedian.equals(that.numberOLibrariesMedian) : that.numberOLibrariesMedian != null)
            return false;
        if (topLibraries != null ? !topLibraries.equals(that.topLibraries) : that.topLibraries != null) return false;
        if (numberOfLibrariesArithmeticMeanNonZero != null ? !numberOfLibrariesArithmeticMeanNonZero.equals(that.numberOfLibrariesArithmeticMeanNonZero) : that.numberOfLibrariesArithmeticMeanNonZero != null)
            return false;
        if (numberOfLibrariesModusNonZero != null ? !numberOfLibrariesModusNonZero.equals(that.numberOfLibrariesModusNonZero) : that.numberOfLibrariesModusNonZero != null)
            return false;
        return !(numberOLibrariesMedianNonZero != null ? !numberOLibrariesMedianNonZero.equals(that.numberOLibrariesMedianNonZero) : that.numberOLibrariesMedianNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = numberOfApksWithLibrariesObtained != null ? numberOfApksWithLibrariesObtained.hashCode() : 0;
        result = 31 * result + (numberOfLibrariesArithmeticMean != null ? numberOfLibrariesArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfLibrariesModus != null ? numberOfLibrariesModus.hashCode() : 0);
        result = 31 * result + (numberOLibrariesMedian != null ? numberOLibrariesMedian.hashCode() : 0);
        result = 31 * result + (topLibraries != null ? topLibraries.hashCode() : 0);
        result = 31 * result + (numberOfLibrariesArithmeticMeanNonZero != null ? numberOfLibrariesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (numberOfLibrariesModusNonZero != null ? numberOfLibrariesModusNonZero.hashCode() : 0);
        result = 31 * result + (numberOLibrariesMedianNonZero != null ? numberOLibrariesMedianNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibrariesStatistics{" +
                "numberOfApksWithLibrariesObtained=" + numberOfApksWithLibrariesObtained +
                ", numberOfLibrariesArithmeticMean=" + numberOfLibrariesArithmeticMean +
                ", numberOfLibrariesModus=" + numberOfLibrariesModus +
                ", numberOLibrariesMedian=" + numberOLibrariesMedian +
                ", topLibraries=" + topLibraries +
                ", numberOfLibrariesArithmeticMeanNonZero=" + numberOfLibrariesArithmeticMeanNonZero +
                ", numberOfLibrariesModusNonZero=" + numberOfLibrariesModusNonZero +
                ", numberOLibrariesMedianNonZero=" + numberOLibrariesMedianNonZero +
                '}';
    }
}
