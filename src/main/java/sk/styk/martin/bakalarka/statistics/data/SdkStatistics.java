package sk.styk.martin.bakalarka.statistics.data;

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
}
