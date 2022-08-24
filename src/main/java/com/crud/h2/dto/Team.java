package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TA27_teams")
public class Team {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
    
	private String serialNum;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name = "faculty_id")
    Faculty faculty;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	private List<Booking> booking;	

	/**Constructors */
	public Team() {
		
	}

	/**
	 * @param id
	 * @param numSerie
	 * @param name
	 * @param faculty
	 */
	public Team(Long id, String numSerie, String name, Faculty faculty) {
		this.id = id;
		this.serialNum = numSerie;
		this.name = name;
		this.faculty = faculty;
	}

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
	 * @return the numSerie
	 */
	public String getSerialNum() {
		return serialNum;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
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
	 * @return the faculty
	 */
	public Faculty getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	/**
	 * @return the booking
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Booking")
	public List<Booking> getBooking() {
		return booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	
	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", numSerie=" + serialNum + ", nombre=" + name +  ", facultad=" + faculty + "]";
	}	
	
	
}
