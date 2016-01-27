package sk.styk.martin.bakalarka.utils.data;

/**
 * Created by Martin Styk on 27.01.2016.
 */
public class DifferencePair<A,B>  {
    private A valueA;
    private B valueB;

    public DifferencePair(A valueA, B valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public int hashCode() {
        int hashFirst = valueA != null ? valueA.hashCode() : 0;
        int hashSecond = valueB != null ? valueB.hashCode() : 0;

        return (hashFirst + hashSecond) * hashSecond + hashFirst;
    }

    public boolean equals(Object other) {
        if (other instanceof DifferencePair) {
            DifferencePair otherPair = (DifferencePair) other;
            return
                    ((this.valueA == otherPair.valueA ||
                            (this.valueA != null && otherPair.valueA != null &&
                                    this.valueA.equals(otherPair.valueA))) &&
                            (this.valueB == otherPair.valueB ||
                                    (this.valueB != null && otherPair.valueB != null &&
                                            this.valueB.equals(otherPair.valueB))));
        }

        return false;
    }

    public A getValueA() {
        return valueA;
    }

    public void setValueA(A valueA) {
        this.valueA = valueA;
    }

    public B getValueB() {
        return valueB;
    }

    public void setValueB(B valueB) {
        this.valueB = valueB;
    }

    public String toString() {
        return "(" + valueA + ", " + valueB + ")";
    }
}
