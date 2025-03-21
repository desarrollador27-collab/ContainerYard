package com.projectest.sigcon.dto;

import com.projectest.sigcon.models.Users.Role_User;

public class UserDTO {


	private Long id;
	private String fullname;
	private String email;
	private String phone;
	private String password;
	private Role_User role_user;
	
	public UserDTO() {}
	
	public UserDTO(Long id, String fullname, String email, String phone, String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role_User getRole_user() {
		return role_user;
	}

	public void setRole_user(Role_User role_user) {
		this.role_user = role_user;
	}


    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", Fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", Phone='" + phone + '\'' +
                '}';
    }
	
	
	
}
