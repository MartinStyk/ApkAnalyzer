package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class FileSizeStatistics {

    private MathStatistics fileSize;
    private MathStatistics dexSize;
    private MathStatistics arscSize;

    public MathStatistics getFileSize() {
        return fileSize;
    }

    public void setFileSize(MathStatistics fileSize) {
        this.fileSize = fileSize;
    }

    public MathStatistics getDexSize() {
        return dexSize;
    }

    public void setDexSize(MathStatistics dexSize) {
        this.dexSize = dexSize;
    }

    public MathStatistics getArscSize() {
        return arscSize;
    }

    public void setArscSize(MathStatistics arscSize) {
        this.arscSize = arscSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileSizeStatistics that = (FileSizeStatistics) o;

        if (fileSize != null ? !fileSize.equals(that.fileSize) : that.fileSize != null) return false;
        if (dexSize != null ? !dexSize.equals(that.dexSize) : that.dexSize != null) return false;
        return !(arscSize != null ? !arscSize.equals(that.arscSize) : that.arscSize != null);

    }

    @Override
    public int hashCode() {
        int result = fileSize != null ? fileSize.hashCode() : 0;
        result = 31 * result + (dexSize != null ? dexSize.hashCode() : 0);
        result = 31 * result + (arscSize != null ? arscSize.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileSizeStatistics{" +
                "fileSize=" + fileSize +
                ", dexSize=" + dexSize +
                ", arscSize=" + arscSize +
                '}';
    }
}