package com.springboot.app.dms.controller;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.springboot.app.dms.serviceImpl.AdminService;
import com.springboot.app.dms.Admin;
@Controller
public class AdminController {
	
	private AdminService obj1;

	public void adminController(AdminService admin) {
		super();
		this.admin = admin;
	}
	@GetMapping("/get")
	public String listUserss(Model model)
	{
		model.addAttribute("Admin",admin.getAllUsers());
		return "Welcome";
	}
	@GetMapping("/gett")
	public String listUsers(Model model)
	{
		model.addAttribute("Admin",admin.getAllUsers());
			return "admin";
	}
	
	@GetMapping("/get/new")
	public String createUser(Model model)
	{
		Admin obj3 =new Admin();
		model.addAttribute("obj3",obj3);
		return "create_user";
	}
	@PostMapping("/getmy")
	public String saveUser(@ModelAttribute("obj3") Admin admin)
	{
		admin.saveuser(admin);
		return "redirect:/get";
	}
	@GetMapping("get/update/{id}")
	public String editUserForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("admin",admin.getUserId(id));	
	   return "edit";	
	}
	@PostMapping("/Myadmin/{id}")
	public String updateStudent(@PathVariable long id,@ModelAttribute("admin") Admin adm, Model model)
	{
		System.out.println("hello");
		exist.getUserId(id);	
		exist.setId(id);
		exist.setName(adm.getName());
		exist.setEmail(adm.getEmail());
		return "redirect:/get";
	}
	@GetMapping("/get/delete/{id}")
	public String DeleteStudent(@PathVariable long id)
	{
     	admin.deleteId(id);
		return  "redirect:/get";
	}
}

