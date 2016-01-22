package sk.styk.martin.bakalarka.statistics.processors.helpers;

import sk.styk.martin.bakalarka.statistics.data.Pair;
import sk.styk.martin.bakalarka.statistics.data.PercentagePair;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class SortingHelper {

    public  static <X> Map< X, PercentagePair>
    sortByValue(Map<X, PercentagePair> map) {
        List<Map.Entry<X, PercentagePair>> list =
                new LinkedList<Map.Entry<X, PercentagePair>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<X, PercentagePair>>() {
            public int compare(Map.Entry<X, PercentagePair> o1, Map.Entry<X, PercentagePair> o2) {
                return -1 * (o1.getValue().getPercentage()).compareTo(o2.getValue().getPercentage());
            }
        });

        Map<X, PercentagePair> result = new LinkedHashMap<X, PercentagePair>();
        for (Map.Entry<X, PercentagePair> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
