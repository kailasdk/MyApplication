package com.AME.Agreements.Agreement;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

// import com.AME.Agreements.Businessline.BusinessLine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agreement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int projectId;
    // BusinessLine businessLine;
    int agreementNumber;
    String projectName;
    String geoUnit;
    Date bidDueDate;
    int c4cId;
    String country;
    boolean isDelfi;
    boolean isDigital;
    boolean isFP226;
    boolean isMultiBusinessline;
    String stage;
    BigDecimal TotalOpportunityValue;

    public Agreement() {
    }
    public int getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(int agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public String getProjectName() {

   
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getGeoUnit() {
        return geoUnit;
    }

    public void setGeoUnit(String geoUnit) {
        this.geoUnit = geoUnit;
    }

    public Date getBidDueDate() {
        return bidDueDate;
    }

    public void setBidDueDate(Date bidDueDate) {
        this.bidDueDate = bidDueDate;
    }

    // public BusinessLine getBusinessLine() {
    //     return businessLine;
    // }

    // public void setBusinessLine(BusinessLine businessLine) {
    //     this.businessLine = businessLine;
    // }

    public int getC4cId() {
        return c4cId;
    }

    public void setC4cId(int c4cId) {
        this.c4cId = c4cId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDelfi() {
        return isDelfi;
    }

    public void setDelfi(boolean isDelfi) {
        this.isDelfi = isDelfi;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean isDigital) {
        this.isDigital = isDigital;
    }

    public boolean isFP226() {
        return isFP226;
    }

    public void setFP226(boolean isFP226) {
        this.isFP226 = isFP226;
    }

    public boolean isMultiBusinessline() {
        return isMultiBusinessline;
    }

    public void setMultiBusinessline(boolean isMultiBusinessline) {
        this.isMultiBusinessline = isMultiBusinessline;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public BigDecimal getTotalOpportunityValue() {
        return TotalOpportunityValue;
    }

    public void setTotalOpportunityValue(BigDecimal totalOpportunityValue) {
        TotalOpportunityValue = totalOpportunityValue;
    }

}
