package sk.styk.martin.bakalarka.statistics.processors.helpers;

import java.math.BigDecimal;

/**
 * Created by Martin Styk on 18.01.2016.
 */
public class PercentageHelper {
    public static BigDecimal getPercentage(double part, double whole){
        return new BigDecimal(part*100 / whole);
    }
}
