package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Investigator;

public interface IInvestigatorDAO  extends JpaRepository<Investigator, Long>{

}
