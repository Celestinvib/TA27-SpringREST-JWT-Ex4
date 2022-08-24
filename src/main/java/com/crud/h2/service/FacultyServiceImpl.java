package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFacultyDAO;
import com.crud.h2.dto.Faculty;

@Service
public class FacultyServiceImpl implements IFacultyService{
	
	//We use the methods of the IItemDAO interface, it is as if we were instantiating.
	@Autowired
	IFacultyDAO iFacultyDAO;
	
	@Override
	public List<Faculty> listFaculties() {
	
		return iFacultyDAO.findAll();
	}

	@Override
	public Faculty saveFaculty(Faculty faculty) {
		
		return iFacultyDAO.save(faculty);
	}

	@Override
	public Faculty facultyXID(Long id) {
		
		return iFacultyDAO.findById(id).get();
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		
		return iFacultyDAO.save(faculty);
	}

	@Override
	public void deleteFaculty(Long id) {
		
		iFacultyDAO.deleteById(id);		
	}

}
