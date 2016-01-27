package sk.styk.martin.bakalarka.statistics.data;

import sk.styk.martin.bakalarka.utils.data.PercentagePair;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Martin Styk on 17.01.2016.
 */
public class ResourceStatistics {

    /**
     * number of apks with data successfully collected
     */
    private Integer analyzedApks;

    //layouts
    private PercentagePair apksWithLayoutsObtainedSuccessfully;
    private BigDecimal layoutsArithmeticMean;
    private List<Integer> layoutsModus;
    private Integer layoutsMedian;
    private Integer layoutsMax;
    private Integer layoutsMin;
    private BigDecimal layoutsVariance;
    private BigDecimal layoutsDeviation;

    private PercentagePair apksWithLayoutsObtainedSuccessfullyNonZero;
    private BigDecimal layoutsArithmeticMeanNonZero;
    private List<Integer> layoutsModusNonZero;
    private Integer layoutsMedianNonZero;
    private Integer layoutsMaxNonZero;
    private Integer layoutsMinNonZero;
    private BigDecimal layoutsVarianceNonZero;
    private BigDecimal layoutsDeviationNonZero;

    //different layouts
    private PercentagePair apksWithDifferentLayoutsObtainedSuccessfully;
    private BigDecimal differentLayoutsArithmeticMean;
    private List<Integer> differentLayoutsModus;
    private Integer differentLayoutsMedian;
    private Integer differentLayoutsMax;
    private Integer differentLayoutsMin;
    private BigDecimal differentLayoutsVariance;
    private BigDecimal differentLayoutsDeviation;

    private PercentagePair apksWithDifferentLayoutsObtainedSuccessfullyNonZero;
    private BigDecimal differentLayoutsArithmeticMeanNonZero;
    private List<Integer> differentLayoutsModusNonZero;
    private Integer differentLayoutsMedianNonZero;
    private Integer differentLayoutsMaxNonZero;
    private Integer differentLayoutsMinNonZero;
    private BigDecimal differentLayoutsVarianceNonZero;
    private BigDecimal differentLayoutsDeviationNonZero;

    //menu
    private PercentagePair apksWithMenusObtainedSuccessfully;
    private BigDecimal menusArithmeticMean;
    private List<Integer> menusModus;
    private Integer menusMedian;
    private Integer menusMax;
    private Integer menusMin;
    private BigDecimal menusVariance;
    private BigDecimal menusDeviation;

    private PercentagePair apksWithMenusObtainedSuccessfullyNonZero;
    private BigDecimal menusArithmeticMeanNonZero;
    private List<Integer> menusModusNonZero;
    private Integer menusMedianNonZero;
    private Integer menusMaxNonZero;
    private Integer menusMinNonZero;
    private BigDecimal menusVarianceNonZero;
    private BigDecimal menusDeviationNonZero;

    //raw resources
    private PercentagePair apksWithRawResourcesObtainedSuccessfully;
    private BigDecimal rawResourcesArithmeticMean;
    private List<Integer> rawResourcesModus;
    private Integer rawResourcesMedian;
    private Integer rawResourcesMax;
    private Integer rawResourcesMin;
    private BigDecimal rawResourcesVariance;
    private BigDecimal rawResourcesDeviation;

    private PercentagePair apksWithRawResourcesObtainedSuccessfullyNonZero;
    private BigDecimal rawResourcesArithmeticMeanNonZero;
    private List<Integer> rawResourcesModusNonZero;
    private Integer rawResourcesMedianNonZero;
    private Integer rawResourcesMaxNonZero;
    private Integer rawResourcesMinNonZero;
    private BigDecimal rawResourcesVarianceNonZero;
    private BigDecimal rawResourcesDeviationNonZero;

    public Integer getAnalyzedApks() {
        return analyzedApks;
    }

    public void setAnalyzedApks(Integer analyzedApks) {
        this.analyzedApks = analyzedApks;
    }

    public PercentagePair getApksWithLayoutsObtainedSuccessfully() {
        return apksWithLayoutsObtainedSuccessfully;
    }

    public void setApksWithLayoutsObtainedSuccessfully(PercentagePair apksWithLayoutsObtainedSuccessfully) {
        this.apksWithLayoutsObtainedSuccessfully = apksWithLayoutsObtainedSuccessfully;
    }

    public BigDecimal getLayoutsArithmeticMean() {
        return layoutsArithmeticMean;
    }

    public void setLayoutsArithmeticMean(BigDecimal layoutsArithmeticMean) {
        this.layoutsArithmeticMean = layoutsArithmeticMean;
    }

    public List<Integer> getLayoutsModus() {
        return layoutsModus;
    }

    public void setLayoutsModus(List<Integer> layoutsModus) {
        this.layoutsModus = layoutsModus;
    }

    public Integer getLayoutsMedian() {
        return layoutsMedian;
    }

    public void setLayoutsMedian(Integer layoutsMedian) {
        this.layoutsMedian = layoutsMedian;
    }

    public Integer getLayoutsMax() {
        return layoutsMax;
    }

    public void setLayoutsMax(Integer layoutsMax) {
        this.layoutsMax = layoutsMax;
    }

    public Integer getLayoutsMin() {
        return layoutsMin;
    }

    public void setLayoutsMin(Integer layoutsMin) {
        this.layoutsMin = layoutsMin;
    }

    public BigDecimal getLayoutsVariance() {
        return layoutsVariance;
    }

    public void setLayoutsVariance(BigDecimal layoutsVariance) {
        this.layoutsVariance = layoutsVariance;
    }

    public BigDecimal getLayoutsDeviation() {
        return layoutsDeviation;
    }

    public void setLayoutsDeviation(BigDecimal layoutsDeviation) {
        this.layoutsDeviation = layoutsDeviation;
    }

    public PercentagePair getApksWithLayoutsObtainedSuccessfullyNonZero() {
        return apksWithLayoutsObtainedSuccessfullyNonZero;
    }

    public void setApksWithLayoutsObtainedSuccessfullyNonZero(PercentagePair apksWithLayoutsObtainedSuccessfullyNonZero) {
        this.apksWithLayoutsObtainedSuccessfullyNonZero = apksWithLayoutsObtainedSuccessfullyNonZero;
    }

    public BigDecimal getLayoutsArithmeticMeanNonZero() {
        return layoutsArithmeticMeanNonZero;
    }

    public void setLayoutsArithmeticMeanNonZero(BigDecimal layoutsArithmeticMeanNonZero) {
        this.layoutsArithmeticMeanNonZero = layoutsArithmeticMeanNonZero;
    }

    public List<Integer> getLayoutsModusNonZero() {
        return layoutsModusNonZero;
    }

    public void setLayoutsModusNonZero(List<Integer> layoutsModusNonZero) {
        this.layoutsModusNonZero = layoutsModusNonZero;
    }

    public Integer getLayoutsMedianNonZero() {
        return layoutsMedianNonZero;
    }

    public void setLayoutsMedianNonZero(Integer layoutsMedianNonZero) {
        this.layoutsMedianNonZero = layoutsMedianNonZero;
    }

    public Integer getLayoutsMaxNonZero() {
        return layoutsMaxNonZero;
    }

    public void setLayoutsMaxNonZero(Integer layoutsMaxNonZero) {
        this.layoutsMaxNonZero = layoutsMaxNonZero;
    }

    public Integer getLayoutsMinNonZero() {
        return layoutsMinNonZero;
    }

    public void setLayoutsMinNonZero(Integer layoutsMinNonZero) {
        this.layoutsMinNonZero = layoutsMinNonZero;
    }

    public BigDecimal getLayoutsVarianceNonZero() {
        return layoutsVarianceNonZero;
    }

    public void setLayoutsVarianceNonZero(BigDecimal layoutsVarianceNonZero) {
        this.layoutsVarianceNonZero = layoutsVarianceNonZero;
    }

    public BigDecimal getLayoutsDeviationNonZero() {
        return layoutsDeviationNonZero;
    }

    public void setLayoutsDeviationNonZero(BigDecimal layoutsDeviationNonZero) {
        this.layoutsDeviationNonZero = layoutsDeviationNonZero;
    }

    public PercentagePair getApksWithDifferentLayoutsObtainedSuccessfully() {
        return apksWithDifferentLayoutsObtainedSuccessfully;
    }

    public void setApksWithDifferentLayoutsObtainedSuccessfully(PercentagePair apksWithDifferentLayoutsObtainedSuccessfully) {
        this.apksWithDifferentLayoutsObtainedSuccessfully = apksWithDifferentLayoutsObtainedSuccessfully;
    }

    public BigDecimal getDifferentLayoutsArithmeticMean() {
        return differentLayoutsArithmeticMean;
    }

    public void setDifferentLayoutsArithmeticMean(BigDecimal differentLayoutsArithmeticMean) {
        this.differentLayoutsArithmeticMean = differentLayoutsArithmeticMean;
    }

    public List<Integer> getDifferentLayoutsModus() {
        return differentLayoutsModus;
    }

    public void setDifferentLayoutsModus(List<Integer> differentLayoutsModus) {
        this.differentLayoutsModus = differentLayoutsModus;
    }

    public Integer getDifferentLayoutsMedian() {
        return differentLayoutsMedian;
    }

    public void setDifferentLayoutsMedian(Integer differentLayoutsMedian) {
        this.differentLayoutsMedian = differentLayoutsMedian;
    }

    public Integer getDifferentLayoutsMax() {
        return differentLayoutsMax;
    }

    public void setDifferentLayoutsMax(Integer differentLayoutsMax) {
        this.differentLayoutsMax = differentLayoutsMax;
    }

    public Integer getDifferentLayoutsMin() {
        return differentLayoutsMin;
    }

    public void setDifferentLayoutsMin(Integer differentLayoutsMin) {
        this.differentLayoutsMin = differentLayoutsMin;
    }

    public BigDecimal getDifferentLayoutsVariance() {
        return differentLayoutsVariance;
    }

    public void setDifferentLayoutsVariance(BigDecimal differentLayoutsVariance) {
        this.differentLayoutsVariance = differentLayoutsVariance;
    }

    public BigDecimal getDifferentLayoutsDeviation() {
        return differentLayoutsDeviation;
    }

    public void setDifferentLayoutsDeviation(BigDecimal differentLayoutsDeviation) {
        this.differentLayoutsDeviation = differentLayoutsDeviation;
    }

    public PercentagePair getApksWithDifferentLayoutsObtainedSuccessfullyNonZero() {
        return apksWithDifferentLayoutsObtainedSuccessfullyNonZero;
    }

    public void setApksWithDifferentLayoutsObtainedSuccessfullyNonZero(PercentagePair apksWithDifferentLayoutsObtainedSuccessfullyNonZero) {
        this.apksWithDifferentLayoutsObtainedSuccessfullyNonZero = apksWithDifferentLayoutsObtainedSuccessfullyNonZero;
    }

    public BigDecimal getDifferentLayoutsArithmeticMeanNonZero() {
        return differentLayoutsArithmeticMeanNonZero;
    }

    public void setDifferentLayoutsArithmeticMeanNonZero(BigDecimal differentLayoutsArithmeticMeanNonZero) {
        this.differentLayoutsArithmeticMeanNonZero = differentLayoutsArithmeticMeanNonZero;
    }

    public List<Integer> getDifferentLayoutsModusNonZero() {
        return differentLayoutsModusNonZero;
    }

    public void setDifferentLayoutsModusNonZero(List<Integer> differentLayoutsModusNonZero) {
        this.differentLayoutsModusNonZero = differentLayoutsModusNonZero;
    }

    public Integer getDifferentLayoutsMedianNonZero() {
        return differentLayoutsMedianNonZero;
    }

    public void setDifferentLayoutsMedianNonZero(Integer differentLayoutsMedianNonZero) {
        this.differentLayoutsMedianNonZero = differentLayoutsMedianNonZero;
    }

    public Integer getDifferentLayoutsMaxNonZero() {
        return differentLayoutsMaxNonZero;
    }

    public void setDifferentLayoutsMaxNonZero(Integer differentLayoutsMaxNonZero) {
        this.differentLayoutsMaxNonZero = differentLayoutsMaxNonZero;
    }

    public Integer getDifferentLayoutsMinNonZero() {
        return differentLayoutsMinNonZero;
    }

    public void setDifferentLayoutsMinNonZero(Integer differentLayoutsMinNonZero) {
        this.differentLayoutsMinNonZero = differentLayoutsMinNonZero;
    }

    public BigDecimal getDifferentLayoutsVarianceNonZero() {
        return differentLayoutsVarianceNonZero;
    }

    public void setDifferentLayoutsVarianceNonZero(BigDecimal differentLayoutsVarianceNonZero) {
        this.differentLayoutsVarianceNonZero = differentLayoutsVarianceNonZero;
    }

    public BigDecimal getDifferentLayoutsDeviationNonZero() {
        return differentLayoutsDeviationNonZero;
    }

    public void setDifferentLayoutsDeviationNonZero(BigDecimal differentLayoutsDeviationNonZero) {
        this.differentLayoutsDeviationNonZero = differentLayoutsDeviationNonZero;
    }

    public PercentagePair getApksWithMenusObtainedSuccessfully() {
        return apksWithMenusObtainedSuccessfully;
    }

    public void setApksWithMenusObtainedSuccessfully(PercentagePair apksWithMenusObtainedSuccessfully) {
        this.apksWithMenusObtainedSuccessfully = apksWithMenusObtainedSuccessfully;
    }

    public BigDecimal getMenusArithmeticMean() {
        return menusArithmeticMean;
    }

    public void setMenusArithmeticMean(BigDecimal menusArithmeticMean) {
        this.menusArithmeticMean = menusArithmeticMean;
    }

    public List<Integer> getMenusModus() {
        return menusModus;
    }

    public void setMenusModus(List<Integer> menusModus) {
        this.menusModus = menusModus;
    }

    public Integer getMenusMedian() {
        return menusMedian;
    }

    public void setMenusMedian(Integer menusMedian) {
        this.menusMedian = menusMedian;
    }

    public Integer getMenusMax() {
        return menusMax;
    }

    public void setMenusMax(Integer menusMax) {
        this.menusMax = menusMax;
    }

    public Integer getMenusMin() {
        return menusMin;
    }

    public void setMenusMin(Integer menusMin) {
        this.menusMin = menusMin;
    }

    public BigDecimal getMenusVariance() {
        return menusVariance;
    }

    public void setMenusVariance(BigDecimal menusVariance) {
        this.menusVariance = menusVariance;
    }

    public BigDecimal getMenusDeviation() {
        return menusDeviation;
    }

    public void setMenusDeviation(BigDecimal menusDeviation) {
        this.menusDeviation = menusDeviation;
    }

    public PercentagePair getApksWithRawResourcesObtainedSuccessfully() {
        return apksWithRawResourcesObtainedSuccessfully;
    }

    public void setApksWithRawResourcesObtainedSuccessfully(PercentagePair apksWithRawResourcesObtainedSuccessfully) {
        this.apksWithRawResourcesObtainedSuccessfully = apksWithRawResourcesObtainedSuccessfully;
    }

    public BigDecimal getRawResourcesArithmeticMean() {
        return rawResourcesArithmeticMean;
    }

    public void setRawResourcesArithmeticMean(BigDecimal rawResourcesArithmeticMean) {
        this.rawResourcesArithmeticMean = rawResourcesArithmeticMean;
    }

    public List<Integer> getRawResourcesModus() {
        return rawResourcesModus;
    }

    public void setRawResourcesModus(List<Integer> rawResourcesModus) {
        this.rawResourcesModus = rawResourcesModus;
    }

    public Integer getRawResourcesMedian() {
        return rawResourcesMedian;
    }

    public void setRawResourcesMedian(Integer rawResourcesMedian) {
        this.rawResourcesMedian = rawResourcesMedian;
    }

    public Integer getRawResourcesMax() {
        return rawResourcesMax;
    }

    public void setRawResourcesMax(Integer rawResourcesMax) {
        this.rawResourcesMax = rawResourcesMax;
    }

    public Integer getRawResourcesMin() {
        return rawResourcesMin;
    }

    public void setRawResourcesMin(Integer rawResourcesMin) {
        this.rawResourcesMin = rawResourcesMin;
    }

    public BigDecimal getRawResourcesVariance() {
        return rawResourcesVariance;
    }

    public void setRawResourcesVariance(BigDecimal rawResourcesVariance) {
        this.rawResourcesVariance = rawResourcesVariance;
    }

    public BigDecimal getRawResourcesDeviation() {
        return rawResourcesDeviation;
    }

    public void setRawResourcesDeviation(BigDecimal rawResourcesDeviation) {
        this.rawResourcesDeviation = rawResourcesDeviation;
    }

    public PercentagePair getApksWithMenusObtainedSuccessfullyNonZero() {
        return apksWithMenusObtainedSuccessfullyNonZero;
    }

    public void setApksWithMenusObtainedSuccessfullyNonZero(PercentagePair apksWithMenusObtainedSuccessfullyNonZero) {
        this.apksWithMenusObtainedSuccessfullyNonZero = apksWithMenusObtainedSuccessfullyNonZero;
    }

    public BigDecimal getMenusArithmeticMeanNonZero() {
        return menusArithmeticMeanNonZero;
    }

    public void setMenusArithmeticMeanNonZero(BigDecimal menusArithmeticMeanNonZero) {
        this.menusArithmeticMeanNonZero = menusArithmeticMeanNonZero;
    }

    public List<Integer> getMenusModusNonZero() {
        return menusModusNonZero;
    }

    public void setMenusModusNonZero(List<Integer> menusModusNonZero) {
        this.menusModusNonZero = menusModusNonZero;
    }

    public Integer getMenusMedianNonZero() {
        return menusMedianNonZero;
    }

    public void setMenusMedianNonZero(Integer menusMedianNonZero) {
        this.menusMedianNonZero = menusMedianNonZero;
    }

    public Integer getMenusMaxNonZero() {
        return menusMaxNonZero;
    }

    public void setMenusMaxNonZero(Integer menusMaxNonZero) {
        this.menusMaxNonZero = menusMaxNonZero;
    }

    public Integer getMenusMinNonZero() {
        return menusMinNonZero;
    }

    public void setMenusMinNonZero(Integer menusMinNonZero) {
        this.menusMinNonZero = menusMinNonZero;
    }

    public BigDecimal getMenusVarianceNonZero() {
        return menusVarianceNonZero;
    }

    public void setMenusVarianceNonZero(BigDecimal menusVarianceNonZero) {
        this.menusVarianceNonZero = menusVarianceNonZero;
    }

    public BigDecimal getMenusDeviationNonZero() {
        return menusDeviationNonZero;
    }

    public void setMenusDeviationNonZero(BigDecimal menusDeviationNonZero) {
        this.menusDeviationNonZero = menusDeviationNonZero;
    }

    public PercentagePair getApksWithRawResourcesObtainedSuccessfullyNonZero() {
        return apksWithRawResourcesObtainedSuccessfullyNonZero;
    }

    public void setApksWithRawResourcesObtainedSuccessfullyNonZero(PercentagePair apksWithRawResourcesObtainedSuccessfullyNonZero) {
        this.apksWithRawResourcesObtainedSuccessfullyNonZero = apksWithRawResourcesObtainedSuccessfullyNonZero;
    }

    public BigDecimal getRawResourcesArithmeticMeanNonZero() {
        return rawResourcesArithmeticMeanNonZero;
    }

    public void setRawResourcesArithmeticMeanNonZero(BigDecimal rawResourcesArithmeticMeanNonZero) {
        this.rawResourcesArithmeticMeanNonZero = rawResourcesArithmeticMeanNonZero;
    }

    public List<Integer> getRawResourcesModusNonZero() {
        return rawResourcesModusNonZero;
    }

    public void setRawResourcesModusNonZero(List<Integer> rawResourcesModusNonZero) {
        this.rawResourcesModusNonZero = rawResourcesModusNonZero;
    }

    public Integer getRawResourcesMedianNonZero() {
        return rawResourcesMedianNonZero;
    }

    public void setRawResourcesMedianNonZero(Integer rawResourcesMedianNonZero) {
        this.rawResourcesMedianNonZero = rawResourcesMedianNonZero;
    }

    public Integer getRawResourcesMaxNonZero() {
        return rawResourcesMaxNonZero;
    }

    public void setRawResourcesMaxNonZero(Integer rawResourcesMaxNonZero) {
        this.rawResourcesMaxNonZero = rawResourcesMaxNonZero;
    }

    public Integer getRawResourcesMinNonZero() {
        return rawResourcesMinNonZero;
    }

    public void setRawResourcesMinNonZero(Integer rawResourcesMinNonZero) {
        this.rawResourcesMinNonZero = rawResourcesMinNonZero;
    }

    public BigDecimal getRawResourcesVarianceNonZero() {
        return rawResourcesVarianceNonZero;
    }

    public void setRawResourcesVarianceNonZero(BigDecimal rawResourcesVarianceNonZero) {
        this.rawResourcesVarianceNonZero = rawResourcesVarianceNonZero;
    }

    public BigDecimal getRawResourcesDeviationNonZero() {
        return rawResourcesDeviationNonZero;
    }

    public void setRawResourcesDeviationNonZero(BigDecimal rawResourcesDeviationNonZero) {
        this.rawResourcesDeviationNonZero = rawResourcesDeviationNonZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResourceStatistics that = (ResourceStatistics) o;

        if (analyzedApks != null ? !analyzedApks.equals(that.analyzedApks) : that.analyzedApks != null) return false;
        if (apksWithLayoutsObtainedSuccessfully != null ? !apksWithLayoutsObtainedSuccessfully.equals(that.apksWithLayoutsObtainedSuccessfully) : that.apksWithLayoutsObtainedSuccessfully != null)
            return false;
        if (layoutsArithmeticMean != null ? !layoutsArithmeticMean.equals(that.layoutsArithmeticMean) : that.layoutsArithmeticMean != null)
            return false;
        if (layoutsModus != null ? !layoutsModus.equals(that.layoutsModus) : that.layoutsModus != null) return false;
        if (layoutsMedian != null ? !layoutsMedian.equals(that.layoutsMedian) : that.layoutsMedian != null)
            return false;
        if (layoutsMax != null ? !layoutsMax.equals(that.layoutsMax) : that.layoutsMax != null) return false;
        if (layoutsMin != null ? !layoutsMin.equals(that.layoutsMin) : that.layoutsMin != null) return false;
        if (layoutsVariance != null ? !layoutsVariance.equals(that.layoutsVariance) : that.layoutsVariance != null)
            return false;
        if (layoutsDeviation != null ? !layoutsDeviation.equals(that.layoutsDeviation) : that.layoutsDeviation != null)
            return false;
        if (apksWithLayoutsObtainedSuccessfullyNonZero != null ? !apksWithLayoutsObtainedSuccessfullyNonZero.equals(that.apksWithLayoutsObtainedSuccessfullyNonZero) : that.apksWithLayoutsObtainedSuccessfullyNonZero != null)
            return false;
        if (layoutsArithmeticMeanNonZero != null ? !layoutsArithmeticMeanNonZero.equals(that.layoutsArithmeticMeanNonZero) : that.layoutsArithmeticMeanNonZero != null)
            return false;
        if (layoutsModusNonZero != null ? !layoutsModusNonZero.equals(that.layoutsModusNonZero) : that.layoutsModusNonZero != null)
            return false;
        if (layoutsMedianNonZero != null ? !layoutsMedianNonZero.equals(that.layoutsMedianNonZero) : that.layoutsMedianNonZero != null)
            return false;
        if (layoutsMaxNonZero != null ? !layoutsMaxNonZero.equals(that.layoutsMaxNonZero) : that.layoutsMaxNonZero != null)
            return false;
        if (layoutsMinNonZero != null ? !layoutsMinNonZero.equals(that.layoutsMinNonZero) : that.layoutsMinNonZero != null)
            return false;
        if (layoutsVarianceNonZero != null ? !layoutsVarianceNonZero.equals(that.layoutsVarianceNonZero) : that.layoutsVarianceNonZero != null)
            return false;
        if (layoutsDeviationNonZero != null ? !layoutsDeviationNonZero.equals(that.layoutsDeviationNonZero) : that.layoutsDeviationNonZero != null)
            return false;
        if (apksWithDifferentLayoutsObtainedSuccessfully != null ? !apksWithDifferentLayoutsObtainedSuccessfully.equals(that.apksWithDifferentLayoutsObtainedSuccessfully) : that.apksWithDifferentLayoutsObtainedSuccessfully != null)
            return false;
        if (differentLayoutsArithmeticMean != null ? !differentLayoutsArithmeticMean.equals(that.differentLayoutsArithmeticMean) : that.differentLayoutsArithmeticMean != null)
            return false;
        if (differentLayoutsModus != null ? !differentLayoutsModus.equals(that.differentLayoutsModus) : that.differentLayoutsModus != null)
            return false;
        if (differentLayoutsMedian != null ? !differentLayoutsMedian.equals(that.differentLayoutsMedian) : that.differentLayoutsMedian != null)
            return false;
        if (differentLayoutsMax != null ? !differentLayoutsMax.equals(that.differentLayoutsMax) : that.differentLayoutsMax != null)
            return false;
        if (differentLayoutsMin != null ? !differentLayoutsMin.equals(that.differentLayoutsMin) : that.differentLayoutsMin != null)
            return false;
        if (differentLayoutsVariance != null ? !differentLayoutsVariance.equals(that.differentLayoutsVariance) : that.differentLayoutsVariance != null)
            return false;
        if (differentLayoutsDeviation != null ? !differentLayoutsDeviation.equals(that.differentLayoutsDeviation) : that.differentLayoutsDeviation != null)
            return false;
        if (apksWithDifferentLayoutsObtainedSuccessfullyNonZero != null ? !apksWithDifferentLayoutsObtainedSuccessfullyNonZero.equals(that.apksWithDifferentLayoutsObtainedSuccessfullyNonZero) : that.apksWithDifferentLayoutsObtainedSuccessfullyNonZero != null)
            return false;
        if (differentLayoutsArithmeticMeanNonZero != null ? !differentLayoutsArithmeticMeanNonZero.equals(that.differentLayoutsArithmeticMeanNonZero) : that.differentLayoutsArithmeticMeanNonZero != null)
            return false;
        if (differentLayoutsModusNonZero != null ? !differentLayoutsModusNonZero.equals(that.differentLayoutsModusNonZero) : that.differentLayoutsModusNonZero != null)
            return false;
        if (differentLayoutsMedianNonZero != null ? !differentLayoutsMedianNonZero.equals(that.differentLayoutsMedianNonZero) : that.differentLayoutsMedianNonZero != null)
            return false;
        if (differentLayoutsMaxNonZero != null ? !differentLayoutsMaxNonZero.equals(that.differentLayoutsMaxNonZero) : that.differentLayoutsMaxNonZero != null)
            return false;
        if (differentLayoutsMinNonZero != null ? !differentLayoutsMinNonZero.equals(that.differentLayoutsMinNonZero) : that.differentLayoutsMinNonZero != null)
            return false;
        if (differentLayoutsVarianceNonZero != null ? !differentLayoutsVarianceNonZero.equals(that.differentLayoutsVarianceNonZero) : that.differentLayoutsVarianceNonZero != null)
            return false;
        if (differentLayoutsDeviationNonZero != null ? !differentLayoutsDeviationNonZero.equals(that.differentLayoutsDeviationNonZero) : that.differentLayoutsDeviationNonZero != null)
            return false;
        if (apksWithMenusObtainedSuccessfully != null ? !apksWithMenusObtainedSuccessfully.equals(that.apksWithMenusObtainedSuccessfully) : that.apksWithMenusObtainedSuccessfully != null)
            return false;
        if (menusArithmeticMean != null ? !menusArithmeticMean.equals(that.menusArithmeticMean) : that.menusArithmeticMean != null)
            return false;
        if (menusModus != null ? !menusModus.equals(that.menusModus) : that.menusModus != null) return false;
        if (menusMedian != null ? !menusMedian.equals(that.menusMedian) : that.menusMedian != null) return false;
        if (menusMax != null ? !menusMax.equals(that.menusMax) : that.menusMax != null) return false;
        if (menusMin != null ? !menusMin.equals(that.menusMin) : that.menusMin != null) return false;
        if (menusVariance != null ? !menusVariance.equals(that.menusVariance) : that.menusVariance != null)
            return false;
        if (menusDeviation != null ? !menusDeviation.equals(that.menusDeviation) : that.menusDeviation != null)
            return false;
        if (apksWithMenusObtainedSuccessfullyNonZero != null ? !apksWithMenusObtainedSuccessfullyNonZero.equals(that.apksWithMenusObtainedSuccessfullyNonZero) : that.apksWithMenusObtainedSuccessfullyNonZero != null)
            return false;
        if (menusArithmeticMeanNonZero != null ? !menusArithmeticMeanNonZero.equals(that.menusArithmeticMeanNonZero) : that.menusArithmeticMeanNonZero != null)
            return false;
        if (menusModusNonZero != null ? !menusModusNonZero.equals(that.menusModusNonZero) : that.menusModusNonZero != null)
            return false;
        if (menusMedianNonZero != null ? !menusMedianNonZero.equals(that.menusMedianNonZero) : that.menusMedianNonZero != null)
            return false;
        if (menusMaxNonZero != null ? !menusMaxNonZero.equals(that.menusMaxNonZero) : that.menusMaxNonZero != null)
            return false;
        if (menusMinNonZero != null ? !menusMinNonZero.equals(that.menusMinNonZero) : that.menusMinNonZero != null)
            return false;
        if (menusVarianceNonZero != null ? !menusVarianceNonZero.equals(that.menusVarianceNonZero) : that.menusVarianceNonZero != null)
            return false;
        if (menusDeviationNonZero != null ? !menusDeviationNonZero.equals(that.menusDeviationNonZero) : that.menusDeviationNonZero != null)
            return false;
        if (apksWithRawResourcesObtainedSuccessfully != null ? !apksWithRawResourcesObtainedSuccessfully.equals(that.apksWithRawResourcesObtainedSuccessfully) : that.apksWithRawResourcesObtainedSuccessfully != null)
            return false;
        if (rawResourcesArithmeticMean != null ? !rawResourcesArithmeticMean.equals(that.rawResourcesArithmeticMean) : that.rawResourcesArithmeticMean != null)
            return false;
        if (rawResourcesModus != null ? !rawResourcesModus.equals(that.rawResourcesModus) : that.rawResourcesModus != null)
            return false;
        if (rawResourcesMedian != null ? !rawResourcesMedian.equals(that.rawResourcesMedian) : that.rawResourcesMedian != null)
            return false;
        if (rawResourcesMax != null ? !rawResourcesMax.equals(that.rawResourcesMax) : that.rawResourcesMax != null)
            return false;
        if (rawResourcesMin != null ? !rawResourcesMin.equals(that.rawResourcesMin) : that.rawResourcesMin != null)
            return false;
        if (rawResourcesVariance != null ? !rawResourcesVariance.equals(that.rawResourcesVariance) : that.rawResourcesVariance != null)
            return false;
        if (rawResourcesDeviation != null ? !rawResourcesDeviation.equals(that.rawResourcesDeviation) : that.rawResourcesDeviation != null)
            return false;
        if (apksWithRawResourcesObtainedSuccessfullyNonZero != null ? !apksWithRawResourcesObtainedSuccessfullyNonZero.equals(that.apksWithRawResourcesObtainedSuccessfullyNonZero) : that.apksWithRawResourcesObtainedSuccessfullyNonZero != null)
            return false;
        if (rawResourcesArithmeticMeanNonZero != null ? !rawResourcesArithmeticMeanNonZero.equals(that.rawResourcesArithmeticMeanNonZero) : that.rawResourcesArithmeticMeanNonZero != null)
            return false;
        if (rawResourcesModusNonZero != null ? !rawResourcesModusNonZero.equals(that.rawResourcesModusNonZero) : that.rawResourcesModusNonZero != null)
            return false;
        if (rawResourcesMedianNonZero != null ? !rawResourcesMedianNonZero.equals(that.rawResourcesMedianNonZero) : that.rawResourcesMedianNonZero != null)
            return false;
        if (rawResourcesMaxNonZero != null ? !rawResourcesMaxNonZero.equals(that.rawResourcesMaxNonZero) : that.rawResourcesMaxNonZero != null)
            return false;
        if (rawResourcesMinNonZero != null ? !rawResourcesMinNonZero.equals(that.rawResourcesMinNonZero) : that.rawResourcesMinNonZero != null)
            return false;
        if (rawResourcesVarianceNonZero != null ? !rawResourcesVarianceNonZero.equals(that.rawResourcesVarianceNonZero) : that.rawResourcesVarianceNonZero != null)
            return false;
        return !(rawResourcesDeviationNonZero != null ? !rawResourcesDeviationNonZero.equals(that.rawResourcesDeviationNonZero) : that.rawResourcesDeviationNonZero != null);

    }

    @Override
    public int hashCode() {
        int result = analyzedApks != null ? analyzedApks.hashCode() : 0;
        result = 31 * result + (apksWithLayoutsObtainedSuccessfully != null ? apksWithLayoutsObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (layoutsArithmeticMean != null ? layoutsArithmeticMean.hashCode() : 0);
        result = 31 * result + (layoutsModus != null ? layoutsModus.hashCode() : 0);
        result = 31 * result + (layoutsMedian != null ? layoutsMedian.hashCode() : 0);
        result = 31 * result + (layoutsMax != null ? layoutsMax.hashCode() : 0);
        result = 31 * result + (layoutsMin != null ? layoutsMin.hashCode() : 0);
        result = 31 * result + (layoutsVariance != null ? layoutsVariance.hashCode() : 0);
        result = 31 * result + (layoutsDeviation != null ? layoutsDeviation.hashCode() : 0);
        result = 31 * result + (apksWithLayoutsObtainedSuccessfullyNonZero != null ? apksWithLayoutsObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (layoutsArithmeticMeanNonZero != null ? layoutsArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (layoutsModusNonZero != null ? layoutsModusNonZero.hashCode() : 0);
        result = 31 * result + (layoutsMedianNonZero != null ? layoutsMedianNonZero.hashCode() : 0);
        result = 31 * result + (layoutsMaxNonZero != null ? layoutsMaxNonZero.hashCode() : 0);
        result = 31 * result + (layoutsMinNonZero != null ? layoutsMinNonZero.hashCode() : 0);
        result = 31 * result + (layoutsVarianceNonZero != null ? layoutsVarianceNonZero.hashCode() : 0);
        result = 31 * result + (layoutsDeviationNonZero != null ? layoutsDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithDifferentLayoutsObtainedSuccessfully != null ? apksWithDifferentLayoutsObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (differentLayoutsArithmeticMean != null ? differentLayoutsArithmeticMean.hashCode() : 0);
        result = 31 * result + (differentLayoutsModus != null ? differentLayoutsModus.hashCode() : 0);
        result = 31 * result + (differentLayoutsMedian != null ? differentLayoutsMedian.hashCode() : 0);
        result = 31 * result + (differentLayoutsMax != null ? differentLayoutsMax.hashCode() : 0);
        result = 31 * result + (differentLayoutsMin != null ? differentLayoutsMin.hashCode() : 0);
        result = 31 * result + (differentLayoutsVariance != null ? differentLayoutsVariance.hashCode() : 0);
        result = 31 * result + (differentLayoutsDeviation != null ? differentLayoutsDeviation.hashCode() : 0);
        result = 31 * result + (apksWithDifferentLayoutsObtainedSuccessfullyNonZero != null ? apksWithDifferentLayoutsObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsArithmeticMeanNonZero != null ? differentLayoutsArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsModusNonZero != null ? differentLayoutsModusNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsMedianNonZero != null ? differentLayoutsMedianNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsMaxNonZero != null ? differentLayoutsMaxNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsMinNonZero != null ? differentLayoutsMinNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsVarianceNonZero != null ? differentLayoutsVarianceNonZero.hashCode() : 0);
        result = 31 * result + (differentLayoutsDeviationNonZero != null ? differentLayoutsDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithMenusObtainedSuccessfully != null ? apksWithMenusObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (menusArithmeticMean != null ? menusArithmeticMean.hashCode() : 0);
        result = 31 * result + (menusModus != null ? menusModus.hashCode() : 0);
        result = 31 * result + (menusMedian != null ? menusMedian.hashCode() : 0);
        result = 31 * result + (menusMax != null ? menusMax.hashCode() : 0);
        result = 31 * result + (menusMin != null ? menusMin.hashCode() : 0);
        result = 31 * result + (menusVariance != null ? menusVariance.hashCode() : 0);
        result = 31 * result + (menusDeviation != null ? menusDeviation.hashCode() : 0);
        result = 31 * result + (apksWithMenusObtainedSuccessfullyNonZero != null ? apksWithMenusObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (menusArithmeticMeanNonZero != null ? menusArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (menusModusNonZero != null ? menusModusNonZero.hashCode() : 0);
        result = 31 * result + (menusMedianNonZero != null ? menusMedianNonZero.hashCode() : 0);
        result = 31 * result + (menusMaxNonZero != null ? menusMaxNonZero.hashCode() : 0);
        result = 31 * result + (menusMinNonZero != null ? menusMinNonZero.hashCode() : 0);
        result = 31 * result + (menusVarianceNonZero != null ? menusVarianceNonZero.hashCode() : 0);
        result = 31 * result + (menusDeviationNonZero != null ? menusDeviationNonZero.hashCode() : 0);
        result = 31 * result + (apksWithRawResourcesObtainedSuccessfully != null ? apksWithRawResourcesObtainedSuccessfully.hashCode() : 0);
        result = 31 * result + (rawResourcesArithmeticMean != null ? rawResourcesArithmeticMean.hashCode() : 0);
        result = 31 * result + (rawResourcesModus != null ? rawResourcesModus.hashCode() : 0);
        result = 31 * result + (rawResourcesMedian != null ? rawResourcesMedian.hashCode() : 0);
        result = 31 * result + (rawResourcesMax != null ? rawResourcesMax.hashCode() : 0);
        result = 31 * result + (rawResourcesMin != null ? rawResourcesMin.hashCode() : 0);
        result = 31 * result + (rawResourcesVariance != null ? rawResourcesVariance.hashCode() : 0);
        result = 31 * result + (rawResourcesDeviation != null ? rawResourcesDeviation.hashCode() : 0);
        result = 31 * result + (apksWithRawResourcesObtainedSuccessfullyNonZero != null ? apksWithRawResourcesObtainedSuccessfullyNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesArithmeticMeanNonZero != null ? rawResourcesArithmeticMeanNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesModusNonZero != null ? rawResourcesModusNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesMedianNonZero != null ? rawResourcesMedianNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesMaxNonZero != null ? rawResourcesMaxNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesMinNonZero != null ? rawResourcesMinNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesVarianceNonZero != null ? rawResourcesVarianceNonZero.hashCode() : 0);
        result = 31 * result + (rawResourcesDeviationNonZero != null ? rawResourcesDeviationNonZero.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ResourceStatistics{" +
                "analyzedApks=" + analyzedApks +
                ", apksWithLayoutsObtainedSuccessfully=" + apksWithLayoutsObtainedSuccessfully +
                ", layoutsArithmeticMean=" + layoutsArithmeticMean +
                ", layoutsModus=" + layoutsModus +
                ", layoutsMedian=" + layoutsMedian +
                ", layoutsMax=" + layoutsMax +
                ", layoutsMin=" + layoutsMin +
                ", layoutsVariance=" + layoutsVariance +
                ", layoutsDeviation=" + layoutsDeviation +
                ", apksWithLayoutsObtainedSuccessfullyNonZero=" + apksWithLayoutsObtainedSuccessfullyNonZero +
                ", layoutsArithmeticMeanNonZero=" + layoutsArithmeticMeanNonZero +
                ", layoutsModusNonZero=" + layoutsModusNonZero +
                ", layoutsMedianNonZero=" + layoutsMedianNonZero +
                ", layoutsMaxNonZero=" + layoutsMaxNonZero +
                ", layoutsMinNonZero=" + layoutsMinNonZero +
                ", layoutsVarianceNonZero=" + layoutsVarianceNonZero +
                ", layoutsDeviationNonZero=" + layoutsDeviationNonZero +
                ", apksWithDifferentLayoutsObtainedSuccessfully=" + apksWithDifferentLayoutsObtainedSuccessfully +
                ", differentLayoutsArithmeticMean=" + differentLayoutsArithmeticMean +
                ", differentLayoutsModus=" + differentLayoutsModus +
                ", differentLayoutsMedian=" + differentLayoutsMedian +
                ", differentLayoutsMax=" + differentLayoutsMax +
                ", differentLayoutsMin=" + differentLayoutsMin +
                ", differentLayoutsVariance=" + differentLayoutsVariance +
                ", differentLayoutsDeviation=" + differentLayoutsDeviation +
                ", apksWithDifferentLayoutsObtainedSuccessfullyNonZero=" + apksWithDifferentLayoutsObtainedSuccessfullyNonZero +
                ", differentLayoutsArithmeticMeanNonZero=" + differentLayoutsArithmeticMeanNonZero +
                ", differentLayoutsModusNonZero=" + differentLayoutsModusNonZero +
                ", differentLayoutsMedianNonZero=" + differentLayoutsMedianNonZero +
                ", differentLayoutsMaxNonZero=" + differentLayoutsMaxNonZero +
                ", differentLayoutsMinNonZero=" + differentLayoutsMinNonZero +
                ", differentLayoutsVarianceNonZero=" + differentLayoutsVarianceNonZero +
                ", differentLayoutsDeviationNonZero=" + differentLayoutsDeviationNonZero +
                ", apksWithMenusObtainedSuccessfully=" + apksWithMenusObtainedSuccessfully +
                ", menusArithmeticMean=" + menusArithmeticMean +
                ", menusModus=" + menusModus +
                ", menusMedian=" + menusMedian +
                ", menusMax=" + menusMax +
                ", menusMin=" + menusMin +
                ", menusVariance=" + menusVariance +
                ", menusDeviation=" + menusDeviation +
                ", apksWithMenusObtainedSuccessfullyNonZero=" + apksWithMenusObtainedSuccessfullyNonZero +
                ", menusArithmeticMeanNonZero=" + menusArithmeticMeanNonZero +
                ", menusModusNonZero=" + menusModusNonZero +
                ", menusMedianNonZero=" + menusMedianNonZero +
                ", menusMaxNonZero=" + menusMaxNonZero +
                ", menusMinNonZero=" + menusMinNonZero +
                ", menusVarianceNonZero=" + menusVarianceNonZero +
                ", menusDeviationNonZero=" + menusDeviationNonZero +
                ", apksWithRawResourcesObtainedSuccessfully=" + apksWithRawResourcesObtainedSuccessfully +
                ", rawResourcesArithmeticMean=" + rawResourcesArithmeticMean +
                ", rawResourcesModus=" + rawResourcesModus +
                ", rawResourcesMedian=" + rawResourcesMedian +
                ", rawResourcesMax=" + rawResourcesMax +
                ", rawResourcesMin=" + rawResourcesMin +
                ", rawResourcesVariance=" + rawResourcesVariance +
                ", rawResourcesDeviation=" + rawResourcesDeviation +
                ", apksWithRawResourcesObtainedSuccessfullyNonZero=" + apksWithRawResourcesObtainedSuccessfullyNonZero +
                ", rawResourcesArithmeticMeanNonZero=" + rawResourcesArithmeticMeanNonZero +
                ", rawResourcesModusNonZero=" + rawResourcesModusNonZero +
                ", rawResourcesMedianNonZero=" + rawResourcesMedianNonZero +
                ", rawResourcesMaxNonZero=" + rawResourcesMaxNonZero +
                ", rawResourcesMinNonZero=" + rawResourcesMinNonZero +
                ", rawResourcesVarianceNonZero=" + rawResourcesVarianceNonZero +
                ", rawResourcesDeviationNonZero=" + rawResourcesDeviationNonZero +
                '}';
    }
}

