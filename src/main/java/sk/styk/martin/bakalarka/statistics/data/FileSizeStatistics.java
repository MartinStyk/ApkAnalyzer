package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FileSizeStatistics {

    //file size
    private Integer fileSizeTotalApks;
    private Long fileSizeArithmeticMean;
    private Long fileSizeMedian;
    private Long fileSizeMax;
    private Long fileSizeMin;
    private Long fileSizeVariance;
    private Long fileSizeDeviation;

    //dex size
    private Integer dexSizeTotalApks;
    private Long dexSizeArithmeticMean;
    private Long dexSizeMedian;
    private Long dexSizeMax;
    private Long dexSizeMin;
    private Long dexSizeVariance;
    private Long dexSizeDeviation;

    //arsc size
    private Integer arscSizeTotalApks;
    private Long arscSizeArithmeticMean;
    private Long arscSizeMedian;
    private Long arscSizeMax;
    private Long arscSizeMin;
    private Long arscSizeVariance;
    private Long arscSizeDeviation;

    public Integer getFileSizeTotalApks() {
        return fileSizeTotalApks;
    }

    public void setFileSizeTotalApks(Integer fileSizeTotalApks) {
        this.fileSizeTotalApks = fileSizeTotalApks;
    }

    public Long getFileSizeArithmeticMean() {
        return fileSizeArithmeticMean;
    }

    public void setFileSizeArithmeticMean(Long fileSizeArithmeticMean) {
        this.fileSizeArithmeticMean = fileSizeArithmeticMean;
    }

    public Long getFileSizeMedian() {
        return fileSizeMedian;
    }

    public void setFileSizeMedian(Long fileSizeMedian) {
        this.fileSizeMedian = fileSizeMedian;
    }

    public Integer getDexSizeTotalApks() {
        return dexSizeTotalApks;
    }

    public void setDexSizeTotalApks(Integer dexSizeTotalApks) {
        this.dexSizeTotalApks = dexSizeTotalApks;
    }

    public Long getDexSizeArithmeticMean() {
        return dexSizeArithmeticMean;
    }

    public void setDexSizeArithmeticMean(Long dexSizeArithmeticMean) {
        this.dexSizeArithmeticMean = dexSizeArithmeticMean;
    }

    public Long getDexSizeMedian() {
        return dexSizeMedian;
    }

    public void setDexSizeMedian(Long dexSizeMedian) {
        this.dexSizeMedian = dexSizeMedian;
    }

    public Integer getArscSizeTotalApks() {
        return arscSizeTotalApks;
    }

    public void setArscSizeTotalApks(Integer arscSizeTotalApks) {
        this.arscSizeTotalApks = arscSizeTotalApks;
    }

    public Long getArscSizeArithmeticMean() {
        return arscSizeArithmeticMean;
    }

    public void setArscSizeArithmeticMean(Long arscSizeArithmeticMean) {
        this.arscSizeArithmeticMean = arscSizeArithmeticMean;
    }

    public Long getArscSizeMedian() {
        return arscSizeMedian;
    }

    public Long getArscSizeMin() {
        return arscSizeMin;
    }

    public void setArscSizeMin(Long arscSizeMin) {
        this.arscSizeMin = arscSizeMin;
    }

    public Long getFileSizeMin() {
        return fileSizeMin;
    }

    public void setFileSizeMin(Long fileSizeMin) {
        this.fileSizeMin = fileSizeMin;
    }

    public Long getDexSizeMax() {
        return dexSizeMax;
    }

    public void setDexSizeMax(Long dexSizeMax) {
        this.dexSizeMax = dexSizeMax;
    }

    public Long getDexSizeMin() {
        return dexSizeMin;
    }

    public void setDexSizeMin(Long dexSizeMin) {
        this.dexSizeMin = dexSizeMin;
    }

    public Long getArscSizeMax() {
        return arscSizeMax;
    }

    public void setArscSizeMax(Long arscSizeMax) {
        this.arscSizeMax = arscSizeMax;
    }

    public Long getFileSizeMax() {
        return fileSizeMax;
    }

    public void setFileSizeMax(Long fileSizeMax) {
        this.fileSizeMax = fileSizeMax;
    }

    public void setArscSizeMedian(Long arscSizeMedian) {
        this.arscSizeMedian = arscSizeMedian;
    }

    public Long getFileSizeVariance() {
        return fileSizeVariance;
    }

    public void setFileSizeVariance(Long fileSizeVariance) {
        this.fileSizeVariance = fileSizeVariance;
    }

    public Long getFileSizeDeviation() {
        return fileSizeDeviation;
    }

    public void setFileSizeDeviation(Long fileSizeDeviation) {
        this.fileSizeDeviation = fileSizeDeviation;
    }

    public Long getDexSizeVariance() {
        return dexSizeVariance;
    }

    public void setDexSizeVariance(Long dexSizeVariance) {
        this.dexSizeVariance = dexSizeVariance;
    }

    public Long getDexSizeDeviation() {
        return dexSizeDeviation;
    }

    public void setDexSizeDeviation(Long dexSizeDeviation) {
        this.dexSizeDeviation = dexSizeDeviation;
    }

    public Long getArscSizeVariance() {
        return arscSizeVariance;
    }

    public void setArscSizeVariance(Long arscSizeVariance) {
        this.arscSizeVariance = arscSizeVariance;
    }

    public Long getArscSizeDeviation() {
        return arscSizeDeviation;
    }

    public void setArscSizeDeviation(Long arscSizeDeviation) {
        this.arscSizeDeviation = arscSizeDeviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileSizeStatistics that = (FileSizeStatistics) o;

        if (fileSizeTotalApks != null ? !fileSizeTotalApks.equals(that.fileSizeTotalApks) : that.fileSizeTotalApks != null)
            return false;
        if (fileSizeArithmeticMean != null ? !fileSizeArithmeticMean.equals(that.fileSizeArithmeticMean) : that.fileSizeArithmeticMean != null)
            return false;
        if (fileSizeMedian != null ? !fileSizeMedian.equals(that.fileSizeMedian) : that.fileSizeMedian != null)
            return false;
        if (fileSizeMax != null ? !fileSizeMax.equals(that.fileSizeMax) : that.fileSizeMax != null) return false;
        if (fileSizeMin != null ? !fileSizeMin.equals(that.fileSizeMin) : that.fileSizeMin != null) return false;
        if (fileSizeVariance != null ? !fileSizeVariance.equals(that.fileSizeVariance) : that.fileSizeVariance != null)
            return false;
        if (fileSizeDeviation != null ? !fileSizeDeviation.equals(that.fileSizeDeviation) : that.fileSizeDeviation != null)
            return false;
        if (dexSizeTotalApks != null ? !dexSizeTotalApks.equals(that.dexSizeTotalApks) : that.dexSizeTotalApks != null)
            return false;
        if (dexSizeArithmeticMean != null ? !dexSizeArithmeticMean.equals(that.dexSizeArithmeticMean) : that.dexSizeArithmeticMean != null)
            return false;
        if (dexSizeMedian != null ? !dexSizeMedian.equals(that.dexSizeMedian) : that.dexSizeMedian != null)
            return false;
        if (dexSizeMax != null ? !dexSizeMax.equals(that.dexSizeMax) : that.dexSizeMax != null) return false;
        if (dexSizeMin != null ? !dexSizeMin.equals(that.dexSizeMin) : that.dexSizeMin != null) return false;
        if (dexSizeVariance != null ? !dexSizeVariance.equals(that.dexSizeVariance) : that.dexSizeVariance != null)
            return false;
        if (dexSizeDeviation != null ? !dexSizeDeviation.equals(that.dexSizeDeviation) : that.dexSizeDeviation != null)
            return false;
        if (arscSizeTotalApks != null ? !arscSizeTotalApks.equals(that.arscSizeTotalApks) : that.arscSizeTotalApks != null)
            return false;
        if (arscSizeArithmeticMean != null ? !arscSizeArithmeticMean.equals(that.arscSizeArithmeticMean) : that.arscSizeArithmeticMean != null)
            return false;
        if (arscSizeMedian != null ? !arscSizeMedian.equals(that.arscSizeMedian) : that.arscSizeMedian != null)
            return false;
        if (arscSizeMax != null ? !arscSizeMax.equals(that.arscSizeMax) : that.arscSizeMax != null) return false;
        if (arscSizeMin != null ? !arscSizeMin.equals(that.arscSizeMin) : that.arscSizeMin != null) return false;
        if (arscSizeVariance != null ? !arscSizeVariance.equals(that.arscSizeVariance) : that.arscSizeVariance != null)
            return false;
        return !(arscSizeDeviation != null ? !arscSizeDeviation.equals(that.arscSizeDeviation) : that.arscSizeDeviation != null);

    }

    @Override
    public int hashCode() {
        int result = fileSizeTotalApks != null ? fileSizeTotalApks.hashCode() : 0;
        result = 31 * result + (fileSizeArithmeticMean != null ? fileSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (fileSizeMedian != null ? fileSizeMedian.hashCode() : 0);
        result = 31 * result + (fileSizeMax != null ? fileSizeMax.hashCode() : 0);
        result = 31 * result + (fileSizeMin != null ? fileSizeMin.hashCode() : 0);
        result = 31 * result + (fileSizeVariance != null ? fileSizeVariance.hashCode() : 0);
        result = 31 * result + (fileSizeDeviation != null ? fileSizeDeviation.hashCode() : 0);
        result = 31 * result + (dexSizeTotalApks != null ? dexSizeTotalApks.hashCode() : 0);
        result = 31 * result + (dexSizeArithmeticMean != null ? dexSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (dexSizeMedian != null ? dexSizeMedian.hashCode() : 0);
        result = 31 * result + (dexSizeMax != null ? dexSizeMax.hashCode() : 0);
        result = 31 * result + (dexSizeMin != null ? dexSizeMin.hashCode() : 0);
        result = 31 * result + (dexSizeVariance != null ? dexSizeVariance.hashCode() : 0);
        result = 31 * result + (dexSizeDeviation != null ? dexSizeDeviation.hashCode() : 0);
        result = 31 * result + (arscSizeTotalApks != null ? arscSizeTotalApks.hashCode() : 0);
        result = 31 * result + (arscSizeArithmeticMean != null ? arscSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (arscSizeMedian != null ? arscSizeMedian.hashCode() : 0);
        result = 31 * result + (arscSizeMax != null ? arscSizeMax.hashCode() : 0);
        result = 31 * result + (arscSizeMin != null ? arscSizeMin.hashCode() : 0);
        result = 31 * result + (arscSizeVariance != null ? arscSizeVariance.hashCode() : 0);
        result = 31 * result + (arscSizeDeviation != null ? arscSizeDeviation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileSizeStatistics{" +
                "fileSizeTotalApks=" + fileSizeTotalApks +
                ", fileSizeArithmeticMean=" + fileSizeArithmeticMean +
                ", fileSizeMedian=" + fileSizeMedian +
                ", fileSizeMax=" + fileSizeMax +
                ", fileSizeMin=" + fileSizeMin +
                ", fileSizeVariance=" + fileSizeVariance +
                ", fileSizeDeviation=" + fileSizeDeviation +
                ", dexSizeTotalApks=" + dexSizeTotalApks +
                ", dexSizeArithmeticMean=" + dexSizeArithmeticMean +
                ", dexSizeMedian=" + dexSizeMedian +
                ", dexSizeMax=" + dexSizeMax +
                ", dexSizeMin=" + dexSizeMin +
                ", dexSizeVariance=" + dexSizeVariance +
                ", dexSizeDeviation=" + dexSizeDeviation +
                ", arscSizeTotalApks=" + arscSizeTotalApks +
                ", arscSizeArithmeticMean=" + arscSizeArithmeticMean +
                ", arscSizeMedian=" + arscSizeMedian +
                ", arscSizeMax=" + arscSizeMax +
                ", arscSizeMin=" + arscSizeMin +
                ", arscSizeVariance=" + arscSizeVariance +
                ", arscSizeDeviation=" + arscSizeDeviation +
                '}';
    }
}
