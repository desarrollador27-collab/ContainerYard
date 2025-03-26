package com.projectest.sigcon.services;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectest.sigcon.dto.UserDTO;
import com.projectest.sigcon.models.Users;
import com.projectest.sigcon.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	//@Autowired
	//private PasswordEncoder passwordEncoder;

	//List UserDTO
	private final List<UserDTO> users = new ArrayList<>();


	//Method for create User Entity for be saved in the DB.
	public UserDTO saveUser(Users user) {
		//String encoderPassword = passwordEncoder.encode(user.getPassword());
		//user.setPassword(encoderPassword);
		Users savedUser = userRepository.save(user);
		return convertToDTO(savedUser);
	}

	//Method for show all Users
	public List<UserDTO> findAllUsers(){

		return userRepository.findAll().stream()
				.map(this::convertToDTO).collect(Collectors.toList());
	}

	//Get user by Id
	public Optional<UserDTO> getUserById(Long id){
		return users.stream().filter(user -> user.getId().equals(id)).findFirst();
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
	public boolean deleteUser(Long id) {
		return users.removeIf(user -> user.getId().equals(id));
	}


	//Method to convert User Entity in UserDTO collect.
	private UserDTO convertToDTO(Users user) {

		return new UserDTO(user.getId(), user.getUsername(), user.getEmail(),user.getPassword(), user.getRole());
	}

}
