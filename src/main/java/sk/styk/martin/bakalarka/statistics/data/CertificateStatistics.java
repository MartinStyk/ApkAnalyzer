package sk.styk.martin.bakalarka.statistics.data;

import java.util.Map;

/**
 * Created by Martin Styk on 16.01.2016.
 */
public class CertificateStatistics {

    private Map<String,Integer> signAlgorithmMap;
    private Map<Integer,Integer> versionMap;

    public Map<String, Integer> getSignAlgorithmMap() {
        return signAlgorithmMap;
    }

    public void setSignAlgorithmMap(Map<String, Integer> signAlgorithmMap) {
        this.signAlgorithmMap = signAlgorithmMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertificateStatistics that = (CertificateStatistics) o;

        if (signAlgorithmMap != null ? !signAlgorithmMap.equals(that.signAlgorithmMap) : that.signAlgorithmMap != null)
            return false;
        return !(versionMap != null ? !versionMap.equals(that.versionMap) : that.versionMap != null);

    }

    @Override
    public int hashCode() {
        int result = signAlgorithmMap != null ? signAlgorithmMap.hashCode() : 0;
        result = 31 * result + (versionMap != null ? versionMap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CertificateStatistics{" +
                "signAlgorithmMap=" + signAlgorithmMap +
                ", versionMap=" + versionMap +
                '}';
    }
}
