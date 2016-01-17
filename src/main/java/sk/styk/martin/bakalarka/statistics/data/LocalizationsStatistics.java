package sk.styk.martin.bakalarka.statistics.data;

import java.util.Map;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class LocalizationsStatistics {

    private Integer numberOfApksWithLocalizationsObtained;

    private Integer numberOfLocalizationsArithmeticMean;
    private Integer numberOfLocalizationsModus;
    private Integer numberOfLocalizationsMedian;

    private Map<String,Integer> topLocalizations;

    private Integer numberOfLocalizationsArithmeticMeanNonZero;
    private Integer numberOfLocalizationsMedianNonZero;
    private Integer numberOfLocalizationsNonZero;

    private Integer defaultStringXMLEntriesObtained;

    private Integer numberOfdefaultStringXMLArithmeticMean;
    private Integer numberOfdefaultStringXMLModus;
    private Integer numberOfdefaultStringXMLMedian;
    private Integer numberOfdefaultStringXMLArithmeticMeanNonZero;
    private Integer numberOfdefaultStringXMLModusNonZero;
    private Integer numberOfdefaultStringXMLMedianNonZero;


    public Integer getNumberOfApksWithLocalizationsObtained() {
        return numberOfApksWithLocalizationsObtained;
    }

    public void setNumberOfApksWithLocalizationsObtained(Integer numberOfApksWithLocalizationsObtained) {
        this.numberOfApksWithLocalizationsObtained = numberOfApksWithLocalizationsObtained;
    }

    public Integer getNumberOfLocalizationsArithmeticMean() {
        return numberOfLocalizationsArithmeticMean;
    }

    public void setNumberOfLocalizationsArithmeticMean(Integer numberOfLocalizationsArithmeticMean) {
        this.numberOfLocalizationsArithmeticMean = numberOfLocalizationsArithmeticMean;
    }

    public Integer getNumberOfLocalizationsModus() {
        return numberOfLocalizationsModus;
    }

    public void setNumberOfLocalizationsModus(Integer numberOfLocalizationsModus) {
        this.numberOfLocalizationsModus = numberOfLocalizationsModus;
    }

    public Integer getNumberOfLocalizationsMedian() {
        return numberOfLocalizationsMedian;
    }

    public void setNumberOfLocalizationsMedian(Integer numberOfLocalizationsMedian) {
        this.numberOfLocalizationsMedian = numberOfLocalizationsMedian;
    }

    public Map<String, Integer> getTopLocalizations() {
        return topLocalizations;
    }

    public void setTopLocalizations(Map<String, Integer> topLocalizations) {
        this.topLocalizations = topLocalizations;
    }

    public Integer getNumberOfLocalizationsArithmeticMeanNonZero() {
        return numberOfLocalizationsArithmeticMeanNonZero;
    }

    public void setNumberOfLocalizationsArithmeticMeanNonZero(Integer numberOfLocalizationsArithmeticMeanNonZero) {
        this.numberOfLocalizationsArithmeticMeanNonZero = numberOfLocalizationsArithmeticMeanNonZero;
    }

    public Integer getNumberOfLocalizationsMedianNonZero() {
        return numberOfLocalizationsMedianNonZero;
    }

    public void setNumberOfLocalizationsMedianNonZero(Integer numberOfLocalizationsMedianNonZero) {
        this.numberOfLocalizationsMedianNonZero = numberOfLocalizationsMedianNonZero;
    }

    public Integer getNumberOfLocalizationsNonZero() {
        return numberOfLocalizationsNonZero;
    }

    public void setNumberOfLocalizationsNonZero(Integer numberOfLocalizationsNonZero) {
        this.numberOfLocalizationsNonZero = numberOfLocalizationsNonZero;
    }

    public Integer getDefaultStringXMLEntriesObtained() {
        return defaultStringXMLEntriesObtained;
    }

    public void setDefaultStringXMLEntriesObtained(Integer defaultStringXMLEntriesObtained) {
        this.defaultStringXMLEntriesObtained = defaultStringXMLEntriesObtained;
    }

    public Integer getNumberOfdefaultStringXMLArithmeticMean() {
        return numberOfdefaultStringXMLArithmeticMean;
    }

    public void setNumberOfdefaultStringXMLArithmeticMean(Integer numberOfdefaultStringXMLArithmeticMean) {
        this.numberOfdefaultStringXMLArithmeticMean = numberOfdefaultStringXMLArithmeticMean;
    }

    public Integer getNumberOfdefaultStringXMLModus() {
        return numberOfdefaultStringXMLModus;
    }

    public void setNumberOfdefaultStringXMLModus(Integer numberOfdefaultStringXMLModus) {
        this.numberOfdefaultStringXMLModus = numberOfdefaultStringXMLModus;
    }

    public Integer getNumberOfdefaultStringXMLMedian() {
        return numberOfdefaultStringXMLMedian;
    }

    public void setNumberOfdefaultStringXMLMedian(Integer numberOfdefaultStringXMLMedian) {
        this.numberOfdefaultStringXMLMedian = numberOfdefaultStringXMLMedian;
    }

    public Integer getNumberOfdefaultStringXMLArithmeticMeanNonZero() {
        return numberOfdefaultStringXMLArithmeticMeanNonZero;
    }

    public void setNumberOfdefaultStringXMLArithmeticMeanNonZero(Integer numberOfdefaultStringXMLArithmeticMeanNonZero) {
        this.numberOfdefaultStringXMLArithmeticMeanNonZero = numberOfdefaultStringXMLArithmeticMeanNonZero;
    }

    public Integer getNumberOfdefaultStringXMLModusNonZero() {
        return numberOfdefaultStringXMLModusNonZero;
    }

    public void setNumberOfdefaultStringXMLModusNonZero(Integer numberOfdefaultStringXMLModusNonZero) {
        this.numberOfdefaultStringXMLModusNonZero = numberOfdefaultStringXMLModusNonZero;
    }

    public Integer getNumberOfdefaultStringXMLMedianNonZero() {
        return numberOfdefaultStringXMLMedianNonZero;
    }

    public void setNumberOfdefaultStringXMLMedianNonZero(Integer numberOfdefaultStringXMLMedianNonZero) {
        this.numberOfdefaultStringXMLMedianNonZero = numberOfdefaultStringXMLMedianNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalizationsStatistics that = (LocalizationsStatistics) o;

        if (numberOfApksWithLocalizationsObtained != null ? !numberOfApksWithLocalizationsObtained.equals(that.numberOfApksWithLocalizationsObtained) : that.numberOfApksWithLocalizationsObtained != null)
            return false;
        if (numberOfLocalizationsArithmeticMean != null ? !numberOfLocalizationsArithmeticMean.equals(that.numberOfLocalizationsArithmeticMean) : that.numberOfLocalizationsArithmeticMean != null)
            return false;
        if (numberOfLocalizationsModus != null ? !numberOfLocalizationsModus.equals(that.numberOfLocalizationsModus) : that.numberOfLocalizationsModus != null)
            return false;
        if (numberOfLocalizationsMedian != null ? !numberOfLocalizationsMedian.equals(that.numberOfLocalizationsMedian) : that.numberOfLocalizationsMedian != null)
            return false;
        if (topLocalizations != null ? !topLocalizations.equals(that.topLocalizations) : that.topLocalizations != null)
            return false;
        if (numberOfLocalizationsArithmeticMeanNonZero != null ? !numberOfLocalizationsArithmeticMeanNonZero.equals(that.numberOfLocalizationsArithmeticMeanNonZero) : that.numberOfLocalizationsArithmeticMeanNonZero != null)
            return false;
        if (numberOfLocalizationsMedianNonZero != null ? !numberOfLocalizationsMedianNonZero.equals(that.numberOfLocalizationsMedianNonZero) : that.numberOfLocalizationsMedianNonZero != null)
            return false;
        if (numberOfLocalizationsNonZero != null ? !numberOfLocalizationsNonZero.equals(that.numberOfLocalizationsNonZero) : that.numberOfLocalizationsNonZero != null)
            return false;
        if (defaultStringXMLEntriesObtained != null ? !defaultStringXMLEntriesObtained.equals(that.defaultStringXMLEntriesObtained) : that.defaultStringXMLEntriesObtained != null)
            return false;
        if (numberOfdefaultStringXMLArithmeticMean != null ? !numberOfdefaultStringXMLArithmeticMean.equals(that.numberOfdefaultStringXMLArithmeticMean) : that.numberOfdefaultStringXMLArithmeticMean != null)
            return false;
        if (numberOfdefaultStringXMLModus != null ? !numberOfdefaultStringXMLModus.equals(that.numberOfdefaultStringXMLModus) : that.numberOfdefaultStringXMLModus != null)
            return false;
        if (numberOfdefaultStringXMLMedian != null ? !numberOfdefaultStringXMLMedian.equals(that.numberOfdefaultStringXMLMedian) : that.numberOfdefaultStringXMLMedian != null)
            return false;
        if (numberOfdefaultStringXMLArithmeticMeanNonZero != null ? !numberOfdefaultStringXMLArithmeticMeanNonZero.equals(that.numberOfdefaultStringXMLArithmeticMeanNonZero) : that.numberOfdefaultStringXMLArithmeticMeanNonZero != null)
            return false;
        if (numberOfdefaultStringXMLModusNonZero != null ? !numberOfdefaultStringXMLModusNonZero.equals(that.numberOfdefaultStringXMLModusNonZero) : that.numberOfdefaultStringXMLModusNonZero != null)
            return false;
        return !(numberOfdefaultStringXMLMedianNonZero != null ? !numberOfdefaultStringXMLMedianNonZero.equals(that.numberOfdefaultStringXMLMedianNonZero) : that.numberOfdefaultStringXMLMedianNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = numberOfApksWithLocalizationsObtained != null ? numberOfApksWithLocalizationsObtained.hashCode() : 0;
        result = 31 * result + (numberOfLocalizationsArithmeticMean != null ? numberOfLocalizationsArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfLocalizationsModus != null ? numberOfLocalizationsModus.hashCode() : 0);
        result = 31 * result + (numberOfLocalizationsMedian != null ? numberOfLocalizationsMedian.hashCode() : 0);
        result = 31 * result + (topLocalizations != null ? topLocalizations.hashCode() : 0);
        result = 31 * result + (numberOfLocalizationsArithmeticMeanNonZero != null ? numberOfLocalizationsArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (numberOfLocalizationsMedianNonZero != null ? numberOfLocalizationsMedianNonZero.hashCode() : 0);
        result = 31 * result + (numberOfLocalizationsNonZero != null ? numberOfLocalizationsNonZero.hashCode() : 0);
        result = 31 * result + (defaultStringXMLEntriesObtained != null ? defaultStringXMLEntriesObtained.hashCode() : 0);
        result = 31 * result + (numberOfdefaultStringXMLArithmeticMean != null ? numberOfdefaultStringXMLArithmeticMean.hashCode() : 0);
        result = 31 * result + (numberOfdefaultStringXMLModus != null ? numberOfdefaultStringXMLModus.hashCode() : 0);
        result = 31 * result + (numberOfdefaultStringXMLMedian != null ? numberOfdefaultStringXMLMedian.hashCode() : 0);
        result = 31 * result + (numberOfdefaultStringXMLArithmeticMeanNonZero != null ? numberOfdefaultStringXMLArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (numberOfdefaultStringXMLModusNonZero != null ? numberOfdefaultStringXMLModusNonZero.hashCode() : 0);
        result = 31 * result + (numberOfdefaultStringXMLMedianNonZero != null ? numberOfdefaultStringXMLMedianNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LocalizationsStatistics{" +
                "numberOfApksWithLocalizationsObtained=" + numberOfApksWithLocalizationsObtained +
                ", numberOfLocalizationsArithmeticMean=" + numberOfLocalizationsArithmeticMean +
                ", numberOfLocalizationsModus=" + numberOfLocalizationsModus +
                ", numberOfLocalizationsMedian=" + numberOfLocalizationsMedian +
                ", topLocalizations=" + topLocalizations +
                ", numberOfLocalizationsArithmeticMeanNonZero=" + numberOfLocalizationsArithmeticMeanNonZero +
                ", numberOfLocalizationsMedianNonZero=" + numberOfLocalizationsMedianNonZero +
                ", numberOfLocalizationsNonZero=" + numberOfLocalizationsNonZero +
                ", defaultStringXMLEntriesObtained=" + defaultStringXMLEntriesObtained +
                ", numberOfdefaultStringXMLArithmeticMean=" + numberOfdefaultStringXMLArithmeticMean +
                ", numberOfdefaultStringXMLModus=" + numberOfdefaultStringXMLModus +
                ", numberOfdefaultStringXMLMedian=" + numberOfdefaultStringXMLMedian +
                ", numberOfdefaultStringXMLArithmeticMeanNonZero=" + numberOfdefaultStringXMLArithmeticMeanNonZero +
                ", numberOfdefaultStringXMLModusNonZero=" + numberOfdefaultStringXMLModusNonZero +
                ", numberOfdefaultStringXMLMedianNonZero=" + numberOfdefaultStringXMLMedianNonZero +
                '}';
    }
}
