package sk.styk.martin.bakalarka.compare.data;

import sk.styk.martin.bakalarka.compare.processors.SimilarityType;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public class ComparisonResult {

    private String nameA;
    private String nameB;
    private SimilarityType similarityType;
    private HashCompareResult hashCompareResult;
    private MetadataCompareResult metadataCompareResult;


    public ComparisonResult(String nameA, String nameB) {
        if (nameA != null && !nameA.isEmpty()) {
            this.nameA = nameA;
        }
        if (nameB != null && !nameB.isEmpty()) {
            this.nameB = nameB;
        }
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public HashCompareResult getHashCompareResult() {
        return hashCompareResult;
    }

    public void setHashCompareResult(HashCompareResult hashCompareResult) {
        this.hashCompareResult = hashCompareResult;
    }

    public MetadataCompareResult getMetadataCompareResult() {
        return metadataCompareResult;
    }

    public void setMetadataCompareResult(MetadataCompareResult metadataCompareResult) {
        this.metadataCompareResult = metadataCompareResult;
    }

    public SimilarityType getSimilar() {
        return similarityType;
    }

    public void setSimilar(SimilarityType similar) {
        similarityType = similar;
    }

    @Override
    public String toString() {
        return "ComparisonResult{" +
                "nameA='" + nameA + '\'' +
                ", nameB='" + nameB + '\'' +
                ", similarityType=" + similarityType +
                ", hashCompareResult=" + hashCompareResult +
                ", metadataCompareResult=" + metadataCompareResult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComparisonResult that = (ComparisonResult) o;

        if (nameA != null ? !nameA.equals(that.nameA) : that.nameA != null) return false;
        if (nameB != null ? !nameB.equals(that.nameB) : that.nameB != null) return false;
        if (similarityType != null ? !similarityType.equals(that.similarityType) : that.similarityType != null) return false;
        if (hashCompareResult != null ? !hashCompareResult.equals(that.hashCompareResult) : that.hashCompareResult != null)
            return false;
        return !(metadataCompareResult != null ? !metadataCompareResult.equals(that.metadataCompareResult) : that.metadataCompareResult != null);

    }

    @Override
    public int hashCode() {
        int result = nameA != null ? nameA.hashCode() : 0;
        result = 31 * result + (nameB != null ? nameB.hashCode() : 0);
        result = 31 * result + (similarityType != null ? similarityType.hashCode() : 0);
        result = 31 * result + (hashCompareResult != null ? hashCompareResult.hashCode() : 0);
        result = 31 * result + (metadataCompareResult != null ? metadataCompareResult.hashCode() : 0);
        return result;
    }
}
