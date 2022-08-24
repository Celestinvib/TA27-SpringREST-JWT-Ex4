package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Investigator;

public interface IInvestigatorService {
	//CRUD methods
	public List<Investigator> listInvestigators(); //List All 
	
	public Investigator saveInvestigator(Investigator investigator);//Save a new investigator "CREATE"
	
	public Investigator investigatorXID(Long id); //Read data from a investigator "READ"
			
	public Investigator updateInvestigator(Investigator investigator); //Update investigator data "UPDATE"
	
	public void deleteInvestigator(Long id);// Delete a investigator via id "DELETE"
}
