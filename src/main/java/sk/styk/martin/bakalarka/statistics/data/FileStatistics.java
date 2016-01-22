package sk.styk.martin.bakalarka.statistics.data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class FileStatistics {
    /**
     * number of apks with data successfully collected from manifest.mf
     */
    private Integer analyzedApks;

    //files in res/layout directory
    private BigDecimal filesInLayoutFolderArithmeticMean;
    private List<Integer> filesInLayoutFolderModus;
    private Integer filesInLayoutFolderMedian;
    private Integer filesInLayoutFolderMax;
    private Integer filesInLayoutFolderMin;
    private BigDecimal filesInLayoutFolderVariance;
    private BigDecimal filesInLayoutFolderDeviation;

    //files in res/drawable directory
    private BigDecimal filesInDrawableFolderArithmeticMean;
    private List<Integer> filesInDrawableFolderModus;
    private Integer filesInDrawableFolderMedian;
    private Integer filesInDrawableFolderMax;
    private Integer filesInDrawableFolderMin;
    private BigDecimal filesInDrawableFolderVariance;
    private BigDecimal filesInDrawableFolderDeviation;

    //other files in apk
    private BigDecimal otherFilesArithmeticMean;
    private List<Integer> otherFilesModus;
    private Integer otherFilesMedian;
    private Integer otherFilesMax;
    private Integer otherFilesMin;
    private BigDecimal otherFilesVariance;
    private BigDecimal otherFilesDeviation;

    //all files together
    private BigDecimal allFilesArithmeticMean;
    private List<Integer> allFilesModus;
    private Integer allFilesMedian;
    private Integer allFilesMax;
    private Integer allFilesMin;
    private BigDecimal allFilesVariance;
    private BigDecimal allFilesDeviation;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public BigDecimal getFilesInLayoutFolderArithmeticMean() {
        return filesInLayoutFolderArithmeticMean;
    }

    public void setFilesInLayoutFolderArithmeticMean(BigDecimal filesInLayoutFolderArithmeticMean) {
        this.filesInLayoutFolderArithmeticMean = filesInLayoutFolderArithmeticMean;
    }

    public List<Integer> getFilesInLayoutFolderModus() {
        return filesInLayoutFolderModus;
    }

    public void setFilesInLayoutFolderModus(List<Integer> filesInLayoutFolderModus) {
        this.filesInLayoutFolderModus = filesInLayoutFolderModus;
    }

    public Integer getFilesInLayoutFolderMedian() {
        return filesInLayoutFolderMedian;
    }

    public void setFilesInLayoutFolderMedian(Integer filesInLayoutFolderMedian) {
        this.filesInLayoutFolderMedian = filesInLayoutFolderMedian;
    }

    public Integer getFilesInLayoutFolderMax() {
        return filesInLayoutFolderMax;
    }

    public void setFilesInLayoutFolderMax(Integer filesInLayoutFolderMax) {
        this.filesInLayoutFolderMax = filesInLayoutFolderMax;
    }

    public Integer getFilesInLayoutFolderMin() {
        return filesInLayoutFolderMin;
    }

    public void setFilesInLayoutFolderMin(Integer filesInLayoutFolderMin) {
        this.filesInLayoutFolderMin = filesInLayoutFolderMin;
    }

    public BigDecimal getFilesInLayoutFolderVariance() {
        return filesInLayoutFolderVariance;
    }

    public void setFilesInLayoutFolderVariance(BigDecimal filesInLayoutFolderVariance) {
        this.filesInLayoutFolderVariance = filesInLayoutFolderVariance;
    }

    public BigDecimal getFilesInLayoutFolderDeviation() {
        return filesInLayoutFolderDeviation;
    }

    public void setFilesInLayoutFolderDeviation(BigDecimal filesInLayoutFolderDeviation) {
        this.filesInLayoutFolderDeviation = filesInLayoutFolderDeviation;
    }

    public BigDecimal getFilesInDrawableFolderArithmeticMean() {
        return filesInDrawableFolderArithmeticMean;
    }

    public void setFilesInDrawableFolderArithmeticMean(BigDecimal filesInDrawableFolderArithmeticMean) {
        this.filesInDrawableFolderArithmeticMean = filesInDrawableFolderArithmeticMean;
    }

    public List<Integer> getFilesInDrawableFolderModus() {
        return filesInDrawableFolderModus;
    }

    public void setFilesInDrawableFolderModus(List<Integer> filesInDrawableFolderModus) {
        this.filesInDrawableFolderModus = filesInDrawableFolderModus;
    }

    public Integer getFilesInDrawableFolderMedian() {
        return filesInDrawableFolderMedian;
    }

    public void setFilesInDrawableFolderMedian(Integer filesInDrawableFolderMedian) {
        this.filesInDrawableFolderMedian = filesInDrawableFolderMedian;
    }

    public Integer getFilesInDrawableFolderMax() {
        return filesInDrawableFolderMax;
    }

    public void setFilesInDrawableFolderMax(Integer filesInDrawableFolderMax) {
        this.filesInDrawableFolderMax = filesInDrawableFolderMax;
    }

    public Integer getFilesInDrawableFolderMin() {
        return filesInDrawableFolderMin;
    }

    public void setFilesInDrawableFolderMin(Integer filesInDrawableFolderMin) {
        this.filesInDrawableFolderMin = filesInDrawableFolderMin;
    }

    public BigDecimal getFilesInDrawableFolderVariance() {
        return filesInDrawableFolderVariance;
    }

    public void setFilesInDrawableFolderVariance(BigDecimal filesInDrawableFolderVariance) {
        this.filesInDrawableFolderVariance = filesInDrawableFolderVariance;
    }

    public BigDecimal getFilesInDrawableFolderDeviation() {
        return filesInDrawableFolderDeviation;
    }

    public void setFilesInDrawableFolderDeviation(BigDecimal filesInDrawableFolderDeviation) {
        this.filesInDrawableFolderDeviation = filesInDrawableFolderDeviation;
    }

    public BigDecimal getOtherFilesArithmeticMean() {
        return otherFilesArithmeticMean;
    }

    public void setOtherFilesArithmeticMean(BigDecimal otherFilesArithmeticMean) {
        this.otherFilesArithmeticMean = otherFilesArithmeticMean;
    }

    public List<Integer> getOtherFilesModus() {
        return otherFilesModus;
    }

    public void setOtherFilesModus(List<Integer> otherFilesModus) {
        this.otherFilesModus = otherFilesModus;
    }

    public Integer getOtherFilesMedian() {
        return otherFilesMedian;
    }

    public void setOtherFilesMedian(Integer otherFilesMedian) {
        this.otherFilesMedian = otherFilesMedian;
    }

    public Integer getOtherFilesMax() {
        return otherFilesMax;
    }

    public void setOtherFilesMax(Integer otherFilesMax) {
        this.otherFilesMax = otherFilesMax;
    }

    public Integer getOtherFilesMin() {
        return otherFilesMin;
    }

    public void setOtherFilesMin(Integer otherFilesMin) {
        this.otherFilesMin = otherFilesMin;
    }

    public BigDecimal getOtherFilesVariance() {
        return otherFilesVariance;
    }

    public void setOtherFilesVariance(BigDecimal otherFilesVariance) {
        this.otherFilesVariance = otherFilesVariance;
    }

    public BigDecimal getOtherFilesDeviation() {
        return otherFilesDeviation;
    }

    public void setOtherFilesDeviation(BigDecimal otherFilesDeviation) {
        this.otherFilesDeviation = otherFilesDeviation;
    }

    public BigDecimal getAllFilesArithmeticMean() {
        return allFilesArithmeticMean;
    }

    public void setAllFilesArithmeticMean(BigDecimal allFilesArithmeticMean) {
        this.allFilesArithmeticMean = allFilesArithmeticMean;
    }

    public List<Integer> getAllFilesModus() {
        return allFilesModus;
    }

    public void setAllFilesModus(List<Integer> allFilesModus) {
        this.allFilesModus = allFilesModus;
    }

    public Integer getAllFilesMedian() {
        return allFilesMedian;
    }

    public void setAllFilesMedian(Integer allFilesMedian) {
        this.allFilesMedian = allFilesMedian;
    }

    public Integer getAllFilesMax() {
        return allFilesMax;
    }

    public void setAllFilesMax(Integer allFilesMax) {
        this.allFilesMax = allFilesMax;
    }

    public Integer getAllFilesMin() {
        return allFilesMin;
    }

    public void setAllFilesMin(Integer allFilesMin) {
        this.allFilesMin = allFilesMin;
    }

    public BigDecimal getAllFilesVariance() {
        return allFilesVariance;
    }

    public void setAllFilesVariance(BigDecimal allFilesVariance) {
        this.allFilesVariance = allFilesVariance;
    }

    public BigDecimal getAllFilesDeviation() {
        return allFilesDeviation;
    }

    public void setAllFilesDeviation(BigDecimal allFilesDeviation) {
        this.allFilesDeviation = allFilesDeviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileStatistics that = (FileStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (filesInLayoutFolderArithmeticMean != null ? !filesInLayoutFolderArithmeticMean.equals(that.filesInLayoutFolderArithmeticMean) : that.filesInLayoutFolderArithmeticMean != null)
            return false;
        if (filesInLayoutFolderModus != null ? !filesInLayoutFolderModus.equals(that.filesInLayoutFolderModus) : that.filesInLayoutFolderModus != null)
            return false;
        if (filesInLayoutFolderMedian != null ? !filesInLayoutFolderMedian.equals(that.filesInLayoutFolderMedian) : that.filesInLayoutFolderMedian != null)
            return false;
        if (filesInLayoutFolderMax != null ? !filesInLayoutFolderMax.equals(that.filesInLayoutFolderMax) : that.filesInLayoutFolderMax != null)
            return false;
        if (filesInLayoutFolderMin != null ? !filesInLayoutFolderMin.equals(that.filesInLayoutFolderMin) : that.filesInLayoutFolderMin != null)
            return false;
        if (filesInLayoutFolderVariance != null ? !filesInLayoutFolderVariance.equals(that.filesInLayoutFolderVariance) : that.filesInLayoutFolderVariance != null)
            return false;
        if (filesInLayoutFolderDeviation != null ? !filesInLayoutFolderDeviation.equals(that.filesInLayoutFolderDeviation) : that.filesInLayoutFolderDeviation != null)
            return false;
        if (filesInDrawableFolderArithmeticMean != null ? !filesInDrawableFolderArithmeticMean.equals(that.filesInDrawableFolderArithmeticMean) : that.filesInDrawableFolderArithmeticMean != null)
            return false;
        if (filesInDrawableFolderModus != null ? !filesInDrawableFolderModus.equals(that.filesInDrawableFolderModus) : that.filesInDrawableFolderModus != null)
            return false;
        if (filesInDrawableFolderMedian != null ? !filesInDrawableFolderMedian.equals(that.filesInDrawableFolderMedian) : that.filesInDrawableFolderMedian != null)
            return false;
        if (filesInDrawableFolderMax != null ? !filesInDrawableFolderMax.equals(that.filesInDrawableFolderMax) : that.filesInDrawableFolderMax != null)
            return false;
        if (filesInDrawableFolderMin != null ? !filesInDrawableFolderMin.equals(that.filesInDrawableFolderMin) : that.filesInDrawableFolderMin != null)
            return false;
        if (filesInDrawableFolderVariance != null ? !filesInDrawableFolderVariance.equals(that.filesInDrawableFolderVariance) : that.filesInDrawableFolderVariance != null)
            return false;
        if (filesInDrawableFolderDeviation != null ? !filesInDrawableFolderDeviation.equals(that.filesInDrawableFolderDeviation) : that.filesInDrawableFolderDeviation != null)
            return false;
        if (otherFilesArithmeticMean != null ? !otherFilesArithmeticMean.equals(that.otherFilesArithmeticMean) : that.otherFilesArithmeticMean != null)
            return false;
        if (otherFilesModus != null ? !otherFilesModus.equals(that.otherFilesModus) : that.otherFilesModus != null)
            return false;
        if (otherFilesMedian != null ? !otherFilesMedian.equals(that.otherFilesMedian) : that.otherFilesMedian != null)
            return false;
        if (otherFilesMax != null ? !otherFilesMax.equals(that.otherFilesMax) : that.otherFilesMax != null)
            return false;
        if (otherFilesMin != null ? !otherFilesMin.equals(that.otherFilesMin) : that.otherFilesMin != null)
            return false;
        if (otherFilesVariance != null ? !otherFilesVariance.equals(that.otherFilesVariance) : that.otherFilesVariance != null)
            return false;
        if (otherFilesDeviation != null ? !otherFilesDeviation.equals(that.otherFilesDeviation) : that.otherFilesDeviation != null)
            return false;
        if (allFilesArithmeticMean != null ? !allFilesArithmeticMean.equals(that.allFilesArithmeticMean) : that.allFilesArithmeticMean != null)
            return false;
        if (allFilesModus != null ? !allFilesModus.equals(that.allFilesModus) : that.allFilesModus != null)
            return false;
        if (allFilesMedian != null ? !allFilesMedian.equals(that.allFilesMedian) : that.allFilesMedian != null)
            return false;
        if (allFilesMax != null ? !allFilesMax.equals(that.allFilesMax) : that.allFilesMax != null) return false;
        if (allFilesMin != null ? !allFilesMin.equals(that.allFilesMin) : that.allFilesMin != null) return false;
        if (allFilesVariance != null ? !allFilesVariance.equals(that.allFilesVariance) : that.allFilesVariance != null)
            return false;
        return !(allFilesDeviation != null ? !allFilesDeviation.equals(that.allFilesDeviation) : that.allFilesDeviation != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (filesInLayoutFolderArithmeticMean != null ? filesInLayoutFolderArithmeticMean.hashCode() : 0);
        result = 31 * result + (filesInLayoutFolderModus != null ? filesInLayoutFolderModus.hashCode() : 0);
        result = 31 * result + (filesInLayoutFolderMedian != null ? filesInLayoutFolderMedian.hashCode() : 0);
        result = 31 * result + (filesInLayoutFolderMax != null ? filesInLayoutFolderMax.hashCode() : 0);
        result = 31 * result + (filesInLayoutFolderMin != null ? filesInLayoutFolderMin.hashCode() : 0);
        result = 31 * result + (filesInLayoutFolderVariance != null ? filesInLayoutFolderVariance.hashCode() : 0);
        result = 31 * result + (filesInLayoutFolderDeviation != null ? filesInLayoutFolderDeviation.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderArithmeticMean != null ? filesInDrawableFolderArithmeticMean.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderModus != null ? filesInDrawableFolderModus.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderMedian != null ? filesInDrawableFolderMedian.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderMax != null ? filesInDrawableFolderMax.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderMin != null ? filesInDrawableFolderMin.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderVariance != null ? filesInDrawableFolderVariance.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolderDeviation != null ? filesInDrawableFolderDeviation.hashCode() : 0);
        result = 31 * result + (otherFilesArithmeticMean != null ? otherFilesArithmeticMean.hashCode() : 0);
        result = 31 * result + (otherFilesModus != null ? otherFilesModus.hashCode() : 0);
        result = 31 * result + (otherFilesMedian != null ? otherFilesMedian.hashCode() : 0);
        result = 31 * result + (otherFilesMax != null ? otherFilesMax.hashCode() : 0);
        result = 31 * result + (otherFilesMin != null ? otherFilesMin.hashCode() : 0);
        result = 31 * result + (otherFilesVariance != null ? otherFilesVariance.hashCode() : 0);
        result = 31 * result + (otherFilesDeviation != null ? otherFilesDeviation.hashCode() : 0);
        result = 31 * result + (allFilesArithmeticMean != null ? allFilesArithmeticMean.hashCode() : 0);
        result = 31 * result + (allFilesModus != null ? allFilesModus.hashCode() : 0);
        result = 31 * result + (allFilesMedian != null ? allFilesMedian.hashCode() : 0);
        result = 31 * result + (allFilesMax != null ? allFilesMax.hashCode() : 0);
        result = 31 * result + (allFilesMin != null ? allFilesMin.hashCode() : 0);
        result = 31 * result + (allFilesVariance != null ? allFilesVariance.hashCode() : 0);
        result = 31 * result + (allFilesDeviation != null ? allFilesDeviation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", filesInLayoutFolderArithmeticMean=" + filesInLayoutFolderArithmeticMean +
                ", filesInLayoutFolderModus=" + filesInLayoutFolderModus +
                ", filesInLayoutFolderMedian=" + filesInLayoutFolderMedian +
                ", filesInLayoutFolderMax=" + filesInLayoutFolderMax +
                ", filesInLayoutFolderMin=" + filesInLayoutFolderMin +
                ", filesInLayoutFolderVariance=" + filesInLayoutFolderVariance +
                ", filesInLayoutFolderDeviation=" + filesInLayoutFolderDeviation +
                ", filesInDrawableFolderArithmeticMean=" + filesInDrawableFolderArithmeticMean +
                ", filesInDrawableFolderModus=" + filesInDrawableFolderModus +
                ", filesInDrawableFolderMedian=" + filesInDrawableFolderMedian +
                ", filesInDrawableFolderMax=" + filesInDrawableFolderMax +
                ", filesInDrawableFolderMin=" + filesInDrawableFolderMin +
                ", filesInDrawableFolderVariance=" + filesInDrawableFolderVariance +
                ", filesInDrawableFolderDeviation=" + filesInDrawableFolderDeviation +
                ", otherFilesArithmeticMean=" + otherFilesArithmeticMean +
                ", otherFilesModus=" + otherFilesModus +
                ", otherFilesMedian=" + otherFilesMedian +
                ", otherFilesMax=" + otherFilesMax +
                ", otherFilesMin=" + otherFilesMin +
                ", otherFilesVariance=" + otherFilesVariance +
                ", otherFilesDeviation=" + otherFilesDeviation +
                ", allFilesArithmeticMean=" + allFilesArithmeticMean +
                ", allFilesModus=" + allFilesModus +
                ", allFilesMedian=" + allFilesMedian +
                ", allFilesMax=" + allFilesMax +
                ", allFilesMin=" + allFilesMin +
                ", allFilesVariance=" + allFilesVariance +
                ", allFilesDeviation=" + allFilesDeviation +
                '}';
    }
}