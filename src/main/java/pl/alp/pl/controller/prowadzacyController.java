package pl.alp.pl.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

	import template.ProwadzacyJDBCTemplate;

	import org.springframework.beans.factory.annotation.Autowired;
	@Controller
	public class prowadzacyController {

		@Autowired
		private ProwadzacyJDBCTemplate prowadzacyJDBCTemplate;
		
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
	}