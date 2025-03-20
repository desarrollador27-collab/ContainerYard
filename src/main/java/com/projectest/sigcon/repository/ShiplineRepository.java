package com.projectest.sigcon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectest.sigcon.models.Shiplines;

@Repository
public interface ShiplineRepository extends JpaRepository<Shiplines, Long> {
	
	Optional<Shiplines>findByName(String name_shipline);
	
	Optional<Shiplines>findByEmail(String email_shipline);

}
