package sk.styk.martin.bakalarka.statistics.processors.helpers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class ConversionHelper {

    public static double[] toDoubleArray(List<Double> numbers){
        double[] target = new double[numbers.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = numbers.get(i).doubleValue();
        }
        return target;
    }

    public static List<Integer> toIntegerList(double[] arr){
        List<Integer> toReturn = new ArrayList<Integer>();
        for(int i = 0 ; i < arr.length ;i ++){
            Double d = arr[i];
            toReturn.add(d.intValue());
        }
        return toReturn;
    }

}
