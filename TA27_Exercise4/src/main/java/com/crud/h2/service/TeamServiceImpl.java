package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ITeamDAO;
import com.crud.h2.dto.Team;

@Service
public class TeamServiceImpl  implements ITeamService{
		//We use the methods of the IItemDAO interface, it is as if we were instantiating.
		@Autowired
		ITeamDAO iTeamDAO;
		
		@Override
		public List<Team> listTeams() {
			
			return iTeamDAO.findAll();
		}

		@Override
		public Team saveTeam(Team team) {
			return iTeamDAO.save(team);
		}

		@Override
		public Team teamXID(Long id) {
			return iTeamDAO.findById(id).get();
		}

		@Override
		public Team updateTeam(Team team) {
			return iTeamDAO.save(team);
		}

		@Override
		public void deleteTeam(Long id) {
			iTeamDAO.deleteById(id);		
		}
}
