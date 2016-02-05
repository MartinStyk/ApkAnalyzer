package sk.styk.martin.bakalarka.utils.data;

import java.util.List;

/**
 * Created by Martin Styk on 05.02.2016.
 */
public class RecordPair<A extends Number, B> {
    private A number;
    private List<B> names;

    public RecordPair(A valueA, List<B> valueB) {
        this.number = valueA;
        this.names = valueB;
    }

    public int hashCode() {
        int hashFirst = number != null ? number.hashCode() : 0;
        int hashSecond = names != null ? names.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof RecordPair) {
            RecordPair otherPair = (RecordPair) other;
            return
                    ((this.number == otherPair.number ||
                            (this.number != null && otherPair.number != null &&
                                    this.number.equals(otherPair.number))) &&
                            (this.names == otherPair.names ||
                                    (this.names != null && otherPair.names != null &&
                                            this.names.equals(otherPair.names))));
        }

        return false;
    }

    public A getNumber() {
        return number;
    }

    public RecordPair<A, B> setNumber(A number) {
        this.number = number;
        return this;
    }

    public List<B> getNames() {
        return names;
    }

    public void setName(List<B> names) {
        this.names = names;
    }

    public String toString() {
        return "(" + number + ", " + names + ")";
    }
}
