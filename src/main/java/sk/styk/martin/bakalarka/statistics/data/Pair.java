package sk.styk.martin.bakalarka.statistics.data;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class Pair<A, B> {
    private A count;
    private B percentage;

    public Pair(A count, B percentage) {
        super();
        this.count = count;
        this.percentage = percentage;
    }

    public int hashCode() {
        int hashFirst = count != null ? count.hashCode() : 0;
        int hashSecond = percentage != null ? percentage.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof Pair) {
            Pair otherPair = (Pair) other;
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

    public A getCount() {
        return count;
    }

    public void setCount(A count) {
        this.count = count;
    }

    public B getPercentage() {
        return percentage;
    }

    public void setPercentage(B percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return "(" + count + ", " + percentage + ")";
    }
}
