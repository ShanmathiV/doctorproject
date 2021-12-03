package com.springboot.app.dms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.dms.Patient;

public class PatientRepository  extends JpaRepository<Patient,Long>{ 

}
