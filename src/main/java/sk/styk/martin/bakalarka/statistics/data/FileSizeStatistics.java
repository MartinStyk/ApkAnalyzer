package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FileSizeStatistics {

    //file size
    private Integer fileSizeTotalApks;
    private Double fileSizeArithmeticMean;
    private Long fileSizeMedian;

    //dex size
    private Integer dexSizeTotalApks;
    private Double dexSizeArithmeticMean;
    private Long dexSizeMedian;

    //arsc size
    private Integer arscSizeTotalApks;
    private Double arscSizeArithmeticMean;
    private Long arscSizeMedian;

    public Integer getFileSizeTotalApks() {
        return fileSizeTotalApks;
    }

    public void setFileSizeTotalApks(Integer fileSizeTotalApks) {
        this.fileSizeTotalApks = fileSizeTotalApks;
    }

    public Double getFileSizeArithmeticMean() {
        return fileSizeArithmeticMean;
    }

    public void setFileSizeArithmeticMean(Double fileSizeArithmeticMean) {
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

    public Double getDexSizeArithmeticMean() {
        return dexSizeArithmeticMean;
    }

    public void setDexSizeArithmeticMean(Double dexSizeArithmeticMean) {
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

    public Double getArscSizeArithmeticMean() {
        return arscSizeArithmeticMean;
    }

    public void setArscSizeArithmeticMean(Double arscSizeArithmeticMean) {
        this.arscSizeArithmeticMean = arscSizeArithmeticMean;
    }

    public Long getArscSizeMedian() {
        return arscSizeMedian;
    }

    public void setArscSizeMedian(Long arscSizeMedian) {
        this.arscSizeMedian = arscSizeMedian;
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
        if (dexSizeTotalApks != null ? !dexSizeTotalApks.equals(that.dexSizeTotalApks) : that.dexSizeTotalApks != null)
            return false;
        if (dexSizeArithmeticMean != null ? !dexSizeArithmeticMean.equals(that.dexSizeArithmeticMean) : that.dexSizeArithmeticMean != null)
            return false;
        if (dexSizeMedian != null ? !dexSizeMedian.equals(that.dexSizeMedian) : that.dexSizeMedian != null)
            return false;
        if (arscSizeTotalApks != null ? !arscSizeTotalApks.equals(that.arscSizeTotalApks) : that.arscSizeTotalApks != null)
            return false;
        if (arscSizeArithmeticMean != null ? !arscSizeArithmeticMean.equals(that.arscSizeArithmeticMean) : that.arscSizeArithmeticMean != null)
            return false;
        return !(arscSizeMedian != null ? !arscSizeMedian.equals(that.arscSizeMedian) : that.arscSizeMedian != null);

    }

    @Override
    public int hashCode() {
        int result = fileSizeTotalApks != null ? fileSizeTotalApks.hashCode() : 0;
        result = 31 * result + (fileSizeArithmeticMean != null ? fileSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (fileSizeMedian != null ? fileSizeMedian.hashCode() : 0);
        result = 31 * result + (dexSizeTotalApks != null ? dexSizeTotalApks.hashCode() : 0);
        result = 31 * result + (dexSizeArithmeticMean != null ? dexSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (dexSizeMedian != null ? dexSizeMedian.hashCode() : 0);
        result = 31 * result + (arscSizeTotalApks != null ? arscSizeTotalApks.hashCode() : 0);
        result = 31 * result + (arscSizeArithmeticMean != null ? arscSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (arscSizeMedian != null ? arscSizeMedian.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileSizeStatistics{" +
                "fileSizeTotalApks=" + fileSizeTotalApks +
                ", fileSizeArithmeticMean=" + fileSizeArithmeticMean +
                ", fileSizeMedian=" + fileSizeMedian +
                ", dexSizeTotalApks=" + dexSizeTotalApks +
                ", dexSizeArithmeticMean=" + dexSizeArithmeticMean +
                ", dexSizeMedian=" + dexSizeMedian +
                ", arscSizeTotalApks=" + arscSizeTotalApks +
                ", arscSizeArithmeticMean=" + arscSizeArithmeticMean +
                ", arscSizeMedian=" + arscSizeMedian +
                '}';
    }
}
