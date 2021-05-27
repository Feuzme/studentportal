package com.studentPortal.dto;

import java.sql.Timestamp;
import java.util.Date;

import com.studentPortal.entity.StudentPortalEntity;

public class StudentDto {
	public int id;
	public String  lastname;
	public String  firstname;
	public String  email;	
	public String  phone;
	
	public StudentDto(StudentPortalEntity studentEntity) {
		super();
		this.id = studentEntity.getId();
		this.lastname = studentEntity.getLastname();
		this.firstname = studentEntity.getFirstname();
		this.email = studentEntity.getEmail();
		this.phone = studentEntity.getPhone();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}	
	
}
