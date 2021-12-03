package com.springboot.app.dms.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.dms.repository.AppointmentRepository;
import com.springboot.app.dms.Appointment;

import java.util.List;

@Service
public class AppointmentImpl {
	
	    @Autowired
	    private AppointmentRepo appointmentRepository;

	    public List<Appointment> listAll(){
	        return appointmentRepository.findAll();
	    }

	    public Appointment get(long id){
	        return appointmentRepository.findById(id).get();

	    }

	    public void save(Appointment appointment){
	        appointmentRepository.save(appointment);
	    }

	    public Appointment update(Appointment appointment ){
	        return appointmentRepository.save(appointment);
	    }

	    public void delete(long id){
	        appointmentRepository.deleteById(id);
	    }

	}

