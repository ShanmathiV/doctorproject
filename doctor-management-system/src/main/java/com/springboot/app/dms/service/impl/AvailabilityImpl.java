package com.springboot.app.dms.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.dms.repository.AvailabilityRepository;
import com.example.demo.model.Availability;
@Service
public class AvailabilityImpl {
	
	  @Autowired
		    private AvailabilityRepo availabilityDatesRepository;

		    public List<Availability> listAll(){
		        return availabilityDatesRepository.findAll();
		    }

		    public Availability get(long id){
		        return availabilityDatesRepository.findById(id).get();

		    }

		    public void save(Availability availabilityDates){
		        availabilityDatesRepository.save(availabilityDates);
		    }

		    public Availability update(Availability availabilityDates ){
		        return availabilityDatesRepository.save(availabilityDates);
		    }

		    public void delete(long id){
		        availabilityDatesRepository.deleteById(id);
		    }
		}

}
