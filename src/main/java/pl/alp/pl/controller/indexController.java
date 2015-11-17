package pl.alp.pl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import template.ProwadzacyJDBCTemplate;

import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class indexController {

	@Autowired
	private ProwadzacyJDBCTemplate prowadzacyJDBCTemplate;
	
		@RequestMapping("/index")
		public String index(Model model){
			model.addAttribute("prowadzacy",prowadzacyJDBCTemplate.listProwadzacy());
			return "index";
		}
}
