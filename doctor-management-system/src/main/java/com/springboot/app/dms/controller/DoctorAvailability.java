package com.springboot.app.dms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.springboot.app.dms.model.Availability;
import com.springboot.app.dms.Doctor; 
import com.springboot.app.dms.serviceImp.AvailabilityService;
import com.springboot.app.dms.serviceImp.DoctorService;

@Controller
public class DoctorAvailability {
	AvailabilityService Docser;

	public AvailabilityController(AvailabilityService doctor) {
		super();
		this.Doctor = doctor;
	}
	@GetMapping("/doctor")
	public String listUserss(Model model)
		{
			model.addAttribute("Admin",Doctor.listAll());
			return "Av_List";
      	}
	@PostMapping("/doctors")
	public String saveUser(@ModelAttribute("obj3") Availability doctor)
	{
		Doctor.save(doctor);
		return "redirect:/Av_list";
				}
	
	
	@GetMapping("/Mydoctor/delete/{id}")
	public String DeleteStudent(@PathVariable	long id)
	{
     	Doctor.delete(id);
		return  "redirect:/Av_list";
	}
	
}
}
