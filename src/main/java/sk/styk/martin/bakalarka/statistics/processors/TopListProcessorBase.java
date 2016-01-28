package sk.styk.martin.bakalarka.statistics.processors;

import org.slf4j.Logger;
import sk.styk.martin.bakalarka.statistics.processors.helpers.PercentageHelper;
import sk.styk.martin.bakalarka.statistics.processors.helpers.SortingHelper;
import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Martin Styk on 27.01.2016.
 */
public abstract class TopListProcessorBase {

    protected abstract Logger getLogger();

    protected Map<String, PercentagePair> getTopValuesMap(Map<String, Integer> topValues, Integer wholeData, String type) {

        getLogger().info("Started processing chart " + type);

        if (wholeData == null) {
            throw new IllegalArgumentException("wholeData");
        }
        if (topValues == null) {
            throw new IllegalArgumentException("topValues");
        }

        Map<String, PercentagePair> withPercentage = new HashMap<String, PercentagePair>();

        for (Map.Entry<String, Integer> entry : topValues.entrySet()) {
            String name = entry.getKey();
            Integer number = entry.getValue();
            BigDecimal percentage = PercentageHelper.getPercentage(number.doubleValue(), wholeData);

            PercentagePair percentageEntry = new PercentagePair(number, percentage);

            withPercentage.put(name, percentageEntry);
        }

        Map<String, PercentagePair> resultFinal = SortingHelper.sortByValue(withPercentage);

        getLogger().info("Finished processing chart chart " + type);
        return resultFinal;
    }

    protected Map<String, PercentagePair> getTopValuesMap(Map<String, PercentagePair> topValues, int number, String type) {

        getLogger().info("Started processing chart for " + type);

        if (topValues == null) {
            throw new IllegalArgumentException("topValues");
        }

        for (Map.Entry<String, PercentagePair> entry : topValues.entrySet()) {
            PercentagePair pair = entry.getValue();
            Integer count = pair.getCount().intValue();
            pair.setPercentage(PercentageHelper.getPercentage(count.doubleValue(), number));
        }

        getLogger().info("Finished processing chart for " + type);
        return topValues;
    }
}
