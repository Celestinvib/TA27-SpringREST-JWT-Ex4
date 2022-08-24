package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Team;

public interface ITeamService {
	//CRUD methods
	public List<Team> listTeams(); //List All 
	
	public Team saveTeam(Team team);//Save a new team "CREATE"
	
	public Team teamXID(Long id); //Read data from a team "READ"
			
	public Team updateTeam(Team team); //Update team data "UPDATE"
	
	public void deleteTeam(Long id);// Delete a team via id "DELETE"
}
