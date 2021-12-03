package com.springboot.app.dms.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.dms.repository.PatientRepository;
import com.springboot.app.dms.Admin;
import com.springboot.app.dms.Patient;
import java.util.List;
@Service
public class PatientImpl {
	 @Autowired
	    private PatientRepository patientRepository;

	    public List<Patient> listAll(){
	        return patientRepository.findAll();
	    }

	    public Patient get(long id){
	        return patientRepository.findById(id).get();

	    }

	    public void save(Patient patient){
	        patientRepository.save(patient);
	    }
	    public Patient save(long patient){
	       return patientRepository.findById(patient).get();
	    }

	    
	    public void delete(long id){
	        patientRepository.deleteById(id);
	    }

		

	}


}
