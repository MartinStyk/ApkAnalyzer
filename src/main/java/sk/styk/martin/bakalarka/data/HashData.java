package sk.styk.martin.bakalarka.data;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Martin Styk on 14.12.2015.
 */
public class HashData {

    /**
     * hash of classes.dex file
     */
    private String dexHash;

    /**
     * hash of resources.arsc file
     */
    private String arscHash;

    /**
     * hash of all files in res/drawable* folder
     */
    private HashMap<String,String> drawableHash;

    /**
     * hash of all files in res/layout* folder
     */
    private HashMap<String,String> layoutHash;

    /**
     * hash that doesn`t belong to any of previous categories
     */
    private HashMap<String,String> otherHash;


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

    public HashMap<String,String> getDrawableHash() {
        return drawableHash;
    }

    public void setDrawableHash(HashMap<String,String> drawableHash) {
        this.drawableHash = drawableHash;
    }

    public HashMap<String,String> getLayoutHash() {
        return layoutHash;
    }

    public void setLayoutHash(HashMap<String,String> layoutHash) {
        this.layoutHash = layoutHash;
    }

    public HashMap<String,String> getOtherHash() {
        return otherHash;
    }

    public void setOtherHash(HashMap<String,String> otherHash) {
        this.otherHash = otherHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashData hashData = (HashData) o;

        if (dexHash != null ? !dexHash.equals(hashData.dexHash) : hashData.dexHash != null) return false;
        if (arscHash != null ? !arscHash.equals(hashData.arscHash) : hashData.arscHash != null) return false;
        if (drawableHash != null ? !drawableHash.equals(hashData.drawableHash) : hashData.drawableHash != null)
            return false;
        if (layoutHash != null ? !layoutHash.equals(hashData.layoutHash) : hashData.layoutHash != null) return false;
        return !(otherHash != null ? !otherHash.equals(hashData.otherHash) : hashData.otherHash != null);

    }

    @Override
    public int hashCode() {
        int result = dexHash != null ? dexHash.hashCode() : 0;
        result = 31 * result + (arscHash != null ? arscHash.hashCode() : 0);
        result = 31 * result + (drawableHash != null ? drawableHash.hashCode() : 0);
        result = 31 * result + (layoutHash != null ? layoutHash.hashCode() : 0);
        result = 31 * result + (otherHash != null ? otherHash.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HashData{" +
                "dexHash='" + dexHash + '\'' +
                ", arscHash='" + arscHash + '\'' +
                ", drawableHash=" + drawableHash +
                ", layoutHash=" + layoutHash +
                ", otherHash=" + otherHash +
                '}';
    }
}
