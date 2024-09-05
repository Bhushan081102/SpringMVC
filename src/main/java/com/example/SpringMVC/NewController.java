package com.example.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class NewController {

	@GetMapping("loginpagedata")
	public String loginpage(@ModelAttribute User user,Model model) {
		System.out.println(user);
		
		if (user.getPassword().equals("Bhushan")) {
			System.out.println("Correct");
			model.addAttribute("msg", "login successfully");
		} else {
			System.out.println("Wrong");
			model.addAttribute("msg", "login Unsuccessfully");
		}
		return "login";
		
	}
}
