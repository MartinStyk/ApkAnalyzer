package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.MathStatistics;

/**
 * Created by Martin Styk on 22.01.2016.
 */
public class FileStatistics {
    /**
     * number of apks with data successfully collected from manifest.mf
     */
    private Integer analyzedApks;

    //files in res/layout directory
    private MathStatistics filesInLayoutFolder;
    //files in res/drawable directory
    private MathStatistics filesInDrawableFolder;
    //other files in apk
    private MathStatistics otherFiles;
    //all files together
    private MathStatistics allFiles;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public MathStatistics getFilesInLayoutFolder() {
        return filesInLayoutFolder;
    }

    public void setFilesInLayoutFolder(MathStatistics filesInLayoutFolder) {
        this.filesInLayoutFolder = filesInLayoutFolder;
    }

    public MathStatistics getFilesInDrawableFolder() {
        return filesInDrawableFolder;
    }

    public void setFilesInDrawableFolder(MathStatistics filesInDrawableFolder) {
        this.filesInDrawableFolder = filesInDrawableFolder;
    }

    public MathStatistics getOtherFiles() {
        return otherFiles;
    }

    public void setOtherFiles(MathStatistics otherFiles) {
        this.otherFiles = otherFiles;
    }

    public MathStatistics getAllFiles() {
        return allFiles;
    }

    public void setAllFiles(MathStatistics allFiles) {
        this.allFiles = allFiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileStatistics that = (FileStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (filesInLayoutFolder != null ? !filesInLayoutFolder.equals(that.filesInLayoutFolder) : that.filesInLayoutFolder != null)
            return false;
        if (filesInDrawableFolder != null ? !filesInDrawableFolder.equals(that.filesInDrawableFolder) : that.filesInDrawableFolder != null)
            return false;
        if (otherFiles != null ? !otherFiles.equals(that.otherFiles) : that.otherFiles != null) return false;
        return !(allFiles != null ? !allFiles.equals(that.allFiles) : that.allFiles != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (filesInLayoutFolder != null ? filesInLayoutFolder.hashCode() : 0);
        result = 31 * result + (filesInDrawableFolder != null ? filesInDrawableFolder.hashCode() : 0);
        result = 31 * result + (otherFiles != null ? otherFiles.hashCode() : 0);
        result = 31 * result + (allFiles != null ? allFiles.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", filesInLayoutFolder=" + filesInLayoutFolder +
                ", filesInDrawableFolder=" + filesInDrawableFolder +
                ", otherFiles=" + otherFiles +
                ", allFiles=" + allFiles +
                '}';
    }
}