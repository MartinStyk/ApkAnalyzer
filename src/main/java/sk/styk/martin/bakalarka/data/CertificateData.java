package sk.styk.martin.bakalarka.data;

import java.util.Date;

/**
 * Created by Martin Styk on 27.11.2015.
 */
public class CertificateData {
    private String fileName;
    private String signAlgorithm;
    private String signAlgorithmOID;
    private Date startDate;
    private Date endDate;
    private String certBase64Md5;
    private String certMd5;
    private String publicKey;
    private Integer version;
    private String issuerName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public String getSignAlgorithmOID() {
        return signAlgorithmOID;
    }

    public void setSignAlgorithmOID(String signAlgorithmOID) {
        this.signAlgorithmOID = signAlgorithmOID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    public String getCertBase64Md5() {
        return certBase64Md5;
    }

    public void setCertBase64Md5(String certBase64Md5) {
        this.certBase64Md5 = certBase64Md5;
    }

    public String getCertMd5() {
        return certMd5;
    }

    public void setCertMd5(String certMd5) {
        this.certMd5 = certMd5;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    public String toString() {
        return "CertificateData{" +
                "fileName='" + fileName + '\'' +
                ", signAlgorithm='" + signAlgorithm + '\'' +
                ", signAlgorithmOID='" + signAlgorithmOID + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", certBase64Md5='" + certBase64Md5 + '\'' +
                ", certMd5='" + certMd5 + '\'' +
                ", version=" + version +
                ", issuerName='" + issuerName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertificateData that = (CertificateData) o;

        if (signAlgorithm != null ? !signAlgorithm.equals(that.signAlgorithm) : that.signAlgorithm != null)
            return false;
        if (signAlgorithmOID != null ? !signAlgorithmOID.equals(that.signAlgorithmOID) : that.signAlgorithmOID != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (certBase64Md5 != null ? !certBase64Md5.equals(that.certBase64Md5) : that.certBase64Md5 != null)
            return false;
        if (certMd5 != null ? !certMd5.equals(that.certMd5) : that.certMd5 != null) return false;
        if (publicKey != null ? !publicKey.equals(that.publicKey) : that.publicKey != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        return !(issuerName != null ? !issuerName.equals(that.issuerName) : that.issuerName != null);

    }

    @Override
    public int hashCode() {
        int result = signAlgorithm != null ? signAlgorithm.hashCode() : 0;
        result = 31 * result + (signAlgorithmOID != null ? signAlgorithmOID.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (certBase64Md5 != null ? certBase64Md5.hashCode() : 0);
        result = 31 * result + (certMd5 != null ? certMd5.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (issuerName != null ? issuerName.hashCode() : 0);
        return result;
    }
}
