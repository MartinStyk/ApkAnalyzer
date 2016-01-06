package sk.styk.martin.bakalarka.analyze.data;

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
    private String publicKeyMd5;
    private String certBase64Md5;
    private String certMd5;
    private Integer version;
    private String issuerName;
    private String subjectName;

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

    public String getPublicKeyMd5() {
        return publicKeyMd5;
    }

    public void setPublicKeyMd5(String publicKeyMd5) {
        this.publicKeyMd5 = publicKeyMd5;
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

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "CertificateData{" +
                "fileName='" + fileName + '\'' +
                ", signAlgorithm='" + signAlgorithm + '\'' +
                ", signAlgorithmOID='" + signAlgorithmOID + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", publicKeyMd5='" + publicKeyMd5 + '\'' +
                ", certBase64Md5='" + certBase64Md5 + '\'' +
                ", certMd5='" + certMd5 + '\'' +
                ", version=" + version +
                ", issuerName='" + issuerName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CertificateData that = (CertificateData) o;

        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (signAlgorithm != null ? !signAlgorithm.equals(that.signAlgorithm) : that.signAlgorithm != null)
            return false;
        if (signAlgorithmOID != null ? !signAlgorithmOID.equals(that.signAlgorithmOID) : that.signAlgorithmOID != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (publicKeyMd5 != null ? !publicKeyMd5.equals(that.publicKeyMd5) : that.publicKeyMd5 != null) return false;
        if (certBase64Md5 != null ? !certBase64Md5.equals(that.certBase64Md5) : that.certBase64Md5 != null)
            return false;
        if (certMd5 != null ? !certMd5.equals(that.certMd5) : that.certMd5 != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (issuerName != null ? !issuerName.equals(that.issuerName) : that.issuerName != null) return false;
        return !(subjectName != null ? !subjectName.equals(that.subjectName) : that.subjectName != null);

    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + (signAlgorithm != null ? signAlgorithm.hashCode() : 0);
        result = 31 * result + (signAlgorithmOID != null ? signAlgorithmOID.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (publicKeyMd5 != null ? publicKeyMd5.hashCode() : 0);
        result = 31 * result + (certBase64Md5 != null ? certBase64Md5.hashCode() : 0);
        result = 31 * result + (certMd5 != null ? certMd5.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (issuerName != null ? issuerName.hashCode() : 0);
        result = 31 * result + (subjectName != null ? subjectName.hashCode() : 0);
        return result;
    }
}
