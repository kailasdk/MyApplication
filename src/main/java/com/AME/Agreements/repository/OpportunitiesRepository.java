package com.AME.Agreements.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.AME.Agreements.model.Opportunity;

public interface OpportunitiesRepository extends CrudRepository<Opportunity,Integer>{
    List<Opportunity> getByOpportunityId(int opportunityId);
}