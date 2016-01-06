package sk.styk.martin.bakalarka.compare;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public class ComparisonException extends Exception {

    public ComparisonException(){
        super();
    }
    public ComparisonException(String message){
        super(message);
    }
    public ComparisonException(String message,Throwable cause){
        super(message,cause);
    }
}
