package com.AME.Agreements.opportunities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Opportunity implements Serializable{
    @Id
    private int opportunityId;
    private String opportunityOwner;
    private String country;
    private Date bidduedate;
    

    public Opportunity() {
    }

    public Opportunity(int opportunityId, String opportunityOwner, String country, Date bidduedate) {
        this.opportunityId = opportunityId;
        this.opportunityOwner = opportunityOwner;
        this.country = country;
        this.bidduedate = bidduedate;
    }

    public int getOpportunityId() {
        return this.opportunityId;
    }

    public void setOpportunityId(int opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getOpportunityOwner() {
        return this.opportunityOwner;
    }

    public void setOpportunityOwner(String opportunityOwner) {
        this.opportunityOwner = opportunityOwner;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBidduedate() {
        return this.bidduedate;
    }

    public void setBidduedate(Date bidduedate) {
        this.bidduedate = bidduedate;
    }

    public Opportunity opportunityId(int opportunityId) {
        setOpportunityId(opportunityId);
        return this;
    }

    public Opportunity opportunityOwner(String opportunityOwner) {
        setOpportunityOwner(opportunityOwner);
        return this;
    }

    public Opportunity country(String country) {
        setCountry(country);
        return this;
    }

    public Opportunity bidduedate(Date bidduedate) {
        setBidduedate(bidduedate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Opportunity)) {
            return false;
        }
        Opportunity opportunity = (Opportunity) o;
        return opportunityId == opportunity.opportunityId && Objects.equals(opportunityOwner, opportunity.opportunityOwner) && Objects.equals(country, opportunity.country) && Objects.equals(bidduedate, opportunity.bidduedate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opportunityId, opportunityOwner, country, bidduedate);
    }

    @Override
    public String toString() {
        return "{" +
            " opportunityId='" + getOpportunityId() + "'" +
            ", opportunityOwner='" + getOpportunityOwner() + "'" +
            ", country='" + getCountry() + "'" +
            ", bidduedate='" + getBidduedate() + "'" +
            "}";
    }
    }
