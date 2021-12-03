package com.springboot.app.dms.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.dms.repository.DoctorRepository;
import com.springboot.app.dms.Doctor;
import com.springboot.app.dms.service.DoctorService;

@Service
public class DoctorImpl implements DoctorService {
	  DoctorRepository Docrepo;

	  public DoctorService(DoctorRepository doctorepo) {
	  	super();
	  	Docrepo = doctorrepo;
	  }

	  @Override
	  public List<Doctor> getAllUsers() {
	  	
	  	return Docrepo.findAll();
	  }

	  @Override
	  public Doctor saveuser(Doctor adm) {

	  	return Docrepo.save(adm);
	  }

	  public Doctor getUserId(long id) {
	  	
	  	return Docrepo.getById(id);
	  }

	  @Override
	  public void deleteId(long id) {
	  	
	  	  Docrepo.deleteById(id);
	  }
	  }


