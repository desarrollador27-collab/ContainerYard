package com.projectest.sigcon.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
@Data
public class Containeryard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    // this methods will utilize for modify or update number container.

    private String equipment;//this is the number container
    
   
    





}









