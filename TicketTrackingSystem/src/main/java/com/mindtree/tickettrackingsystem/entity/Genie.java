package com.mindtree.tickettrackingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Genie {
	@Id
	private String genieId;
	private String genieDescription;
	private boolean genieStatus;
	
	@ManyToOne
	
	private CampusMind cminds;
	
	public Genie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Genie(String genieId, String genieDescription, boolean genieStatus, CampusMind cminds) {
		super();
		this.genieId = genieId;
		this.genieDescription = genieDescription;
		this.genieStatus = genieStatus;
		this.cminds = cminds;
	}

	public String getGenieId() {
		return genieId;
	}
	public void setGenieId(String genieId) {
		this.genieId = genieId;
	}
	public String getGenieDescription() {
		return genieDescription;
	}
	public void setGenieDescription(String genieDescription) {
		this.genieDescription = genieDescription;
	}
	public boolean isGenieStatus() {
		return genieStatus;
	}
	public void setGenieStatus(boolean genieStatus) {
		this.genieStatus = genieStatus;
	}
	public CampusMind getCminds() {
		return cminds;
	}
	public void setCminds(CampusMind cminds) {
		this.cminds = cminds;
	}


}
