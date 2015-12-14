package sk.styk.martin.bakalarka.data;

import java.util.List;

/**
 * Created by Martin Styk on 14.12.2015.
 */
public class HashData {

    private String dexHash;
    private String arscHash;
    private List<String> hashesFromManifest;

    public List<String> getHashesFromManifest() {
        return hashesFromManifest;
    }

    public void setHashesFromManifest(List<String> hashesFromManifest) {
        this.hashesFromManifest = hashesFromManifest;
    }

    public String getDexHash() {
        return dexHash;
    }

    public void setDexHash(String dexHash) {
        this.dexHash = dexHash;
    }

    public String getArscHash() {
        return arscHash;
    }

    public void setArscHash(String arscHash) {
        this.arscHash = arscHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashData hashData = (HashData) o;

        if (dexHash != null ? !dexHash.equals(hashData.dexHash) : hashData.dexHash != null) return false;
        if (arscHash != null ? !arscHash.equals(hashData.arscHash) : hashData.arscHash != null) return false;
        return !(hashesFromManifest != null ? !hashesFromManifest.equals(hashData.hashesFromManifest) : hashData.hashesFromManifest != null);

    }

    @Override
    public int hashCode() {
        int result = dexHash != null ? dexHash.hashCode() : 0;
        result = 31 * result + (arscHash != null ? arscHash.hashCode() : 0);
        result = 31 * result + (hashesFromManifest != null ? hashesFromManifest.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HashData{" +
                "dexHash='" + dexHash + '\'' +
                ", arscHash='" + arscHash + '\'' +
                ", hashesFromManifest=" + hashesFromManifest +
                '}';
    }
}
