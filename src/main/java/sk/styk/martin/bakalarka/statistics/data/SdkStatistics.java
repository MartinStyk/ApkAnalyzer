package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class SdkStatistics {
    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;
    /**
     * number of apks with uses-sdk tag found in manifest
     * Pair(number, percentage whole-anlyzed apks, part number)
     */
    private PercentagePair apksWithGeneralUsesSdkTagObtained;

    //sdk
    private PercentagePair apksWithMinSdkTagObtained;
    private Map<String, PercentagePair> topMinSdk;

    private PercentagePair apksWithTargetSdkTagObtained;
    private Map<String, PercentagePair> topTargetSdk;

    private PercentagePair apksWithMaxSdkTagObtained;
    private Map<String, PercentagePair> topMaxSdk;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public PercentagePair getApksWithGeneralUsesSdkTagObtained() {
        return apksWithGeneralUsesSdkTagObtained;
    }

    public void setApksWithGeneralUsesSdkTagObtained(PercentagePair apksWithSdkTagObtained) {
        this.apksWithGeneralUsesSdkTagObtained = apksWithSdkTagObtained;
    }

    public PercentagePair getApksWithMinSdkTagObtained() {
        return apksWithMinSdkTagObtained;
    }

    public void setApksWithMinSdkTagObtained(PercentagePair apksWithMinSdkTagObtained) {
        this.apksWithMinSdkTagObtained = apksWithMinSdkTagObtained;
    }

    public Map<String, PercentagePair> getTopMinSdk() {
        return topMinSdk;
    }

    public void setTopMinSdk(Map<String, PercentagePair> topMinSdk) {
        this.topMinSdk = topMinSdk;
    }

    public PercentagePair getApksWithTargetSdkTagObtained() {
        return apksWithTargetSdkTagObtained;
    }

    public void setApksWithTargetSdkTagObtained(PercentagePair apksWithTargetSdkTagObtained) {
        this.apksWithTargetSdkTagObtained = apksWithTargetSdkTagObtained;
    }

    public Map<String, PercentagePair> getTopTargetSdk() {
        return topTargetSdk;
    }

    public void setTopTargetSdk(Map<String, PercentagePair> topTargetSdk) {
        this.topTargetSdk = topTargetSdk;
    }

    public PercentagePair getApksWithMaxSdkTagObtained() {
        return apksWithMaxSdkTagObtained;
    }

    public void setApksWithMaxSdkTagObtained(PercentagePair apksWithMaxSdkTagObtained) {
        this.apksWithMaxSdkTagObtained = apksWithMaxSdkTagObtained;
    }

    public Map<String, PercentagePair> getTopMaxSdk() {
        return topMaxSdk;
    }

    public void setTopMaxSdk(Map<String, PercentagePair> topMaxSdk) {
        this.topMaxSdk = topMaxSdk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SdkStatistics that = (SdkStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (apksWithGeneralUsesSdkTagObtained != null ? !apksWithGeneralUsesSdkTagObtained.equals(that.apksWithGeneralUsesSdkTagObtained) : that.apksWithGeneralUsesSdkTagObtained != null)
            return false;
        if (apksWithMinSdkTagObtained != null ? !apksWithMinSdkTagObtained.equals(that.apksWithMinSdkTagObtained) : that.apksWithMinSdkTagObtained != null)
            return false;
        if (topMinSdk != null ? !topMinSdk.equals(that.topMinSdk) : that.topMinSdk != null) return false;
        if (apksWithTargetSdkTagObtained != null ? !apksWithTargetSdkTagObtained.equals(that.apksWithTargetSdkTagObtained) : that.apksWithTargetSdkTagObtained != null)
            return false;
        if (topTargetSdk != null ? !topTargetSdk.equals(that.topTargetSdk) : that.topTargetSdk != null) return false;
        if (apksWithMaxSdkTagObtained != null ? !apksWithMaxSdkTagObtained.equals(that.apksWithMaxSdkTagObtained) : that.apksWithMaxSdkTagObtained != null)
            return false;
        return !(topMaxSdk != null ? !topMaxSdk.equals(that.topMaxSdk) : that.topMaxSdk != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (apksWithGeneralUsesSdkTagObtained != null ? apksWithGeneralUsesSdkTagObtained.hashCode() : 0);
        result = 31 * result + (apksWithMinSdkTagObtained != null ? apksWithMinSdkTagObtained.hashCode() : 0);
        result = 31 * result + (topMinSdk != null ? topMinSdk.hashCode() : 0);
        result = 31 * result + (apksWithTargetSdkTagObtained != null ? apksWithTargetSdkTagObtained.hashCode() : 0);
        result = 31 * result + (topTargetSdk != null ? topTargetSdk.hashCode() : 0);
        result = 31 * result + (apksWithMaxSdkTagObtained != null ? apksWithMaxSdkTagObtained.hashCode() : 0);
        result = 31 * result + (topMaxSdk != null ? topMaxSdk.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SdkStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", apksWithGeneralUsesSdkTagObtained=" + apksWithGeneralUsesSdkTagObtained +
                ", apksWithMinSdkTagObtained=" + apksWithMinSdkTagObtained +
                ", topMinSdk=" + topMinSdk +
                ", apksWithTargetSdkTagObtained=" + apksWithTargetSdkTagObtained +
                ", topTargetSdk=" + topTargetSdk +
                ", apksWithMaxSdkTagObtained=" + apksWithMaxSdkTagObtained +
                ", topMaxSdk=" + topMaxSdk +
                '}';
    }
}
