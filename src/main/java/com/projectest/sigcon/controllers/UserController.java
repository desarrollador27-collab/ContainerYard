package com.projectest.sigcon.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectest.sigcon.dto.UserDTO;
import com.projectest.sigcon.models.Users;
import com.projectest.sigcon.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;


	//Get  All Users
	@GetMapping("/users_list")
	public List<UserDTO> getAllUsers(){
		return userService.findAllUsers();
	}

	//Get User by id
	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> getUserById(@PathVariable Long id){
		Optional<UserDTO> user = userService.getUserById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

	}

	//Methods to create a Users
	@PostMapping("/create")
	public ResponseEntity<UserDTO> CreateUser(@RequestBody Users user){
		UserDTO saveUser = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
	}

	//Method to update a User
	@PutMapping("/{id}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody Users user){
		UserDTO updateUser = userService.updateUser(id, user);
		if(updateUser != null) {
			return ResponseEntity.ok(updateUser);
		}else {
			return ResponseEntity.notFound().build();
		}

	}


	//Delete to User
	@DeleteMapping("/{id}")
	public ResponseEntity<UserDTO> deleteUser(@PathVariable Long id){
		boolean deleted = userService.deleteUser(id);
		if(deleted) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}


}
