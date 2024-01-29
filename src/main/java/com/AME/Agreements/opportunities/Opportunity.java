package com.AME.Agreements.opportunities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Opportunity implements Serializable {
    @Id
    private int opportunityId;
    private String opportunityOwner;
    private String country;
    private Date bidduedate;

}
