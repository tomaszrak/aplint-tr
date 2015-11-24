package pl.alp.pl.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.alp.pl.entity.Prowadzacy;
import template.ProwadzacyJDBCTemplate;

	import org.springframework.beans.factory.annotation.Autowired;
	@Controller
	public class prowadzacyController {

		@Autowired
		private ProwadzacyJDBCTemplate prowadzacyJDBCTemplate;
		
		@ModelAttribute("prowadzacy")
		public Prowadzacy construct(){
			
			return new Prowadzacy();
		}
		
			@RequestMapping("/users")
			public String index(Model model){
				model.addAttribute("prowadzacy",prowadzacyJDBCTemplate.listProwadzacy());
				return "users";
			}
			
			
		@RequestMapping("/users/{id}")
		public String detail(Model model,@PathVariable int id){
			model.addAttribute("user", prowadzacyJDBCTemplate.znajdzid(id));
			return "prowadzacyszczeg";
		}
		@RequestMapping("/dodajprowadzacego")
		public String showRegistrer() {
			return "dodajprowadzacego";
		}
		
		@RequestMapping(value="/dodajprowadzacego", method=RequestMethod.POST)
		public String doRegistrer(@ModelAttribute("prowadzacy") Prowadzacy prowadzacy){
			prowadzacyJDBCTemplate.create(prowadzacy.getImie(),prowadzacy.getNazwisko(),prowadzacy.getPassword());
			return "dodajprowadzacego";
		}
		
	}