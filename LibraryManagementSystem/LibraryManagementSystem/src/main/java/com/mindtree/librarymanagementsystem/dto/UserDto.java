package com.mindtree.librarymanagementsystem.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class UserDto {
	private int userId;
	private String userName;
	private String userAddress;
	@JsonIgnoreProperties(value="users")
	private Set<LibraryDto> libraries;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(int userId, String userName, String userAddress, Set<LibraryDto> libraries) {
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
	public Set<LibraryDto> getLibraries() {
		return libraries;
	}
	public void setLibraries(Set<LibraryDto> libraries) {
		this.libraries = libraries;
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", libraries="
				+ libraries + "]";
	}
	
}
