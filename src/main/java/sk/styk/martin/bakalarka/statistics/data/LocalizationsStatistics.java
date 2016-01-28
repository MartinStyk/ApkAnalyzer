package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;
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

    private MathStatistics localizationNumber;
    private MathStatistics localizationNumberNonZero;

    private MathStatistics defaultStringXmlEntries;
    /**
     * conatining more than one element
     */
    private MathStatistics defaultStringXmlEntriesNonDefault;
    /**
     * normalized locale - i.e. en-GB equal eng-US
     * some apks contains strings.xml file in strange directories.
     */
    private Map<String, PercentagePair> topLocalizationsNormalized;
    private Map<String, PercentagePair> topLocalizations;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getLocalizationNumber() {
        return localizationNumber;
    }

    public void setLocalizationNumber(MathStatistics localizationNumber) {
        this.localizationNumber = localizationNumber;
    }

    public MathStatistics getLocalizationNumberNonZero() {
        return localizationNumberNonZero;
    }

    public void setLocalizationNumberNonZero(MathStatistics localizationNumberNonZero) {
        this.localizationNumberNonZero = localizationNumberNonZero;
    }

    public MathStatistics getDefaultStringXmlEntries() {
        return defaultStringXmlEntries;
    }

    public void setDefaultStringXmlEntries(MathStatistics defaultStringXmlEntries) {
        this.defaultStringXmlEntries = defaultStringXmlEntries;
    }

    public MathStatistics getDefaultStringXmlEntriesNonDefault() {
        return defaultStringXmlEntriesNonDefault;
    }

    public void setDefaultStringXmlEntriesNonDefault(MathStatistics defaultStringXmlEntriesNonDefault) {
        this.defaultStringXmlEntriesNonDefault = defaultStringXmlEntriesNonDefault;
    }

    public Map<String, PercentagePair> getTopLocalizations() {
        return topLocalizations;
    }

    public void setTopLocalizations(Map<String, PercentagePair> topLocalizations) {
        this.topLocalizations = topLocalizations;
    }

    public Map<String, PercentagePair> getTopLocalizationsNormalized() {
        return topLocalizationsNormalized;
    }

    public void setTopLocalizationsNormalized(Map<String, PercentagePair> topLocalizationsNormalized) {
        this.topLocalizationsNormalized = topLocalizationsNormalized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalizationsStatistics that = (LocalizationsStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (localizationNumber != null ? !localizationNumber.equals(that.localizationNumber) : that.localizationNumber != null)
            return false;
        if (localizationNumberNonZero != null ? !localizationNumberNonZero.equals(that.localizationNumberNonZero) : that.localizationNumberNonZero != null)
            return false;
        if (defaultStringXmlEntries != null ? !defaultStringXmlEntries.equals(that.defaultStringXmlEntries) : that.defaultStringXmlEntries != null)
            return false;
        if (defaultStringXmlEntriesNonDefault != null ? !defaultStringXmlEntriesNonDefault.equals(that.defaultStringXmlEntriesNonDefault) : that.defaultStringXmlEntriesNonDefault != null)
            return false;
        if (topLocalizationsNormalized != null ? !topLocalizationsNormalized.equals(that.topLocalizationsNormalized) : that.topLocalizationsNormalized != null)
            return false;
        return !(topLocalizations != null ? !topLocalizations.equals(that.topLocalizations) : that.topLocalizations != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (localizationNumber != null ? localizationNumber.hashCode() : 0);
        result = 31 * result + (localizationNumberNonZero != null ? localizationNumberNonZero.hashCode() : 0);
        result = 31 * result + (defaultStringXmlEntries != null ? defaultStringXmlEntries.hashCode() : 0);
        result = 31 * result + (defaultStringXmlEntriesNonDefault != null ? defaultStringXmlEntriesNonDefault.hashCode() : 0);
        result = 31 * result + (topLocalizationsNormalized != null ? topLocalizationsNormalized.hashCode() : 0);
        result = 31 * result + (topLocalizations != null ? topLocalizations.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LocalizationsStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", localizationNumber=" + localizationNumber +
                ", localizationNumberNonZero=" + localizationNumberNonZero +
                ", defaultStringXmlEntries=" + defaultStringXmlEntries +
                ", defaultStringXmlEntriesNonDefault=" + defaultStringXmlEntriesNonDefault +
                ", topLocalizationsNormalized=" + topLocalizationsNormalized +
                ", topLocalizations=" + topLocalizations +
                '}';
    }
}