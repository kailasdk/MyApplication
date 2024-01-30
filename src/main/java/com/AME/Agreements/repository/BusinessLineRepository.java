package com.AME.Agreements.repository;

import org.springframework.data.repository.CrudRepository;

import com.AME.Agreements.model.BusinessLine;

import java.util.List;


public interface BusinessLineRepository extends CrudRepository<BusinessLine,Integer> {

        List<BusinessLine> getByBusinesslineId(long businesslineId);
        List<BusinessLine> getByBusinesslineName(String businesslineName);
}
