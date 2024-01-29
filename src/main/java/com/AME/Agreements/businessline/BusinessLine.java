package com.AME.Agreements.businessline;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

}
