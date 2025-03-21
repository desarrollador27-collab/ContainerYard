package com.projectest.sigcon.services;


import java.util.List;

import com.projectest.sigcon.dto.UserDTO;
import com.projectest.sigcon.models.Users;
import com.projectest.sigcon.repository.UserRepository;

public class UserService {
	
	
	private final UserRepository userRepository = null;
	
	
	// Services to create User and save in DataBase
	public UserDTO createUser(UserDTO userdto) {
		
		if(userRepository.existsById(userdto.getId())) {
			throw new IllegalArgumentException("Usuario no disponible, ya existe");
		}
		Users user = new Users();
		user.setFullname(userdto.getFullname());
		user.setEmail(userdto.getEmail());
		user.setPhone(userdto.getPhone());
		user.setPassword(userdto.getPassword());
		user.setRole_user(userdto.getRole_user());
		
		Users saveuser = userRepository.save(user);
		return mapUserToDTO(saveuser);
	
	}
	
	// Services to find All Users created in the DataBase
	public List<UserDTO> findAllUsers(){
		
		return userRepository.findAll().stream().map(this::mapUserToDTO).toList();
	}
	
	
	public Users updateUser(Long id, UserDTO userdto) {
		
		return null;
	}


	
	
	
	
	
	
	private UserDTO mapUserToDTO(Users user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFullname(user.getFullname());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setRole_user(user.getRole_user());

        return userDTO;
    }
	
	

}
