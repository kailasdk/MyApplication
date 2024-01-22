package com.AME.Agreements.businessline;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BusinessLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long businesslineId;
    private String businesslineName;
    private BigDecimal businessValue;
    private boolean isActive;
    private boolean isDigital;

    public BusinessLine() {
    }

    public BusinessLine(long businesslineId, String businesslineName, BigDecimal businessValue, boolean isActive, boolean isDigital) {
        this.businesslineId = businesslineId;
        this.businesslineName = businesslineName;
        this.businessValue = businessValue;
        this.isActive = isActive;
        this.isDigital = isDigital;
    }

    public long getBusinesslineId() {
        return this.businesslineId;
    }

    public void setBusinesslineId(long businesslineId) {
        this.businesslineId = businesslineId;
    }

    public String getBusinesslineName() {
        return this.businesslineName;
    }

    public void setBusinesslineName(String businesslineName) {
        this.businesslineName = businesslineName;
    }

    public BigDecimal getBusinessValue() {
        return this.businessValue;
    }

    public void setBusinessValue(BigDecimal businessValue) {
        this.businessValue = businessValue;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsDigital() {
        return this.isDigital;
    }

    public boolean getIsDigital() {
        return this.isDigital;
    }

    public void setIsDigital(boolean isDigital) {
        this.isDigital = isDigital;
    }

    public BusinessLine businesslineId(long businesslineId) {
        setBusinesslineId(businesslineId);
        return this;
    }

    public BusinessLine businesslineName(String businesslineName) {
        setBusinesslineName(businesslineName);
        return this;
    }

    public BusinessLine businessValue(BigDecimal businessValue) {
        setBusinessValue(businessValue);
        return this;
    }

    public BusinessLine isActive(boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    public BusinessLine isDigital(boolean isDigital) {
        setIsDigital(isDigital);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BusinessLine)) {
            return false;
        }
        BusinessLine businessLine = (BusinessLine) o;
        return businesslineId == businessLine.businesslineId && Objects.equals(businesslineName, businessLine.businesslineName) && Objects.equals(businessValue, businessLine.businessValue) && isActive == businessLine.isActive && isDigital == businessLine.isDigital;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businesslineId, businesslineName, businessValue, isActive, isDigital);
    }

    @Override
    public String toString() {
        return "{" +
            " businesslineId='" + getBusinesslineId() + "'" +
            ", businesslineName='" + getBusinesslineName() + "'" +
            ", businessValue='" + getBusinessValue() + "'" +
            ", isActive='" + isIsActive() + "'" +
            ", isDigital='" + isIsDigital() + "'" +
            "}";
    }
}
