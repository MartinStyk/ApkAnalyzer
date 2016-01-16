package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class ScreenStatistics {

    private Integer supportsScreensResizeableObtained;
    private Integer supportsScreensResizeablePercentage;

    private Integer supportsScreensSmallObtained;
    private Integer supportsScreensSmallPercentage;

    private Integer supportsScreensNormalObtained;
    private Integer supportsScreensNormalPercentage;

    private Integer supportsScreensLargeObtained;
    private Integer supportsScreensLargePercentage;

    private Integer supportsScreensXlargeObtained;
    private Integer supportsScreensXlargePercentage;

    private Integer supportsScreensAnyDensityObtained;
    private Integer supportsScreensAnyDensityPercentage;

    public Integer getSupportsScreensResizeableObtained() {
        return supportsScreensResizeableObtained;
    }

    public void setSupportsScreensResizeableObtained(Integer supportsScreensResizeableObtained) {
        this.supportsScreensResizeableObtained = supportsScreensResizeableObtained;
    }

    public Integer getSupportsScreensResizeablePercentage() {
        return supportsScreensResizeablePercentage;
    }

    public void setSupportsScreensResizeablePercentage(Integer supportsScreensResizeablePercentage) {
        this.supportsScreensResizeablePercentage = supportsScreensResizeablePercentage;
    }

    public Integer getSupportsScreensSmallObtained() {
        return supportsScreensSmallObtained;
    }

    public void setSupportsScreensSmallObtained(Integer supportsScreensSmallObtained) {
        this.supportsScreensSmallObtained = supportsScreensSmallObtained;
    }

    public Integer getSupportsScreensSmallPercentage() {
        return supportsScreensSmallPercentage;
    }

    public void setSupportsScreensSmallPercentage(Integer supportsScreensSmallPercentage) {
        this.supportsScreensSmallPercentage = supportsScreensSmallPercentage;
    }

    public Integer getSupportsScreensNormalObtained() {
        return supportsScreensNormalObtained;
    }

    public void setSupportsScreensNormalObtained(Integer supportsScreensNormalObtained) {
        this.supportsScreensNormalObtained = supportsScreensNormalObtained;
    }

    public Integer getSupportsScreensNormalPercentage() {
        return supportsScreensNormalPercentage;
    }

    public void setSupportsScreensNormalPercentage(Integer supportsScreensNormalPercentage) {
        this.supportsScreensNormalPercentage = supportsScreensNormalPercentage;
    }

    public Integer getSupportsScreensLargeObtained() {
        return supportsScreensLargeObtained;
    }

    public void setSupportsScreensLargeObtained(Integer supportsScreensLargeObtained) {
        this.supportsScreensLargeObtained = supportsScreensLargeObtained;
    }

    public Integer getSupportsScreensLargePercentage() {
        return supportsScreensLargePercentage;
    }

    public void setSupportsScreensLargePercentage(Integer supportsScreensLargePercentage) {
        this.supportsScreensLargePercentage = supportsScreensLargePercentage;
    }

    public Integer getSupportsScreensXlargeObtained() {
        return supportsScreensXlargeObtained;
    }

    public void setSupportsScreensXlargeObtained(Integer supportsScreensXlargeObtained) {
        this.supportsScreensXlargeObtained = supportsScreensXlargeObtained;
    }

    public Integer getSupportsScreensXlargePercentage() {
        return supportsScreensXlargePercentage;
    }

    public void setSupportsScreensXlargePercentage(Integer supportsScreensXlargePercentage) {
        this.supportsScreensXlargePercentage = supportsScreensXlargePercentage;
    }

    public Integer getSupportsScreensAnyDensityObtained() {
        return supportsScreensAnyDensityObtained;
    }

    public void setSupportsScreensAnyDensityObtained(Integer supportsScreensAnyDensityObtained) {
        this.supportsScreensAnyDensityObtained = supportsScreensAnyDensityObtained;
    }

    public Integer getSupportsScreensAnyDensityPercentage() {
        return supportsScreensAnyDensityPercentage;
    }

    public void setSupportsScreensAnyDensityPercentage(Integer supportsScreensAnyDensityPercentage) {
        this.supportsScreensAnyDensityPercentage = supportsScreensAnyDensityPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScreenStatistics that = (ScreenStatistics) o;

        if (supportsScreensResizeableObtained != null ? !supportsScreensResizeableObtained.equals(that.supportsScreensResizeableObtained) : that.supportsScreensResizeableObtained != null)
            return false;
        if (supportsScreensResizeablePercentage != null ? !supportsScreensResizeablePercentage.equals(that.supportsScreensResizeablePercentage) : that.supportsScreensResizeablePercentage != null)
            return false;
        if (supportsScreensSmallObtained != null ? !supportsScreensSmallObtained.equals(that.supportsScreensSmallObtained) : that.supportsScreensSmallObtained != null)
            return false;
        if (supportsScreensSmallPercentage != null ? !supportsScreensSmallPercentage.equals(that.supportsScreensSmallPercentage) : that.supportsScreensSmallPercentage != null)
            return false;
        if (supportsScreensNormalObtained != null ? !supportsScreensNormalObtained.equals(that.supportsScreensNormalObtained) : that.supportsScreensNormalObtained != null)
            return false;
        if (supportsScreensNormalPercentage != null ? !supportsScreensNormalPercentage.equals(that.supportsScreensNormalPercentage) : that.supportsScreensNormalPercentage != null)
            return false;
        if (supportsScreensLargeObtained != null ? !supportsScreensLargeObtained.equals(that.supportsScreensLargeObtained) : that.supportsScreensLargeObtained != null)
            return false;
        if (supportsScreensLargePercentage != null ? !supportsScreensLargePercentage.equals(that.supportsScreensLargePercentage) : that.supportsScreensLargePercentage != null)
            return false;
        if (supportsScreensXlargeObtained != null ? !supportsScreensXlargeObtained.equals(that.supportsScreensXlargeObtained) : that.supportsScreensXlargeObtained != null)
            return false;
        if (supportsScreensXlargePercentage != null ? !supportsScreensXlargePercentage.equals(that.supportsScreensXlargePercentage) : that.supportsScreensXlargePercentage != null)
            return false;
        if (supportsScreensAnyDensityObtained != null ? !supportsScreensAnyDensityObtained.equals(that.supportsScreensAnyDensityObtained) : that.supportsScreensAnyDensityObtained != null)
            return false;
        return !(supportsScreensAnyDensityPercentage != null ? !supportsScreensAnyDensityPercentage.equals(that.supportsScreensAnyDensityPercentage) : that.supportsScreensAnyDensityPercentage != null);

    }

    @Override
    public int hashCode() {
        int result = supportsScreensResizeableObtained != null ? supportsScreensResizeableObtained.hashCode() : 0;
        result = 31 * result + (supportsScreensResizeablePercentage != null ? supportsScreensResizeablePercentage.hashCode() : 0);
        result = 31 * result + (supportsScreensSmallObtained != null ? supportsScreensSmallObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensSmallPercentage != null ? supportsScreensSmallPercentage.hashCode() : 0);
        result = 31 * result + (supportsScreensNormalObtained != null ? supportsScreensNormalObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensNormalPercentage != null ? supportsScreensNormalPercentage.hashCode() : 0);
        result = 31 * result + (supportsScreensLargeObtained != null ? supportsScreensLargeObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensLargePercentage != null ? supportsScreensLargePercentage.hashCode() : 0);
        result = 31 * result + (supportsScreensXlargeObtained != null ? supportsScreensXlargeObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensXlargePercentage != null ? supportsScreensXlargePercentage.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensityObtained != null ? supportsScreensAnyDensityObtained.hashCode() : 0);
        result = 31 * result + (supportsScreensAnyDensityPercentage != null ? supportsScreensAnyDensityPercentage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ScreenStatistics{" +
                "supportsScreensResizeableObtained=" + supportsScreensResizeableObtained +
                ", supportsScreensResizeablePercentage=" + supportsScreensResizeablePercentage +
                ", supportsScreensSmallObtained=" + supportsScreensSmallObtained +
                ", supportsScreensSmallPercentage=" + supportsScreensSmallPercentage +
                ", supportsScreensNormalObtained=" + supportsScreensNormalObtained +
                ", supportsScreensNormalPercentage=" + supportsScreensNormalPercentage +
                ", supportsScreensLargeObtained=" + supportsScreensLargeObtained +
                ", supportsScreensLargePercentage=" + supportsScreensLargePercentage +
                ", supportsScreensXlargeObtained=" + supportsScreensXlargeObtained +
                ", supportsScreensXlargePercentage=" + supportsScreensXlargePercentage +
                ", supportsScreensAnyDensityObtained=" + supportsScreensAnyDensityObtained +
                ", supportsScreensAnyDensityPercentage=" + supportsScreensAnyDensityPercentage +
                '}';
    }
}
