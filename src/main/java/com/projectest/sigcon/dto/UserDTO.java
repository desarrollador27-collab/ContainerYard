package com.projectest.sigcon.dto;

import com.projectest.sigcon.models.Role;
import lombok.Data;

@Data
public class UserDTO {


	private Long id;

	
	private String usarname;
	private String email;
	private String password;


	private Role role;

	public UserDTO(Long id, String username, String email, String password, Role role) {
	}

	/*public UserDTO() {}

	public UserDTO(Long id, String username, String email, String password, Role role) {
		this.id = id;
		this.usarname = username;
		this.email = email;
		this.password = password;
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
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}

*/
}
