package com.mindtree.librarymanagementsystem.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.librarymanagementsystem.entity.Library;
@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{

}