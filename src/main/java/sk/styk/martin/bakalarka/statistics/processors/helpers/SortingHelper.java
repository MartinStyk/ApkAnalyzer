package sk.styk.martin.bakalarka.statistics.processors.helpers;

import sk.styk.martin.bakalarka.statistics.data.Pair;
import sk.styk.martin.bakalarka.statistics.data.PercentagePair;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class SortingHelper {
    public static Map<String, PercentagePair>
    sortByValue(Map<String, PercentagePair> map) {
        List<Map.Entry<String, PercentagePair>> list =
                new LinkedList<Map.Entry<String, PercentagePair>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, PercentagePair>>() {
            public int compare(Map.Entry<String, PercentagePair> o1, Map.Entry<String, PercentagePair> o2) {
                return -1 * (o1.getValue().getPercentage()).compareTo(o2.getValue().getPercentage());
            }
        });

        Map<String, PercentagePair> result = new LinkedHashMap<String, PercentagePair>();
        for (Map.Entry<String, PercentagePair> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
