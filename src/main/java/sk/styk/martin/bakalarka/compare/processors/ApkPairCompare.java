package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.compare.data.ComparisonResult;

/**
 * Created by Martin Styk on 06.01.2016.
 */
public interface ApkPairCompare {
    ComparisonResult compare();

    SimilarityEvaluator getSimilarityEvaluator();

    void setSimilarityEvaluator(SimilarityEvaluator similarityEvaluator);
}
