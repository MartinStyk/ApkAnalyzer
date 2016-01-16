package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FileSizeStatistics {

    //file size
    private Integer fileSizeTotalApks;
    private Long fileSizeArithmeticMean;
    private Long fileSizeModus;
    private Long fileSizeMedian;

    //dex size
    private Integer dexSizeTotalApks;
    private Long dexSizeArithmeticMean;
    private Long dexSizeModus;
    private Long dexSizeMedian;

    //arsc size
    private Integer arscSizeTotalApks;
    private Long arscSizeArithmeticMean;
    private Long arscSizeModus;
    private Long arscSizeMedian;

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

    public Long getFileSizeModus() {
        return fileSizeModus;
    }

    public void setFileSizeModus(Long fileSizeModus) {
        this.fileSizeModus = fileSizeModus;
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

    public Long getDexSizeModus() {
        return dexSizeModus;
    }

    public void setDexSizeModus(Long dexSizeModus) {
        this.dexSizeModus = dexSizeModus;
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

    public Long getArscSizeModus() {
        return arscSizeModus;
    }

    public void setArscSizeModus(Long arscSizeModus) {
        this.arscSizeModus = arscSizeModus;
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
        if (fileSizeModus != null ? !fileSizeModus.equals(that.fileSizeModus) : that.fileSizeModus != null)
            return false;
        if (fileSizeMedian != null ? !fileSizeMedian.equals(that.fileSizeMedian) : that.fileSizeMedian != null)
            return false;
        if (dexSizeTotalApks != null ? !dexSizeTotalApks.equals(that.dexSizeTotalApks) : that.dexSizeTotalApks != null)
            return false;
        if (dexSizeArithmeticMean != null ? !dexSizeArithmeticMean.equals(that.dexSizeArithmeticMean) : that.dexSizeArithmeticMean != null)
            return false;
        if (dexSizeModus != null ? !dexSizeModus.equals(that.dexSizeModus) : that.dexSizeModus != null) return false;
        if (dexSizeMedian != null ? !dexSizeMedian.equals(that.dexSizeMedian) : that.dexSizeMedian != null)
            return false;
        if (arscSizeTotalApks != null ? !arscSizeTotalApks.equals(that.arscSizeTotalApks) : that.arscSizeTotalApks != null)
            return false;
        if (arscSizeArithmeticMean != null ? !arscSizeArithmeticMean.equals(that.arscSizeArithmeticMean) : that.arscSizeArithmeticMean != null)
            return false;
        if (arscSizeModus != null ? !arscSizeModus.equals(that.arscSizeModus) : that.arscSizeModus != null)
            return false;
        return !(arscSizeMedian != null ? !arscSizeMedian.equals(that.arscSizeMedian) : that.arscSizeMedian != null);

    }

    @Override
    public int hashCode() {
        int result = fileSizeTotalApks != null ? fileSizeTotalApks.hashCode() : 0;
        result = 31 * result + (fileSizeArithmeticMean != null ? fileSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (fileSizeModus != null ? fileSizeModus.hashCode() : 0);
        result = 31 * result + (fileSizeMedian != null ? fileSizeMedian.hashCode() : 0);
        result = 31 * result + (dexSizeTotalApks != null ? dexSizeTotalApks.hashCode() : 0);
        result = 31 * result + (dexSizeArithmeticMean != null ? dexSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (dexSizeModus != null ? dexSizeModus.hashCode() : 0);
        result = 31 * result + (dexSizeMedian != null ? dexSizeMedian.hashCode() : 0);
        result = 31 * result + (arscSizeTotalApks != null ? arscSizeTotalApks.hashCode() : 0);
        result = 31 * result + (arscSizeArithmeticMean != null ? arscSizeArithmeticMean.hashCode() : 0);
        result = 31 * result + (arscSizeModus != null ? arscSizeModus.hashCode() : 0);
        result = 31 * result + (arscSizeMedian != null ? arscSizeMedian.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileSizeStatistics{" +
                "fileSizeTotalApks=" + fileSizeTotalApks +
                ", fileSizeArithmeticMean=" + fileSizeArithmeticMean +
                ", fileSizeModus=" + fileSizeModus +
                ", fileSizeMedian=" + fileSizeMedian +
                ", dexSizeTotalApks=" + dexSizeTotalApks +
                ", dexSizeArithmeticMean=" + dexSizeArithmeticMean +
                ", dexSizeModus=" + dexSizeModus +
                ", dexSizeMedian=" + dexSizeMedian +
                ", arscSizeTotalApks=" + arscSizeTotalApks +
                ", arscSizeArithmeticMean=" + arscSizeArithmeticMean +
                ", arscSizeModus=" + arscSizeModus +
                ", arscSizeMedian=" + arscSizeMedian +
                '}';
    }
}
