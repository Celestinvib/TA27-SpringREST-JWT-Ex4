package com.crud.h2.dto;

import java.util.List;

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
@Table(name="TA27_investigators")
public class Investigator {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	private String DNI;
	
	private String nameSurnames;
	
	@ManyToOne
    @JoinColumn(name = "faculty_id")
    Faculty faculty;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigator")
	private List<Booking> booking;	
	
	/**Constructors */
	public Investigator() {
		
	}

	/**
	 * @param id
	 * @param dNI
	 * @param nameSurnames
	 * @param faculty
	 * @param booking
	 */
	public Investigator(Long id, String dNI, String nameSurnames, Faculty faculty) {
		this.id = id;
		DNI = dNI;
		this.nameSurnames = nameSurnames;
		this.faculty = faculty;
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
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * @return the nameSurnames
	 */
	public String getNameSurnames() {
		return nameSurnames;
	}

	/**
	 * @param nameSurnames the nameSurnames to set
	 */
	public void setNameSurnames(String nameSurnames) {
		this.nameSurnames = nameSurnames;
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
		return "Investigador [id=" + id + ", dni=" + DNI + ", nomApels=" + nameSurnames +  ", facultad=" + faculty + "]";
	}	
	
	
	
}
