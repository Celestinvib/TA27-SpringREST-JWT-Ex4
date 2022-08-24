package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Team;
import com.crud.h2.service.TeamServiceImpl;

@RestController
@RequestMapping("/api")
public class TeamController {
	@Autowired
	TeamServiceImpl teamServiceImpl;
	
	@GetMapping("/equipos")
	public List<Team> listTeams(){
		return teamServiceImpl.listTeams();
	}
	
	@PostMapping("/equipos")
	public Team saveTeam(@RequestBody Team team) {
		
		return teamServiceImpl.saveTeam(team);
	}
	
	@GetMapping("/equipos/{id}")
	public Team teamXID(@PathVariable(name="id") Long id) {
		
		Team team_xid= new Team();
		
		team_xid= teamServiceImpl.teamXID(id);
		
		System.out.println("Equipo XID: "+team_xid);
		
		return team_xid;
	}
	
	@PutMapping("/equipos/{id}")
	public Team updateTeam(@PathVariable(name="id")Long id,@RequestBody Team team) {
		
		Team teamSelected= new Team();
		Team teamUpdated = new Team();
		
		teamSelected= teamServiceImpl.teamXID(id);
		
		teamSelected.setName(team.getName());
		teamSelected.setSerialNum(team.getSerialNum());
		teamSelected.setFaculty(team.getFaculty());
		
		teamUpdated = teamServiceImpl.updateTeam(teamSelected);
		
		System.out.println("El equipo actualizado es: "+ teamUpdated);
		
		return teamUpdated;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void deleteTeam(@PathVariable(name="id")Long id) {
		teamServiceImpl.deleteTeam(id);
	}	
}
