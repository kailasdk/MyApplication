package com.AME.Agreements.repository;

import org.springframework.data.repository.CrudRepository;

import com.AME.Agreements.model.Agreement;

// import com.AME.Agreements.Businessline.BusinessLine;

public interface AgreementRepository extends CrudRepository<Agreement,Integer> {

}
