package com.durgesh.response;

import com.durgesh.entity.Student;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentResponse {

	private long id;

	@JsonProperty("first_name")
	private String firstName;

	private String lastName;

	private String email;
	
	private String fullName;
	
	public StudentResponse (Student student) {
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
		this.fullName = student.getFirstName() + " " +
				student.getLastName();
	}

}
