package com.mindtree.librarymanagementsystem.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class LibraryDto {

	private int LibraryId;
	private String LibraryName;
	private String LibraryAddress;
	@JsonIgnoreProperties(value="libraries")
	private Set<UserDto> userDto;
	public LibraryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LibraryDto(int libraryId, String libraryName, String libraryAddress, Set<UserDto> userDto) {
		super();
		LibraryId = libraryId;
		LibraryName = libraryName;
		LibraryAddress = libraryAddress;
		this.userDto = userDto;
	}
	public int getLibraryId() {
		return LibraryId;
	}
	public void setLibraryId(int libraryId) {
		LibraryId = libraryId;
	}
	public String getLibraryName() {
		return LibraryName;
	}
	public void setLibraryName(String libraryName) {
		LibraryName = libraryName;
	}
	public String getLibraryAddress() {
		return LibraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		LibraryAddress = libraryAddress;
	}
	public Set<UserDto> getUserDto() {
		return userDto;
	}
	public void setUserDto(Set<UserDto> userDto) {
		this.userDto = userDto;
	}
	@Override
	public String toString() {
		return "LibraryDto [LibraryId=" + LibraryId + ", LibraryName=" + LibraryName + ", LibraryAddress="
				+ LibraryAddress + ", userDto=" + userDto + "]";
	}
	
}
