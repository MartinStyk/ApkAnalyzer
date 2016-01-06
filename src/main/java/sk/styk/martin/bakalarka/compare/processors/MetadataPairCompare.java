package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.compare.data.MetadataCompareResult;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public class MetadataPairCompare {
    private ApkData apkDataA;
    private ApkData apkDataB;
    private MetadataCompareResult result;

    public MetadataPairCompare(ApkData apkDataA, ApkData apkDataB) {
        if (apkDataA == null) {
            throw new IllegalArgumentException("apkDataA");
        }
        if (apkDataB == null) {
            throw new IllegalArgumentException("apkDataB");
        }

        this.apkDataA = apkDataA;
        this.apkDataB = apkDataB;
    }

}
