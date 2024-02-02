package com.AME.Agreements.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BusinessLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long businesslineId;
    private String businesslineName;
    private BigDecimal businessValue;
    private boolean isActive;
    private boolean isDigital;
    
    @ManyToOne
    @JoinColumn(name = "projectId")
    private Agreement agreement;


}
