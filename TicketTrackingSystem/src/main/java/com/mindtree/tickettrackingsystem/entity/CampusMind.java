package com.mindtree.tickettrackingsystem.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class CampusMind {
	@Id
	private String mid;
	private String name;
	private String projectName;
	@OneToMany(mappedBy = "cminds",cascade = CascadeType.ALL)
	@JsonIgnoreProperties
	private List<Genie> genie;
	
	
	public CampusMind() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CampusMind(String mid, String name, String projectName, List<Genie> genie) {
		super();
		this.mid = mid;
		this.name = name;
		this.projectName = projectName;
		this.genie = genie;
	}
	


	public String getMid() {
		return mid;
	}


	public void setMid(String mid) {
		this.mid = mid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public List<Genie> getGenie() {
		return genie;
	}


	public void setGenie(List<Genie> genie) {
		this.genie = genie;
	}


	@Override
	public String toString() {
		return "CampusMind [mid=" + mid + ", name=" + name + ", projectName=" + projectName + ", genie=" + genie + "]";
	}

	

}
