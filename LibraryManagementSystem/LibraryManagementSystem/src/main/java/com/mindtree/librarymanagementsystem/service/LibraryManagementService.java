package com.mindtree.librarymanagementsystem.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.mindtree.librarymanagementsystem.dto.LibraryDto;
import com.mindtree.librarymanagementsystem.dto.UserDto;
import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.entity.User;
@Service
public interface LibraryManagementService {
public String registerLibrary(Library libraries);
public String registerUser(User users);
public Set<LibraryDto> getAllLibrary();
public Set<LibraryDto> getAllUsers();
public UserDto getUserLibrary(int userId);
}
