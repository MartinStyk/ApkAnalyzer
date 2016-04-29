package sk.styk.martin.bakalarka.compare.processors;

import sk.styk.martin.bakalarka.compare.data.ComparisonResult;

/**
 * Compare of APK pair
 * Works with metadata created during analyze task
 *
 * Created by Martin Styk on 06.01.2016.
 */
public interface ApkPairCompare {
    /**
     * Execute compare of 2 APKs
     * @return result of comparison
     */
    ComparisonResult compare();

    /**
     * @return SimilarityEvaluator used during compare
     */
    SimilarityEvaluator getSimilarityEvaluator();

    /**
     * Set SimilarityEvaluator to use during compare
     * @param similarityEvaluator
     */
    void setSimilarityEvaluator(SimilarityEvaluator similarityEvaluator);
}
