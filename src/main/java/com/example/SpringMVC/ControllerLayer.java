package com.example.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

//@Controller
@RestController
public class ControllerLayer {

	@GetMapping("getdata")
	public String getname() {
		return "hello jsp";
		
	}
	
	
}
