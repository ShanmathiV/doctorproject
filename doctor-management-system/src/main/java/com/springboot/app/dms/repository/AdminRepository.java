package com.springboot.app.dms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 import com.springboot.app.dms.Admin;
 
@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
	   Admin findByNameAndEmail(String name, String email); 


}
