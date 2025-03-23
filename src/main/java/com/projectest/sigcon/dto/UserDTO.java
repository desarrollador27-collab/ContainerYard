package com.projectest.sigcon.dto;

import com.projectest.sigcon.models.Role;

public class UserDTO {
	
	private Long id;
	
	private String usarname;
	private String email;
	
	private Role role;
	
	public UserDTO() {}
	
	public UserDTO(Long id, String username, String email, Role role) {
		this.id = id;
		this.usarname = username;
		this.email = email;
		this.role = role;
	}


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsarname() {
	return usarname;
}
public void setUsarname(String usarname) {
	this.usarname = usarname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}






	
	
	
}
