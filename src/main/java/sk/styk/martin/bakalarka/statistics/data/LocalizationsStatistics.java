package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class LocalizationsStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;

    private PercentagePair apksWithLocalizationsObtained;
    private BigDecimal localizationsArithmeticMean;
    private List<Integer> localizationsModus;
    private Integer localizationsMedian;
    private Integer localizationsMax;
    private Integer localizationsMin;
    private BigDecimal localizationsVariance;
    private BigDecimal localizationsDeviation;

    private PercentagePair numberOfApksWithLocalizationsObtainedNonZero;
    private BigDecimal localizationsArithmeticMeanNonZero;
    private List<Integer> localizationsModusNonZero;
    private Integer localizationsMedianNonZero;
    private Integer localizationsMaxNonZero;
    private Integer localizationsMinNonZero;
    private BigDecimal localizationsVarianceNonZero;
    private BigDecimal localizationsDeviationNonZero;

    private PercentagePair apksWithDefaultStringXmlObtained;
    private BigDecimal defaultStringXmlArithmeticMean;
    private List<Integer> defaultStringXmlModus;
    private Integer defaultStringXmlMedian;
    private Integer defaultStringXmlMax;
    private Integer defaultStringXmlMin;
    private BigDecimal defaultStringXmlVariance;
    private BigDecimal defaultStringXmlDeviation;

    /**
     * conatining more than one element
     */
    private PercentagePair apksWithDefaultStringXmlObtainedNonDefault;
    private BigDecimal defaultStringXmlArithmeticMeanNonDefault;
    private List<Integer> defaultStringXmlModusNonDefault;
    private Integer defaultStringXmlMedianNonDefault;
    private Integer defaultStringXmlMaxNonDefault;
    private Integer defaultStringXmlMinNonDefault;
    private BigDecimal defaultStringXmlVarianceNonDefault;
    private BigDecimal defaultStringXmlDeviationNonDefault;

    /**
     * normalized locale - i.e. en-GB equal eng-US
     * some apks contains strings.xml file in strange directories.
     */
    private Map<String, PercentagePair> topLocalizations;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public PercentagePair getApksWithLocalizationsObtained() {
        return apksWithLocalizationsObtained;
    }

    public void setApksWithLocalizationsObtained(PercentagePair apksWithLocalizationsObtained) {
        this.apksWithLocalizationsObtained = apksWithLocalizationsObtained;
    }

    public BigDecimal getLocalizationsArithmeticMean() {
        return localizationsArithmeticMean;
    }

    public void setLocalizationsArithmeticMean(BigDecimal localizationsArithmeticMean) {
        this.localizationsArithmeticMean = localizationsArithmeticMean;
    }

    public List<Integer> getLocalizationsModus() {
        return localizationsModus;
    }

    public void setLocalizationsModus(List<Integer> localizationsModus) {
        this.localizationsModus = localizationsModus;
    }

    public Integer getLocalizationsMedian() {
        return localizationsMedian;
    }

    public void setLocalizationsMedian(Integer localizationsMedian) {
        this.localizationsMedian = localizationsMedian;
    }

    public Integer getLocalizationsMax() {
        return localizationsMax;
    }

    public void setLocalizationsMax(Integer localizationsMax) {
        this.localizationsMax = localizationsMax;
    }

    public Integer getLocalizationsMin() {
        return localizationsMin;
    }

    public void setLocalizationsMin(Integer localizationsMin) {
        this.localizationsMin = localizationsMin;
    }

    public BigDecimal getLocalizationsVariance() {
        return localizationsVariance;
    }

    public void setLocalizationsVariance(BigDecimal localizationsVariance) {
        this.localizationsVariance = localizationsVariance;
    }

    public BigDecimal getLocalizationsDeviation() {
        return localizationsDeviation;
    }

    public void setLocalizationsDeviation(BigDecimal localizationsDeviation) {
        this.localizationsDeviation = localizationsDeviation;
    }

    public PercentagePair getNumberOfApksWithLocalizationsObtainedNonZero() {
        return numberOfApksWithLocalizationsObtainedNonZero;
    }

    public void setNumberOfApksWithLocalizationsObtainedNonZero(PercentagePair numberOfApksWithLocalizationsObtainedNonZero) {
        this.numberOfApksWithLocalizationsObtainedNonZero = numberOfApksWithLocalizationsObtainedNonZero;
    }

    public BigDecimal getLocalizationsArithmeticMeanNonZero() {
        return localizationsArithmeticMeanNonZero;
    }

    public void setLocalizationsArithmeticMeanNonZero(BigDecimal localizationsArithmeticMeanNonZero) {
        this.localizationsArithmeticMeanNonZero = localizationsArithmeticMeanNonZero;
    }

    public List<Integer> getLocalizationsModusNonZero() {
        return localizationsModusNonZero;
    }

    public void setLocalizationsModusNonZero(List<Integer> localizationsModusNonZero) {
        this.localizationsModusNonZero = localizationsModusNonZero;
    }

    public Integer getLocalizationsMedianNonZero() {
        return localizationsMedianNonZero;
    }

    public void setLocalizationsMedianNonZero(Integer localizationsMedianNonZero) {
        this.localizationsMedianNonZero = localizationsMedianNonZero;
    }

    public Integer getLocalizationsMaxNonZero() {
        return localizationsMaxNonZero;
    }

    public void setLocalizationsMaxNonZero(Integer localizationsMaxNonZero) {
        this.localizationsMaxNonZero = localizationsMaxNonZero;
    }

    public Integer getLocalizationsMinNonZero() {
        return localizationsMinNonZero;
    }

    public void setLocalizationsMinNonZero(Integer localizationsMinNonZero) {
        this.localizationsMinNonZero = localizationsMinNonZero;
    }

    public BigDecimal getLocalizationsVarianceNonZero() {
        return localizationsVarianceNonZero;
    }

    public void setLocalizationsVarianceNonZero(BigDecimal localizationsVarianceNonZero) {
        this.localizationsVarianceNonZero = localizationsVarianceNonZero;
    }

    public BigDecimal getLocalizationsDeviationNonZero() {
        return localizationsDeviationNonZero;
    }

    public void setLocalizationsDeviationNonZero(BigDecimal localizationsDeviationNonZero) {
        this.localizationsDeviationNonZero = localizationsDeviationNonZero;
    }

    public PercentagePair getApksWithDefaultStringXmlObtained() {
        return apksWithDefaultStringXmlObtained;
    }

    public void setApksWithDefaultStringXmlObtained(PercentagePair apksWithDefaultStringXmlObtained) {
        this.apksWithDefaultStringXmlObtained = apksWithDefaultStringXmlObtained;
    }

    public BigDecimal getDefaultStringXmlArithmeticMean() {
        return defaultStringXmlArithmeticMean;
    }

    public void setDefaultStringXmlArithmeticMean(BigDecimal defaultStringXmlArithmeticMean) {
        this.defaultStringXmlArithmeticMean = defaultStringXmlArithmeticMean;
    }

    public List<Integer> getDefaultStringXmlModus() {
        return defaultStringXmlModus;
    }

    public void setDefaultStringXmlModus(List<Integer> defaultStringXmlModus) {
        this.defaultStringXmlModus = defaultStringXmlModus;
    }

    public Integer getDefaultStringXmlMedian() {
        return defaultStringXmlMedian;
    }

    public void setDefaultStringXmlMedian(Integer defaultStringXmlMedian) {
        this.defaultStringXmlMedian = defaultStringXmlMedian;
    }

    public Integer getDefaultStringXmlMax() {
        return defaultStringXmlMax;
    }

    public void setDefaultStringXmlMax(Integer defaultStringXmlMax) {
        this.defaultStringXmlMax = defaultStringXmlMax;
    }

    public Integer getDefaultStringXmlMin() {
        return defaultStringXmlMin;
    }

    public void setDefaultStringXmlMin(Integer defaultStringXmlMin) {
        this.defaultStringXmlMin = defaultStringXmlMin;
    }

    public BigDecimal getDefaultStringXmlVariance() {
        return defaultStringXmlVariance;
    }

    public void setDefaultStringXmlVariance(BigDecimal defaultStringXmlVariance) {
        this.defaultStringXmlVariance = defaultStringXmlVariance;
    }

    public BigDecimal getDefaultStringXmlDeviation() {
        return defaultStringXmlDeviation;
    }

    public void setDefaultStringXmlDeviation(BigDecimal defaultStringXmlDeviation) {
        this.defaultStringXmlDeviation = defaultStringXmlDeviation;
    }

    public PercentagePair getApksWithDefaultStringXmlObtainedNonDefault() {
        return apksWithDefaultStringXmlObtainedNonDefault;
    }

    public void setApksWithDefaultStringXmlObtainedNonDefault(PercentagePair apksWithDefaultStringXmlObtainedNonDefault) {
        this.apksWithDefaultStringXmlObtainedNonDefault = apksWithDefaultStringXmlObtainedNonDefault;
    }

    public BigDecimal getDefaultStringXmlArithmeticMeanNonDefault() {
        return defaultStringXmlArithmeticMeanNonDefault;
    }

    public void setDefaultStringXmlArithmeticMeanNonDefault(BigDecimal defaultStringXmlArithmeticMeanNonDefault) {
        this.defaultStringXmlArithmeticMeanNonDefault = defaultStringXmlArithmeticMeanNonDefault;
    }

    public List<Integer> getDefaultStringXmlModusNonDefault() {
        return defaultStringXmlModusNonDefault;
    }

    public void setDefaultStringXmlModusNonDefault(List<Integer> defaultStringXmlModusNonDefault) {
        this.defaultStringXmlModusNonDefault = defaultStringXmlModusNonDefault;
    }

    public Integer getDefaultStringXmlMedianNonDefault() {
        return defaultStringXmlMedianNonDefault;
    }

    public void setDefaultStringXmlMedianNonDefault(Integer defaultStringXmlMedianNonDefault) {
        this.defaultStringXmlMedianNonDefault = defaultStringXmlMedianNonDefault;
    }

    public Integer getDefaultStringXmlMaxNonDefault() {
        return defaultStringXmlMaxNonDefault;
    }

    public void setDefaultStringXmlMaxNonDefault(Integer defaultStringXmlMaxNonDefault) {
        this.defaultStringXmlMaxNonDefault = defaultStringXmlMaxNonDefault;
    }

    public Integer getDefaultStringXmlMinNonDefault() {
        return defaultStringXmlMinNonDefault;
    }

    public void setDefaultStringXmlMinNonDefault(Integer defaultStringXmlMinNonDefault) {
        this.defaultStringXmlMinNonDefault = defaultStringXmlMinNonDefault;
    }

    public BigDecimal getDefaultStringXmlVarianceNonDefault() {
        return defaultStringXmlVarianceNonDefault;
    }

    public void setDefaultStringXmlVarianceNonDefault(BigDecimal defaultStringXmlVarianceNonDefault) {
        this.defaultStringXmlVarianceNonDefault = defaultStringXmlVarianceNonDefault;
    }

    public BigDecimal getDefaultStringXmlDeviationNonDefault() {
        return defaultStringXmlDeviationNonDefault;
    }

    public void setDefaultStringXmlDeviationNonDefault(BigDecimal defaultStringXmlDeviationNonDefault) {
        this.defaultStringXmlDeviationNonDefault = defaultStringXmlDeviationNonDefault;
    }

    public Map<String, PercentagePair> getTopLocalizations() {
        return topLocalizations;
    }

    public void setTopLocalizations(Map<String, PercentagePair> topLocalizations) {
        this.topLocalizations = topLocalizations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalizationsStatistics that = (LocalizationsStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (apksWithLocalizationsObtained != null ? !apksWithLocalizationsObtained.equals(that.apksWithLocalizationsObtained) : that.apksWithLocalizationsObtained != null)
            return false;
        if (localizationsArithmeticMean != null ? !localizationsArithmeticMean.equals(that.localizationsArithmeticMean) : that.localizationsArithmeticMean != null)
            return false;
        if (localizationsModus != null ? !localizationsModus.equals(that.localizationsModus) : that.localizationsModus != null)
            return false;
        if (localizationsMedian != null ? !localizationsMedian.equals(that.localizationsMedian) : that.localizationsMedian != null)
            return false;
        if (localizationsMax != null ? !localizationsMax.equals(that.localizationsMax) : that.localizationsMax != null)
            return false;
        if (localizationsMin != null ? !localizationsMin.equals(that.localizationsMin) : that.localizationsMin != null)
            return false;
        if (localizationsVariance != null ? !localizationsVariance.equals(that.localizationsVariance) : that.localizationsVariance != null)
            return false;
        if (localizationsDeviation != null ? !localizationsDeviation.equals(that.localizationsDeviation) : that.localizationsDeviation != null)
            return false;
        if (numberOfApksWithLocalizationsObtainedNonZero != null ? !numberOfApksWithLocalizationsObtainedNonZero.equals(that.numberOfApksWithLocalizationsObtainedNonZero) : that.numberOfApksWithLocalizationsObtainedNonZero != null)
            return false;
        if (localizationsArithmeticMeanNonZero != null ? !localizationsArithmeticMeanNonZero.equals(that.localizationsArithmeticMeanNonZero) : that.localizationsArithmeticMeanNonZero != null)
            return false;
        if (localizationsModusNonZero != null ? !localizationsModusNonZero.equals(that.localizationsModusNonZero) : that.localizationsModusNonZero != null)
            return false;
        if (localizationsMedianNonZero != null ? !localizationsMedianNonZero.equals(that.localizationsMedianNonZero) : that.localizationsMedianNonZero != null)
            return false;
        if (localizationsMaxNonZero != null ? !localizationsMaxNonZero.equals(that.localizationsMaxNonZero) : that.localizationsMaxNonZero != null)
            return false;
        if (localizationsMinNonZero != null ? !localizationsMinNonZero.equals(that.localizationsMinNonZero) : that.localizationsMinNonZero != null)
            return false;
        if (localizationsVarianceNonZero != null ? !localizationsVarianceNonZero.equals(that.localizationsVarianceNonZero) : that.localizationsVarianceNonZero != null)
            return false;
        if (localizationsDeviationNonZero != null ? !localizationsDeviationNonZero.equals(that.localizationsDeviationNonZero) : that.localizationsDeviationNonZero != null)
            return false;
        if (apksWithDefaultStringXmlObtained != null ? !apksWithDefaultStringXmlObtained.equals(that.apksWithDefaultStringXmlObtained) : that.apksWithDefaultStringXmlObtained != null)
            return false;
        if (defaultStringXmlArithmeticMean != null ? !defaultStringXmlArithmeticMean.equals(that.defaultStringXmlArithmeticMean) : that.defaultStringXmlArithmeticMean != null)
            return false;
        if (defaultStringXmlModus != null ? !defaultStringXmlModus.equals(that.defaultStringXmlModus) : that.defaultStringXmlModus != null)
            return false;
        if (defaultStringXmlMedian != null ? !defaultStringXmlMedian.equals(that.defaultStringXmlMedian) : that.defaultStringXmlMedian != null)
            return false;
        if (defaultStringXmlMax != null ? !defaultStringXmlMax.equals(that.defaultStringXmlMax) : that.defaultStringXmlMax != null)
            return false;
        if (defaultStringXmlMin != null ? !defaultStringXmlMin.equals(that.defaultStringXmlMin) : that.defaultStringXmlMin != null)
            return false;
        if (defaultStringXmlVariance != null ? !defaultStringXmlVariance.equals(that.defaultStringXmlVariance) : that.defaultStringXmlVariance != null)
            return false;
        if (defaultStringXmlDeviation != null ? !defaultStringXmlDeviation.equals(that.defaultStringXmlDeviation) : that.defaultStringXmlDeviation != null)
            return false;
        if (apksWithDefaultStringXmlObtainedNonDefault != null ? !apksWithDefaultStringXmlObtainedNonDefault.equals(that.apksWithDefaultStringXmlObtainedNonDefault) : that.apksWithDefaultStringXmlObtainedNonDefault != null)
            return false;
        if (defaultStringXmlArithmeticMeanNonDefault != null ? !defaultStringXmlArithmeticMeanNonDefault.equals(that.defaultStringXmlArithmeticMeanNonDefault) : that.defaultStringXmlArithmeticMeanNonDefault != null)
            return false;
        if (defaultStringXmlModusNonDefault != null ? !defaultStringXmlModusNonDefault.equals(that.defaultStringXmlModusNonDefault) : that.defaultStringXmlModusNonDefault != null)
            return false;
        if (defaultStringXmlMedianNonDefault != null ? !defaultStringXmlMedianNonDefault.equals(that.defaultStringXmlMedianNonDefault) : that.defaultStringXmlMedianNonDefault != null)
            return false;
        if (defaultStringXmlMaxNonDefault != null ? !defaultStringXmlMaxNonDefault.equals(that.defaultStringXmlMaxNonDefault) : that.defaultStringXmlMaxNonDefault != null)
            return false;
        if (defaultStringXmlMinNonDefault != null ? !defaultStringXmlMinNonDefault.equals(that.defaultStringXmlMinNonDefault) : that.defaultStringXmlMinNonDefault != null)
            return false;
        if (defaultStringXmlVarianceNonDefault != null ? !defaultStringXmlVarianceNonDefault.equals(that.defaultStringXmlVarianceNonDefault) : that.defaultStringXmlVarianceNonDefault != null)
            return false;
        if (defaultStringXmlDeviationNonDefault != null ? !defaultStringXmlDeviationNonDefault.equals(that.defaultStringXmlDeviationNonDefault) : that.defaultStringXmlDeviationNonDefault != null)
            return false;
        return !(topLocalizations != null ? !topLocalizations.equals(that.topLocalizations) : that.topLocalizations != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (apksWithLocalizationsObtained != null ? apksWithLocalizationsObtained.hashCode() : 0);
        result = 31 * result + (localizationsArithmeticMean != null ? localizationsArithmeticMean.hashCode() : 0);
        result = 31 * result + (localizationsModus != null ? localizationsModus.hashCode() : 0);
        result = 31 * result + (localizationsMedian != null ? localizationsMedian.hashCode() : 0);
        result = 31 * result + (localizationsMax != null ? localizationsMax.hashCode() : 0);
        result = 31 * result + (localizationsMin != null ? localizationsMin.hashCode() : 0);
        result = 31 * result + (localizationsVariance != null ? localizationsVariance.hashCode() : 0);
        result = 31 * result + (localizationsDeviation != null ? localizationsDeviation.hashCode() : 0);
        result = 31 * result + (numberOfApksWithLocalizationsObtainedNonZero != null ? numberOfApksWithLocalizationsObtainedNonZero.hashCode() : 0);
        result = 31 * result + (localizationsArithmeticMeanNonZero != null ? localizationsArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (localizationsModusNonZero != null ? localizationsModusNonZero.hashCode() : 0);
        result = 31 * result + (localizationsMedianNonZero != null ? localizationsMedianNonZero.hashCode() : 0);
        result = 31 * result + (localizationsMaxNonZero != null ? localizationsMaxNonZero.hashCode() : 0);
        result = 31 * result + (localizationsMinNonZero != null ? localizationsMinNonZero.hashCode() : 0);
        result = 31 * result + (localizationsVarianceNonZero != null ? localizationsVarianceNonZero.hashCode() : 0);
        result = 31 * result + (localizationsDeviationNonZero != null ? localizationsDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithDefaultStringXmlObtained != null ? apksWithDefaultStringXmlObtained.hashCode() : 0);
        result = 31 * result + (defaultStringXmlArithmeticMean != null ? defaultStringXmlArithmeticMean.hashCode() : 0);
        result = 31 * result + (defaultStringXmlModus != null ? defaultStringXmlModus.hashCode() : 0);
        result = 31 * result + (defaultStringXmlMedian != null ? defaultStringXmlMedian.hashCode() : 0);
        result = 31 * result + (defaultStringXmlMax != null ? defaultStringXmlMax.hashCode() : 0);
        result = 31 * result + (defaultStringXmlMin != null ? defaultStringXmlMin.hashCode() : 0);
        result = 31 * result + (defaultStringXmlVariance != null ? defaultStringXmlVariance.hashCode() : 0);
        result = 31 * result + (defaultStringXmlDeviation != null ? defaultStringXmlDeviation.hashCode() : 0);
        result = 31 * result + (apksWithDefaultStringXmlObtainedNonDefault != null ? apksWithDefaultStringXmlObtainedNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlArithmeticMeanNonDefault != null ? defaultStringXmlArithmeticMeanNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlModusNonDefault != null ? defaultStringXmlModusNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlMedianNonDefault != null ? defaultStringXmlMedianNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlMaxNonDefault != null ? defaultStringXmlMaxNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlMinNonDefault != null ? defaultStringXmlMinNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlVarianceNonDefault != null ? defaultStringXmlVarianceNonDefault.hashCode() : 0);
        result = 31 * result + (defaultStringXmlDeviationNonDefault != null ? defaultStringXmlDeviationNonDefault.hashCode() : 0);
        result = 31 * result + (topLocalizations != null ? topLocalizations.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LocalizationsStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", apksWithLocalizationsObtained=" + apksWithLocalizationsObtained +
                ", localizationsArithmeticMean=" + localizationsArithmeticMean +
                ", localizationsModus=" + localizationsModus +
                ", localizationsMedian=" + localizationsMedian +
                ", localizationsMax=" + localizationsMax +
                ", localizationsMin=" + localizationsMin +
                ", localizationsVariance=" + localizationsVariance +
                ", localizationsDeviation=" + localizationsDeviation +
                ", numberOfApksWithLocalizationsObtainedNonZero=" + numberOfApksWithLocalizationsObtainedNonZero +
                ", localizationsArithmeticMeanNonZero=" + localizationsArithmeticMeanNonZero +
                ", localizationsModusNonZero=" + localizationsModusNonZero +
                ", localizationsMedianNonZero=" + localizationsMedianNonZero +
                ", localizationsMaxNonZero=" + localizationsMaxNonZero +
                ", localizationsMinNonZero=" + localizationsMinNonZero +
                ", localizationsVarianceNonZero=" + localizationsVarianceNonZero +
                ", localizationsDeviationNonZero=" + localizationsDeviationNonZero +
                ", apksWithDefaultStringXmlObtained=" + apksWithDefaultStringXmlObtained +
                ", defaultStringXmlArithmeticMean=" + defaultStringXmlArithmeticMean +
                ", defaultStringXmlModus=" + defaultStringXmlModus +
                ", defaultStringXmlMedian=" + defaultStringXmlMedian +
                ", defaultStringXmlMax=" + defaultStringXmlMax +
                ", defaultStringXmlMin=" + defaultStringXmlMin +
                ", defaultStringXmlVariance=" + defaultStringXmlVariance +
                ", defaultStringXmlDeviation=" + defaultStringXmlDeviation +
                ", apksWithDefaultStringXmlObtainedNonDefault=" + apksWithDefaultStringXmlObtainedNonDefault +
                ", defaultStringXmlArithmeticMeanNonDefault=" + defaultStringXmlArithmeticMeanNonDefault +
                ", defaultStringXmlModusNonDefault=" + defaultStringXmlModusNonDefault +
                ", defaultStringXmlMedianNonDefault=" + defaultStringXmlMedianNonDefault +
                ", defaultStringXmlMaxNonDefault=" + defaultStringXmlMaxNonDefault +
                ", defaultStringXmlMinNonDefault=" + defaultStringXmlMinNonDefault +
                ", defaultStringXmlVarianceNonDefault=" + defaultStringXmlVarianceNonDefault +
                ", defaultStringXmlDeviationNonDefault=" + defaultStringXmlDeviationNonDefault +
                ", topLocalizations=" + topLocalizations +
                '}';
    }
}

