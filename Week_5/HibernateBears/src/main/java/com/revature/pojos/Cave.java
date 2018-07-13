package com.revature.pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAVE")
public class Cave {
	
	@Id
	@SequenceGenerator(name="CAVEID_SEQ", sequenceName="CAVEID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAVEID_SEQ")
	@Column(name="CAVE_ID")
	private int caveId;
	
	@Column(name="CAVE_TYPE")
	private String caveType;
	
	@Column(name="SQ_FOOTAGE")
	private double sqFootage;

	public Set<Bear> getBears() {
		return bears;
	}

	public void setBears(Set<Bear> bears) {
		this.bears = bears;
	}

	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.REMOVE, mappedBy="bearHome")
	private Set<Bear> bears;
	
	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cave(int caveId, String caveType, double sqFootage) {
		super();
		this.caveId = caveId;
		this.caveType = caveType;
		this.sqFootage = sqFootage;
	}

	@Override
	public String toString() {
		return "Cave [caveId=" + caveId + ", caveType=" + caveType + ", sqFootage=" + sqFootage + ", bears=" + bears
				+ "]";
	}

	public int getCaveId() {
		return caveId;
	}

	public void setCaveId(int caveId) {
		this.caveId = caveId;
	}

	public String getCaveType() {
		return caveType;
	}

	public void setCaveType(String caveType) {
		this.caveType = caveType;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}
	
	

}
