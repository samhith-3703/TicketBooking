package com.sat.tmf.tkt.tktbooking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sat.tmf.tkt.tktbooking.dto.CreateUserDTO;
import com.sat.tmf.tkt.tktbooking.entity.User;
import com.sat.tmf.tkt.tktbooking.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String testMethod(@RequestParam("uname") String userName) {
		System.out.println("This is a testMethod() @ UserController");
		System.out.println("User Name:"+userName);
		return null;
	}
	
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public String testPostMethod(@RequestParam("uname") String userName) {
		System.out.println("This is a testMethod() @ UserController");
		System.out.println("User Name:"+userName);
		return null;
	}
	
	@RequestMapping(value="/addNew", method= RequestMethod.POST)
	public String registerNewUser( @RequestBody CreateUserDTO user) {
		User userResp = userService.registerNewUser(user);
		System.out.println(userResp.getId());
		return null;
	}
}
