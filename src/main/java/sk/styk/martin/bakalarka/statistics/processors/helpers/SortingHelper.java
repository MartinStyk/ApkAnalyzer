package sk.styk.martin.bakalarka.statistics.processors.helpers;

import sk.styk.martin.bakalarka.statistics.data.Pair;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Martin Styk on 21.01.2016.
 */
public class SortingHelper {
    public static Map<String, Pair<Integer, BigDecimal>>
    sortByValue(Map<String, Pair<Integer, BigDecimal>> map) {
        List<Map.Entry<String, Pair<Integer, BigDecimal>>> list =
                new LinkedList<Map.Entry<String, Pair<Integer, BigDecimal>>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Pair<Integer, BigDecimal>>>() {
            public int compare(Map.Entry<String, Pair<Integer, BigDecimal>> o1, Map.Entry<String, Pair<Integer, BigDecimal>> o2) {
                return -1* (o1.getValue().getPercentage()).compareTo(o2.getValue().getPercentage());
            }
        });

        Map<String, Pair<Integer, BigDecimal>> result = new LinkedHashMap<String, Pair<Integer, BigDecimal>>();
        for (Map.Entry<String, Pair<Integer, BigDecimal>> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
