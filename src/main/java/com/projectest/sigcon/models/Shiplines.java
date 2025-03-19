package com.projectest.sigcon.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class Shiplines {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name_shipline;
	private String email_shipline;
	private String phone_shipline;
	
	public String getName_shipline() {
		return name_shipline;
	}
	public void setName_shipline(String name_shipline) {
		this.name_shipline = name_shipline;
	}
	public String getEmail_shipline() {
		return email_shipline;
	}
	public void setEmail_shipline(String email_shipline) {
		this.email_shipline = email_shipline;
	}
	public String getPhone_shipline() {
		return phone_shipline;
	}
	public void setPhone_shipline(String phone_shipline) {
		this.phone_shipline = phone_shipline;
	}

	

}
