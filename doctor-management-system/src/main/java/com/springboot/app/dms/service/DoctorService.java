package com.springboot.app.dms.service;
import java.util.List;
import com.springboot.app.dms.Doctor;
public interface DoctorService {
	 public List<Doctor> getAllUsers();
	  public  Doctor saveuser(Doctor adm);
	  public  Doctor getUserId(long id); 
	  public void deleteId(long id);
}
