package com.AME.Agreements.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

// import com.AME.Agreements.Businessline.BusinessLine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Agreement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    BusinessLine businessLines;
    
    public Agreement(int opportunityId, String country, Date bidDuDate,BusinessLine businessLine) {
        
        this.c4cId = opportunityId;
        this.country = country;
        this.bidDueDate = bidDuDate;
        this.businessLines=businessLine;
    }
}
