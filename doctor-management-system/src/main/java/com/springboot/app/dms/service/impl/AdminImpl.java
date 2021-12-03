package com.springboot.app.dms.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.app.dms.Repository.AdminRepository;
import com.springboot.app.dms.Admin;
import com.springboot.app.dms.service.Adminservice;
@Service
public class AdminImpl implements Adminservice {
	
	
	
		private AdminRepository obj;
		public AdminService(AdminRepository obj)
		{
			this.obj=obj;
		}
		
		@Override
		public List<Admin> getAllUsers() {
			
			return obj.findAll();
		}

		@Override
		public Admin saveuser(Admin adm) {
			
			return obj.save(adm);
		}
		public Admin getUserId(long id) {
			
			return obj.findById(id).get();
		}
		@Override
		public Admin updateuser(Admin adm) {
			
			return obj.save(adm);
		}

		@Override
		public void deleteId(long id) {
			
			obj.deleteById(id);
		}

		@Override
		public Admin loginUser(String name, String email) {
			
			Admin user=obj.findByNameAndEmail(name, email);
			return user;
		}
		
		
	}
}
