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
    private ComparisonResult comparisonResult;
    private HashPairCompare hashComparator;
    private MetadataPairCompare metadataComparator;
    private SimilarityEvaluator similarityEvaluator;

    public ApkPairCompare(ApkData dataA, ApkData dataB) {
        if (dataA == null || dataB == null) {
            throw new IllegalArgumentException("data is null");
        }
        this.dataA = dataA;
        this.dataB = dataB;
        this.hashComparator = new HashPairCompare(dataA.getFileDigest(), dataB.getFileDigest());
        this.metadataComparator = new MetadataPairCompare(dataA, dataB);
        this.similarityEvaluator = new SimilarityEvaluator();
    }

    public ComparisonResult compare() throws ComparisonException {

        comparisonResult = new ComparisonResult(dataA.getFileName(), dataB.getFileName());

        //do just basic compare
        comparisonResult.setMetadataCompareResult(metadataComparator.basicCompare());

        //check whether they are similiar
        boolean isBasicallySimilar = similarityEvaluator.basicEvaluate(comparisonResult);

        if (isBasicallySimilar) //if they are not similar dont continue
            return comparisonResult;

        //if they are similar get full statistics
        comparisonResult.setMetadataCompareResult(metadataComparator.fullCompare());
        comparisonResult.setHashCompareResult(hashComparator.hashCompare());

        boolean isDetailedSimilar = similarityEvaluator.fullEvaluate(comparisonResult);

        return comparisonResult;
    }

}
