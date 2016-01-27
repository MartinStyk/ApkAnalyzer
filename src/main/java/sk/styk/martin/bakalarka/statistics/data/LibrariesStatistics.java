package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class LibrariesStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;

    private MathStatistics libraries;
    private MathStatistics librariesNonZero;

    private Map<String, PercentagePair> topLibraries;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getLibraries() {
        return libraries;
    }

    public void setLibraries(MathStatistics libraries) {
        this.libraries = libraries;
    }

    public MathStatistics getLibrariesNonZero() {
        return librariesNonZero;
    }

    public void setLibrariesNonZero(MathStatistics librariesNonZero) {
        this.librariesNonZero = librariesNonZero;
    }

    public Map<String, PercentagePair> getTopLibraries() {
        return topLibraries;
    }

    public void setTopLibraries(Map<String, PercentagePair> topLibraries) {
        this.topLibraries = topLibraries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibrariesStatistics that = (LibrariesStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (libraries != null ? !libraries.equals(that.libraries) : that.libraries != null) return false;
        if (librariesNonZero != null ? !librariesNonZero.equals(that.librariesNonZero) : that.librariesNonZero != null)
            return false;
        return !(topLibraries != null ? !topLibraries.equals(that.topLibraries) : that.topLibraries != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (libraries != null ? libraries.hashCode() : 0);
        result = 31 * result + (librariesNonZero != null ? librariesNonZero.hashCode() : 0);
        result = 31 * result + (topLibraries != null ? topLibraries.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibrariesStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", libraries=" + libraries +
                ", librariesNonZero=" + librariesNonZero +
                ", topLibraries=" + topLibraries +
                '}';
    }
}