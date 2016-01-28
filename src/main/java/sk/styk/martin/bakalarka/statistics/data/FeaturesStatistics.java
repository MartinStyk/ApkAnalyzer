package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FeaturesStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;

    private MathStatistics features;
    private MathStatistics featuresNonZero;

    private Map<String, PercentagePair> topFeatures;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getFeatures() {
        return features;
    }

    public void setFeatures(MathStatistics features) {
        this.features = features;
    }

    public MathStatistics getFeaturesNonZero() {
        return featuresNonZero;
    }

    public void setFeaturesNonZero(MathStatistics featuresNonZero) {
        this.featuresNonZero = featuresNonZero;
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
        if (features != null ? !features.equals(that.features) : that.features != null) return false;
        if (featuresNonZero != null ? !featuresNonZero.equals(that.featuresNonZero) : that.featuresNonZero != null)
            return false;
        return !(topFeatures != null ? !topFeatures.equals(that.topFeatures) : that.topFeatures != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (features != null ? features.hashCode() : 0);
        result = 31 * result + (featuresNonZero != null ? featuresNonZero.hashCode() : 0);
        result = 31 * result + (topFeatures != null ? topFeatures.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FeaturesStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", features=" + features +
                ", featuresNonZero=" + featuresNonZero +
                ", topFeatures=" + topFeatures +
                '}';
    }
}