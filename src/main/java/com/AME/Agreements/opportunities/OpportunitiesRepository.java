package com.AME.Agreements.opportunities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OpportunitiesRepository extends CrudRepository<Opportunity,Integer>{
    List<Opportunity> getByOpportunityId(int opportunityId);
}