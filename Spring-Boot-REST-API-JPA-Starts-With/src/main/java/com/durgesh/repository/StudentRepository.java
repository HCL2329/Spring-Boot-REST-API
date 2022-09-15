package com.durgesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.durgesh.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	List<Student> findByFirstName(String firstname);
	
	Student findByLastNameAndFirstName (String lastName, String firstName);
	
	List<Student> findByFirstNameOrLastName (String firstName, String lastName);
	
	List<Student> findByFirstNameIn (List<String> firstNames);
	
	List<Student> findByFirstNameContains(String firstName);
	
	List<Student> findByFirstNameStartsWith(String firstName);
}
