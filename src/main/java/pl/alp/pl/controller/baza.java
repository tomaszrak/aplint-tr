package pl.alp.pl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pl.alp.pl.service.UserService;

@Controller
public class baza {
	
	@Autowired
	private UserService userService;

}
