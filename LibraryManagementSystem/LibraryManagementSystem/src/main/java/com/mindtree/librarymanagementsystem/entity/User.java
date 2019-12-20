package com.mindtree.librarymanagementsystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int userId;
	public String userName;
	public String userAddress;
	@ManyToMany(mappedBy = "users",cascade = CascadeType.ALL)
	
	public Set<Library> libraries;
	public User() {
		super();
		
	}
	public User(int userId, String userName, String userAddress, Set<Library> libraries) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.libraries = libraries;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Set<Library> getLibraries() {
		return libraries;
	}
	public void setLibraries(Set<Library> libraries) {
		this.libraries = libraries;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", libraries="
				+ libraries + "]";
	}
	
}
