package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TA27_faculties")
public class Faculty {
	
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	private int code;
	
	private String name;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "faculty")
	private List<Investigator> investigator;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "faculty")
	private List<Team> team;
	
	/**Constructors */
	public Faculty() {
		
	}

	/**
	 * @param id
	 * @param code
	 * @param name
	 * @param investigator
	 * @param team
	 */
	public Faculty(Long id, int code, String name) {
		this.id = id;
		this.code = code;
		this.name = name;
	}

	/**Getters y Setters*/

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the investigator
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigator")
	public List<Investigator> getInvestigator() {
		return investigator;
	}

	/**
	 * @param investigator the investigator to set
	 */
	public void setInvestigator(List<Investigator> investigator) {
		this.investigator = investigator;
	}

	/**
	 * @return the team
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public List<Team> getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(List<Team> team) {
		this.team = team;
	}
	
	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "Facultad [id=" + id + ", code=" + code + ", name=" + name + "]";
	}	
	
	
	
	
}
