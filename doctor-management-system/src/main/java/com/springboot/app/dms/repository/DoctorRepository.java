package com.springboot.app.dms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.dms.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
