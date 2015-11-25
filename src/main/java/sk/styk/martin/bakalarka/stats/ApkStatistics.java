package sk.styk.martin.bakalarka.stats;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkStatistics {
    private String fileName;
    private Long fileSize;
    private Long dexSize;
    private Long arscSize;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String name) {
        this.fileName = name;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getDexSize() {
        return dexSize;
    }

    public void setDexSize(Long dexSize) {
        this.dexSize = dexSize;
    }

    public Long getArscSize() {
        return arscSize;
    }

    public void setArscSize(Long arscSize) {
        this.arscSize = arscSize;
    }
}
