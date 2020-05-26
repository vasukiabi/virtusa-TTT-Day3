package net.codejava.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.codejava.spring.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		User userForm = new User();		
		model.put("userForm", userForm);
		
		List<String> professionList = new ArrayList<>();
		professionList.add("India");
		professionList.add("China");
		professionList.add("Pakistan");
		model.put("professionList", professionList);
		
		return "Registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") User user, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("username: " + user.getfirstname());
		System.out.println("password: " + user.getlastname());
		System.out.println("email: " + user.getEmail());
		System.out.println("age: " + user.getage());
		System.out.println("profession: " + user.getProfession());
		
		return "RegistrationSuccess";
	}
}
