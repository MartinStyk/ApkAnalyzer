package sk.styk.martin.bakalarka.statistics.processors;

import sk.styk.martin.bakalarka.utils.data.RecordPair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin Styk on 05.02.2016.
 */
public class TopValueProcessorBase<X> {

    //max

    private Map<String, RecordPair<Number, X>> maxInventary = new HashMap<String, RecordPair<Number, X>>();

    public void requestMaxValues(Enum e) {
        requestMaxValues(e.toString());
    }

    public void requestMaxValues(String name) {
        if (maxInventary.containsKey(name))
            throw new IllegalArgumentException("max values for this name already in use");
        maxInventary.put(name, new RecordPair<Number, X>(0, new ArrayList<X>()));
    }

    public RecordPair<Number, X> processMaxExtreme(Enum name, long currentValue, X currentName) {
        return processMaxExtreme(name.toString(), currentValue,currentName);
    }

    public RecordPair<Number, X> processMaxExtreme(String name, long currentValue, X currentName) {
        RecordPair currentRecordPair = maxInventary.get(name);

        if (currentRecordPair == null)
            throw new IllegalArgumentException("unknown name, max values are for this name not in use");

        Long oldMax = currentRecordPair.getNumber().longValue();
        List<X> oldList = currentRecordPair.getNames();

        if (currentValue > oldMax) {
            oldList.clear();
            oldList.add(currentName);
            currentRecordPair.setNumber(currentValue);
        } else if( currentValue == oldMax){
            oldList.add(currentName);
        }

        return currentRecordPair;
    }

    //min

    private Map<String, RecordPair<Number, X>> minInventary = new HashMap<String, RecordPair<Number, X>>();

    public void requestMinValues(Enum e) {
        requestMinValues(e.toString());
    }

    public void requestMinValues(String name) {
        if (minInventary.containsKey(name))
            throw new IllegalArgumentException("min values for this name already in use");
        minInventary.put(name, new RecordPair<Number, X>(0, new ArrayList<X>()));
    }

    public RecordPair<Number, X> processMinExtreme(Enum name, long currentValue, X currentName) {
        return processMinExtreme(name.toString(), currentValue,currentName);
    }

    public RecordPair<Number, X> processMinExtreme(String name, long currentValue, X currentName) {
        RecordPair currentRecordPair = maxInventary.get(name);

        if (currentRecordPair == null)
            throw new IllegalArgumentException("unknown name, min values are for this name not in use");

        Long oldMin = currentRecordPair.getNumber().longValue();
        List<X> oldList = currentRecordPair.getNames();

        if (currentValue < oldMin) {
            oldList.clear();
            oldList.add(currentName);
            currentRecordPair.setNumber(currentValue);
        } else if( currentValue == oldMin){
            oldList.add(currentName);
        }

        return currentRecordPair;
    }
}
