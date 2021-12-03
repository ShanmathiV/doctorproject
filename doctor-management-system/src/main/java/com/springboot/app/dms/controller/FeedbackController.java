package com.springboot.app.dms.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.app.dms.model.Admin;
import com.springboot.app.dms.model.Feedback;
import com.springboot.app.dms.serviceImp.AdminService;
import com.springboot.app.dms.serviceImp.FeedbackService;
public class FeedbackController {
	private FeedbackService feed;

	public FeedbackController(FeedbackService feed) {
		super();
		this.feed= feed;
	}

	@PostMapping("/getmy")
	public String saveUser(@ModelAttribute("obj3") Feedback admin)
	{
		feed.save(admin);
		return "redirect:/getmy";
	}
	@GetMapping("get/update/{id}")
	public String editUserForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("admin",feed.get(id));	
	   return "Feedback";	
	}
	
	@GetMapping("/get/delete/{id}")
	public String DeleteStudent(@PathVariable long id)
	{
     feed.delete(id);
		return  "redirect:/gett";
	}
}

}
