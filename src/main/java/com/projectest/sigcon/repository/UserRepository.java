package com.projectest.sigcon.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectest.sigcon.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	
	
}
