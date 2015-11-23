package pl.alp.pl.controller;
//fornt controler 
//wywo³ywanie plików jsp wraz z danymi z bazy danych
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import template.ProwadzacyJDBCTemplate;

import org.springframework.beans.factory.annotation.Autowired;
@Controller
public class indexController {


		@RequestMapping("/index")
		public String index(Model model){
			return "index";
		}
}
