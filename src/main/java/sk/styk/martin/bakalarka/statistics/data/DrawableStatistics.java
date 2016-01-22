package sk.styk.martin.bakalarka.statistics.data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class DrawableStatistics {

    /**
     * number of apks with data successfully collected
     */
    private Integer analyzedApks;

    //DRAWABLE FORMAT
    //-------------------------------------------------------

    //png
    private PercentagePair apksWithPngDrawablesObtainedSuccessfully;
    private BigDecimal pngDrawablesArithmeticMean;
    private List<Integer> pngDrawablesModus;
    private Integer pngDrawablesMedian;
    private Integer pngDrawablesMax;
    private Integer pngDrawablesMin;
    private BigDecimal pngDrawablesVariance;
    private BigDecimal pngDrawablesDeviation;

    private PercentagePair apksWithPngDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal pngDrawablesArithmeticMeanNonZero;
    private List<Integer> pngDrawablesModusNonZero;
    private Integer pngDrawablesMedianNonZero;
    private Integer pngDrawablesMaxNonZero;
    private Integer pngDrawablesMinNonZero;
    private BigDecimal pngDrawablesVarianceNonZero;
    private BigDecimal pngDrawablesDeviationNonZero;

    //jpg
    private PercentagePair apksWithJpgDrawablesObtainedSuccessfully;
    private BigDecimal jpgDrawablesArithmeticMean;
    private List<Integer> jpgDrawablesModus;
    private Integer jpgDrawablesMedian;
    private Integer jpgDrawablesMax;
    private Integer jpgDrawablesMin;
    private BigDecimal jpgDrawablesVariance;
    private BigDecimal jpgDrawablesDeviation;

    private PercentagePair apksWithJpgDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal jpgDrawablesArithmeticMeanNonZero;
    private List<Integer> jpgDrawablesModusNonZero;
    private Integer jpgDrawablesMedianNonZero;
    private Integer jpgDrawablesMaxNonZero;
    private Integer jpgDrawablesMinNonZero;
    private BigDecimal jpgDrawablesVarianceNonZero;
    private BigDecimal jpgDrawablesDeviationNonZero;

    //gif
    private PercentagePair apksWithGifDrawablesObtainedSuccessfully;
    private BigDecimal gifDrawablesArithmeticMean;
    private List<Integer> gifDrawablesModus;
    private Integer gifDrawablesMedian;
    private Integer gifDrawablesMax;
    private Integer gifDrawablesMin;
    private BigDecimal gifDrawablesVariance;
    private BigDecimal gifDrawablesDeviation;

    private PercentagePair apksWithGifDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal gifDrawablesArithmeticMeanNonZero;
    private List<Integer> gifDrawablesModusNonZero;
    private Integer gifDrawablesMedianNonZero;
    private Integer gifDrawablesMaxNonZero;
    private Integer gifDrawablesMinNonZero;
    private BigDecimal gifDrawablesVarianceNonZero;
    private BigDecimal gifDrawablesDeviationNonZero;

    //xml
    private PercentagePair apksWithXmlDrawablesObtainedSuccessfully;
    private BigDecimal xmlDrawablesArithmeticMean;
    private List<Integer> xmlDrawablesModus;
    private Integer xmlDrawablesMedian;
    private Integer xmlDrawablesMax;
    private Integer xmlDrawablesMin;
    private BigDecimal xmlDrawablesVariance;
    private BigDecimal xmlDrawablesDeviation;

    private PercentagePair apksWithXmlDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal xmlDrawablesArithmeticMeanNonZero;
    private List<Integer> xmlDrawablesModusNonZero;
    private Integer xmlDrawablesMedianNonZero;
    private Integer xmlDrawablesMaxNonZero;
    private Integer xmlDrawablesMinNonZero;
    private BigDecimal xmlDrawablesVarianceNonZero;
    private BigDecimal xmlDrawablesDeviationNonZero;


    //DIFFERENT DRAWABLES
    //-------------------------------------------------------

    //different drawables
    private PercentagePair apksWithDifferentDrawablesObtainedSuccessfully;
    private BigDecimal differentDrawablesArithmeticMean;
    private List<Integer> differentDrawablesModus;
    private Integer differentDrawablesMedian;
    private Integer differentDrawablesMax;
    private Integer differentDrawablesMin;
    private BigDecimal differentDrawablesVariance;
    private BigDecimal differentDrawablesDeviation;

    private PercentagePair apksWithDifferentDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal differentDrawablesArithmeticMeanNonZero;
    private List<Integer> differentDrawablesModusNonZero;
    private Integer differentDrawablesMedianNonZero;
    private Integer differentDrawablesMaxNonZero;
    private Integer differentDrawablesMinNonZero;
    private BigDecimal differentDrawablesVarianceNonZero;
    private BigDecimal differentDrawablesDeviationNonZero;


    //DRAWABLES RESOLUTION
    //-------------------------------------------------------

    // ldpi
    private PercentagePair apksWithLdpiDrawablesObtainedSuccessfully;
    private BigDecimal ldpiDrawablesArithmeticMean;
    private List<Integer> ldpiDrawablesModus;
    private Integer ldpiDrawablesMedian;
    private Integer ldpiDrawablesMax;
    private Integer ldpiDrawablesMin;
    private BigDecimal ldpiDrawablesVariance;
    private BigDecimal ldpiDrawablesDeviation;

    private PercentagePair apksWithLdpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal ldpiDrawablesArithmeticMeanNonZero;
    private List<Integer> ldpiDrawablesModusNonZero;
    private Integer ldpiDrawablesMedianNonZero;
    private Integer ldpiDrawablesMaxNonZero;
    private Integer ldpiDrawablesMinNonZero;
    private BigDecimal ldpiDrawablesVarianceNonZero;
    private BigDecimal ldpiDrawablesDeviationNonZero;

    // mdpi
    private PercentagePair apksWithMdpiDrawablesObtainedSuccessfully;
    private BigDecimal mdpiDrawablesArithmeticMean;
    private List<Integer> mdpiDrawablesModus;
    private Integer mdpiDrawablesMedian;
    private Integer mdpiDrawablesMax;
    private Integer mdpiDrawablesMin;
    private BigDecimal mdpiDrawablesVariance;
    private BigDecimal mdpiDrawablesDeviation;

    private PercentagePair apksWithMdpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal mdpiDrawablesArithmeticMeanNonZero;
    private List<Integer> mdpiDrawablesModusNonZero;
    private Integer mdpiDrawablesMedianNonZero;
    private Integer mdpiDrawablesMaxNonZero;
    private Integer mdpiDrawablesMinNonZero;
    private BigDecimal mdpiDrawablesVarianceNonZero;
    private BigDecimal mdpiDrawablesDeviationNonZero;

    // hdpi
    private PercentagePair apksWithHdpiDrawablesObtainedSuccessfully;
    private BigDecimal hdpiDrawablesArithmeticMean;
    private List<Integer> hdpiDrawablesModus;
    private Integer hdpiDrawablesMedian;
    private Integer hdpiDrawablesMax;
    private Integer hdpiDrawablesMin;
    private BigDecimal hdpiDrawablesVariance;
    private BigDecimal hdpiDrawablesDeviation;

    private PercentagePair apksWithHdpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal hdpiDrawablesArithmeticMeanNonZero;
    private List<Integer> hdpiDrawablesModusNonZero;
    private Integer hdpiDrawablesMedianNonZero;
    private Integer hdpiDrawablesMaxNonZero;
    private Integer hdpiDrawablesMinNonZero;
    private BigDecimal hdpiDrawablesVarianceNonZero;
    private BigDecimal hdpiDrawablesDeviationNonZero;

    // xdpi
    private PercentagePair apksWithXhdpiDrawablesObtainedSuccessfully;
    private BigDecimal xhdpiDrawablesArithmeticMean;
    private List<Integer> xhdpiDrawablesModus;
    private Integer xhdpiDrawablesMedian;
    private Integer xhdpiDrawablesMax;
    private Integer xhdpiDrawablesMin;
    private BigDecimal xhdpiDrawablesVariance;
    private BigDecimal xhdpiDrawablesDeviation;

    private PercentagePair apksWithXhdpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal xhdpiDrawablesArithmeticMeanNonZero;
    private List<Integer> xhdpiDrawablesModusNonZero;
    private Integer xhdpiDrawablesMedianNonZero;
    private Integer xhdpiDrawablesMaxNonZero;
    private Integer xhdpiDrawablesMinNonZero;
    private BigDecimal xhdpiDrawablesVarianceNonZero;
    private BigDecimal xhdpiDrawablesDeviationNonZero;

    // xxdpi
    private PercentagePair apksWithXxhdpiDrawablesObtainedSuccessfully;
    private BigDecimal xxhdpiDrawablesArithmeticMean;
    private List<Integer> xxhdpiDrawablesModus;
    private Integer xxhdpiDrawablesMedian;
    private Integer xxhdpiDrawablesMax;
    private Integer xxhdpiDrawablesMin;
    private BigDecimal xxhdpiDrawablesVariance;
    private BigDecimal xxhdpiDrawablesDeviation;

    private PercentagePair apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal xxhdpiDrawablesArithmeticMeanNonZero;
    private List<Integer> xxhdpiDrawablesModusNonZero;
    private Integer xxhdpiDrawablesMedianNonZero;
    private Integer xxhdpiDrawablesMaxNonZero;
    private Integer xxhdpiDrawablesMinNonZero;
    private BigDecimal xxhdpiDrawablesVarianceNonZero;
    private BigDecimal xxhdpiDrawablesDeviationNonZero;

    // xxxdpi
    private PercentagePair apksWithXxxhdpiDrawablesObtainedSuccessfully;
    private BigDecimal xxxhdpiDrawablesArithmeticMean;
    private List<Integer> xxxhdpiDrawablesModus;
    private Integer xxxhdpiDrawablesMedian;
    private Integer xxxhdpiDrawablesMax;
    private Integer xxxhdpiDrawablesMin;
    private BigDecimal xxxhdpiDrawablesVariance;
    private BigDecimal xxxhdpiDrawablesDeviation;

    private PercentagePair apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal xxxhdpiDrawablesArithmeticMeanNonZero;
    private List<Integer> xxxhdpiDrawablesModusNonZero;
    private Integer xxxhdpiDrawablesMedianNonZero;
    private Integer xxxhdpiDrawablesMaxNonZero;
    private Integer xxxhdpiDrawablesMinNonZero;
    private BigDecimal xxxhdpiDrawablesVarianceNonZero;
    private BigDecimal xxxhdpiDrawablesDeviationNonZero;

    // unspecified dpi
    private PercentagePair apksWithUnspecifiedDpiDrawablesObtainedSuccessfully;
    private BigDecimal unspecifiedDpiDrawablesArithmeticMean;
    private List<Integer> unspecifiedDpiDrawablesModus;
    private Integer unspecifiedDpiDrawablesMedian;
    private Integer unspecifiedDpiDrawablesMax;
    private Integer unspecifiedDpiDrawablesMin;
    private BigDecimal unspecifiedDpiDrawablesVariance;
    private BigDecimal unspecifiedDpiDrawablesDeviation;

    private PercentagePair apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero;
    private BigDecimal unspecifiedDpiDrawablesArithmeticMeanNonZero;
    private List<Integer> unspecifiedDpiDrawablesModusNonZero;
    private Integer unspecifiedDpiDrawablesMedianNonZero;
    private Integer unspecifiedDpiDrawablesMaxNonZero;
    private Integer unspecifiedDpiDrawablesMinNonZero;
    private BigDecimal unspecifiedDpiDrawablesVarianceNonZero;
    private BigDecimal unspecifiedDpiDrawablesDeviationNonZero;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public PercentagePair getApksWithPngDrawablesObtainedSuccessfully() {
        return apksWithPngDrawablesObtainedSuccessfully;
    }

    public void setApksWithPngDrawablesObtainedSuccessfully(PercentagePair apksWithPngDrawablesObtainedSuccessfully) {
        this.apksWithPngDrawablesObtainedSuccessfully = apksWithPngDrawablesObtainedSuccessfully;
    }

    public BigDecimal getPngDrawablesArithmeticMean() {
        return pngDrawablesArithmeticMean;
    }

    public void setPngDrawablesArithmeticMean(BigDecimal pngDrawablesArithmeticMean) {
        this.pngDrawablesArithmeticMean = pngDrawablesArithmeticMean;
    }

    public List<Integer> getPngDrawablesModus() {
        return pngDrawablesModus;
    }

    public void setPngDrawablesModus(List<Integer> pngDrawablesModus) {
        this.pngDrawablesModus = pngDrawablesModus;
    }

    public Integer getPngDrawablesMedian() {
        return pngDrawablesMedian;
    }

    public void setPngDrawablesMedian(Integer pngDrawablesMedian) {
        this.pngDrawablesMedian = pngDrawablesMedian;
    }

    public Integer getPngDrawablesMax() {
        return pngDrawablesMax;
    }

    public void setPngDrawablesMax(Integer pngDrawablesMax) {
        this.pngDrawablesMax = pngDrawablesMax;
    }

    public Integer getPngDrawablesMin() {
        return pngDrawablesMin;
    }

    public void setPngDrawablesMin(Integer pngDrawablesMin) {
        this.pngDrawablesMin = pngDrawablesMin;
    }

    public BigDecimal getPngDrawablesVariance() {
        return pngDrawablesVariance;
    }

    public void setPngDrawablesVariance(BigDecimal pngDrawablesVariance) {
        this.pngDrawablesVariance = pngDrawablesVariance;
    }

    public BigDecimal getPngDrawablesDeviation() {
        return pngDrawablesDeviation;
    }

    public void setPngDrawablesDeviation(BigDecimal pngDrawablesDeviation) {
        this.pngDrawablesDeviation = pngDrawablesDeviation;
    }

    public PercentagePair getApksWithPngDrawablesObtainedSuccessfullyNonZero() {
        return apksWithPngDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithPngDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithPngDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithPngDrawablesObtainedSuccessfullyNonZero = apksWithPngDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getPngDrawablesArithmeticMeanNonZero() {
        return pngDrawablesArithmeticMeanNonZero;
    }

    public void setPngDrawablesArithmeticMeanNonZero(BigDecimal pngDrawablesArithmeticMeanNonZero) {
        this.pngDrawablesArithmeticMeanNonZero = pngDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getPngDrawablesModusNonZero() {
        return pngDrawablesModusNonZero;
    }

    public void setPngDrawablesModusNonZero(List<Integer> pngDrawablesModusNonZero) {
        this.pngDrawablesModusNonZero = pngDrawablesModusNonZero;
    }

    public Integer getPngDrawablesMedianNonZero() {
        return pngDrawablesMedianNonZero;
    }

    public void setPngDrawablesMedianNonZero(Integer pngDrawablesMedianNonZero) {
        this.pngDrawablesMedianNonZero = pngDrawablesMedianNonZero;
    }

    public Integer getPngDrawablesMaxNonZero() {
        return pngDrawablesMaxNonZero;
    }

    public void setPngDrawablesMaxNonZero(Integer pngDrawablesMaxNonZero) {
        this.pngDrawablesMaxNonZero = pngDrawablesMaxNonZero;
    }

    public Integer getPngDrawablesMinNonZero() {
        return pngDrawablesMinNonZero;
    }

    public void setPngDrawablesMinNonZero(Integer pngDrawablesMinNonZero) {
        this.pngDrawablesMinNonZero = pngDrawablesMinNonZero;
    }

    public BigDecimal getPngDrawablesVarianceNonZero() {
        return pngDrawablesVarianceNonZero;
    }

    public void setPngDrawablesVarianceNonZero(BigDecimal pngDrawablesVarianceNonZero) {
        this.pngDrawablesVarianceNonZero = pngDrawablesVarianceNonZero;
    }

    public BigDecimal getPngDrawablesDeviationNonZero() {
        return pngDrawablesDeviationNonZero;
    }

    public void setPngDrawablesDeviationNonZero(BigDecimal pngDrawablesDeviationNonZero) {
        this.pngDrawablesDeviationNonZero = pngDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithJpgDrawablesObtainedSuccessfully() {
        return apksWithJpgDrawablesObtainedSuccessfully;
    }

    public void setApksWithJpgDrawablesObtainedSuccessfully(PercentagePair apksWithJpgDrawablesObtainedSuccessfully) {
        this.apksWithJpgDrawablesObtainedSuccessfully = apksWithJpgDrawablesObtainedSuccessfully;
    }

    public BigDecimal getJpgDrawablesArithmeticMean() {
        return jpgDrawablesArithmeticMean;
    }

    public void setJpgDrawablesArithmeticMean(BigDecimal jpgDrawablesArithmeticMean) {
        this.jpgDrawablesArithmeticMean = jpgDrawablesArithmeticMean;
    }

    public List<Integer> getJpgDrawablesModus() {
        return jpgDrawablesModus;
    }

    public void setJpgDrawablesModus(List<Integer> jpgDrawablesModus) {
        this.jpgDrawablesModus = jpgDrawablesModus;
    }

    public Integer getJpgDrawablesMedian() {
        return jpgDrawablesMedian;
    }

    public void setJpgDrawablesMedian(Integer jpgDrawablesMedian) {
        this.jpgDrawablesMedian = jpgDrawablesMedian;
    }

    public Integer getJpgDrawablesMax() {
        return jpgDrawablesMax;
    }

    public void setJpgDrawablesMax(Integer jpgDrawablesMax) {
        this.jpgDrawablesMax = jpgDrawablesMax;
    }

    public Integer getJpgDrawablesMin() {
        return jpgDrawablesMin;
    }

    public void setJpgDrawablesMin(Integer jpgDrawablesMin) {
        this.jpgDrawablesMin = jpgDrawablesMin;
    }

    public BigDecimal getJpgDrawablesVariance() {
        return jpgDrawablesVariance;
    }

    public void setJpgDrawablesVariance(BigDecimal jpgDrawablesVariance) {
        this.jpgDrawablesVariance = jpgDrawablesVariance;
    }

    public BigDecimal getJpgDrawablesDeviation() {
        return jpgDrawablesDeviation;
    }

    public void setJpgDrawablesDeviation(BigDecimal jpgDrawablesDeviation) {
        this.jpgDrawablesDeviation = jpgDrawablesDeviation;
    }

    public PercentagePair getApksWithJpgDrawablesObtainedSuccessfullyNonZero() {
        return apksWithJpgDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithJpgDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithJpgDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithJpgDrawablesObtainedSuccessfullyNonZero = apksWithJpgDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getJpgDrawablesArithmeticMeanNonZero() {
        return jpgDrawablesArithmeticMeanNonZero;
    }

    public void setJpgDrawablesArithmeticMeanNonZero(BigDecimal jpgDrawablesArithmeticMeanNonZero) {
        this.jpgDrawablesArithmeticMeanNonZero = jpgDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getJpgDrawablesModusNonZero() {
        return jpgDrawablesModusNonZero;
    }

    public void setJpgDrawablesModusNonZero(List<Integer> jpgDrawablesModusNonZero) {
        this.jpgDrawablesModusNonZero = jpgDrawablesModusNonZero;
    }

    public Integer getJpgDrawablesMedianNonZero() {
        return jpgDrawablesMedianNonZero;
    }

    public void setJpgDrawablesMedianNonZero(Integer jpgDrawablesMedianNonZero) {
        this.jpgDrawablesMedianNonZero = jpgDrawablesMedianNonZero;
    }

    public Integer getJpgDrawablesMaxNonZero() {
        return jpgDrawablesMaxNonZero;
    }

    public void setJpgDrawablesMaxNonZero(Integer jpgDrawablesMaxNonZero) {
        this.jpgDrawablesMaxNonZero = jpgDrawablesMaxNonZero;
    }

    public Integer getJpgDrawablesMinNonZero() {
        return jpgDrawablesMinNonZero;
    }

    public void setJpgDrawablesMinNonZero(Integer jpgDrawablesMinNonZero) {
        this.jpgDrawablesMinNonZero = jpgDrawablesMinNonZero;
    }

    public BigDecimal getJpgDrawablesVarianceNonZero() {
        return jpgDrawablesVarianceNonZero;
    }

    public void setJpgDrawablesVarianceNonZero(BigDecimal jpgDrawablesVarianceNonZero) {
        this.jpgDrawablesVarianceNonZero = jpgDrawablesVarianceNonZero;
    }

    public BigDecimal getJpgDrawablesDeviationNonZero() {
        return jpgDrawablesDeviationNonZero;
    }

    public void setJpgDrawablesDeviationNonZero(BigDecimal jpgDrawablesDeviationNonZero) {
        this.jpgDrawablesDeviationNonZero = jpgDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithGifDrawablesObtainedSuccessfully() {
        return apksWithGifDrawablesObtainedSuccessfully;
    }

    public void setApksWithGifDrawablesObtainedSuccessfully(PercentagePair apksWithGifDrawablesObtainedSuccessfully) {
        this.apksWithGifDrawablesObtainedSuccessfully = apksWithGifDrawablesObtainedSuccessfully;
    }

    public BigDecimal getGifDrawablesArithmeticMean() {
        return gifDrawablesArithmeticMean;
    }

    public void setGifDrawablesArithmeticMean(BigDecimal gifDrawablesArithmeticMean) {
        this.gifDrawablesArithmeticMean = gifDrawablesArithmeticMean;
    }

    public List<Integer> getGifDrawablesModus() {
        return gifDrawablesModus;
    }

    public void setGifDrawablesModus(List<Integer> gifDrawablesModus) {
        this.gifDrawablesModus = gifDrawablesModus;
    }

    public Integer getGifDrawablesMedian() {
        return gifDrawablesMedian;
    }

    public void setGifDrawablesMedian(Integer gifDrawablesMedian) {
        this.gifDrawablesMedian = gifDrawablesMedian;
    }

    public Integer getGifDrawablesMax() {
        return gifDrawablesMax;
    }

    public void setGifDrawablesMax(Integer gifDrawablesMax) {
        this.gifDrawablesMax = gifDrawablesMax;
    }

    public Integer getGifDrawablesMin() {
        return gifDrawablesMin;
    }

    public void setGifDrawablesMin(Integer gifDrawablesMin) {
        this.gifDrawablesMin = gifDrawablesMin;
    }

    public BigDecimal getGifDrawablesVariance() {
        return gifDrawablesVariance;
    }

    public void setGifDrawablesVariance(BigDecimal gifDrawablesVariance) {
        this.gifDrawablesVariance = gifDrawablesVariance;
    }

    public BigDecimal getGifDrawablesDeviation() {
        return gifDrawablesDeviation;
    }

    public void setGifDrawablesDeviation(BigDecimal gifDrawablesDeviation) {
        this.gifDrawablesDeviation = gifDrawablesDeviation;
    }

    public PercentagePair getApksWithGifDrawablesObtainedSuccessfullyNonZero() {
        return apksWithGifDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithGifDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithGifDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithGifDrawablesObtainedSuccessfullyNonZero = apksWithGifDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getGifDrawablesArithmeticMeanNonZero() {
        return gifDrawablesArithmeticMeanNonZero;
    }

    public void setGifDrawablesArithmeticMeanNonZero(BigDecimal gifDrawablesArithmeticMeanNonZero) {
        this.gifDrawablesArithmeticMeanNonZero = gifDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getGifDrawablesModusNonZero() {
        return gifDrawablesModusNonZero;
    }

    public void setGifDrawablesModusNonZero(List<Integer> gifDrawablesModusNonZero) {
        this.gifDrawablesModusNonZero = gifDrawablesModusNonZero;
    }

    public Integer getGifDrawablesMedianNonZero() {
        return gifDrawablesMedianNonZero;
    }

    public void setGifDrawablesMedianNonZero(Integer gifDrawablesMedianNonZero) {
        this.gifDrawablesMedianNonZero = gifDrawablesMedianNonZero;
    }

    public Integer getGifDrawablesMaxNonZero() {
        return gifDrawablesMaxNonZero;
    }

    public void setGifDrawablesMaxNonZero(Integer gifDrawablesMaxNonZero) {
        this.gifDrawablesMaxNonZero = gifDrawablesMaxNonZero;
    }

    public Integer getGifDrawablesMinNonZero() {
        return gifDrawablesMinNonZero;
    }

    public void setGifDrawablesMinNonZero(Integer gifDrawablesMinNonZero) {
        this.gifDrawablesMinNonZero = gifDrawablesMinNonZero;
    }

    public BigDecimal getGifDrawablesVarianceNonZero() {
        return gifDrawablesVarianceNonZero;
    }

    public void setGifDrawablesVarianceNonZero(BigDecimal gifDrawablesVarianceNonZero) {
        this.gifDrawablesVarianceNonZero = gifDrawablesVarianceNonZero;
    }

    public BigDecimal getGifDrawablesDeviationNonZero() {
        return gifDrawablesDeviationNonZero;
    }

    public void setGifDrawablesDeviationNonZero(BigDecimal gifDrawablesDeviationNonZero) {
        this.gifDrawablesDeviationNonZero = gifDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithXmlDrawablesObtainedSuccessfully() {
        return apksWithXmlDrawablesObtainedSuccessfully;
    }

    public void setApksWithXmlDrawablesObtainedSuccessfully(PercentagePair apksWithXmlDrawablesObtainedSuccessfully) {
        this.apksWithXmlDrawablesObtainedSuccessfully = apksWithXmlDrawablesObtainedSuccessfully;
    }

    public BigDecimal getXmlDrawablesArithmeticMean() {
        return xmlDrawablesArithmeticMean;
    }

    public void setXmlDrawablesArithmeticMean(BigDecimal xmlDrawablesArithmeticMean) {
        this.xmlDrawablesArithmeticMean = xmlDrawablesArithmeticMean;
    }

    public List<Integer> getXmlDrawablesModus() {
        return xmlDrawablesModus;
    }

    public void setXmlDrawablesModus(List<Integer> xmlDrawablesModus) {
        this.xmlDrawablesModus = xmlDrawablesModus;
    }

    public Integer getXmlDrawablesMedian() {
        return xmlDrawablesMedian;
    }

    public void setXmlDrawablesMedian(Integer xmlDrawablesMedian) {
        this.xmlDrawablesMedian = xmlDrawablesMedian;
    }

    public Integer getXmlDrawablesMax() {
        return xmlDrawablesMax;
    }

    public void setXmlDrawablesMax(Integer xmlDrawablesMax) {
        this.xmlDrawablesMax = xmlDrawablesMax;
    }

    public Integer getXmlDrawablesMin() {
        return xmlDrawablesMin;
    }

    public void setXmlDrawablesMin(Integer xmlDrawablesMin) {
        this.xmlDrawablesMin = xmlDrawablesMin;
    }

    public BigDecimal getXmlDrawablesVariance() {
        return xmlDrawablesVariance;
    }

    public void setXmlDrawablesVariance(BigDecimal xmlDrawablesVariance) {
        this.xmlDrawablesVariance = xmlDrawablesVariance;
    }

    public BigDecimal getXmlDrawablesDeviation() {
        return xmlDrawablesDeviation;
    }

    public void setXmlDrawablesDeviation(BigDecimal xmlDrawablesDeviation) {
        this.xmlDrawablesDeviation = xmlDrawablesDeviation;
    }

    public PercentagePair getApksWithXmlDrawablesObtainedSuccessfullyNonZero() {
        return apksWithXmlDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithXmlDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithXmlDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithXmlDrawablesObtainedSuccessfullyNonZero = apksWithXmlDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getXmlDrawablesArithmeticMeanNonZero() {
        return xmlDrawablesArithmeticMeanNonZero;
    }

    public void setXmlDrawablesArithmeticMeanNonZero(BigDecimal xmlDrawablesArithmeticMeanNonZero) {
        this.xmlDrawablesArithmeticMeanNonZero = xmlDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getXmlDrawablesModusNonZero() {
        return xmlDrawablesModusNonZero;
    }

    public void setXmlDrawablesModusNonZero(List<Integer> xmlDrawablesModusNonZero) {
        this.xmlDrawablesModusNonZero = xmlDrawablesModusNonZero;
    }

    public Integer getXmlDrawablesMedianNonZero() {
        return xmlDrawablesMedianNonZero;
    }

    public void setXmlDrawablesMedianNonZero(Integer xmlDrawablesMedianNonZero) {
        this.xmlDrawablesMedianNonZero = xmlDrawablesMedianNonZero;
    }

    public Integer getXmlDrawablesMaxNonZero() {
        return xmlDrawablesMaxNonZero;
    }

    public void setXmlDrawablesMaxNonZero(Integer xmlDrawablesMaxNonZero) {
        this.xmlDrawablesMaxNonZero = xmlDrawablesMaxNonZero;
    }

    public Integer getXmlDrawablesMinNonZero() {
        return xmlDrawablesMinNonZero;
    }

    public void setXmlDrawablesMinNonZero(Integer xmlDrawablesMinNonZero) {
        this.xmlDrawablesMinNonZero = xmlDrawablesMinNonZero;
    }

    public BigDecimal getXmlDrawablesVarianceNonZero() {
        return xmlDrawablesVarianceNonZero;
    }

    public void setXmlDrawablesVarianceNonZero(BigDecimal xmlDrawablesVarianceNonZero) {
        this.xmlDrawablesVarianceNonZero = xmlDrawablesVarianceNonZero;
    }

    public BigDecimal getXmlDrawablesDeviationNonZero() {
        return xmlDrawablesDeviationNonZero;
    }

    public void setXmlDrawablesDeviationNonZero(BigDecimal xmlDrawablesDeviationNonZero) {
        this.xmlDrawablesDeviationNonZero = xmlDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithDifferentDrawablesObtainedSuccessfully() {
        return apksWithDifferentDrawablesObtainedSuccessfully;
    }

    public void setApksWithDifferentDrawablesObtainedSuccessfully(PercentagePair apksWithDifferentDrawablesObtainedSuccessfully) {
        this.apksWithDifferentDrawablesObtainedSuccessfully = apksWithDifferentDrawablesObtainedSuccessfully;
    }

    public BigDecimal getDifferentDrawablesArithmeticMean() {
        return differentDrawablesArithmeticMean;
    }

    public void setDifferentDrawablesArithmeticMean(BigDecimal differentDrawablesArithmeticMean) {
        this.differentDrawablesArithmeticMean = differentDrawablesArithmeticMean;
    }

    public List<Integer> getDifferentDrawablesModus() {
        return differentDrawablesModus;
    }

    public void setDifferentDrawablesModus(List<Integer> differentDrawablesModus) {
        this.differentDrawablesModus = differentDrawablesModus;
    }

    public Integer getDifferentDrawablesMedian() {
        return differentDrawablesMedian;
    }

    public void setDifferentDrawablesMedian(Integer differentDrawablesMedian) {
        this.differentDrawablesMedian = differentDrawablesMedian;
    }

    public Integer getDifferentDrawablesMax() {
        return differentDrawablesMax;
    }

    public void setDifferentDrawablesMax(Integer differentDrawablesMax) {
        this.differentDrawablesMax = differentDrawablesMax;
    }

    public Integer getDifferentDrawablesMin() {
        return differentDrawablesMin;
    }

    public void setDifferentDrawablesMin(Integer differentDrawablesMin) {
        this.differentDrawablesMin = differentDrawablesMin;
    }

    public BigDecimal getDifferentDrawablesVariance() {
        return differentDrawablesVariance;
    }

    public void setDifferentDrawablesVariance(BigDecimal differentDrawablesVariance) {
        this.differentDrawablesVariance = differentDrawablesVariance;
    }

    public BigDecimal getDifferentDrawablesDeviation() {
        return differentDrawablesDeviation;
    }

    public void setDifferentDrawablesDeviation(BigDecimal differentDrawablesDeviation) {
        this.differentDrawablesDeviation = differentDrawablesDeviation;
    }

    public PercentagePair getApksWithDifferentDrawablesObtainedSuccessfullyNonZero() {
        return apksWithDifferentDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithDifferentDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithDifferentDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithDifferentDrawablesObtainedSuccessfullyNonZero = apksWithDifferentDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getDifferentDrawablesArithmeticMeanNonZero() {
        return differentDrawablesArithmeticMeanNonZero;
    }

    public void setDifferentDrawablesArithmeticMeanNonZero(BigDecimal differentDrawablesArithmeticMeanNonZero) {
        this.differentDrawablesArithmeticMeanNonZero = differentDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getDifferentDrawablesModusNonZero() {
        return differentDrawablesModusNonZero;
    }

    public void setDifferentDrawablesModusNonZero(List<Integer> differentDrawablesModusNonZero) {
        this.differentDrawablesModusNonZero = differentDrawablesModusNonZero;
    }

    public Integer getDifferentDrawablesMedianNonZero() {
        return differentDrawablesMedianNonZero;
    }

    public void setDifferentDrawablesMedianNonZero(Integer differentDrawablesMedianNonZero) {
        this.differentDrawablesMedianNonZero = differentDrawablesMedianNonZero;
    }

    public Integer getDifferentDrawablesMaxNonZero() {
        return differentDrawablesMaxNonZero;
    }

    public void setDifferentDrawablesMaxNonZero(Integer differentDrawablesMaxNonZero) {
        this.differentDrawablesMaxNonZero = differentDrawablesMaxNonZero;
    }

    public Integer getDifferentDrawablesMinNonZero() {
        return differentDrawablesMinNonZero;
    }

    public void setDifferentDrawablesMinNonZero(Integer differentDrawablesMinNonZero) {
        this.differentDrawablesMinNonZero = differentDrawablesMinNonZero;
    }

    public BigDecimal getDifferentDrawablesVarianceNonZero() {
        return differentDrawablesVarianceNonZero;
    }

    public void setDifferentDrawablesVarianceNonZero(BigDecimal differentDrawablesVarianceNonZero) {
        this.differentDrawablesVarianceNonZero = differentDrawablesVarianceNonZero;
    }

    public BigDecimal getDifferentDrawablesDeviationNonZero() {
        return differentDrawablesDeviationNonZero;
    }

    public void setDifferentDrawablesDeviationNonZero(BigDecimal differentDrawablesDeviationNonZero) {
        this.differentDrawablesDeviationNonZero = differentDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithLdpiDrawablesObtainedSuccessfully() {
        return apksWithLdpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithLdpiDrawablesObtainedSuccessfully(PercentagePair apksWithLdpiDrawablesObtainedSuccessfully) {
        this.apksWithLdpiDrawablesObtainedSuccessfully = apksWithLdpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getLdpiDrawablesArithmeticMean() {
        return ldpiDrawablesArithmeticMean;
    }

    public void setLdpiDrawablesArithmeticMean(BigDecimal ldpiDrawablesArithmeticMean) {
        this.ldpiDrawablesArithmeticMean = ldpiDrawablesArithmeticMean;
    }

    public List<Integer> getLdpiDrawablesModus() {
        return ldpiDrawablesModus;
    }

    public void setLdpiDrawablesModus(List<Integer> ldpiDrawablesModus) {
        this.ldpiDrawablesModus = ldpiDrawablesModus;
    }

    public Integer getLdpiDrawablesMedian() {
        return ldpiDrawablesMedian;
    }

    public void setLdpiDrawablesMedian(Integer ldpiDrawablesMedian) {
        this.ldpiDrawablesMedian = ldpiDrawablesMedian;
    }

    public Integer getLdpiDrawablesMax() {
        return ldpiDrawablesMax;
    }

    public void setLdpiDrawablesMax(Integer ldpiDrawablesMax) {
        this.ldpiDrawablesMax = ldpiDrawablesMax;
    }

    public Integer getLdpiDrawablesMin() {
        return ldpiDrawablesMin;
    }

    public void setLdpiDrawablesMin(Integer ldpiDrawablesMin) {
        this.ldpiDrawablesMin = ldpiDrawablesMin;
    }

    public BigDecimal getLdpiDrawablesVariance() {
        return ldpiDrawablesVariance;
    }

    public void setLdpiDrawablesVariance(BigDecimal ldpiDrawablesVariance) {
        this.ldpiDrawablesVariance = ldpiDrawablesVariance;
    }

    public BigDecimal getLdpiDrawablesDeviation() {
        return ldpiDrawablesDeviation;
    }

    public void setLdpiDrawablesDeviation(BigDecimal ldpiDrawablesDeviation) {
        this.ldpiDrawablesDeviation = ldpiDrawablesDeviation;
    }

    public PercentagePair getApksWithLdpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithLdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithLdpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithLdpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithLdpiDrawablesObtainedSuccessfullyNonZero = apksWithLdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getLdpiDrawablesArithmeticMeanNonZero() {
        return ldpiDrawablesArithmeticMeanNonZero;
    }

    public void setLdpiDrawablesArithmeticMeanNonZero(BigDecimal ldpiDrawablesArithmeticMeanNonZero) {
        this.ldpiDrawablesArithmeticMeanNonZero = ldpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getLdpiDrawablesModusNonZero() {
        return ldpiDrawablesModusNonZero;
    }

    public void setLdpiDrawablesModusNonZero(List<Integer> ldpiDrawablesModusNonZero) {
        this.ldpiDrawablesModusNonZero = ldpiDrawablesModusNonZero;
    }

    public Integer getLdpiDrawablesMedianNonZero() {
        return ldpiDrawablesMedianNonZero;
    }

    public void setLdpiDrawablesMedianNonZero(Integer ldpiDrawablesMedianNonZero) {
        this.ldpiDrawablesMedianNonZero = ldpiDrawablesMedianNonZero;
    }

    public Integer getLdpiDrawablesMaxNonZero() {
        return ldpiDrawablesMaxNonZero;
    }

    public void setLdpiDrawablesMaxNonZero(Integer ldpiDrawablesMaxNonZero) {
        this.ldpiDrawablesMaxNonZero = ldpiDrawablesMaxNonZero;
    }

    public Integer getLdpiDrawablesMinNonZero() {
        return ldpiDrawablesMinNonZero;
    }

    public void setLdpiDrawablesMinNonZero(Integer ldpiDrawablesMinNonZero) {
        this.ldpiDrawablesMinNonZero = ldpiDrawablesMinNonZero;
    }

    public BigDecimal getLdpiDrawablesVarianceNonZero() {
        return ldpiDrawablesVarianceNonZero;
    }

    public void setLdpiDrawablesVarianceNonZero(BigDecimal ldpiDrawablesVarianceNonZero) {
        this.ldpiDrawablesVarianceNonZero = ldpiDrawablesVarianceNonZero;
    }

    public BigDecimal getLdpiDrawablesDeviationNonZero() {
        return ldpiDrawablesDeviationNonZero;
    }

    public void setLdpiDrawablesDeviationNonZero(BigDecimal ldpiDrawablesDeviationNonZero) {
        this.ldpiDrawablesDeviationNonZero = ldpiDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithMdpiDrawablesObtainedSuccessfully() {
        return apksWithMdpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithMdpiDrawablesObtainedSuccessfully(PercentagePair apksWithMdpiDrawablesObtainedSuccessfully) {
        this.apksWithMdpiDrawablesObtainedSuccessfully = apksWithMdpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getMdpiDrawablesArithmeticMean() {
        return mdpiDrawablesArithmeticMean;
    }

    public void setMdpiDrawablesArithmeticMean(BigDecimal mdpiDrawablesArithmeticMean) {
        this.mdpiDrawablesArithmeticMean = mdpiDrawablesArithmeticMean;
    }

    public List<Integer> getMdpiDrawablesModus() {
        return mdpiDrawablesModus;
    }

    public void setMdpiDrawablesModus(List<Integer> mdpiDrawablesModus) {
        this.mdpiDrawablesModus = mdpiDrawablesModus;
    }

    public Integer getMdpiDrawablesMedian() {
        return mdpiDrawablesMedian;
    }

    public void setMdpiDrawablesMedian(Integer mdpiDrawablesMedian) {
        this.mdpiDrawablesMedian = mdpiDrawablesMedian;
    }

    public Integer getMdpiDrawablesMax() {
        return mdpiDrawablesMax;
    }

    public void setMdpiDrawablesMax(Integer mdpiDrawablesMax) {
        this.mdpiDrawablesMax = mdpiDrawablesMax;
    }

    public Integer getMdpiDrawablesMin() {
        return mdpiDrawablesMin;
    }

    public void setMdpiDrawablesMin(Integer mdpiDrawablesMin) {
        this.mdpiDrawablesMin = mdpiDrawablesMin;
    }

    public BigDecimal getMdpiDrawablesVariance() {
        return mdpiDrawablesVariance;
    }

    public void setMdpiDrawablesVariance(BigDecimal mdpiDrawablesVariance) {
        this.mdpiDrawablesVariance = mdpiDrawablesVariance;
    }

    public BigDecimal getMdpiDrawablesDeviation() {
        return mdpiDrawablesDeviation;
    }

    public void setMdpiDrawablesDeviation(BigDecimal mdpiDrawablesDeviation) {
        this.mdpiDrawablesDeviation = mdpiDrawablesDeviation;
    }

    public PercentagePair getApksWithMdpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithMdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithMdpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithMdpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithMdpiDrawablesObtainedSuccessfullyNonZero = apksWithMdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getMdpiDrawablesArithmeticMeanNonZero() {
        return mdpiDrawablesArithmeticMeanNonZero;
    }

    public void setMdpiDrawablesArithmeticMeanNonZero(BigDecimal mdpiDrawablesArithmeticMeanNonZero) {
        this.mdpiDrawablesArithmeticMeanNonZero = mdpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getMdpiDrawablesModusNonZero() {
        return mdpiDrawablesModusNonZero;
    }

    public void setMdpiDrawablesModusNonZero(List<Integer> mdpiDrawablesModusNonZero) {
        this.mdpiDrawablesModusNonZero = mdpiDrawablesModusNonZero;
    }

    public Integer getMdpiDrawablesMedianNonZero() {
        return mdpiDrawablesMedianNonZero;
    }

    public void setMdpiDrawablesMedianNonZero(Integer mdpiDrawablesMedianNonZero) {
        this.mdpiDrawablesMedianNonZero = mdpiDrawablesMedianNonZero;
    }

    public Integer getMdpiDrawablesMaxNonZero() {
        return mdpiDrawablesMaxNonZero;
    }

    public void setMdpiDrawablesMaxNonZero(Integer mdpiDrawablesMaxNonZero) {
        this.mdpiDrawablesMaxNonZero = mdpiDrawablesMaxNonZero;
    }

    public Integer getMdpiDrawablesMinNonZero() {
        return mdpiDrawablesMinNonZero;
    }

    public void setMdpiDrawablesMinNonZero(Integer mdpiDrawablesMinNonZero) {
        this.mdpiDrawablesMinNonZero = mdpiDrawablesMinNonZero;
    }

    public BigDecimal getMdpiDrawablesVarianceNonZero() {
        return mdpiDrawablesVarianceNonZero;
    }

    public void setMdpiDrawablesVarianceNonZero(BigDecimal mdpiDrawablesVarianceNonZero) {
        this.mdpiDrawablesVarianceNonZero = mdpiDrawablesVarianceNonZero;
    }

    public BigDecimal getMdpiDrawablesDeviationNonZero() {
        return mdpiDrawablesDeviationNonZero;
    }

    public void setMdpiDrawablesDeviationNonZero(BigDecimal mdpiDrawablesDeviationNonZero) {
        this.mdpiDrawablesDeviationNonZero = mdpiDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithHdpiDrawablesObtainedSuccessfully() {
        return apksWithHdpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithHdpiDrawablesObtainedSuccessfully(PercentagePair apksWithHdpiDrawablesObtainedSuccessfully) {
        this.apksWithHdpiDrawablesObtainedSuccessfully = apksWithHdpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getHdpiDrawablesArithmeticMean() {
        return hdpiDrawablesArithmeticMean;
    }

    public void setHdpiDrawablesArithmeticMean(BigDecimal hdpiDrawablesArithmeticMean) {
        this.hdpiDrawablesArithmeticMean = hdpiDrawablesArithmeticMean;
    }

    public List<Integer> getHdpiDrawablesModus() {
        return hdpiDrawablesModus;
    }

    public void setHdpiDrawablesModus(List<Integer> hdpiDrawablesModus) {
        this.hdpiDrawablesModus = hdpiDrawablesModus;
    }

    public Integer getHdpiDrawablesMedian() {
        return hdpiDrawablesMedian;
    }

    public void setHdpiDrawablesMedian(Integer hdpiDrawablesMedian) {
        this.hdpiDrawablesMedian = hdpiDrawablesMedian;
    }

    public Integer getHdpiDrawablesMax() {
        return hdpiDrawablesMax;
    }

    public void setHdpiDrawablesMax(Integer hdpiDrawablesMax) {
        this.hdpiDrawablesMax = hdpiDrawablesMax;
    }

    public Integer getHdpiDrawablesMin() {
        return hdpiDrawablesMin;
    }

    public void setHdpiDrawablesMin(Integer hdpiDrawablesMin) {
        this.hdpiDrawablesMin = hdpiDrawablesMin;
    }

    public BigDecimal getHdpiDrawablesVariance() {
        return hdpiDrawablesVariance;
    }

    public void setHdpiDrawablesVariance(BigDecimal hdpiDrawablesVariance) {
        this.hdpiDrawablesVariance = hdpiDrawablesVariance;
    }

    public BigDecimal getHdpiDrawablesDeviation() {
        return hdpiDrawablesDeviation;
    }

    public void setHdpiDrawablesDeviation(BigDecimal hdpiDrawablesDeviation) {
        this.hdpiDrawablesDeviation = hdpiDrawablesDeviation;
    }

    public PercentagePair getApksWithHdpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithHdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithHdpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithHdpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithHdpiDrawablesObtainedSuccessfullyNonZero = apksWithHdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getHdpiDrawablesArithmeticMeanNonZero() {
        return hdpiDrawablesArithmeticMeanNonZero;
    }

    public void setHdpiDrawablesArithmeticMeanNonZero(BigDecimal hdpiDrawablesArithmeticMeanNonZero) {
        this.hdpiDrawablesArithmeticMeanNonZero = hdpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getHdpiDrawablesModusNonZero() {
        return hdpiDrawablesModusNonZero;
    }

    public void setHdpiDrawablesModusNonZero(List<Integer> hdpiDrawablesModusNonZero) {
        this.hdpiDrawablesModusNonZero = hdpiDrawablesModusNonZero;
    }

    public Integer getHdpiDrawablesMedianNonZero() {
        return hdpiDrawablesMedianNonZero;
    }

    public void setHdpiDrawablesMedianNonZero(Integer hdpiDrawablesMedianNonZero) {
        this.hdpiDrawablesMedianNonZero = hdpiDrawablesMedianNonZero;
    }

    public Integer getHdpiDrawablesMaxNonZero() {
        return hdpiDrawablesMaxNonZero;
    }

    public void setHdpiDrawablesMaxNonZero(Integer hdpiDrawablesMaxNonZero) {
        this.hdpiDrawablesMaxNonZero = hdpiDrawablesMaxNonZero;
    }

    public Integer getHdpiDrawablesMinNonZero() {
        return hdpiDrawablesMinNonZero;
    }

    public void setHdpiDrawablesMinNonZero(Integer hdpiDrawablesMinNonZero) {
        this.hdpiDrawablesMinNonZero = hdpiDrawablesMinNonZero;
    }

    public BigDecimal getHdpiDrawablesVarianceNonZero() {
        return hdpiDrawablesVarianceNonZero;
    }

    public void setHdpiDrawablesVarianceNonZero(BigDecimal hdpiDrawablesVarianceNonZero) {
        this.hdpiDrawablesVarianceNonZero = hdpiDrawablesVarianceNonZero;
    }

    public BigDecimal getHdpiDrawablesDeviationNonZero() {
        return hdpiDrawablesDeviationNonZero;
    }

    public void setHdpiDrawablesDeviationNonZero(BigDecimal hdpiDrawablesDeviationNonZero) {
        this.hdpiDrawablesDeviationNonZero = hdpiDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithXhdpiDrawablesObtainedSuccessfully() {
        return apksWithXhdpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithXhdpiDrawablesObtainedSuccessfully(PercentagePair apksWithXhdpiDrawablesObtainedSuccessfully) {
        this.apksWithXhdpiDrawablesObtainedSuccessfully = apksWithXhdpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getXhdpiDrawablesArithmeticMean() {
        return xhdpiDrawablesArithmeticMean;
    }

    public void setXhdpiDrawablesArithmeticMean(BigDecimal xhdpiDrawablesArithmeticMean) {
        this.xhdpiDrawablesArithmeticMean = xhdpiDrawablesArithmeticMean;
    }

    public List<Integer> getXhdpiDrawablesModus() {
        return xhdpiDrawablesModus;
    }

    public void setXhdpiDrawablesModus(List<Integer> xhdpiDrawablesModus) {
        this.xhdpiDrawablesModus = xhdpiDrawablesModus;
    }

    public Integer getXhdpiDrawablesMedian() {
        return xhdpiDrawablesMedian;
    }

    public void setXhdpiDrawablesMedian(Integer xhdpiDrawablesMedian) {
        this.xhdpiDrawablesMedian = xhdpiDrawablesMedian;
    }

    public Integer getXhdpiDrawablesMax() {
        return xhdpiDrawablesMax;
    }

    public void setXhdpiDrawablesMax(Integer xhdpiDrawablesMax) {
        this.xhdpiDrawablesMax = xhdpiDrawablesMax;
    }

    public Integer getXhdpiDrawablesMin() {
        return xhdpiDrawablesMin;
    }

    public void setXhdpiDrawablesMin(Integer xhdpiDrawablesMin) {
        this.xhdpiDrawablesMin = xhdpiDrawablesMin;
    }

    public BigDecimal getXhdpiDrawablesVariance() {
        return xhdpiDrawablesVariance;
    }

    public void setXhdpiDrawablesVariance(BigDecimal xhdpiDrawablesVariance) {
        this.xhdpiDrawablesVariance = xhdpiDrawablesVariance;
    }

    public BigDecimal getXhdpiDrawablesDeviation() {
        return xhdpiDrawablesDeviation;
    }

    public void setXhdpiDrawablesDeviation(BigDecimal xhdpiDrawablesDeviation) {
        this.xhdpiDrawablesDeviation = xhdpiDrawablesDeviation;
    }

    public PercentagePair getApksWithXhdpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithXhdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithXhdpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithXhdpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithXhdpiDrawablesObtainedSuccessfullyNonZero = apksWithXhdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getXhdpiDrawablesArithmeticMeanNonZero() {
        return xhdpiDrawablesArithmeticMeanNonZero;
    }

    public void setXhdpiDrawablesArithmeticMeanNonZero(BigDecimal xhdpiDrawablesArithmeticMeanNonZero) {
        this.xhdpiDrawablesArithmeticMeanNonZero = xhdpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getXhdpiDrawablesModusNonZero() {
        return xhdpiDrawablesModusNonZero;
    }

    public void setXhdpiDrawablesModusNonZero(List<Integer> xhdpiDrawablesModusNonZero) {
        this.xhdpiDrawablesModusNonZero = xhdpiDrawablesModusNonZero;
    }

    public Integer getXhdpiDrawablesMedianNonZero() {
        return xhdpiDrawablesMedianNonZero;
    }

    public void setXhdpiDrawablesMedianNonZero(Integer xhdpiDrawablesMedianNonZero) {
        this.xhdpiDrawablesMedianNonZero = xhdpiDrawablesMedianNonZero;
    }

    public Integer getXhdpiDrawablesMaxNonZero() {
        return xhdpiDrawablesMaxNonZero;
    }

    public void setXhdpiDrawablesMaxNonZero(Integer xhdpiDrawablesMaxNonZero) {
        this.xhdpiDrawablesMaxNonZero = xhdpiDrawablesMaxNonZero;
    }

    public Integer getXhdpiDrawablesMinNonZero() {
        return xhdpiDrawablesMinNonZero;
    }

    public void setXhdpiDrawablesMinNonZero(Integer xhdpiDrawablesMinNonZero) {
        this.xhdpiDrawablesMinNonZero = xhdpiDrawablesMinNonZero;
    }

    public BigDecimal getXhdpiDrawablesVarianceNonZero() {
        return xhdpiDrawablesVarianceNonZero;
    }

    public void setXhdpiDrawablesVarianceNonZero(BigDecimal xhdpiDrawablesVarianceNonZero) {
        this.xhdpiDrawablesVarianceNonZero = xhdpiDrawablesVarianceNonZero;
    }

    public BigDecimal getXhdpiDrawablesDeviationNonZero() {
        return xhdpiDrawablesDeviationNonZero;
    }

    public void setXhdpiDrawablesDeviationNonZero(BigDecimal xhdpiDrawablesDeviationNonZero) {
        this.xhdpiDrawablesDeviationNonZero = xhdpiDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithXxhdpiDrawablesObtainedSuccessfully() {
        return apksWithXxhdpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithXxhdpiDrawablesObtainedSuccessfully(PercentagePair apksWithXxhdpiDrawablesObtainedSuccessfully) {
        this.apksWithXxhdpiDrawablesObtainedSuccessfully = apksWithXxhdpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getXxhdpiDrawablesArithmeticMean() {
        return xxhdpiDrawablesArithmeticMean;
    }

    public void setXxhdpiDrawablesArithmeticMean(BigDecimal xxhdpiDrawablesArithmeticMean) {
        this.xxhdpiDrawablesArithmeticMean = xxhdpiDrawablesArithmeticMean;
    }

    public List<Integer> getXxhdpiDrawablesModus() {
        return xxhdpiDrawablesModus;
    }

    public void setXxhdpiDrawablesModus(List<Integer> xxhdpiDrawablesModus) {
        this.xxhdpiDrawablesModus = xxhdpiDrawablesModus;
    }

    public Integer getXxhdpiDrawablesMedian() {
        return xxhdpiDrawablesMedian;
    }

    public void setXxhdpiDrawablesMedian(Integer xxhdpiDrawablesMedian) {
        this.xxhdpiDrawablesMedian = xxhdpiDrawablesMedian;
    }

    public Integer getXxhdpiDrawablesMax() {
        return xxhdpiDrawablesMax;
    }

    public void setXxhdpiDrawablesMax(Integer xxhdpiDrawablesMax) {
        this.xxhdpiDrawablesMax = xxhdpiDrawablesMax;
    }

    public Integer getXxhdpiDrawablesMin() {
        return xxhdpiDrawablesMin;
    }

    public void setXxhdpiDrawablesMin(Integer xxhdpiDrawablesMin) {
        this.xxhdpiDrawablesMin = xxhdpiDrawablesMin;
    }

    public BigDecimal getXxhdpiDrawablesVariance() {
        return xxhdpiDrawablesVariance;
    }

    public void setXxhdpiDrawablesVariance(BigDecimal xxhdpiDrawablesVariance) {
        this.xxhdpiDrawablesVariance = xxhdpiDrawablesVariance;
    }

    public BigDecimal getXxhdpiDrawablesDeviation() {
        return xxhdpiDrawablesDeviation;
    }

    public void setXxhdpiDrawablesDeviation(BigDecimal xxhdpiDrawablesDeviation) {
        this.xxhdpiDrawablesDeviation = xxhdpiDrawablesDeviation;
    }

    public PercentagePair getApksWithXxhdpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithXxhdpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero = apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getXxhdpiDrawablesArithmeticMeanNonZero() {
        return xxhdpiDrawablesArithmeticMeanNonZero;
    }

    public void setXxhdpiDrawablesArithmeticMeanNonZero(BigDecimal xxhdpiDrawablesArithmeticMeanNonZero) {
        this.xxhdpiDrawablesArithmeticMeanNonZero = xxhdpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getXxhdpiDrawablesModusNonZero() {
        return xxhdpiDrawablesModusNonZero;
    }

    public void setXxhdpiDrawablesModusNonZero(List<Integer> xxhdpiDrawablesModusNonZero) {
        this.xxhdpiDrawablesModusNonZero = xxhdpiDrawablesModusNonZero;
    }

    public Integer getXxhdpiDrawablesMedianNonZero() {
        return xxhdpiDrawablesMedianNonZero;
    }

    public void setXxhdpiDrawablesMedianNonZero(Integer xxhdpiDrawablesMedianNonZero) {
        this.xxhdpiDrawablesMedianNonZero = xxhdpiDrawablesMedianNonZero;
    }

    public Integer getXxhdpiDrawablesMaxNonZero() {
        return xxhdpiDrawablesMaxNonZero;
    }

    public void setXxhdpiDrawablesMaxNonZero(Integer xxhdpiDrawablesMaxNonZero) {
        this.xxhdpiDrawablesMaxNonZero = xxhdpiDrawablesMaxNonZero;
    }

    public Integer getXxhdpiDrawablesMinNonZero() {
        return xxhdpiDrawablesMinNonZero;
    }

    public void setXxhdpiDrawablesMinNonZero(Integer xxhdpiDrawablesMinNonZero) {
        this.xxhdpiDrawablesMinNonZero = xxhdpiDrawablesMinNonZero;
    }

    public BigDecimal getXxhdpiDrawablesVarianceNonZero() {
        return xxhdpiDrawablesVarianceNonZero;
    }

    public void setXxhdpiDrawablesVarianceNonZero(BigDecimal xxhdpiDrawablesVarianceNonZero) {
        this.xxhdpiDrawablesVarianceNonZero = xxhdpiDrawablesVarianceNonZero;
    }

    public BigDecimal getXxhdpiDrawablesDeviationNonZero() {
        return xxhdpiDrawablesDeviationNonZero;
    }

    public void setXxhdpiDrawablesDeviationNonZero(BigDecimal xxhdpiDrawablesDeviationNonZero) {
        this.xxhdpiDrawablesDeviationNonZero = xxhdpiDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithXxxhdpiDrawablesObtainedSuccessfully() {
        return apksWithXxxhdpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithXxxhdpiDrawablesObtainedSuccessfully(PercentagePair apksWithXxxhdpiDrawablesObtainedSuccessfully) {
        this.apksWithXxxhdpiDrawablesObtainedSuccessfully = apksWithXxxhdpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getXxxhdpiDrawablesArithmeticMean() {
        return xxxhdpiDrawablesArithmeticMean;
    }

    public void setXxxhdpiDrawablesArithmeticMean(BigDecimal xxxhdpiDrawablesArithmeticMean) {
        this.xxxhdpiDrawablesArithmeticMean = xxxhdpiDrawablesArithmeticMean;
    }

    public List<Integer> getXxxhdpiDrawablesModus() {
        return xxxhdpiDrawablesModus;
    }

    public void setXxxhdpiDrawablesModus(List<Integer> xxxhdpiDrawablesModus) {
        this.xxxhdpiDrawablesModus = xxxhdpiDrawablesModus;
    }

    public Integer getXxxhdpiDrawablesMedian() {
        return xxxhdpiDrawablesMedian;
    }

    public void setXxxhdpiDrawablesMedian(Integer xxxhdpiDrawablesMedian) {
        this.xxxhdpiDrawablesMedian = xxxhdpiDrawablesMedian;
    }

    public Integer getXxxhdpiDrawablesMax() {
        return xxxhdpiDrawablesMax;
    }

    public void setXxxhdpiDrawablesMax(Integer xxxhdpiDrawablesMax) {
        this.xxxhdpiDrawablesMax = xxxhdpiDrawablesMax;
    }

    public Integer getXxxhdpiDrawablesMin() {
        return xxxhdpiDrawablesMin;
    }

    public void setXxxhdpiDrawablesMin(Integer xxxhdpiDrawablesMin) {
        this.xxxhdpiDrawablesMin = xxxhdpiDrawablesMin;
    }

    public BigDecimal getXxxhdpiDrawablesVariance() {
        return xxxhdpiDrawablesVariance;
    }

    public void setXxxhdpiDrawablesVariance(BigDecimal xxxhdpiDrawablesVariance) {
        this.xxxhdpiDrawablesVariance = xxxhdpiDrawablesVariance;
    }

    public BigDecimal getXxxhdpiDrawablesDeviation() {
        return xxxhdpiDrawablesDeviation;
    }

    public void setXxxhdpiDrawablesDeviation(BigDecimal xxxhdpiDrawablesDeviation) {
        this.xxxhdpiDrawablesDeviation = xxxhdpiDrawablesDeviation;
    }

    public PercentagePair getApksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero = apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getXxxhdpiDrawablesArithmeticMeanNonZero() {
        return xxxhdpiDrawablesArithmeticMeanNonZero;
    }

    public void setXxxhdpiDrawablesArithmeticMeanNonZero(BigDecimal xxxhdpiDrawablesArithmeticMeanNonZero) {
        this.xxxhdpiDrawablesArithmeticMeanNonZero = xxxhdpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getXxxhdpiDrawablesModusNonZero() {
        return xxxhdpiDrawablesModusNonZero;
    }

    public void setXxxhdpiDrawablesModusNonZero(List<Integer> xxxhdpiDrawablesModusNonZero) {
        this.xxxhdpiDrawablesModusNonZero = xxxhdpiDrawablesModusNonZero;
    }

    public Integer getXxxhdpiDrawablesMedianNonZero() {
        return xxxhdpiDrawablesMedianNonZero;
    }

    public void setXxxhdpiDrawablesMedianNonZero(Integer xxxhdpiDrawablesMedianNonZero) {
        this.xxxhdpiDrawablesMedianNonZero = xxxhdpiDrawablesMedianNonZero;
    }

    public Integer getXxxhdpiDrawablesMaxNonZero() {
        return xxxhdpiDrawablesMaxNonZero;
    }

    public void setXxxhdpiDrawablesMaxNonZero(Integer xxxhdpiDrawablesMaxNonZero) {
        this.xxxhdpiDrawablesMaxNonZero = xxxhdpiDrawablesMaxNonZero;
    }

    public Integer getXxxhdpiDrawablesMinNonZero() {
        return xxxhdpiDrawablesMinNonZero;
    }

    public void setXxxhdpiDrawablesMinNonZero(Integer xxxhdpiDrawablesMinNonZero) {
        this.xxxhdpiDrawablesMinNonZero = xxxhdpiDrawablesMinNonZero;
    }

    public BigDecimal getXxxhdpiDrawablesVarianceNonZero() {
        return xxxhdpiDrawablesVarianceNonZero;
    }

    public void setXxxhdpiDrawablesVarianceNonZero(BigDecimal xxxhdpiDrawablesVarianceNonZero) {
        this.xxxhdpiDrawablesVarianceNonZero = xxxhdpiDrawablesVarianceNonZero;
    }

    public BigDecimal getXxxhdpiDrawablesDeviationNonZero() {
        return xxxhdpiDrawablesDeviationNonZero;
    }

    public void setXxxhdpiDrawablesDeviationNonZero(BigDecimal xxxhdpiDrawablesDeviationNonZero) {
        this.xxxhdpiDrawablesDeviationNonZero = xxxhdpiDrawablesDeviationNonZero;
    }

    public PercentagePair getApksWithUnspecifiedDpiDrawablesObtainedSuccessfully() {
        return apksWithUnspecifiedDpiDrawablesObtainedSuccessfully;
    }

    public void setApksWithUnspecifiedDpiDrawablesObtainedSuccessfully(PercentagePair apksWithUnspecifiedDpiDrawablesObtainedSuccessfully) {
        this.apksWithUnspecifiedDpiDrawablesObtainedSuccessfully = apksWithUnspecifiedDpiDrawablesObtainedSuccessfully;
    }

    public BigDecimal getUnspecifiedDpiDrawablesArithmeticMean() {
        return unspecifiedDpiDrawablesArithmeticMean;
    }

    public void setUnspecifiedDpiDrawablesArithmeticMean(BigDecimal unspecifiedDpiDrawablesArithmeticMean) {
        this.unspecifiedDpiDrawablesArithmeticMean = unspecifiedDpiDrawablesArithmeticMean;
    }

    public List<Integer> getUnspecifiedDpiDrawablesModus() {
        return unspecifiedDpiDrawablesModus;
    }

    public void setUnspecifiedDpiDrawablesModus(List<Integer> unspecifiedDpiDrawablesModus) {
        this.unspecifiedDpiDrawablesModus = unspecifiedDpiDrawablesModus;
    }

    public Integer getUnspecifiedDpiDrawablesMedian() {
        return unspecifiedDpiDrawablesMedian;
    }

    public void setUnspecifiedDpiDrawablesMedian(Integer unspecifiedDpiDrawablesMedian) {
        this.unspecifiedDpiDrawablesMedian = unspecifiedDpiDrawablesMedian;
    }

    public Integer getUnspecifiedDpiDrawablesMax() {
        return unspecifiedDpiDrawablesMax;
    }

    public void setUnspecifiedDpiDrawablesMax(Integer unspecifiedDpiDrawablesMax) {
        this.unspecifiedDpiDrawablesMax = unspecifiedDpiDrawablesMax;
    }

    public Integer getUnspecifiedDpiDrawablesMin() {
        return unspecifiedDpiDrawablesMin;
    }

    public void setUnspecifiedDpiDrawablesMin(Integer unspecifiedDpiDrawablesMin) {
        this.unspecifiedDpiDrawablesMin = unspecifiedDpiDrawablesMin;
    }

    public BigDecimal getUnspecifiedDpiDrawablesVariance() {
        return unspecifiedDpiDrawablesVariance;
    }

    public void setUnspecifiedDpiDrawablesVariance(BigDecimal unspecifiedDpiDrawablesVariance) {
        this.unspecifiedDpiDrawablesVariance = unspecifiedDpiDrawablesVariance;
    }

    public BigDecimal getUnspecifiedDpiDrawablesDeviation() {
        return unspecifiedDpiDrawablesDeviation;
    }

    public void setUnspecifiedDpiDrawablesDeviation(BigDecimal unspecifiedDpiDrawablesDeviation) {
        this.unspecifiedDpiDrawablesDeviation = unspecifiedDpiDrawablesDeviation;
    }

    public PercentagePair getApksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero() {
        return apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero;
    }

    public void setApksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero(PercentagePair apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero) {
        this.apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero = apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getUnspecifiedDpiDrawablesArithmeticMeanNonZero() {
        return unspecifiedDpiDrawablesArithmeticMeanNonZero;
    }

    public void setUnspecifiedDpiDrawablesArithmeticMeanNonZero(BigDecimal unspecifiedDpiDrawablesArithmeticMeanNonZero) {
        this.unspecifiedDpiDrawablesArithmeticMeanNonZero = unspecifiedDpiDrawablesArithmeticMeanNonZero;
    }

    public List<Integer> getUnspecifiedDpiDrawablesModusNonZero() {
        return unspecifiedDpiDrawablesModusNonZero;
    }

    public void setUnspecifiedDpiDrawablesModusNonZero(List<Integer> unspecifiedDpiDrawablesModusNonZero) {
        this.unspecifiedDpiDrawablesModusNonZero = unspecifiedDpiDrawablesModusNonZero;
    }

    public Integer getUnspecifiedDpiDrawablesMedianNonZero() {
        return unspecifiedDpiDrawablesMedianNonZero;
    }

    public void setUnspecifiedDpiDrawablesMedianNonZero(Integer unspecifiedDpiDrawablesMedianNonZero) {
        this.unspecifiedDpiDrawablesMedianNonZero = unspecifiedDpiDrawablesMedianNonZero;
    }

    public Integer getUnspecifiedDpiDrawablesMaxNonZero() {
        return unspecifiedDpiDrawablesMaxNonZero;
    }

    public void setUnspecifiedDpiDrawablesMaxNonZero(Integer unspecifiedDpiDrawablesMaxNonZero) {
        this.unspecifiedDpiDrawablesMaxNonZero = unspecifiedDpiDrawablesMaxNonZero;
    }

    public Integer getUnspecifiedDpiDrawablesMinNonZero() {
        return unspecifiedDpiDrawablesMinNonZero;
    }

    public void setUnspecifiedDpiDrawablesMinNonZero(Integer unspecifiedDpiDrawablesMinNonZero) {
        this.unspecifiedDpiDrawablesMinNonZero = unspecifiedDpiDrawablesMinNonZero;
    }

    public BigDecimal getUnspecifiedDpiDrawablesVarianceNonZero() {
        return unspecifiedDpiDrawablesVarianceNonZero;
    }

    public void setUnspecifiedDpiDrawablesVarianceNonZero(BigDecimal unspecifiedDpiDrawablesVarianceNonZero) {
        this.unspecifiedDpiDrawablesVarianceNonZero = unspecifiedDpiDrawablesVarianceNonZero;
    }

    public BigDecimal getUnspecifiedDpiDrawablesDeviationNonZero() {
        return unspecifiedDpiDrawablesDeviationNonZero;
    }

    public void setUnspecifiedDpiDrawablesDeviationNonZero(BigDecimal unspecifiedDpiDrawablesDeviationNonZero) {
        this.unspecifiedDpiDrawablesDeviationNonZero = unspecifiedDpiDrawablesDeviationNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrawableStatistics that = (DrawableStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (apksWithPngDrawablesObtainedSuccessfully != null ? !apksWithPngDrawablesObtainedSuccessfully.equals(that.apksWithPngDrawablesObtainedSuccessfully) : that.apksWithPngDrawablesObtainedSuccessfully != null)
            return false;
        if (pngDrawablesArithmeticMean != null ? !pngDrawablesArithmeticMean.equals(that.pngDrawablesArithmeticMean) : that.pngDrawablesArithmeticMean != null)
            return false;
        if (pngDrawablesModus != null ? !pngDrawablesModus.equals(that.pngDrawablesModus) : that.pngDrawablesModus != null)
            return false;
        if (pngDrawablesMedian != null ? !pngDrawablesMedian.equals(that.pngDrawablesMedian) : that.pngDrawablesMedian != null)
            return false;
        if (pngDrawablesMax != null ? !pngDrawablesMax.equals(that.pngDrawablesMax) : that.pngDrawablesMax != null)
            return false;
        if (pngDrawablesMin != null ? !pngDrawablesMin.equals(that.pngDrawablesMin) : that.pngDrawablesMin != null)
            return false;
        if (pngDrawablesVariance != null ? !pngDrawablesVariance.equals(that.pngDrawablesVariance) : that.pngDrawablesVariance != null)
            return false;
        if (pngDrawablesDeviation != null ? !pngDrawablesDeviation.equals(that.pngDrawablesDeviation) : that.pngDrawablesDeviation != null)
            return false;
        if (apksWithPngDrawablesObtainedSuccessfullyNonZero != null ? !apksWithPngDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithPngDrawablesObtainedSuccessfullyNonZero) : that.apksWithPngDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (pngDrawablesArithmeticMeanNonZero != null ? !pngDrawablesArithmeticMeanNonZero.equals(that.pngDrawablesArithmeticMeanNonZero) : that.pngDrawablesArithmeticMeanNonZero != null)
            return false;
        if (pngDrawablesModusNonZero != null ? !pngDrawablesModusNonZero.equals(that.pngDrawablesModusNonZero) : that.pngDrawablesModusNonZero != null)
            return false;
        if (pngDrawablesMedianNonZero != null ? !pngDrawablesMedianNonZero.equals(that.pngDrawablesMedianNonZero) : that.pngDrawablesMedianNonZero != null)
            return false;
        if (pngDrawablesMaxNonZero != null ? !pngDrawablesMaxNonZero.equals(that.pngDrawablesMaxNonZero) : that.pngDrawablesMaxNonZero != null)
            return false;
        if (pngDrawablesMinNonZero != null ? !pngDrawablesMinNonZero.equals(that.pngDrawablesMinNonZero) : that.pngDrawablesMinNonZero != null)
            return false;
        if (pngDrawablesVarianceNonZero != null ? !pngDrawablesVarianceNonZero.equals(that.pngDrawablesVarianceNonZero) : that.pngDrawablesVarianceNonZero != null)
            return false;
        if (pngDrawablesDeviationNonZero != null ? !pngDrawablesDeviationNonZero.equals(that.pngDrawablesDeviationNonZero) : that.pngDrawablesDeviationNonZero != null)
            return false;
        if (apksWithJpgDrawablesObtainedSuccessfully != null ? !apksWithJpgDrawablesObtainedSuccessfully.equals(that.apksWithJpgDrawablesObtainedSuccessfully) : that.apksWithJpgDrawablesObtainedSuccessfully != null)
            return false;
        if (jpgDrawablesArithmeticMean != null ? !jpgDrawablesArithmeticMean.equals(that.jpgDrawablesArithmeticMean) : that.jpgDrawablesArithmeticMean != null)
            return false;
        if (jpgDrawablesModus != null ? !jpgDrawablesModus.equals(that.jpgDrawablesModus) : that.jpgDrawablesModus != null)
            return false;
        if (jpgDrawablesMedian != null ? !jpgDrawablesMedian.equals(that.jpgDrawablesMedian) : that.jpgDrawablesMedian != null)
            return false;
        if (jpgDrawablesMax != null ? !jpgDrawablesMax.equals(that.jpgDrawablesMax) : that.jpgDrawablesMax != null)
            return false;
        if (jpgDrawablesMin != null ? !jpgDrawablesMin.equals(that.jpgDrawablesMin) : that.jpgDrawablesMin != null)
            return false;
        if (jpgDrawablesVariance != null ? !jpgDrawablesVariance.equals(that.jpgDrawablesVariance) : that.jpgDrawablesVariance != null)
            return false;
        if (jpgDrawablesDeviation != null ? !jpgDrawablesDeviation.equals(that.jpgDrawablesDeviation) : that.jpgDrawablesDeviation != null)
            return false;
        if (apksWithJpgDrawablesObtainedSuccessfullyNonZero != null ? !apksWithJpgDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithJpgDrawablesObtainedSuccessfullyNonZero) : that.apksWithJpgDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (jpgDrawablesArithmeticMeanNonZero != null ? !jpgDrawablesArithmeticMeanNonZero.equals(that.jpgDrawablesArithmeticMeanNonZero) : that.jpgDrawablesArithmeticMeanNonZero != null)
            return false;
        if (jpgDrawablesModusNonZero != null ? !jpgDrawablesModusNonZero.equals(that.jpgDrawablesModusNonZero) : that.jpgDrawablesModusNonZero != null)
            return false;
        if (jpgDrawablesMedianNonZero != null ? !jpgDrawablesMedianNonZero.equals(that.jpgDrawablesMedianNonZero) : that.jpgDrawablesMedianNonZero != null)
            return false;
        if (jpgDrawablesMaxNonZero != null ? !jpgDrawablesMaxNonZero.equals(that.jpgDrawablesMaxNonZero) : that.jpgDrawablesMaxNonZero != null)
            return false;
        if (jpgDrawablesMinNonZero != null ? !jpgDrawablesMinNonZero.equals(that.jpgDrawablesMinNonZero) : that.jpgDrawablesMinNonZero != null)
            return false;
        if (jpgDrawablesVarianceNonZero != null ? !jpgDrawablesVarianceNonZero.equals(that.jpgDrawablesVarianceNonZero) : that.jpgDrawablesVarianceNonZero != null)
            return false;
        if (jpgDrawablesDeviationNonZero != null ? !jpgDrawablesDeviationNonZero.equals(that.jpgDrawablesDeviationNonZero) : that.jpgDrawablesDeviationNonZero != null)
            return false;
        if (apksWithGifDrawablesObtainedSuccessfully != null ? !apksWithGifDrawablesObtainedSuccessfully.equals(that.apksWithGifDrawablesObtainedSuccessfully) : that.apksWithGifDrawablesObtainedSuccessfully != null)
            return false;
        if (gifDrawablesArithmeticMean != null ? !gifDrawablesArithmeticMean.equals(that.gifDrawablesArithmeticMean) : that.gifDrawablesArithmeticMean != null)
            return false;
        if (gifDrawablesModus != null ? !gifDrawablesModus.equals(that.gifDrawablesModus) : that.gifDrawablesModus != null)
            return false;
        if (gifDrawablesMedian != null ? !gifDrawablesMedian.equals(that.gifDrawablesMedian) : that.gifDrawablesMedian != null)
            return false;
        if (gifDrawablesMax != null ? !gifDrawablesMax.equals(that.gifDrawablesMax) : that.gifDrawablesMax != null)
            return false;
        if (gifDrawablesMin != null ? !gifDrawablesMin.equals(that.gifDrawablesMin) : that.gifDrawablesMin != null)
            return false;
        if (gifDrawablesVariance != null ? !gifDrawablesVariance.equals(that.gifDrawablesVariance) : that.gifDrawablesVariance != null)
            return false;
        if (gifDrawablesDeviation != null ? !gifDrawablesDeviation.equals(that.gifDrawablesDeviation) : that.gifDrawablesDeviation != null)
            return false;
        if (apksWithGifDrawablesObtainedSuccessfullyNonZero != null ? !apksWithGifDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithGifDrawablesObtainedSuccessfullyNonZero) : that.apksWithGifDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (gifDrawablesArithmeticMeanNonZero != null ? !gifDrawablesArithmeticMeanNonZero.equals(that.gifDrawablesArithmeticMeanNonZero) : that.gifDrawablesArithmeticMeanNonZero != null)
            return false;
        if (gifDrawablesModusNonZero != null ? !gifDrawablesModusNonZero.equals(that.gifDrawablesModusNonZero) : that.gifDrawablesModusNonZero != null)
            return false;
        if (gifDrawablesMedianNonZero != null ? !gifDrawablesMedianNonZero.equals(that.gifDrawablesMedianNonZero) : that.gifDrawablesMedianNonZero != null)
            return false;
        if (gifDrawablesMaxNonZero != null ? !gifDrawablesMaxNonZero.equals(that.gifDrawablesMaxNonZero) : that.gifDrawablesMaxNonZero != null)
            return false;
        if (gifDrawablesMinNonZero != null ? !gifDrawablesMinNonZero.equals(that.gifDrawablesMinNonZero) : that.gifDrawablesMinNonZero != null)
            return false;
        if (gifDrawablesVarianceNonZero != null ? !gifDrawablesVarianceNonZero.equals(that.gifDrawablesVarianceNonZero) : that.gifDrawablesVarianceNonZero != null)
            return false;
        if (gifDrawablesDeviationNonZero != null ? !gifDrawablesDeviationNonZero.equals(that.gifDrawablesDeviationNonZero) : that.gifDrawablesDeviationNonZero != null)
            return false;
        if (apksWithXmlDrawablesObtainedSuccessfully != null ? !apksWithXmlDrawablesObtainedSuccessfully.equals(that.apksWithXmlDrawablesObtainedSuccessfully) : that.apksWithXmlDrawablesObtainedSuccessfully != null)
            return false;
        if (xmlDrawablesArithmeticMean != null ? !xmlDrawablesArithmeticMean.equals(that.xmlDrawablesArithmeticMean) : that.xmlDrawablesArithmeticMean != null)
            return false;
        if (xmlDrawablesModus != null ? !xmlDrawablesModus.equals(that.xmlDrawablesModus) : that.xmlDrawablesModus != null)
            return false;
        if (xmlDrawablesMedian != null ? !xmlDrawablesMedian.equals(that.xmlDrawablesMedian) : that.xmlDrawablesMedian != null)
            return false;
        if (xmlDrawablesMax != null ? !xmlDrawablesMax.equals(that.xmlDrawablesMax) : that.xmlDrawablesMax != null)
            return false;
        if (xmlDrawablesMin != null ? !xmlDrawablesMin.equals(that.xmlDrawablesMin) : that.xmlDrawablesMin != null)
            return false;
        if (xmlDrawablesVariance != null ? !xmlDrawablesVariance.equals(that.xmlDrawablesVariance) : that.xmlDrawablesVariance != null)
            return false;
        if (xmlDrawablesDeviation != null ? !xmlDrawablesDeviation.equals(that.xmlDrawablesDeviation) : that.xmlDrawablesDeviation != null)
            return false;
        if (apksWithXmlDrawablesObtainedSuccessfullyNonZero != null ? !apksWithXmlDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithXmlDrawablesObtainedSuccessfullyNonZero) : that.apksWithXmlDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (xmlDrawablesArithmeticMeanNonZero != null ? !xmlDrawablesArithmeticMeanNonZero.equals(that.xmlDrawablesArithmeticMeanNonZero) : that.xmlDrawablesArithmeticMeanNonZero != null)
            return false;
        if (xmlDrawablesModusNonZero != null ? !xmlDrawablesModusNonZero.equals(that.xmlDrawablesModusNonZero) : that.xmlDrawablesModusNonZero != null)
            return false;
        if (xmlDrawablesMedianNonZero != null ? !xmlDrawablesMedianNonZero.equals(that.xmlDrawablesMedianNonZero) : that.xmlDrawablesMedianNonZero != null)
            return false;
        if (xmlDrawablesMaxNonZero != null ? !xmlDrawablesMaxNonZero.equals(that.xmlDrawablesMaxNonZero) : that.xmlDrawablesMaxNonZero != null)
            return false;
        if (xmlDrawablesMinNonZero != null ? !xmlDrawablesMinNonZero.equals(that.xmlDrawablesMinNonZero) : that.xmlDrawablesMinNonZero != null)
            return false;
        if (xmlDrawablesVarianceNonZero != null ? !xmlDrawablesVarianceNonZero.equals(that.xmlDrawablesVarianceNonZero) : that.xmlDrawablesVarianceNonZero != null)
            return false;
        if (xmlDrawablesDeviationNonZero != null ? !xmlDrawablesDeviationNonZero.equals(that.xmlDrawablesDeviationNonZero) : that.xmlDrawablesDeviationNonZero != null)
            return false;
        if (apksWithDifferentDrawablesObtainedSuccessfully != null ? !apksWithDifferentDrawablesObtainedSuccessfully.equals(that.apksWithDifferentDrawablesObtainedSuccessfully) : that.apksWithDifferentDrawablesObtainedSuccessfully != null)
            return false;
        if (differentDrawablesArithmeticMean != null ? !differentDrawablesArithmeticMean.equals(that.differentDrawablesArithmeticMean) : that.differentDrawablesArithmeticMean != null)
            return false;
        if (differentDrawablesModus != null ? !differentDrawablesModus.equals(that.differentDrawablesModus) : that.differentDrawablesModus != null)
            return false;
        if (differentDrawablesMedian != null ? !differentDrawablesMedian.equals(that.differentDrawablesMedian) : that.differentDrawablesMedian != null)
            return false;
        if (differentDrawablesMax != null ? !differentDrawablesMax.equals(that.differentDrawablesMax) : that.differentDrawablesMax != null)
            return false;
        if (differentDrawablesMin != null ? !differentDrawablesMin.equals(that.differentDrawablesMin) : that.differentDrawablesMin != null)
            return false;
        if (differentDrawablesVariance != null ? !differentDrawablesVariance.equals(that.differentDrawablesVariance) : that.differentDrawablesVariance != null)
            return false;
        if (differentDrawablesDeviation != null ? !differentDrawablesDeviation.equals(that.differentDrawablesDeviation) : that.differentDrawablesDeviation != null)
            return false;
        if (apksWithDifferentDrawablesObtainedSuccessfullyNonZero != null ? !apksWithDifferentDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithDifferentDrawablesObtainedSuccessfullyNonZero) : that.apksWithDifferentDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (differentDrawablesArithmeticMeanNonZero != null ? !differentDrawablesArithmeticMeanNonZero.equals(that.differentDrawablesArithmeticMeanNonZero) : that.differentDrawablesArithmeticMeanNonZero != null)
            return false;
        if (differentDrawablesModusNonZero != null ? !differentDrawablesModusNonZero.equals(that.differentDrawablesModusNonZero) : that.differentDrawablesModusNonZero != null)
            return false;
        if (differentDrawablesMedianNonZero != null ? !differentDrawablesMedianNonZero.equals(that.differentDrawablesMedianNonZero) : that.differentDrawablesMedianNonZero != null)
            return false;
        if (differentDrawablesMaxNonZero != null ? !differentDrawablesMaxNonZero.equals(that.differentDrawablesMaxNonZero) : that.differentDrawablesMaxNonZero != null)
            return false;
        if (differentDrawablesMinNonZero != null ? !differentDrawablesMinNonZero.equals(that.differentDrawablesMinNonZero) : that.differentDrawablesMinNonZero != null)
            return false;
        if (differentDrawablesVarianceNonZero != null ? !differentDrawablesVarianceNonZero.equals(that.differentDrawablesVarianceNonZero) : that.differentDrawablesVarianceNonZero != null)
            return false;
        if (differentDrawablesDeviationNonZero != null ? !differentDrawablesDeviationNonZero.equals(that.differentDrawablesDeviationNonZero) : that.differentDrawablesDeviationNonZero != null)
            return false;
        if (apksWithLdpiDrawablesObtainedSuccessfully != null ? !apksWithLdpiDrawablesObtainedSuccessfully.equals(that.apksWithLdpiDrawablesObtainedSuccessfully) : that.apksWithLdpiDrawablesObtainedSuccessfully != null)
            return false;
        if (ldpiDrawablesArithmeticMean != null ? !ldpiDrawablesArithmeticMean.equals(that.ldpiDrawablesArithmeticMean) : that.ldpiDrawablesArithmeticMean != null)
            return false;
        if (ldpiDrawablesModus != null ? !ldpiDrawablesModus.equals(that.ldpiDrawablesModus) : that.ldpiDrawablesModus != null)
            return false;
        if (ldpiDrawablesMedian != null ? !ldpiDrawablesMedian.equals(that.ldpiDrawablesMedian) : that.ldpiDrawablesMedian != null)
            return false;
        if (ldpiDrawablesMax != null ? !ldpiDrawablesMax.equals(that.ldpiDrawablesMax) : that.ldpiDrawablesMax != null)
            return false;
        if (ldpiDrawablesMin != null ? !ldpiDrawablesMin.equals(that.ldpiDrawablesMin) : that.ldpiDrawablesMin != null)
            return false;
        if (ldpiDrawablesVariance != null ? !ldpiDrawablesVariance.equals(that.ldpiDrawablesVariance) : that.ldpiDrawablesVariance != null)
            return false;
        if (ldpiDrawablesDeviation != null ? !ldpiDrawablesDeviation.equals(that.ldpiDrawablesDeviation) : that.ldpiDrawablesDeviation != null)
            return false;
        if (apksWithLdpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithLdpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithLdpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithLdpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (ldpiDrawablesArithmeticMeanNonZero != null ? !ldpiDrawablesArithmeticMeanNonZero.equals(that.ldpiDrawablesArithmeticMeanNonZero) : that.ldpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (ldpiDrawablesModusNonZero != null ? !ldpiDrawablesModusNonZero.equals(that.ldpiDrawablesModusNonZero) : that.ldpiDrawablesModusNonZero != null)
            return false;
        if (ldpiDrawablesMedianNonZero != null ? !ldpiDrawablesMedianNonZero.equals(that.ldpiDrawablesMedianNonZero) : that.ldpiDrawablesMedianNonZero != null)
            return false;
        if (ldpiDrawablesMaxNonZero != null ? !ldpiDrawablesMaxNonZero.equals(that.ldpiDrawablesMaxNonZero) : that.ldpiDrawablesMaxNonZero != null)
            return false;
        if (ldpiDrawablesMinNonZero != null ? !ldpiDrawablesMinNonZero.equals(that.ldpiDrawablesMinNonZero) : that.ldpiDrawablesMinNonZero != null)
            return false;
        if (ldpiDrawablesVarianceNonZero != null ? !ldpiDrawablesVarianceNonZero.equals(that.ldpiDrawablesVarianceNonZero) : that.ldpiDrawablesVarianceNonZero != null)
            return false;
        if (ldpiDrawablesDeviationNonZero != null ? !ldpiDrawablesDeviationNonZero.equals(that.ldpiDrawablesDeviationNonZero) : that.ldpiDrawablesDeviationNonZero != null)
            return false;
        if (apksWithMdpiDrawablesObtainedSuccessfully != null ? !apksWithMdpiDrawablesObtainedSuccessfully.equals(that.apksWithMdpiDrawablesObtainedSuccessfully) : that.apksWithMdpiDrawablesObtainedSuccessfully != null)
            return false;
        if (mdpiDrawablesArithmeticMean != null ? !mdpiDrawablesArithmeticMean.equals(that.mdpiDrawablesArithmeticMean) : that.mdpiDrawablesArithmeticMean != null)
            return false;
        if (mdpiDrawablesModus != null ? !mdpiDrawablesModus.equals(that.mdpiDrawablesModus) : that.mdpiDrawablesModus != null)
            return false;
        if (mdpiDrawablesMedian != null ? !mdpiDrawablesMedian.equals(that.mdpiDrawablesMedian) : that.mdpiDrawablesMedian != null)
            return false;
        if (mdpiDrawablesMax != null ? !mdpiDrawablesMax.equals(that.mdpiDrawablesMax) : that.mdpiDrawablesMax != null)
            return false;
        if (mdpiDrawablesMin != null ? !mdpiDrawablesMin.equals(that.mdpiDrawablesMin) : that.mdpiDrawablesMin != null)
            return false;
        if (mdpiDrawablesVariance != null ? !mdpiDrawablesVariance.equals(that.mdpiDrawablesVariance) : that.mdpiDrawablesVariance != null)
            return false;
        if (mdpiDrawablesDeviation != null ? !mdpiDrawablesDeviation.equals(that.mdpiDrawablesDeviation) : that.mdpiDrawablesDeviation != null)
            return false;
        if (apksWithMdpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithMdpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithMdpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithMdpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (mdpiDrawablesArithmeticMeanNonZero != null ? !mdpiDrawablesArithmeticMeanNonZero.equals(that.mdpiDrawablesArithmeticMeanNonZero) : that.mdpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (mdpiDrawablesModusNonZero != null ? !mdpiDrawablesModusNonZero.equals(that.mdpiDrawablesModusNonZero) : that.mdpiDrawablesModusNonZero != null)
            return false;
        if (mdpiDrawablesMedianNonZero != null ? !mdpiDrawablesMedianNonZero.equals(that.mdpiDrawablesMedianNonZero) : that.mdpiDrawablesMedianNonZero != null)
            return false;
        if (mdpiDrawablesMaxNonZero != null ? !mdpiDrawablesMaxNonZero.equals(that.mdpiDrawablesMaxNonZero) : that.mdpiDrawablesMaxNonZero != null)
            return false;
        if (mdpiDrawablesMinNonZero != null ? !mdpiDrawablesMinNonZero.equals(that.mdpiDrawablesMinNonZero) : that.mdpiDrawablesMinNonZero != null)
            return false;
        if (mdpiDrawablesVarianceNonZero != null ? !mdpiDrawablesVarianceNonZero.equals(that.mdpiDrawablesVarianceNonZero) : that.mdpiDrawablesVarianceNonZero != null)
            return false;
        if (mdpiDrawablesDeviationNonZero != null ? !mdpiDrawablesDeviationNonZero.equals(that.mdpiDrawablesDeviationNonZero) : that.mdpiDrawablesDeviationNonZero != null)
            return false;
        if (apksWithHdpiDrawablesObtainedSuccessfully != null ? !apksWithHdpiDrawablesObtainedSuccessfully.equals(that.apksWithHdpiDrawablesObtainedSuccessfully) : that.apksWithHdpiDrawablesObtainedSuccessfully != null)
            return false;
        if (hdpiDrawablesArithmeticMean != null ? !hdpiDrawablesArithmeticMean.equals(that.hdpiDrawablesArithmeticMean) : that.hdpiDrawablesArithmeticMean != null)
            return false;
        if (hdpiDrawablesModus != null ? !hdpiDrawablesModus.equals(that.hdpiDrawablesModus) : that.hdpiDrawablesModus != null)
            return false;
        if (hdpiDrawablesMedian != null ? !hdpiDrawablesMedian.equals(that.hdpiDrawablesMedian) : that.hdpiDrawablesMedian != null)
            return false;
        if (hdpiDrawablesMax != null ? !hdpiDrawablesMax.equals(that.hdpiDrawablesMax) : that.hdpiDrawablesMax != null)
            return false;
        if (hdpiDrawablesMin != null ? !hdpiDrawablesMin.equals(that.hdpiDrawablesMin) : that.hdpiDrawablesMin != null)
            return false;
        if (hdpiDrawablesVariance != null ? !hdpiDrawablesVariance.equals(that.hdpiDrawablesVariance) : that.hdpiDrawablesVariance != null)
            return false;
        if (hdpiDrawablesDeviation != null ? !hdpiDrawablesDeviation.equals(that.hdpiDrawablesDeviation) : that.hdpiDrawablesDeviation != null)
            return false;
        if (apksWithHdpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithHdpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithHdpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithHdpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (hdpiDrawablesArithmeticMeanNonZero != null ? !hdpiDrawablesArithmeticMeanNonZero.equals(that.hdpiDrawablesArithmeticMeanNonZero) : that.hdpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (hdpiDrawablesModusNonZero != null ? !hdpiDrawablesModusNonZero.equals(that.hdpiDrawablesModusNonZero) : that.hdpiDrawablesModusNonZero != null)
            return false;
        if (hdpiDrawablesMedianNonZero != null ? !hdpiDrawablesMedianNonZero.equals(that.hdpiDrawablesMedianNonZero) : that.hdpiDrawablesMedianNonZero != null)
            return false;
        if (hdpiDrawablesMaxNonZero != null ? !hdpiDrawablesMaxNonZero.equals(that.hdpiDrawablesMaxNonZero) : that.hdpiDrawablesMaxNonZero != null)
            return false;
        if (hdpiDrawablesMinNonZero != null ? !hdpiDrawablesMinNonZero.equals(that.hdpiDrawablesMinNonZero) : that.hdpiDrawablesMinNonZero != null)
            return false;
        if (hdpiDrawablesVarianceNonZero != null ? !hdpiDrawablesVarianceNonZero.equals(that.hdpiDrawablesVarianceNonZero) : that.hdpiDrawablesVarianceNonZero != null)
            return false;
        if (hdpiDrawablesDeviationNonZero != null ? !hdpiDrawablesDeviationNonZero.equals(that.hdpiDrawablesDeviationNonZero) : that.hdpiDrawablesDeviationNonZero != null)
            return false;
        if (apksWithXhdpiDrawablesObtainedSuccessfully != null ? !apksWithXhdpiDrawablesObtainedSuccessfully.equals(that.apksWithXhdpiDrawablesObtainedSuccessfully) : that.apksWithXhdpiDrawablesObtainedSuccessfully != null)
            return false;
        if (xhdpiDrawablesArithmeticMean != null ? !xhdpiDrawablesArithmeticMean.equals(that.xhdpiDrawablesArithmeticMean) : that.xhdpiDrawablesArithmeticMean != null)
            return false;
        if (xhdpiDrawablesModus != null ? !xhdpiDrawablesModus.equals(that.xhdpiDrawablesModus) : that.xhdpiDrawablesModus != null)
            return false;
        if (xhdpiDrawablesMedian != null ? !xhdpiDrawablesMedian.equals(that.xhdpiDrawablesMedian) : that.xhdpiDrawablesMedian != null)
            return false;
        if (xhdpiDrawablesMax != null ? !xhdpiDrawablesMax.equals(that.xhdpiDrawablesMax) : that.xhdpiDrawablesMax != null)
            return false;
        if (xhdpiDrawablesMin != null ? !xhdpiDrawablesMin.equals(that.xhdpiDrawablesMin) : that.xhdpiDrawablesMin != null)
            return false;
        if (xhdpiDrawablesVariance != null ? !xhdpiDrawablesVariance.equals(that.xhdpiDrawablesVariance) : that.xhdpiDrawablesVariance != null)
            return false;
        if (xhdpiDrawablesDeviation != null ? !xhdpiDrawablesDeviation.equals(that.xhdpiDrawablesDeviation) : that.xhdpiDrawablesDeviation != null)
            return false;
        if (apksWithXhdpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithXhdpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithXhdpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithXhdpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (xhdpiDrawablesArithmeticMeanNonZero != null ? !xhdpiDrawablesArithmeticMeanNonZero.equals(that.xhdpiDrawablesArithmeticMeanNonZero) : that.xhdpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (xhdpiDrawablesModusNonZero != null ? !xhdpiDrawablesModusNonZero.equals(that.xhdpiDrawablesModusNonZero) : that.xhdpiDrawablesModusNonZero != null)
            return false;
        if (xhdpiDrawablesMedianNonZero != null ? !xhdpiDrawablesMedianNonZero.equals(that.xhdpiDrawablesMedianNonZero) : that.xhdpiDrawablesMedianNonZero != null)
            return false;
        if (xhdpiDrawablesMaxNonZero != null ? !xhdpiDrawablesMaxNonZero.equals(that.xhdpiDrawablesMaxNonZero) : that.xhdpiDrawablesMaxNonZero != null)
            return false;
        if (xhdpiDrawablesMinNonZero != null ? !xhdpiDrawablesMinNonZero.equals(that.xhdpiDrawablesMinNonZero) : that.xhdpiDrawablesMinNonZero != null)
            return false;
        if (xhdpiDrawablesVarianceNonZero != null ? !xhdpiDrawablesVarianceNonZero.equals(that.xhdpiDrawablesVarianceNonZero) : that.xhdpiDrawablesVarianceNonZero != null)
            return false;
        if (xhdpiDrawablesDeviationNonZero != null ? !xhdpiDrawablesDeviationNonZero.equals(that.xhdpiDrawablesDeviationNonZero) : that.xhdpiDrawablesDeviationNonZero != null)
            return false;
        if (apksWithXxhdpiDrawablesObtainedSuccessfully != null ? !apksWithXxhdpiDrawablesObtainedSuccessfully.equals(that.apksWithXxhdpiDrawablesObtainedSuccessfully) : that.apksWithXxhdpiDrawablesObtainedSuccessfully != null)
            return false;
        if (xxhdpiDrawablesArithmeticMean != null ? !xxhdpiDrawablesArithmeticMean.equals(that.xxhdpiDrawablesArithmeticMean) : that.xxhdpiDrawablesArithmeticMean != null)
            return false;
        if (xxhdpiDrawablesModus != null ? !xxhdpiDrawablesModus.equals(that.xxhdpiDrawablesModus) : that.xxhdpiDrawablesModus != null)
            return false;
        if (xxhdpiDrawablesMedian != null ? !xxhdpiDrawablesMedian.equals(that.xxhdpiDrawablesMedian) : that.xxhdpiDrawablesMedian != null)
            return false;
        if (xxhdpiDrawablesMax != null ? !xxhdpiDrawablesMax.equals(that.xxhdpiDrawablesMax) : that.xxhdpiDrawablesMax != null)
            return false;
        if (xxhdpiDrawablesMin != null ? !xxhdpiDrawablesMin.equals(that.xxhdpiDrawablesMin) : that.xxhdpiDrawablesMin != null)
            return false;
        if (xxhdpiDrawablesVariance != null ? !xxhdpiDrawablesVariance.equals(that.xxhdpiDrawablesVariance) : that.xxhdpiDrawablesVariance != null)
            return false;
        if (xxhdpiDrawablesDeviation != null ? !xxhdpiDrawablesDeviation.equals(that.xxhdpiDrawablesDeviation) : that.xxhdpiDrawablesDeviation != null)
            return false;
        if (apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (xxhdpiDrawablesArithmeticMeanNonZero != null ? !xxhdpiDrawablesArithmeticMeanNonZero.equals(that.xxhdpiDrawablesArithmeticMeanNonZero) : that.xxhdpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (xxhdpiDrawablesModusNonZero != null ? !xxhdpiDrawablesModusNonZero.equals(that.xxhdpiDrawablesModusNonZero) : that.xxhdpiDrawablesModusNonZero != null)
            return false;
        if (xxhdpiDrawablesMedianNonZero != null ? !xxhdpiDrawablesMedianNonZero.equals(that.xxhdpiDrawablesMedianNonZero) : that.xxhdpiDrawablesMedianNonZero != null)
            return false;
        if (xxhdpiDrawablesMaxNonZero != null ? !xxhdpiDrawablesMaxNonZero.equals(that.xxhdpiDrawablesMaxNonZero) : that.xxhdpiDrawablesMaxNonZero != null)
            return false;
        if (xxhdpiDrawablesMinNonZero != null ? !xxhdpiDrawablesMinNonZero.equals(that.xxhdpiDrawablesMinNonZero) : that.xxhdpiDrawablesMinNonZero != null)
            return false;
        if (xxhdpiDrawablesVarianceNonZero != null ? !xxhdpiDrawablesVarianceNonZero.equals(that.xxhdpiDrawablesVarianceNonZero) : that.xxhdpiDrawablesVarianceNonZero != null)
            return false;
        if (xxhdpiDrawablesDeviationNonZero != null ? !xxhdpiDrawablesDeviationNonZero.equals(that.xxhdpiDrawablesDeviationNonZero) : that.xxhdpiDrawablesDeviationNonZero != null)
            return false;
        if (apksWithXxxhdpiDrawablesObtainedSuccessfully != null ? !apksWithXxxhdpiDrawablesObtainedSuccessfully.equals(that.apksWithXxxhdpiDrawablesObtainedSuccessfully) : that.apksWithXxxhdpiDrawablesObtainedSuccessfully != null)
            return false;
        if (xxxhdpiDrawablesArithmeticMean != null ? !xxxhdpiDrawablesArithmeticMean.equals(that.xxxhdpiDrawablesArithmeticMean) : that.xxxhdpiDrawablesArithmeticMean != null)
            return false;
        if (xxxhdpiDrawablesModus != null ? !xxxhdpiDrawablesModus.equals(that.xxxhdpiDrawablesModus) : that.xxxhdpiDrawablesModus != null)
            return false;
        if (xxxhdpiDrawablesMedian != null ? !xxxhdpiDrawablesMedian.equals(that.xxxhdpiDrawablesMedian) : that.xxxhdpiDrawablesMedian != null)
            return false;
        if (xxxhdpiDrawablesMax != null ? !xxxhdpiDrawablesMax.equals(that.xxxhdpiDrawablesMax) : that.xxxhdpiDrawablesMax != null)
            return false;
        if (xxxhdpiDrawablesMin != null ? !xxxhdpiDrawablesMin.equals(that.xxxhdpiDrawablesMin) : that.xxxhdpiDrawablesMin != null)
            return false;
        if (xxxhdpiDrawablesVariance != null ? !xxxhdpiDrawablesVariance.equals(that.xxxhdpiDrawablesVariance) : that.xxxhdpiDrawablesVariance != null)
            return false;
        if (xxxhdpiDrawablesDeviation != null ? !xxxhdpiDrawablesDeviation.equals(that.xxxhdpiDrawablesDeviation) : that.xxxhdpiDrawablesDeviation != null)
            return false;
        if (apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (xxxhdpiDrawablesArithmeticMeanNonZero != null ? !xxxhdpiDrawablesArithmeticMeanNonZero.equals(that.xxxhdpiDrawablesArithmeticMeanNonZero) : that.xxxhdpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (xxxhdpiDrawablesModusNonZero != null ? !xxxhdpiDrawablesModusNonZero.equals(that.xxxhdpiDrawablesModusNonZero) : that.xxxhdpiDrawablesModusNonZero != null)
            return false;
        if (xxxhdpiDrawablesMedianNonZero != null ? !xxxhdpiDrawablesMedianNonZero.equals(that.xxxhdpiDrawablesMedianNonZero) : that.xxxhdpiDrawablesMedianNonZero != null)
            return false;
        if (xxxhdpiDrawablesMaxNonZero != null ? !xxxhdpiDrawablesMaxNonZero.equals(that.xxxhdpiDrawablesMaxNonZero) : that.xxxhdpiDrawablesMaxNonZero != null)
            return false;
        if (xxxhdpiDrawablesMinNonZero != null ? !xxxhdpiDrawablesMinNonZero.equals(that.xxxhdpiDrawablesMinNonZero) : that.xxxhdpiDrawablesMinNonZero != null)
            return false;
        if (xxxhdpiDrawablesVarianceNonZero != null ? !xxxhdpiDrawablesVarianceNonZero.equals(that.xxxhdpiDrawablesVarianceNonZero) : that.xxxhdpiDrawablesVarianceNonZero != null)
            return false;
        if (xxxhdpiDrawablesDeviationNonZero != null ? !xxxhdpiDrawablesDeviationNonZero.equals(that.xxxhdpiDrawablesDeviationNonZero) : that.xxxhdpiDrawablesDeviationNonZero != null)
            return false;
        if (apksWithUnspecifiedDpiDrawablesObtainedSuccessfully != null ? !apksWithUnspecifiedDpiDrawablesObtainedSuccessfully.equals(that.apksWithUnspecifiedDpiDrawablesObtainedSuccessfully) : that.apksWithUnspecifiedDpiDrawablesObtainedSuccessfully != null)
            return false;
        if (unspecifiedDpiDrawablesArithmeticMean != null ? !unspecifiedDpiDrawablesArithmeticMean.equals(that.unspecifiedDpiDrawablesArithmeticMean) : that.unspecifiedDpiDrawablesArithmeticMean != null)
            return false;
        if (unspecifiedDpiDrawablesModus != null ? !unspecifiedDpiDrawablesModus.equals(that.unspecifiedDpiDrawablesModus) : that.unspecifiedDpiDrawablesModus != null)
            return false;
        if (unspecifiedDpiDrawablesMedian != null ? !unspecifiedDpiDrawablesMedian.equals(that.unspecifiedDpiDrawablesMedian) : that.unspecifiedDpiDrawablesMedian != null)
            return false;
        if (unspecifiedDpiDrawablesMax != null ? !unspecifiedDpiDrawablesMax.equals(that.unspecifiedDpiDrawablesMax) : that.unspecifiedDpiDrawablesMax != null)
            return false;
        if (unspecifiedDpiDrawablesMin != null ? !unspecifiedDpiDrawablesMin.equals(that.unspecifiedDpiDrawablesMin) : that.unspecifiedDpiDrawablesMin != null)
            return false;
        if (unspecifiedDpiDrawablesVariance != null ? !unspecifiedDpiDrawablesVariance.equals(that.unspecifiedDpiDrawablesVariance) : that.unspecifiedDpiDrawablesVariance != null)
            return false;
        if (unspecifiedDpiDrawablesDeviation != null ? !unspecifiedDpiDrawablesDeviation.equals(that.unspecifiedDpiDrawablesDeviation) : that.unspecifiedDpiDrawablesDeviation != null)
            return false;
        if (apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero != null ? !apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero.equals(that.apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero) : that.apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero != null)
            return false;
        if (unspecifiedDpiDrawablesArithmeticMeanNonZero != null ? !unspecifiedDpiDrawablesArithmeticMeanNonZero.equals(that.unspecifiedDpiDrawablesArithmeticMeanNonZero) : that.unspecifiedDpiDrawablesArithmeticMeanNonZero != null)
            return false;
        if (unspecifiedDpiDrawablesModusNonZero != null ? !unspecifiedDpiDrawablesModusNonZero.equals(that.unspecifiedDpiDrawablesModusNonZero) : that.unspecifiedDpiDrawablesModusNonZero != null)
            return false;
        if (unspecifiedDpiDrawablesMedianNonZero != null ? !unspecifiedDpiDrawablesMedianNonZero.equals(that.unspecifiedDpiDrawablesMedianNonZero) : that.unspecifiedDpiDrawablesMedianNonZero != null)
            return false;
        if (unspecifiedDpiDrawablesMaxNonZero != null ? !unspecifiedDpiDrawablesMaxNonZero.equals(that.unspecifiedDpiDrawablesMaxNonZero) : that.unspecifiedDpiDrawablesMaxNonZero != null)
            return false;
        if (unspecifiedDpiDrawablesMinNonZero != null ? !unspecifiedDpiDrawablesMinNonZero.equals(that.unspecifiedDpiDrawablesMinNonZero) : that.unspecifiedDpiDrawablesMinNonZero != null)
            return false;
        if (unspecifiedDpiDrawablesVarianceNonZero != null ? !unspecifiedDpiDrawablesVarianceNonZero.equals(that.unspecifiedDpiDrawablesVarianceNonZero) : that.unspecifiedDpiDrawablesVarianceNonZero != null)
            return false;
        return !(unspecifiedDpiDrawablesDeviationNonZero != null ? !unspecifiedDpiDrawablesDeviationNonZero.equals(that.unspecifiedDpiDrawablesDeviationNonZero) : that.unspecifiedDpiDrawablesDeviationNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (apksWithPngDrawablesObtainedSuccessfully != null ? apksWithPngDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (pngDrawablesArithmeticMean != null ? pngDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (pngDrawablesModus != null ? pngDrawablesModus.hashCode() : 0);
        result = 31 * result + (pngDrawablesMedian != null ? pngDrawablesMedian.hashCode() : 0);
        result = 31 * result + (pngDrawablesMax != null ? pngDrawablesMax.hashCode() : 0);
        result = 31 * result + (pngDrawablesMin != null ? pngDrawablesMin.hashCode() : 0);
        result = 31 * result + (pngDrawablesVariance != null ? pngDrawablesVariance.hashCode() : 0);
        result = 31 * result + (pngDrawablesDeviation != null ? pngDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithPngDrawablesObtainedSuccessfullyNonZero != null ? apksWithPngDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesArithmeticMeanNonZero != null ? pngDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesModusNonZero != null ? pngDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesMedianNonZero != null ? pngDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesMaxNonZero != null ? pngDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesMinNonZero != null ? pngDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesVarianceNonZero != null ? pngDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (pngDrawablesDeviationNonZero != null ? pngDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithJpgDrawablesObtainedSuccessfully != null ? apksWithJpgDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (jpgDrawablesArithmeticMean != null ? jpgDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (jpgDrawablesModus != null ? jpgDrawablesModus.hashCode() : 0);
        result = 31 * result + (jpgDrawablesMedian != null ? jpgDrawablesMedian.hashCode() : 0);
        result = 31 * result + (jpgDrawablesMax != null ? jpgDrawablesMax.hashCode() : 0);
        result = 31 * result + (jpgDrawablesMin != null ? jpgDrawablesMin.hashCode() : 0);
        result = 31 * result + (jpgDrawablesVariance != null ? jpgDrawablesVariance.hashCode() : 0);
        result = 31 * result + (jpgDrawablesDeviation != null ? jpgDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithJpgDrawablesObtainedSuccessfullyNonZero != null ? apksWithJpgDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesArithmeticMeanNonZero != null ? jpgDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesModusNonZero != null ? jpgDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesMedianNonZero != null ? jpgDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesMaxNonZero != null ? jpgDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesMinNonZero != null ? jpgDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesVarianceNonZero != null ? jpgDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (jpgDrawablesDeviationNonZero != null ? jpgDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithGifDrawablesObtainedSuccessfully != null ? apksWithGifDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (gifDrawablesArithmeticMean != null ? gifDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (gifDrawablesModus != null ? gifDrawablesModus.hashCode() : 0);
        result = 31 * result + (gifDrawablesMedian != null ? gifDrawablesMedian.hashCode() : 0);
        result = 31 * result + (gifDrawablesMax != null ? gifDrawablesMax.hashCode() : 0);
        result = 31 * result + (gifDrawablesMin != null ? gifDrawablesMin.hashCode() : 0);
        result = 31 * result + (gifDrawablesVariance != null ? gifDrawablesVariance.hashCode() : 0);
        result = 31 * result + (gifDrawablesDeviation != null ? gifDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithGifDrawablesObtainedSuccessfullyNonZero != null ? apksWithGifDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesArithmeticMeanNonZero != null ? gifDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesModusNonZero != null ? gifDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesMedianNonZero != null ? gifDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesMaxNonZero != null ? gifDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesMinNonZero != null ? gifDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesVarianceNonZero != null ? gifDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (gifDrawablesDeviationNonZero != null ? gifDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithXmlDrawablesObtainedSuccessfully != null ? apksWithXmlDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (xmlDrawablesArithmeticMean != null ? xmlDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (xmlDrawablesModus != null ? xmlDrawablesModus.hashCode() : 0);
        result = 31 * result + (xmlDrawablesMedian != null ? xmlDrawablesMedian.hashCode() : 0);
        result = 31 * result + (xmlDrawablesMax != null ? xmlDrawablesMax.hashCode() : 0);
        result = 31 * result + (xmlDrawablesMin != null ? xmlDrawablesMin.hashCode() : 0);
        result = 31 * result + (xmlDrawablesVariance != null ? xmlDrawablesVariance.hashCode() : 0);
        result = 31 * result + (xmlDrawablesDeviation != null ? xmlDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithXmlDrawablesObtainedSuccessfullyNonZero != null ? apksWithXmlDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesArithmeticMeanNonZero != null ? xmlDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesModusNonZero != null ? xmlDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesMedianNonZero != null ? xmlDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesMaxNonZero != null ? xmlDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesMinNonZero != null ? xmlDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesVarianceNonZero != null ? xmlDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (xmlDrawablesDeviationNonZero != null ? xmlDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithDifferentDrawablesObtainedSuccessfully != null ? apksWithDifferentDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (differentDrawablesArithmeticMean != null ? differentDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (differentDrawablesModus != null ? differentDrawablesModus.hashCode() : 0);
        result = 31 * result + (differentDrawablesMedian != null ? differentDrawablesMedian.hashCode() : 0);
        result = 31 * result + (differentDrawablesMax != null ? differentDrawablesMax.hashCode() : 0);
        result = 31 * result + (differentDrawablesMin != null ? differentDrawablesMin.hashCode() : 0);
        result = 31 * result + (differentDrawablesVariance != null ? differentDrawablesVariance.hashCode() : 0);
        result = 31 * result + (differentDrawablesDeviation != null ? differentDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithDifferentDrawablesObtainedSuccessfullyNonZero != null ? apksWithDifferentDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesArithmeticMeanNonZero != null ? differentDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesModusNonZero != null ? differentDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesMedianNonZero != null ? differentDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesMaxNonZero != null ? differentDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesMinNonZero != null ? differentDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesVarianceNonZero != null ? differentDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (differentDrawablesDeviationNonZero != null ? differentDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithLdpiDrawablesObtainedSuccessfully != null ? apksWithLdpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesArithmeticMean != null ? ldpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesModus != null ? ldpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesMedian != null ? ldpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesMax != null ? ldpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesMin != null ? ldpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesVariance != null ? ldpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesDeviation != null ? ldpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithLdpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithLdpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesArithmeticMeanNonZero != null ? ldpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesModusNonZero != null ? ldpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesMedianNonZero != null ? ldpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesMaxNonZero != null ? ldpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesMinNonZero != null ? ldpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesVarianceNonZero != null ? ldpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (ldpiDrawablesDeviationNonZero != null ? ldpiDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithMdpiDrawablesObtainedSuccessfully != null ? apksWithMdpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesArithmeticMean != null ? mdpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesModus != null ? mdpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesMedian != null ? mdpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesMax != null ? mdpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesMin != null ? mdpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesVariance != null ? mdpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesDeviation != null ? mdpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithMdpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithMdpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesArithmeticMeanNonZero != null ? mdpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesModusNonZero != null ? mdpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesMedianNonZero != null ? mdpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesMaxNonZero != null ? mdpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesMinNonZero != null ? mdpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesVarianceNonZero != null ? mdpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (mdpiDrawablesDeviationNonZero != null ? mdpiDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithHdpiDrawablesObtainedSuccessfully != null ? apksWithHdpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesArithmeticMean != null ? hdpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesModus != null ? hdpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesMedian != null ? hdpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesMax != null ? hdpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesMin != null ? hdpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesVariance != null ? hdpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesDeviation != null ? hdpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithHdpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithHdpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesArithmeticMeanNonZero != null ? hdpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesModusNonZero != null ? hdpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesMedianNonZero != null ? hdpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesMaxNonZero != null ? hdpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesMinNonZero != null ? hdpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesVarianceNonZero != null ? hdpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (hdpiDrawablesDeviationNonZero != null ? hdpiDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithXhdpiDrawablesObtainedSuccessfully != null ? apksWithXhdpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesArithmeticMean != null ? xhdpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesModus != null ? xhdpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesMedian != null ? xhdpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesMax != null ? xhdpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesMin != null ? xhdpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesVariance != null ? xhdpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesDeviation != null ? xhdpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithXhdpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithXhdpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesArithmeticMeanNonZero != null ? xhdpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesModusNonZero != null ? xhdpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesMedianNonZero != null ? xhdpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesMaxNonZero != null ? xhdpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesMinNonZero != null ? xhdpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesVarianceNonZero != null ? xhdpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (xhdpiDrawablesDeviationNonZero != null ? xhdpiDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithXxhdpiDrawablesObtainedSuccessfully != null ? apksWithXxhdpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesArithmeticMean != null ? xxhdpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesModus != null ? xxhdpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesMedian != null ? xxhdpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesMax != null ? xxhdpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesMin != null ? xxhdpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesVariance != null ? xxhdpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesDeviation != null ? xxhdpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesArithmeticMeanNonZero != null ? xxhdpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesModusNonZero != null ? xxhdpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesMedianNonZero != null ? xxhdpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesMaxNonZero != null ? xxhdpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesMinNonZero != null ? xxhdpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesVarianceNonZero != null ? xxhdpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (xxhdpiDrawablesDeviationNonZero != null ? xxhdpiDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithXxxhdpiDrawablesObtainedSuccessfully != null ? apksWithXxxhdpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesArithmeticMean != null ? xxxhdpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesModus != null ? xxxhdpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesMedian != null ? xxxhdpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesMax != null ? xxxhdpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesMin != null ? xxxhdpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesVariance != null ? xxxhdpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesDeviation != null ? xxxhdpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesArithmeticMeanNonZero != null ? xxxhdpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesModusNonZero != null ? xxxhdpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesMedianNonZero != null ? xxxhdpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesMaxNonZero != null ? xxxhdpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesMinNonZero != null ? xxxhdpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesVarianceNonZero != null ? xxxhdpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (xxxhdpiDrawablesDeviationNonZero != null ? xxxhdpiDrawablesDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithUnspecifiedDpiDrawablesObtainedSuccessfully != null ? apksWithUnspecifiedDpiDrawablesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesArithmeticMean != null ? unspecifiedDpiDrawablesArithmeticMean.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesModus != null ? unspecifiedDpiDrawablesModus.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesMedian != null ? unspecifiedDpiDrawablesMedian.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesMax != null ? unspecifiedDpiDrawablesMax.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesMin != null ? unspecifiedDpiDrawablesMin.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesVariance != null ? unspecifiedDpiDrawablesVariance.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesDeviation != null ? unspecifiedDpiDrawablesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero != null ? apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesArithmeticMeanNonZero != null ? unspecifiedDpiDrawablesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesModusNonZero != null ? unspecifiedDpiDrawablesModusNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesMedianNonZero != null ? unspecifiedDpiDrawablesMedianNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesMaxNonZero != null ? unspecifiedDpiDrawablesMaxNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesMinNonZero != null ? unspecifiedDpiDrawablesMinNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesVarianceNonZero != null ? unspecifiedDpiDrawablesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (unspecifiedDpiDrawablesDeviationNonZero != null ? unspecifiedDpiDrawablesDeviationNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DrawableStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", apksWithPngDrawablesObtainedSuccessfully=" + apksWithPngDrawablesObtainedSuccessfully +
                ", pngDrawablesArithmeticMean=" + pngDrawablesArithmeticMean +
                ", pngDrawablesModus=" + pngDrawablesModus +
                ", pngDrawablesMedian=" + pngDrawablesMedian +
                ", pngDrawablesMax=" + pngDrawablesMax +
                ", pngDrawablesMin=" + pngDrawablesMin +
                ", pngDrawablesVariance=" + pngDrawablesVariance +
                ", pngDrawablesDeviation=" + pngDrawablesDeviation +
                ", apksWithPngDrawablesObtainedSuccessfullyNonZero=" + apksWithPngDrawablesObtainedSuccessfullyNonZero +
                ", pngDrawablesArithmeticMeanNonZero=" + pngDrawablesArithmeticMeanNonZero +
                ", pngDrawablesModusNonZero=" + pngDrawablesModusNonZero +
                ", pngDrawablesMedianNonZero=" + pngDrawablesMedianNonZero +
                ", pngDrawablesMaxNonZero=" + pngDrawablesMaxNonZero +
                ", pngDrawablesMinNonZero=" + pngDrawablesMinNonZero +
                ", pngDrawablesVarianceNonZero=" + pngDrawablesVarianceNonZero +
                ", pngDrawablesDeviationNonZero=" + pngDrawablesDeviationNonZero +
                ", apksWithJpgDrawablesObtainedSuccessfully=" + apksWithJpgDrawablesObtainedSuccessfully +
                ", jpgDrawablesArithmeticMean=" + jpgDrawablesArithmeticMean +
                ", jpgDrawablesModus=" + jpgDrawablesModus +
                ", jpgDrawablesMedian=" + jpgDrawablesMedian +
                ", jpgDrawablesMax=" + jpgDrawablesMax +
                ", jpgDrawablesMin=" + jpgDrawablesMin +
                ", jpgDrawablesVariance=" + jpgDrawablesVariance +
                ", jpgDrawablesDeviation=" + jpgDrawablesDeviation +
                ", apksWithJpgDrawablesObtainedSuccessfullyNonZero=" + apksWithJpgDrawablesObtainedSuccessfullyNonZero +
                ", jpgDrawablesArithmeticMeanNonZero=" + jpgDrawablesArithmeticMeanNonZero +
                ", jpgDrawablesModusNonZero=" + jpgDrawablesModusNonZero +
                ", jpgDrawablesMedianNonZero=" + jpgDrawablesMedianNonZero +
                ", jpgDrawablesMaxNonZero=" + jpgDrawablesMaxNonZero +
                ", jpgDrawablesMinNonZero=" + jpgDrawablesMinNonZero +
                ", jpgDrawablesVarianceNonZero=" + jpgDrawablesVarianceNonZero +
                ", jpgDrawablesDeviationNonZero=" + jpgDrawablesDeviationNonZero +
                ", apksWithGifDrawablesObtainedSuccessfully=" + apksWithGifDrawablesObtainedSuccessfully +
                ", gifDrawablesArithmeticMean=" + gifDrawablesArithmeticMean +
                ", gifDrawablesModus=" + gifDrawablesModus +
                ", gifDrawablesMedian=" + gifDrawablesMedian +
                ", gifDrawablesMax=" + gifDrawablesMax +
                ", gifDrawablesMin=" + gifDrawablesMin +
                ", gifDrawablesVariance=" + gifDrawablesVariance +
                ", gifDrawablesDeviation=" + gifDrawablesDeviation +
                ", apksWithGifDrawablesObtainedSuccessfullyNonZero=" + apksWithGifDrawablesObtainedSuccessfullyNonZero +
                ", gifDrawablesArithmeticMeanNonZero=" + gifDrawablesArithmeticMeanNonZero +
                ", gifDrawablesModusNonZero=" + gifDrawablesModusNonZero +
                ", gifDrawablesMedianNonZero=" + gifDrawablesMedianNonZero +
                ", gifDrawablesMaxNonZero=" + gifDrawablesMaxNonZero +
                ", gifDrawablesMinNonZero=" + gifDrawablesMinNonZero +
                ", gifDrawablesVarianceNonZero=" + gifDrawablesVarianceNonZero +
                ", gifDrawablesDeviationNonZero=" + gifDrawablesDeviationNonZero +
                ", apksWithXmlDrawablesObtainedSuccessfully=" + apksWithXmlDrawablesObtainedSuccessfully +
                ", xmlDrawablesArithmeticMean=" + xmlDrawablesArithmeticMean +
                ", xmlDrawablesModus=" + xmlDrawablesModus +
                ", xmlDrawablesMedian=" + xmlDrawablesMedian +
                ", xmlDrawablesMax=" + xmlDrawablesMax +
                ", xmlDrawablesMin=" + xmlDrawablesMin +
                ", xmlDrawablesVariance=" + xmlDrawablesVariance +
                ", xmlDrawablesDeviation=" + xmlDrawablesDeviation +
                ", apksWithXmlDrawablesObtainedSuccessfullyNonZero=" + apksWithXmlDrawablesObtainedSuccessfullyNonZero +
                ", xmlDrawablesArithmeticMeanNonZero=" + xmlDrawablesArithmeticMeanNonZero +
                ", xmlDrawablesModusNonZero=" + xmlDrawablesModusNonZero +
                ", xmlDrawablesMedianNonZero=" + xmlDrawablesMedianNonZero +
                ", xmlDrawablesMaxNonZero=" + xmlDrawablesMaxNonZero +
                ", xmlDrawablesMinNonZero=" + xmlDrawablesMinNonZero +
                ", xmlDrawablesVarianceNonZero=" + xmlDrawablesVarianceNonZero +
                ", xmlDrawablesDeviationNonZero=" + xmlDrawablesDeviationNonZero +
                ", apksWithDifferentDrawablesObtainedSuccessfully=" + apksWithDifferentDrawablesObtainedSuccessfully +
                ", differentDrawablesArithmeticMean=" + differentDrawablesArithmeticMean +
                ", differentDrawablesModus=" + differentDrawablesModus +
                ", differentDrawablesMedian=" + differentDrawablesMedian +
                ", differentDrawablesMax=" + differentDrawablesMax +
                ", differentDrawablesMin=" + differentDrawablesMin +
                ", differentDrawablesVariance=" + differentDrawablesVariance +
                ", differentDrawablesDeviation=" + differentDrawablesDeviation +
                ", apksWithDifferentDrawablesObtainedSuccessfullyNonZero=" + apksWithDifferentDrawablesObtainedSuccessfullyNonZero +
                ", differentDrawablesArithmeticMeanNonZero=" + differentDrawablesArithmeticMeanNonZero +
                ", differentDrawablesModusNonZero=" + differentDrawablesModusNonZero +
                ", differentDrawablesMedianNonZero=" + differentDrawablesMedianNonZero +
                ", differentDrawablesMaxNonZero=" + differentDrawablesMaxNonZero +
                ", differentDrawablesMinNonZero=" + differentDrawablesMinNonZero +
                ", differentDrawablesVarianceNonZero=" + differentDrawablesVarianceNonZero +
                ", differentDrawablesDeviationNonZero=" + differentDrawablesDeviationNonZero +
                ", apksWithLdpiDrawablesObtainedSuccessfully=" + apksWithLdpiDrawablesObtainedSuccessfully +
                ", ldpiDrawablesArithmeticMean=" + ldpiDrawablesArithmeticMean +
                ", ldpiDrawablesModus=" + ldpiDrawablesModus +
                ", ldpiDrawablesMedian=" + ldpiDrawablesMedian +
                ", ldpiDrawablesMax=" + ldpiDrawablesMax +
                ", ldpiDrawablesMin=" + ldpiDrawablesMin +
                ", ldpiDrawablesVariance=" + ldpiDrawablesVariance +
                ", ldpiDrawablesDeviation=" + ldpiDrawablesDeviation +
                ", apksWithLdpiDrawablesObtainedSuccessfullyNonZero=" + apksWithLdpiDrawablesObtainedSuccessfullyNonZero +
                ", ldpiDrawablesArithmeticMeanNonZero=" + ldpiDrawablesArithmeticMeanNonZero +
                ", ldpiDrawablesModusNonZero=" + ldpiDrawablesModusNonZero +
                ", ldpiDrawablesMedianNonZero=" + ldpiDrawablesMedianNonZero +
                ", ldpiDrawablesMaxNonZero=" + ldpiDrawablesMaxNonZero +
                ", ldpiDrawablesMinNonZero=" + ldpiDrawablesMinNonZero +
                ", ldpiDrawablesVarianceNonZero=" + ldpiDrawablesVarianceNonZero +
                ", ldpiDrawablesDeviationNonZero=" + ldpiDrawablesDeviationNonZero +
                ", apksWithMdpiDrawablesObtainedSuccessfully=" + apksWithMdpiDrawablesObtainedSuccessfully +
                ", mdpiDrawablesArithmeticMean=" + mdpiDrawablesArithmeticMean +
                ", mdpiDrawablesModus=" + mdpiDrawablesModus +
                ", mdpiDrawablesMedian=" + mdpiDrawablesMedian +
                ", mdpiDrawablesMax=" + mdpiDrawablesMax +
                ", mdpiDrawablesMin=" + mdpiDrawablesMin +
                ", mdpiDrawablesVariance=" + mdpiDrawablesVariance +
                ", mdpiDrawablesDeviation=" + mdpiDrawablesDeviation +
                ", apksWithMdpiDrawablesObtainedSuccessfullyNonZero=" + apksWithMdpiDrawablesObtainedSuccessfullyNonZero +
                ", mdpiDrawablesArithmeticMeanNonZero=" + mdpiDrawablesArithmeticMeanNonZero +
                ", mdpiDrawablesModusNonZero=" + mdpiDrawablesModusNonZero +
                ", mdpiDrawablesMedianNonZero=" + mdpiDrawablesMedianNonZero +
                ", mdpiDrawablesMaxNonZero=" + mdpiDrawablesMaxNonZero +
                ", mdpiDrawablesMinNonZero=" + mdpiDrawablesMinNonZero +
                ", mdpiDrawablesVarianceNonZero=" + mdpiDrawablesVarianceNonZero +
                ", mdpiDrawablesDeviationNonZero=" + mdpiDrawablesDeviationNonZero +
                ", apksWithHdpiDrawablesObtainedSuccessfully=" + apksWithHdpiDrawablesObtainedSuccessfully +
                ", hdpiDrawablesArithmeticMean=" + hdpiDrawablesArithmeticMean +
                ", hdpiDrawablesModus=" + hdpiDrawablesModus +
                ", hdpiDrawablesMedian=" + hdpiDrawablesMedian +
                ", hdpiDrawablesMax=" + hdpiDrawablesMax +
                ", hdpiDrawablesMin=" + hdpiDrawablesMin +
                ", hdpiDrawablesVariance=" + hdpiDrawablesVariance +
                ", hdpiDrawablesDeviation=" + hdpiDrawablesDeviation +
                ", apksWithHdpiDrawablesObtainedSuccessfullyNonZero=" + apksWithHdpiDrawablesObtainedSuccessfullyNonZero +
                ", hdpiDrawablesArithmeticMeanNonZero=" + hdpiDrawablesArithmeticMeanNonZero +
                ", hdpiDrawablesModusNonZero=" + hdpiDrawablesModusNonZero +
                ", hdpiDrawablesMedianNonZero=" + hdpiDrawablesMedianNonZero +
                ", hdpiDrawablesMaxNonZero=" + hdpiDrawablesMaxNonZero +
                ", hdpiDrawablesMinNonZero=" + hdpiDrawablesMinNonZero +
                ", hdpiDrawablesVarianceNonZero=" + hdpiDrawablesVarianceNonZero +
                ", hdpiDrawablesDeviationNonZero=" + hdpiDrawablesDeviationNonZero +
                ", apksWithXhdpiDrawablesObtainedSuccessfully=" + apksWithXhdpiDrawablesObtainedSuccessfully +
                ", xhdpiDrawablesArithmeticMean=" + xhdpiDrawablesArithmeticMean +
                ", xhdpiDrawablesModus=" + xhdpiDrawablesModus +
                ", xhdpiDrawablesMedian=" + xhdpiDrawablesMedian +
                ", xhdpiDrawablesMax=" + xhdpiDrawablesMax +
                ", xhdpiDrawablesMin=" + xhdpiDrawablesMin +
                ", xhdpiDrawablesVariance=" + xhdpiDrawablesVariance +
                ", xhdpiDrawablesDeviation=" + xhdpiDrawablesDeviation +
                ", apksWithXhdpiDrawablesObtainedSuccessfullyNonZero=" + apksWithXhdpiDrawablesObtainedSuccessfullyNonZero +
                ", xhdpiDrawablesArithmeticMeanNonZero=" + xhdpiDrawablesArithmeticMeanNonZero +
                ", xhdpiDrawablesModusNonZero=" + xhdpiDrawablesModusNonZero +
                ", xhdpiDrawablesMedianNonZero=" + xhdpiDrawablesMedianNonZero +
                ", xhdpiDrawablesMaxNonZero=" + xhdpiDrawablesMaxNonZero +
                ", xhdpiDrawablesMinNonZero=" + xhdpiDrawablesMinNonZero +
                ", xhdpiDrawablesVarianceNonZero=" + xhdpiDrawablesVarianceNonZero +
                ", xhdpiDrawablesDeviationNonZero=" + xhdpiDrawablesDeviationNonZero +
                ", apksWithXxhdpiDrawablesObtainedSuccessfully=" + apksWithXxhdpiDrawablesObtainedSuccessfully +
                ", xxhdpiDrawablesArithmeticMean=" + xxhdpiDrawablesArithmeticMean +
                ", xxhdpiDrawablesModus=" + xxhdpiDrawablesModus +
                ", xxhdpiDrawablesMedian=" + xxhdpiDrawablesMedian +
                ", xxhdpiDrawablesMax=" + xxhdpiDrawablesMax +
                ", xxhdpiDrawablesMin=" + xxhdpiDrawablesMin +
                ", xxhdpiDrawablesVariance=" + xxhdpiDrawablesVariance +
                ", xxhdpiDrawablesDeviation=" + xxhdpiDrawablesDeviation +
                ", apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero=" + apksWithXxhdpiDrawablesObtainedSuccessfullyNonZero +
                ", xxhdpiDrawablesArithmeticMeanNonZero=" + xxhdpiDrawablesArithmeticMeanNonZero +
                ", xxhdpiDrawablesModusNonZero=" + xxhdpiDrawablesModusNonZero +
                ", xxhdpiDrawablesMedianNonZero=" + xxhdpiDrawablesMedianNonZero +
                ", xxhdpiDrawablesMaxNonZero=" + xxhdpiDrawablesMaxNonZero +
                ", xxhdpiDrawablesMinNonZero=" + xxhdpiDrawablesMinNonZero +
                ", xxhdpiDrawablesVarianceNonZero=" + xxhdpiDrawablesVarianceNonZero +
                ", xxhdpiDrawablesDeviationNonZero=" + xxhdpiDrawablesDeviationNonZero +
                ", apksWithXxxhdpiDrawablesObtainedSuccessfully=" + apksWithXxxhdpiDrawablesObtainedSuccessfully +
                ", xxxhdpiDrawablesArithmeticMean=" + xxxhdpiDrawablesArithmeticMean +
                ", xxxhdpiDrawablesModus=" + xxxhdpiDrawablesModus +
                ", xxxhdpiDrawablesMedian=" + xxxhdpiDrawablesMedian +
                ", xxxhdpiDrawablesMax=" + xxxhdpiDrawablesMax +
                ", xxxhdpiDrawablesMin=" + xxxhdpiDrawablesMin +
                ", xxxhdpiDrawablesVariance=" + xxxhdpiDrawablesVariance +
                ", xxxhdpiDrawablesDeviation=" + xxxhdpiDrawablesDeviation +
                ", apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero=" + apksWithXxxhdpiDrawablesObtainedSuccessfullyNonZero +
                ", xxxhdpiDrawablesArithmeticMeanNonZero=" + xxxhdpiDrawablesArithmeticMeanNonZero +
                ", xxxhdpiDrawablesModusNonZero=" + xxxhdpiDrawablesModusNonZero +
                ", xxxhdpiDrawablesMedianNonZero=" + xxxhdpiDrawablesMedianNonZero +
                ", xxxhdpiDrawablesMaxNonZero=" + xxxhdpiDrawablesMaxNonZero +
                ", xxxhdpiDrawablesMinNonZero=" + xxxhdpiDrawablesMinNonZero +
                ", xxxhdpiDrawablesVarianceNonZero=" + xxxhdpiDrawablesVarianceNonZero +
                ", xxxhdpiDrawablesDeviationNonZero=" + xxxhdpiDrawablesDeviationNonZero +
                ", apksWithUnspecifiedDpiDrawablesObtainedSuccessfully=" + apksWithUnspecifiedDpiDrawablesObtainedSuccessfully +
                ", unspecifiedDpiDrawablesArithmeticMean=" + unspecifiedDpiDrawablesArithmeticMean +
                ", unspecifiedDpiDrawablesModus=" + unspecifiedDpiDrawablesModus +
                ", unspecifiedDpiDrawablesMedian=" + unspecifiedDpiDrawablesMedian +
                ", unspecifiedDpiDrawablesMax=" + unspecifiedDpiDrawablesMax +
                ", unspecifiedDpiDrawablesMin=" + unspecifiedDpiDrawablesMin +
                ", unspecifiedDpiDrawablesVariance=" + unspecifiedDpiDrawablesVariance +
                ", unspecifiedDpiDrawablesDeviation=" + unspecifiedDpiDrawablesDeviation +
                ", apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero=" + apksWithUnspecifiedDpiDrawablesObtainedSuccessfullyNonZero +
                ", unspecifiedDpiDrawablesArithmeticMeanNonZero=" + unspecifiedDpiDrawablesArithmeticMeanNonZero +
                ", unspecifiedDpiDrawablesModusNonZero=" + unspecifiedDpiDrawablesModusNonZero +
                ", unspecifiedDpiDrawablesMedianNonZero=" + unspecifiedDpiDrawablesMedianNonZero +
                ", unspecifiedDpiDrawablesMaxNonZero=" + unspecifiedDpiDrawablesMaxNonZero +
                ", unspecifiedDpiDrawablesMinNonZero=" + unspecifiedDpiDrawablesMinNonZero +
                ", unspecifiedDpiDrawablesVarianceNonZero=" + unspecifiedDpiDrawablesVarianceNonZero +
                ", unspecifiedDpiDrawablesDeviationNonZero=" + unspecifiedDpiDrawablesDeviationNonZero +
                '}';
    }
}
