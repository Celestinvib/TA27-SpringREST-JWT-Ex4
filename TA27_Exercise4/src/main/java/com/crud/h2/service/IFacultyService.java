package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Faculty;

public interface IFacultyService {
	//CRUD methods
	public List<Faculty> listFaculties(); //List All 
	
	public Faculty saveFaculty(Faculty faculty);//Save a new faculty "CREATE"
	
	public Faculty facultyXID(Long id); //Read data from a faculty "READ"
			
	public Faculty updateFaculty(Faculty faculty); //Update faculty data "UPDATE"
	
	public void deleteFaculty(Long id);// Delete a faculty via id "DELETE"
}
