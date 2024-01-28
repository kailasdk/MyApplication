package com.AME.Agreements.businessline;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface BusinessLineRepository extends CrudRepository<BusinessLine,Integer> {

        List<BusinessLine> getByBusinesslineId(long businesslineId);
        List<BusinessLine> getByBusinesslineName(String businesslineName);
}
