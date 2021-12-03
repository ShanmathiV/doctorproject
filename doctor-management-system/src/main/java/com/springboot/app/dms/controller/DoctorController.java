package com.springboot.app.dms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.springboot.app.dms.service.DoctorService;
import com.springboot.app.dms.entity.Doctor;

@Controller
public class DoctorController{
	private DoctorService doctorService;

	public DoctorController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	
	@GetMapping("/doctors")
	public String listDoctors(Model model) {
		model.addAttribute("doctors", doctorService.getAllDoctors());
		return "doctors";
		
	}
	@GetMapping("doctors/new")
	public String createDoctorForm(Model model) {
		
		//create doctor object to hold doctor form data
		Doctor doctor=new Doctor();
		model.addAttribute("doctor",doctor);
		return "create_doctor";
		
	}
	@PostMapping("/doctors")
	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
		doctorService.saveDoctor(doctor);
		return "redirect:/doctors";
	}
	@GetMapping("/doctors/edit/{id}")
   public String editDoctorsForm(@PathVariable Long id, Model model) {
		model.addAttribute("doctor", doctorService.getStudentById(id));
		return "edit_doctor";
	   }
	
	@PostMapping("/doctors/{id}")
	public String updateDoctor(@PathVariable Long id,
		@ModelAttribute("doctor") Doctor doctor, Model model) {
		
		 Doctor existingDoctor=doctorService.getDoctorById(id);
		 existingDoctor.setId(id);
		 existingDoctor.setFirstName(doctor.getFirstName());
		 existingDoctor.setLastName(doctor.getLastName());
		 existingDoctor.setEmail(doctor.getEmail());
		 
		 //save updated doctor object
		 doctorService.updateDoctor(existingDoctor);
		 return "redirect:/doctors";
	}
	//delete doctor object
	@GetMapping("/doctors/{id}")
	public String deleteDoctor(@PathVariable Long id) {
		doctorService.deleteDoctorById(id);
		return "redirect:/doctors";
		
	}
	
}
	