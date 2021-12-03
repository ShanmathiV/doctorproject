package com.springboot.app.dms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.dms.AppointmentRepository;



public class AppointmentRepository extends JpaRepository<Appointment,Long>  {

}
