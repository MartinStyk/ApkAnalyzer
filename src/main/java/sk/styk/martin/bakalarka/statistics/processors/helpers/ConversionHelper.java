package sk.styk.martin.bakalarka.statistics.processors.helpers;

import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class ConversionHelper {

    public static double[] toDoubleArray(List<Double> doubles){
        double[] target = new double[doubles.size()];
        for (int i = 0; i < target.length; i++) {
            target[i] = doubles.get(i);
        }
        return target;
    }

}
