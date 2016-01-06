package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.analyze.data.ApkData;
import sk.styk.martin.bakalarka.compare.ComparisonException;
import sk.styk.martin.bakalarka.compare.data.ComparisonResult;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public class ApkPairCompare {

    private ApkData dataA;
    private ApkData dataB;
    private ComparisonResult result;
    private HashPairCompare hashComparator;
    private MetadataPairCompare metadataComparator;

    public ApkPairCompare(ApkData dataA, ApkData dataB){
        if(dataA == null || dataB == null){
            throw new IllegalArgumentException("data is null");
        }
        this.dataA = dataA;
        this.dataB = dataB;
        this.hashComparator = new HashPairCompare(dataA.getFileDigest(), dataB.getFileDigest());
        this.metadataComparator = new MetadataPairCompare(dataA,dataB);
    }

    public ComparisonResult compare() throws ComparisonException {
        result = new ComparisonResult(dataA.getFileName(), dataB.getFileName());

        result.setMetadataCompareResult(metadataComparator.fullCompare());
//elevate whether they are similiar if so continue
    //    result.setMetadataCompareResult(metadataComparator.fullCompare());
        result.setHashCompareResult(hashComparator.hashCompare());

        return result;
    }

}
