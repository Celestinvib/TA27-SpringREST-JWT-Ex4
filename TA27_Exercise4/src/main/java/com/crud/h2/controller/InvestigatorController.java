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

import com.crud.h2.dto.Investigator;
import com.crud.h2.service.InvestigatorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigatorController {
	@Autowired
	InvestigatorServiceImpl investigatorServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigator> listFaculties(){
		return investigatorServiceImpl.listInvestigators();
	}
	
	@PostMapping("/investigadores")
	public Investigator saveInvestigator(@RequestBody Investigator investigator) {
		
		return investigatorServiceImpl.saveInvestigator(investigator);
	}
	
	@GetMapping("/investigadores/{id}")
	public Investigator investigatorXID(@PathVariable(name="id") Long id) {
		
		Investigator faculty_xid= new Investigator();
		
		faculty_xid= investigatorServiceImpl.investigatorXID(id);
		
		System.out.println("Investigador XID: "+faculty_xid);
		
		return faculty_xid;
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigator updateFaculty(@PathVariable(name="id")Long id,@RequestBody Investigator investigator) {
		
		Investigator investigadorSelected= new Investigator();
		Investigator investigadorUpdated = new Investigator();
		
		investigadorSelected= investigatorServiceImpl.investigatorXID(id);
		
		investigadorSelected.setDNI(investigator.getDNI());
		investigadorSelected.setNameSurnames(investigator.getNameSurnames());
		investigadorSelected.setFaculty(investigator.getFaculty());
		

		investigadorUpdated = investigatorServiceImpl.updateInvestigator(investigadorSelected);
		
		System.out.println("El Investigator actualizado es: "+ investigadorUpdated);
		
		return investigadorUpdated;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void deleteInvestigator(@PathVariable(name="id")Long id) {
		investigatorServiceImpl.deleteInvestigator(id);
	}	
}
