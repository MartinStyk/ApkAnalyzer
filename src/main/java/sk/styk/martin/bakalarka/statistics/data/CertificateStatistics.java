package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class CertificateStatistics {

    /**
     * number of apks with data successfully collected from certificate.
     */
    private Integer analyzedApks;
    private Map<Integer, PercentagePair> numberOfCertificates;
    private PercentagePair signAlgorithmObtained;
    private Map<String, PercentagePair> signAlgorithmMap;
    private PercentagePair versionObtained;
    private Map<Integer, PercentagePair> versionMap;

    public Map<String, PercentagePair> getSignAlgorithmMap() {
        return signAlgorithmMap;
    }

    public PercentagePair getSignAlgorithmObtained() {
        return signAlgorithmObtained;
    }

    public void setSignAlgorithmObtained(PercentagePair signAlgorithmObtained) {
        this.signAlgorithmObtained = signAlgorithmObtained;
    }

    public PercentagePair getVersionObtained() {
        return versionObtained;
    }

    public void setVersionObtained(PercentagePair versionObtained) {
        this.versionObtained = versionObtained;
    }

    public void setSignAlgorithmMap(Map<String, PercentagePair> signAlgorithmMap) {
        this.signAlgorithmMap = signAlgorithmMap;
    }

    public Map<Integer, PercentagePair> getNumberOfCertificates() {
        return numberOfCertificates;
    }

    public void setNumberOfCertificates(Map<Integer, PercentagePair> numberOfCertificates) {
        this.numberOfCertificates = numberOfCertificates;
    }

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public Map<Integer, PercentagePair> getVersionMap() {
        return versionMap;
    }

    public void setVersionMap(Map<Integer, PercentagePair> versionMap) {
        this.versionMap = versionMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertificateStatistics that = (CertificateStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (numberOfCertificates != null ? !numberOfCertificates.equals(that.numberOfCertificates) : that.numberOfCertificates != null)
            return false;
        if (signAlgorithmObtained != null ? !signAlgorithmObtained.equals(that.signAlgorithmObtained) : that.signAlgorithmObtained != null)
            return false;
        if (signAlgorithmMap != null ? !signAlgorithmMap.equals(that.signAlgorithmMap) : that.signAlgorithmMap != null)
            return false;
        if (versionObtained != null ? !versionObtained.equals(that.versionObtained) : that.versionObtained != null)
            return false;
        return !(versionMap != null ? !versionMap.equals(that.versionMap) : that.versionMap != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (numberOfCertificates != null ? numberOfCertificates.hashCode() : 0);
        result = 31 * result + (signAlgorithmObtained != null ? signAlgorithmObtained.hashCode() : 0);
        result = 31 * result + (signAlgorithmMap != null ? signAlgorithmMap.hashCode() : 0);
        result = 31 * result + (versionObtained != null ? versionObtained.hashCode() : 0);
        result = 31 * result + (versionMap != null ? versionMap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CertificateStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", numberOfCertificates=" + numberOfCertificates +
                ", signAlgorithmObtained=" + signAlgorithmObtained +
                ", signAlgorithmMap=" + signAlgorithmMap +
                ", versionObtained=" + versionObtained +
                ", versionMap=" + versionMap +
                '}';
    }
}
