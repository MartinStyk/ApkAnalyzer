package sk.styk.martin.bakalarka.statistics.data;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class ScreenStatistics {

    /**
     * number of apks with data successfully collected from android manifest
     */
    private Integer analyzedApks;

    private PercentagePair supportsScreensResizeableObtained;
    private Map<String, PercentagePair> supportsScreensResizeable;

    private PercentagePair supportsScreensSmallObtained;
    private Map<String, PercentagePair> supportsScreensSmall;

    private PercentagePair supportsScreensNormalObtained;
    private Map<String, PercentagePair> supportsScreensNormal;

    private PercentagePair supportsScreensLargeObtained;
    private Map<String, PercentagePair> supportsScreensLarge;

    private PercentagePair supportsScreensXlargeObtained;
    private Map<String, PercentagePair> supportsScreensXlarge;

    private PercentagePair supportsScreensAnyDensityObtained;
    private Map<String, PercentagePair> supportsScreensAnyDensity;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public PercentagePair getSupportsScreensResizeableObtained() {
        return supportsScreensResizeableObtained;
    }

    public void setSupportsScreensResizeableObtained(PercentagePair supportsScreensResizeableObtained) {
        this.supportsScreensResizeableObtained = supportsScreensResizeableObtained;
    }

    public Map<String, PercentagePair> getSupportsScreensResizeable() {
        return supportsScreensResizeable;
    }

    public void setSupportsScreensResizeable(Map<String, PercentagePair> supportsScreensResizeable) {
        this.supportsScreensResizeable = supportsScreensResizeable;
    }

    public PercentagePair getSupportsScreensSmallObtained() {
        return supportsScreensSmallObtained;
    }

    public void setSupportsScreensSmallObtained(PercentagePair supportsScreensSmallObtained) {
        this.supportsScreensSmallObtained = supportsScreensSmallObtained;
    }

    public Map<String, PercentagePair> getSupportsScreensSmall() {
        return supportsScreensSmall;
    }

    public void setSupportsScreensSmall(Map<String, PercentagePair> supportsScreensSmall) {
        this.supportsScreensSmall = supportsScreensSmall;
    }

    public PercentagePair getSupportsScreensNormalObtained() {
        return supportsScreensNormalObtained;
    }

    public void setSupportsScreensNormalObtained(PercentagePair supportsScreensNormalObtained) {
        this.supportsScreensNormalObtained = supportsScreensNormalObtained;
    }

    public Map<String, PercentagePair> getSupportsScreensNormal() {
        return supportsScreensNormal;
    }

    public void setSupportsScreensNormal(Map<String, PercentagePair> supportsScreensNormal) {
        this.supportsScreensNormal = supportsScreensNormal;
    }

    public PercentagePair getSupportsScreensLargeObtained() {
        return supportsScreensLargeObtained;
    }

    public void setSupportsScreensLargeObtained(PercentagePair supportsScreensLargeObtained) {
        this.supportsScreensLargeObtained = supportsScreensLargeObtained;
    }

    public Map<String, PercentagePair> getSupportsScreensLarge() {
        return supportsScreensLarge;
    }

    public void setSupportsScreensLarge(Map<String, PercentagePair> supportsScreensLarge) {
        this.supportsScreensLarge = supportsScreensLarge;
    }

    public PercentagePair getSupportsScreensXlargeObtained() {
        return supportsScreensXlargeObtained;
    }

    public void setSupportsScreensXlargeObtained(PercentagePair supportsScreensXlargeObtained) {
        this.supportsScreensXlargeObtained = supportsScreensXlargeObtained;
    }

    public Map<String, PercentagePair> getSupportsScreensXlarge() {
        return supportsScreensXlarge;
    }

    public void setSupportsScreensXlarge(Map<String, PercentagePair> supportsScreensXlarge) {
        this.supportsScreensXlarge = supportsScreensXlarge;
    }

    public PercentagePair getSupportsScreensAnyDensityObtained() {
        return supportsScreensAnyDensityObtained;
    }

    public void setSupportsScreensAnyDensityObtained(PercentagePair supportsScreensAnyDensityObtained) {
        this.supportsScreensAnyDensityObtained = supportsScreensAnyDensityObtained;
    }

    public Map<String, PercentagePair> getSupportsScreensAnyDensity() {
        return supportsScreensAnyDensity;
    }

    public void setSupportsScreensAnyDensity(Map<String, PercentagePair> supportsScreensAnyDensity) {
        this.supportsScreensAnyDensity = supportsScreensAnyDensity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScreenStatistics that = (ScreenStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (supportsScreensResizeableObtained != null ? !supportsScreensResizeableObtained.equals(that.supportsScreensResizeableObtained) : that.supportsScreensResizeableObtained != null)
            return false;
        if (supportsScreensResizeable != null ? !supportsScreensResizeable.equals(that.supportsScreensResizeable) : that.supportsScreensResizeable != null)
            return false;
        if (supportsScreensSmallObtained != null ? !supportsScreensSmallObtained.equals(that.supportsScreensSmallObtained) : that.supportsScreensSmallObtained != null)
            return false;
        if (supportsScreensSmall != null ? !supportsScreensSmall.equals(that.supportsScreensSmall) : that.supportsScreensSmall != null)
            return false;
        if (supportsScreensNormalObtained != null ? !supportsScreensNormalObtained.equals(that.supportsScreensNormalObtained) : that.supportsScreensNormalObtained != null)
            return false;
        if (supportsScreensNormal != null ? !supportsScreensNormal.equals(that.supportsScreensNormal) : that.supportsScreensNormal != null)
            return false;
        if (supportsScreensLargeObtained != null ? !supportsScreensLargeObtained.equals(that.supportsScreensLargeObtained) : that.supportsScreensLargeObtained != null)
            return false;
        if (supportsScreensLarge != null ? !supportsScreensLarge.equals(that.supportsScreensLarge) : that.supportsScreensLarge != null)
            return false;
        if (supportsScreensXlargeObtained != null ? !supportsScreensXlargeObtained.equals(that.supportsScreensXlargeObtained) : that.supportsScreensXlargeObtained != null)
            return false;
        if (supportsScreensXlarge != null ? !supportsScreensXlarge.equals(that.supportsScreensXlarge) : that.supportsScreensXlarge != null)
            return false;
        if (supportsScreensAnyDensityObtained != null ? !supportsScreensAnyDensityObtained.equals(that.supportsScreensAnyDensityObtained) : that.supportsScreensAnyDensityObtained != null)
            return false;
        return !(supportsScreensAnyDensity != null ? !supportsScreensAnyDensity.equals(that.supportsScreensAnyDensity) : that.supportsScreensAnyDensity != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (supportsScreensResizeableObtained != null ? supportsScreensResizeableObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensResizeable != null ? supportsScreensResizeable.hashCode() : 0);
        result = 31 * result + (supportsScreensSmallObtained != null ? supportsScreensSmallObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensSmall != null ? supportsScreensSmall.hashCode() : 0);
        result = 31 * result + (supportsScreensNormalObtained != null ? supportsScreensNormalObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensNormal != null ? supportsScreensNormal.hashCode() : 0);
        result = 31 * result + (supportsScreensLargeObtained != null ? supportsScreensLargeObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensLarge != null ? supportsScreensLarge.hashCode() : 0);
        result = 31 * result + (supportsScreensXlargeObtained != null ? supportsScreensXlargeObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensXlarge != null ? supportsScreensXlarge.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensityObtained != null ? supportsScreensAnyDensityObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensity != null ? supportsScreensAnyDensity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ScreenStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", supportsScreensResizeableObtained=" + supportsScreensResizeableObtained +
                ", supportsScreensResizeable=" + supportsScreensResizeable +
                ", supportsScreensSmallObtained=" + supportsScreensSmallObtained +
                ", supportsScreensSmall=" + supportsScreensSmall +
                ", supportsScreensNormalObtained=" + supportsScreensNormalObtained +
                ", supportsScreensNormal=" + supportsScreensNormal +
                ", supportsScreensLargeObtained=" + supportsScreensLargeObtained +
                ", supportsScreensLarge=" + supportsScreensLarge +
                ", supportsScreensXlargeObtained=" + supportsScreensXlargeObtained +
                ", supportsScreensXlarge=" + supportsScreensXlarge +
                ", supportsScreensAnyDensityObtained=" + supportsScreensAnyDensityObtained +
                ", supportsScreensAnyDensity=" + supportsScreensAnyDensity +
                '}';
    }
}

