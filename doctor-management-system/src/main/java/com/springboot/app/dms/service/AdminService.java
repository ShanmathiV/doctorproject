package com.springboot.app.dms.service;
import java.util.List;
import com.springboot.app.dms.Admin;
public interface AdminService {
List<Admin> getAllUsers();
	    Admin saveuser(Admin admin);
	    Admin updateuser(Admin admin);
	    Admin getUserId (long id);
	  public  Admin loginUser(String uname,String password);
	  public  void deleteId(long id);
	}

