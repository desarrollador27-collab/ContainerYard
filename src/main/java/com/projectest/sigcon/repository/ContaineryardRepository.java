package com.projectest.sigcon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectest.sigcon.models.Containeryard;

@Repository
public interface ContaineryardRepository extends JpaRepository<Containeryard, Long> {
	
	Optional<Containeryard>findByEquipment(String equipment);

}
