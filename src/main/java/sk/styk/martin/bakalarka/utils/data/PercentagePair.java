package sk.styk.martin.bakalarka.utils.data;

import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;

import java.math.BigDecimal;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class PercentagePair {
    private Number count;
    private BigDecimal percentage;

    public PercentagePair(Number count, BigDecimal percentage) {
        this.count = count;
        this.percentage = percentage;
    }

    public PercentagePair(Number count, Number total) {
        this.count = count;
        this.percentage = PercentageHelper.getPercentage(count.doubleValue(), total.doubleValue());
    }

    public int hashCode() {
        int hashFirst = count != null ? count.hashCode() : 0;
        int hashSecond = percentage != null ? percentage.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof PercentagePair) {
            PercentagePair otherPair = (PercentagePair) other;
            return
                    ((this.count == otherPair.count ||
                            (this.count != null && otherPair.count != null &&
                                    this.count.equals(otherPair.count))) &&
                            (this.percentage == otherPair.percentage ||
                                    (this.percentage != null && otherPair.percentage != null &&
                                            this.percentage.equals(otherPair.percentage))));
        }

        return false;
    }

    public Number getCount() {
        return count;
    }

    public void setCount(Number count) {
        this.count = count;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return "(" + count + ", " + percentage + ")";
    }
}

