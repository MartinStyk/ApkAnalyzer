package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 23.11.2015.
 */
public class ApkData {


    //basic info
    private String fileName;
    private Long fileSize;
    private Long dexSize;
    private Long arscSize;

    //certificate info
    private List<CertificateData> certificateDatas;

    //manifest info
    private int numberOfActivities;
    private int numberOfServices;
    private int numberOfContentProviders;
    private int numberOfBroadcastReceivers;
    private List<String> usesPermissions;
    private List<String> usesLibrary;
    private List<String> usesFeature;


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

    public int getNumberOfActivities() {
        return numberOfActivities;
    }

    public void setNumberOfActivities(int numberOfActivities) {
        this.numberOfActivities = numberOfActivities;
    }

    public int getNumberOfServices() {
        return numberOfServices;
    }

    public void setNumberOfServices(int numberOfServices) {
        this.numberOfServices = numberOfServices;
    }

    public int getNumberOfContentProviders() {
        return numberOfContentProviders;
    }

    public void setNumberOfContentProviders(int numberOfContentProviders) {
        this.numberOfContentProviders = numberOfContentProviders;
    }

    public int getNumberOfBroadcastReceivers() {
        return numberOfBroadcastReceivers;
    }

    public void setNumberOfBroadcastReceivers(int numberOfBroadcastReceivers) {
        this.numberOfBroadcastReceivers = numberOfBroadcastReceivers;
    }

    public List<String> getUsesPermissions() {
        return usesPermissions;
    }

    public void setUsesPermissions(List<String> usesPermissions) {
        this.usesPermissions = usesPermissions;
    }

    public List<String> getUsesLibrary() {
        return usesLibrary;
    }

    public void setUsesLibrary(List<String> usesLibrary) {
        this.usesLibrary = usesLibrary;
    }

    public List<String> getUsesFeature() {
        return usesFeature;
    }

    public void setUsesFeature(List<String> usesFeature) {
        this.usesFeature = usesFeature;
    }

    public List<CertificateData> getCertificateDatas() {
        return certificateDatas;
    }

    public void setCertificateDatas(List<CertificateData> certificateDatas) {
        this.certificateDatas = certificateDatas;
    }

    @Override
    public String toString() {
        return "ApkData{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", dexSize=" + dexSize +
                ", arscSize=" + arscSize +
                ", numberOfActivities=" + numberOfActivities +
                ", numberOfServices=" + numberOfServices +
                ", numberOfContentProviders=" + numberOfContentProviders +
                ", numberOfBroadcastReceivers=" + numberOfBroadcastReceivers +
                ", usesPermissions=" + usesPermissions +
                ", usesLibrary=" + usesLibrary +
                ", usesFeature=" + usesFeature +
                '}';
    }
}
