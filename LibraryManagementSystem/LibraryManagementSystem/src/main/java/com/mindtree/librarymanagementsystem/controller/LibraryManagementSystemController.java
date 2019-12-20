package com.mindtree.librarymanagementsystem.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.librarymanagementsystem.dto.LibraryDto;
import com.mindtree.librarymanagementsystem.dto.UserDto;
import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.entity.User;
import com.mindtree.librarymanagementsystem.service.LibraryManagementService;

@RestController
public class LibraryManagementSystemController {

	@Autowired
	LibraryManagementService service;
	@PostMapping(value="/register")
	public String registerLibrary(@RequestBody Library libraries)
	{
		return service.registerLibrary(libraries);
	}
	@PostMapping(value="/user")
	public String registerUser(@RequestBody User users)
	{
		return service.registerUser(users);
	}
	@GetMapping(value="/getAllLibrary")
	public Set<LibraryDto> getAllLibrary()
	{
		return service.getAllLibrary();
		
	}
	@GetMapping(value="/getallusers")
	public Set<LibraryDto> getAllUsers()
	{
		return service.getAllUsers();
	}
	@GetMapping(value="/getparticularuser/{userId}")
	public UserDto getParticularUser(@PathVariable (value="userId")  int userId)
	{
		return service.getUserLibrary(userId);
		
	}
}
