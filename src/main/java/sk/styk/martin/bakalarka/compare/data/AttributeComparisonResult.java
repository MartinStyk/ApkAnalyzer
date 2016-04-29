package sk.styk.martin.bakalarka.compare.data;

import sk.styk.martin.bakalarka.utils.data.DifferencePair;

/**
 * Comparison result of single attribute
 *
 * Created by Martin Styk on 27.01.2016.
 */
public class AttributeComparisonResult<X> {
    private Boolean isSame;
    private DifferencePair difference;

    public AttributeComparisonResult() {
    }

    public AttributeComparisonResult(X valueA, X valueB) {
        setValues(valueA, valueB);
    }

    public AttributeComparisonResult(Boolean isSame, DifferencePair difference) {
        this.difference = difference;
        this.isSame = isSame;
    }

    private void setValues(X valueA, X valueB) {
        if (valueA.equals(valueB)) {
            isSame = true;
            return;
        }
        isSame = false;
        difference = new DifferencePair(valueA, valueB);
    }

    public Boolean getSame() {
        return isSame;
    }

    public void setSame(Boolean same) {
        isSame = same;
    }

    public DifferencePair getDifference() {
        return difference;
    }

    public void setDifference(DifferencePair difference) {
        this.difference = difference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributeComparisonResult that = (AttributeComparisonResult) o;

        if (isSame != null ? !isSame.equals(that.isSame) : that.isSame != null) return false;
        return !(difference != null ? !difference.equals(that.difference) : that.difference != null);

    }

    @Override
    public int hashCode() {
        int result = isSame != null ? isSame.hashCode() : 0;
        result = 31 * result + (difference != null ? difference.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AttributeComparisonResult{" +
                "isSame=" + isSame +
                ", difference=" + difference +
                '}';
    }
}
