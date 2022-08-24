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

import com.crud.h2.dto.Faculty;
import com.crud.h2.service.FacultyServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultyController {
	@Autowired
	FacultyServiceImpl facultyServiceImpl;
	
	@GetMapping("/facultades")
	public List<Faculty> listFaculties(){
		return facultyServiceImpl.listFaculties();
	}
	
	@PostMapping("/facultades")
	public Faculty saveFaculty(@RequestBody Faculty faculty) {
		
		return facultyServiceImpl.saveFaculty(faculty);
	}
	
	@GetMapping("/facultades/{id}")
	public Faculty facultyXID(@PathVariable(name="id") Long id) {
		
		Faculty faculty_xid= new Faculty();
		
		faculty_xid= facultyServiceImpl.facultyXID(id);
		
		System.out.println("Facultat XID: "+faculty_xid);
		
		return faculty_xid;
	}
	
	@PutMapping("/facultades/{id}")
	public Faculty updateFaculty(@PathVariable(name="id")Long id,@RequestBody Faculty faculty) {
		
		Faculty facultySelected= new Faculty();
		Faculty facultyUpdated = new Faculty();
		
		facultySelected= facultyServiceImpl.facultyXID(id);
		
		facultySelected.setName(faculty.getName());
		
	
		facultyUpdated = facultyServiceImpl.updateFaculty(facultySelected);
		
		System.out.println("La facultat actualizada es: "+ facultyUpdated);
		
		return facultyUpdated;
	}
	
	@DeleteMapping("/facultades/{id}")
	public void deleteFaculty(@PathVariable(name="id")Long id) {
		facultyServiceImpl.deleteFaculty(id);
	}	

}
