package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Team;

public interface ITeamDAO  extends JpaRepository<Team, Long>{

}
