package com.crud.h2.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TA27_bookings")
public class Booking {
	/**Attributes */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Find last value and increment from final id of db
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "investigator_id")
    Investigator investigator;
	
	@ManyToOne
    @JoinColumn(name = "team_id")
    Team team;
	
	private Date beginning;
	
	private Date end;
	
  	/**Constructors */
	public Booking() {
		
	}

	/**
	 * @param id
	 * @param investigator
	 * @param team
	 * @param beginning
	 * @param end
	 */
	public Booking(Long id, Investigator investigator, Team team, Date beginning, Date end) {
		this.id = id;
		this.investigator = investigator;
		this.team = team;
		this.beginning = beginning;
		this.end = end;
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
	 * @return the investigator
	 */
	public Investigator getInvestigator() {
		return investigator;
	}

	/**
	 * @param investigator the investigator to set
	 */
	public void setInvestigator(Investigator investigator) {
		this.investigator = investigator;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	/**
	 * @return the beginning
	 */
	public Date getBeginning() {
		return beginning;
	}

	/**
	 * @param beginning the beginning to set
	 */
	public void setBeginning(Date beginning) {
		this.beginning = beginning;
	}

	/**
	 * @return the end
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * Method printing data by console
	 */
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", investigador=" + investigator + ", comienzo=" + beginning + ", fin=" + end +"]";
	}	
	
	
}
