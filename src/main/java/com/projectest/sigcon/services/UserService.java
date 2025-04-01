package com.projectest.sigcon.services;



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
    private final UserRepository userRepository;

    //@Autowired
   // private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Method for create User Entity for saving in DB
    public UserDTO saveUser(Users user) {
        //String encodedPassword = passwordEncoder.encode(user.getPassword());
        //user.setPassword(encodedPassword);
        Users savedUser = userRepository.save(user);
        return convertToDTO(savedUser);
    }

    // Method for showing all Users
    public List<UserDTO> findAllUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToDTO).collect(Collectors.toList());
    }

    // Get user by Id
    public Optional<UserDTO> getUserById(Long id) {
        Optional<Users> user = userRepository.findById(id);
        return user.map(this::convertToDTO);
    }

    // Method for updating User by Id
    public UserDTO updateUser(Long id, Users updatedUser) {
        Users existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        existingUser.setRole(updatedUser.getRole());
        
        Users savedUser = userRepository.save(existingUser);
        return convertToDTO(savedUser);
    }

    // Method for deleting User by Id
    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Method to convert User Entity to UserDTO
    private UserDTO convertToDTO(Users user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), user.getPassword(), user.getRole());
    }
}
