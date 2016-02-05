package sk.styk.martin.bakalarka.utils.data;

import org.apache.commons.math3.stat.StatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sk.styk.martin.bakalarka.statistics.processors.helpers.ConversionHelper;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Martin Styk on 27.01.2016.
 */
public class MathStatistics {

    private static final Logger logger = LoggerFactory.getLogger(MathStatistics.class);

    private PercentagePair analyzedDataSet;
    private BigDecimal arithmeticMean;
    private Long median;
    private List<Long> modus;
    private RecordPair max;
    private RecordPair min;
    private BigDecimal variance;
    private BigDecimal deviation;

    public MathStatistics(PercentagePair analyzedDataSet, Number arithmeticMean, Number median, List<Number> modus, RecordPair max, RecordPair min, Number variance, Number deviation) {
        this.analyzedDataSet = analyzedDataSet;
        this.arithmeticMean = new BigDecimal(arithmeticMean.doubleValue());
        this.median = median.longValue();
        this.modus = ConversionHelper.toLongList(modus);
        this.max = max;
        this.min = min;
        this.variance = new BigDecimal(variance.doubleValue());
        this.deviation = new BigDecimal(deviation.doubleValue());
    }

    public <X> MathStatistics(PercentagePair analyzedDataSet, List<Double> data, RecordPair minimalValue, RecordPair maximalValue) {
        this(analyzedDataSet, ConversionHelper.toDoubleArray(data), minimalValue, maximalValue);
    }

    public <X> MathStatistics(PercentagePair analyzedDataSet, double[] data, RecordPair minimalValue, RecordPair maximalValue) {
        this.analyzedDataSet = analyzedDataSet;
        this.min = minimalValue;
        this.max = maximalValue;
        computeStatistics(data);
    }

    public static Logger getLogger() {
        return logger;
    }

    private void computeStatistics(double[] array) {
        logger.trace("Started processing stats");

        Double mean = StatUtils.mean(array);
        Double median = StatUtils.percentile(array, 50);
        double[] modus = StatUtils.mode(array);
        Double minimum = StatUtils.min(array);
        Double maximum = StatUtils.max(array);
        Double variance = StatUtils.variance(array);
        Double deviation = Math.sqrt(variance);

        this.arithmeticMean = new BigDecimal(mean);
        this.median = median.longValue();
        this.modus = ConversionHelper.toLongList(modus);
        this.min = min == null ? new RecordPair<Long, String>(minimum.longValue(), null) : min;
        this.max = max == null ? new RecordPair<Long, String>(maximum.longValue(), null) : max;
        this.variance = new BigDecimal(variance);
        this.deviation = new BigDecimal(deviation);

        logger.trace("Finished processing stats");
    }

    public PercentagePair getAnalyzedDataSet() {
        return analyzedDataSet;
    }

    public void setAnalyzedDataSet(PercentagePair analyzedDataSet) {
        this.analyzedDataSet = analyzedDataSet;
    }

    public BigDecimal getArithmeticMean() {
        return arithmeticMean;
    }

    public void setArithmeticMean(BigDecimal arithmeticMean) {
        this.arithmeticMean = arithmeticMean;
    }

    public Long getMedian() {
        return median;
    }

    public void setMedian(Long median) {
        this.median = median;
    }

    public List<Long> getModus() {
        return modus;
    }

    public void setModus(List<Long> modus) {
        this.modus = modus;
    }

    public RecordPair getMax() {
        return max;
    }

    public void setMax(RecordPair max) {
        this.max = max;
    }

    public RecordPair getMin() {
        return min;
    }

    public void setMin(RecordPair min) {
        this.min = min;
    }

    public BigDecimal getVariance() {
        return variance;
    }

    public void setVariance(BigDecimal variance) {
        this.variance = variance;
    }

    public BigDecimal getDeviation() {
        return deviation;
    }

    public void setDeviation(BigDecimal deviation) {
        this.deviation = deviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MathStatistics that = (MathStatistics) o;

        if (analyzedDataSet != null ? !analyzedDataSet.equals(that.analyzedDataSet) : that.analyzedDataSet != null)
            return false;
        if (arithmeticMean != null ? !arithmeticMean.equals(that.arithmeticMean) : that.arithmeticMean != null)
            return false;
        if (median != null ? !median.equals(that.median) : that.median != null) return false;
        if (modus != null ? !modus.equals(that.modus) : that.modus != null) return false;
        if (max != null ? !max.equals(that.max) : that.max != null) return false;
        if (min != null ? !min.equals(that.min) : that.min != null) return false;
        if (variance != null ? !variance.equals(that.variance) : that.variance != null) return false;
        return !(deviation != null ? !deviation.equals(that.deviation) : that.deviation != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedDataSet != null ? analyzedDataSet.hashCode() : 0;
        result = 31 * result + (arithmeticMean != null ? arithmeticMean.hashCode() : 0);
        result = 31 * result + (median != null ? median.hashCode() : 0);
        result = 31 * result + (modus != null ? modus.hashCode() : 0);
        result = 31 * result + (max != null ? max.hashCode() : 0);
        result = 31 * result + (min != null ? min.hashCode() : 0);
        result = 31 * result + (variance != null ? variance.hashCode() : 0);
        result = 31 * result + (deviation != null ? deviation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MathStatistics{" +
                "analyzedDataSet=" + analyzedDataSet +
                ", arithmeticMean=" + arithmeticMean +
                ", median=" + median +
                ", modus=" + modus +
                ", max=" + max +
                ", min=" + min +
                ", variance=" + variance +
                ", deviation=" + deviation +
                '}';
    }
}
