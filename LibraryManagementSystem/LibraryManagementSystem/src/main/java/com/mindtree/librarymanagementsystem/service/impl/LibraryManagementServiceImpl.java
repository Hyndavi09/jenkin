package com.mindtree.librarymanagementsystem.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.librarymanagementsystem.dto.LibraryDto;
import com.mindtree.librarymanagementsystem.dto.UserDto;
import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.entity.User;
import com.mindtree.librarymanagementsystem.repository.LibraryRepository;
import com.mindtree.librarymanagementsystem.repository.UserRepository;
import com.mindtree.librarymanagementsystem.service.LibraryManagementService;

@Service
public class LibraryManagementServiceImpl implements LibraryManagementService {

	@Autowired
	LibraryRepository libraryRepository;
	@Autowired
	UserRepository userRepository;

	@Override
	public String registerLibrary(Library libraries) {
		
		libraryRepository.save(libraries);
		return "Library Registered Successfully";
	}

	@Override
	public String registerUser(User user) {
		Set<User> users = new HashSet<User>();
		users.add(user);
		user.getLibraries().forEach(i -> i.setUsers(users));
		userRepository.save(user);
		return "User Registered Successfully";
	}

	@Override
	public Set<LibraryDto> getAllLibrary() {
		Set<LibraryDto> newlibrary = new HashSet<LibraryDto>();
		for (Library library : libraryRepository.findAll()) {
			LibraryDto libraryDto = new LibraryDto();
			libraryDto.setLibraryId(library.getLibraryId());
			libraryDto.setLibraryName(library.getLibraryName());
			libraryDto.setLibraryAddress(library.getLibraryAddress());
			Set<UserDto> newUser = new HashSet<UserDto>();
			for (User user : library.getUsers()) {
				UserDto usersDto = new UserDto();
				usersDto.setUserId(user.getUserId());
				usersDto.setUserName(user.getUserName());
				usersDto.setUserAddress(user.getUserAddress());

				newUser.add(usersDto);

			}
			libraryDto.setUserDto(newUser);
			newlibrary.add(libraryDto);
		}

		return newlibrary;
	}

	@Override
	public Set<LibraryDto> getAllUsers() {
		Set<LibraryDto> newLibrary = new HashSet<LibraryDto>();

		for (Library library : libraryRepository.findAll()) {

			if (library.getUsers().size() <= 2) {
				LibraryDto libraryDto = new LibraryDto();
				libraryDto.setLibraryId(library.getLibraryId());
				libraryDto.setLibraryName(library.getLibraryName());
				libraryDto.setLibraryAddress(library.getLibraryAddress());
				Set<UserDto> newUser = new HashSet<UserDto>();
				for (User user : library.getUsers()) {
					UserDto usersDto = new UserDto();
					usersDto.setUserId(user.getUserId());
					usersDto.setUserName(user.getUserName());
					usersDto.setUserAddress(user.getUserAddress());
					newUser.add(usersDto);

				}
				libraryDto.setUserDto(newUser);
				newLibrary.add(libraryDto);
			}

		}
		return newLibrary;
	}
	public UserDto getUserLibrary(int userId)
	{
		User user=new User();
		user=userRepository.findById(userId).get();
		UserDto userDto=new UserDto();
		userDto.setUserId(user.getUserId());
		userDto.setUserName(user.getUserName());
		userDto.setUserAddress(user.getUserAddress());
		Set<LibraryDto> libraryDto=new HashSet<LibraryDto>();
		for(Library library:user.getLibraries())
		{
			LibraryDto library1=new LibraryDto();
			library1.setLibraryId(library.getLibraryId());
			library1.setLibraryName(library.getLibraryName());
			library1.setLibraryAddress(library.getLibraryAddress());
			libraryDto.add(library1);
		}
		userDto.setLibraries(libraryDto);
		return userDto;
		
	}
	
}
