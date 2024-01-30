package com.AME.Agreements.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class Opportunity implements Serializable {
    @Id
    private int opportunityId;
    private String opportunityOwner;
    private String country;
    private Date bidduedate;
 
    private BusinessLine businessLine;
}
