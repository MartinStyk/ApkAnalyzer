package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.analyze.data.HashData;
import sk.styk.martin.bakalarka.compare.data.HashCompareResult;

import java.util.*;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public class HashPairCompare {

    private HashData hashDataA;
    private HashData hashDataB;
    private HashCompareResult result;

    public HashPairCompare(HashData hashDataA, HashData hashDataB) {
        if (hashDataA == null) {
            throw new IllegalArgumentException("hashDataA");
        }
        if (hashDataB == null) {
            throw new IllegalArgumentException("hashDataB");
        }

        this.hashDataA = hashDataA;
        this.hashDataB = hashDataB;
    }

    public HashCompareResult hashCompare() {
        if (result != null) {
            return result;
        }
        result = new HashCompareResult();


        result.setDexIdentical(hashDataA.getDexHash().equals(hashDataB.getDexHash()));
        compareArsc();
        compareDex();
        compareDrawable();
        compareLayouts();
        compareOther();

        return result;
    }

    private void compareArsc(){
        String arscA = hashDataA.getArscHash();
        String arscB = hashDataB.getArscHash();

        if(arscA != null && arscB!=null){
            result.setArscIdentical(arscA.equals(arscB));
        }
    }

    private void compareDex(){
        String dexA = hashDataA.getDexHash();
        String dexB = hashDataB.getDexHash();

        if(dexA != null && dexB!=null){
            result.setDexIdentical(dexA.equals(dexB));
        }
    }

    private void compareDrawable() {

        Map mapA = hashDataA.getDrawableHash();
        Map mapB = hashDataB.getDrawableHash();

        if(mapA == null || mapB == null){
            return;
        }

        Set<String> keysA = new HashSet<String>(mapA.keySet());
        Set<String> keysB = new HashSet<String>(mapB.keySet());

        compare(keysA, keysB);

        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        List<String> modified = new ArrayList<String>();

        String additionFile;
        for (String s : keysA) {
            additionFile = (String) mapA.get(s);
            additionalInA.add(additionFile);
        }

        for (String s : keysB) {
            additionFile = (String) mapB.get(s);
            additionalInB.add(additionFile);
        }

        List<String> addtionalInAclone = new ArrayList<String>(additionalInA);
        for(String s: addtionalInAclone){
            if(additionalInB.contains(s)){
                modified.add(s);
                additionalInA.remove(s);
                additionalInB.remove(s);
            }
        }

        result.setAdditionalDrawableFilesA(additionalInA);
        result.setAdditionalDrawableFilesB(additionalInB);
        result.setModifiedDrawableFiles(modified);
        result.setIdenticalDrawables(mapA.keySet().size() - keysA.size());
        result.setTotalDrawablesA(mapA.keySet().size());
        result.setTotalDrawablesB(mapB.keySet().size());

        int higher = mapA.keySet().size()> mapB.keySet().size() ? mapA.keySet().size() : mapB.keySet().size();
        result.setIdenticalDrawablesRatio(getPercentage(mapA.keySet().size() - keysA.size(),higher));

    }

    private void compareLayouts() {

        Map mapA = hashDataA.getLayoutHash();
        Map mapB = hashDataB.getLayoutHash();

        if(mapA == null || mapB == null){
            return;
        }

        Set<String> keysA = new HashSet<String>(mapA.keySet());
        Set<String> keysB = new HashSet<String>(mapB.keySet());

        compare(keysA, keysB);

        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        List<String> modified = new ArrayList<String>();

        String additionFile;
        for (String s : keysA) {
            additionFile = (String) mapA.get(s);
            additionalInA.add(additionFile);
        }

        for (String s : keysB) {
            additionFile = (String) mapB.get(s);
            additionalInB.add(additionFile);
        }

        List<String> addtionalInAclone = new ArrayList<String>(additionalInA);
        for(String s: addtionalInAclone){
            if(additionalInB.contains(s)){
                modified.add(s);
                additionalInA.remove(s);
                additionalInB.remove(s);
            }
        }

        result.setAdditionaLayoutFilesA(additionalInA);
        result.setAdditionaLayoutFilesB(additionalInB);
        result.setModifiedLayoutFiles(modified);
        result.setIdenticalLayouts(mapA.keySet().size() - keysA.size());
        result.setTotalLayoutsA(mapA.keySet().size());
        result.setTotalLayoutsB(mapB.keySet().size());

        int higher = mapA.keySet().size()> mapB.keySet().size() ? mapA.keySet().size() : mapB.keySet().size();
        result.setIdenticalLayoutsRatio(getPercentage(mapA.keySet().size() - keysA.size(),higher));

    }

    private void compareOther() {

        Map mapA = hashDataA.getOtherHash();
        Map mapB = hashDataB.getOtherHash();

        if(mapA == null || mapB == null){
            return;
        }

        Set<String> keysA = new HashSet<String>(mapA.keySet());
        Set<String> keysB = new HashSet<String>(mapB.keySet());

        compare(keysA, keysB);

        List<String> additionalInA = new ArrayList<String>();
        List<String> additionalInB = new ArrayList<String>();
        List<String> modified = new ArrayList<String>();

        String additionFile;
        for (String s : keysA) {
            additionFile = (String) mapA.get(s);
            additionalInA.add(additionFile);
        }

        for (String s : keysB) {
            additionFile = (String) mapB.get(s);
            additionalInB.add(additionFile);
        }

        List<String> addtionalInAclone = new ArrayList<String>(additionalInA);
        for(String s: addtionalInAclone){
            if(additionalInB.contains(s)){
                modified.add(s);
                additionalInA.remove(s);
                additionalInB.remove(s);
            }
        }

        result.setAdditionalOtherFilesA(additionalInA);
        result.setAdditionalOtherFilesB(additionalInB);
        result.setModifiedOtherFiles(modified);
        result.setIdenticalOthers(mapA.keySet().size() - keysA.size());
        result.setTotalOthersA(mapA.keySet().size());
        result.setTotalOthersB(mapB.keySet().size());

        int higher = mapA.keySet().size()> mapB.keySet().size() ? mapA.keySet().size() : mapB.keySet().size();
        result.setIdenticalOthersRatio(getPercentage(mapA.keySet().size() - keysA.size(),higher));

    }

    private void compare(Set<String> keysA, Set<String> keysB) {

        Set<String> keysAClone = new HashSet<String>(keysA);

        Iterator it = keysAClone.iterator();
        while (it.hasNext()) {
            String value = (String) it.next();
            if (keysB.contains(value)) {
                keysB.remove(value);
                keysA.remove(value);
            }
        }
    }
    private Integer getPercentage(Integer part, Integer bigger) {

        Long result =Math.abs(Math.round(100L * part / bigger.doubleValue()));
        return result.intValue();
    }

}

