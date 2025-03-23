package com.projectest.sigcon.services;



import java.util.List;
import java.util.stream.Collectors;

import com.projectest.sigcon.dto.UserDTO;
import com.projectest.sigcon.models.Users;
import com.projectest.sigcon.repository.UserRepository;

public class UserService {
	
	private UserRepository userRepository;
	
	
	
	//Method for create User Entity for be saved in the DB.
	public UserDTO createUser(Users user) {
		
		Users savedUser = userRepository.save(user);
		return convertToDTO(savedUser);
	}
	
	//Method for show all Users
	public List<UserDTO> findAllUsers(){
		
		return userRepository.findAll().stream()
				.map(this::convertToDTO).collect(Collectors.toList());
	}
	
	// Method for update User by Id
	public UserDTO updateUser(Long id, Users updatedUser) {
		Users existingUser = userRepository.findById(id).orElse(null);
		if(existingUser!= null) {
			existingUser.setUsername(updatedUser.getUsername());
			existingUser.setEmail(updatedUser.getEmail());
			existingUser.setPassword(updatedUser.getPassword());
			existingUser.setRole(updatedUser.getRole());
			Users savedUser = userRepository.save(existingUser);
			return convertToDTO(savedUser);
		}
		return null;
	}
	
	//Method for delete User saved in DB by Id
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	
	//Method to convert User Entity in UserDTO collect.
	private UserDTO convertToDTO(Users user) {
		
		return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), user.getRole());
	}

}
