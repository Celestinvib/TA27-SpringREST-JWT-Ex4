package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Faculty;

public interface IFacultyDAO  extends JpaRepository<Faculty, Long>{

}
