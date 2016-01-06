package pl.alp.pl.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.alp.pl.entity.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.text.Document;

import template.ProwadzacyJDBCTemplate;
import template.RezerwacjeJDBCTemplate;

import java.security.Principal;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
	@Controller
	public class prowadzacyController {

		@Autowired
		private ProwadzacyJDBCTemplate prowadzacyJDBCTemplate;
		
		@Autowired
		private RezerwacjeJDBCTemplate rezerwacjeJDBCTemplate;
		
		
		
		@ModelAttribute("prowadzacy")
		public Prowadzacy construct(){
			
			return new Prowadzacy();
		}
		@ModelAttribute("rezerwacja")
		public Rezerwacja constructt(){
			
			return new Rezerwacja();
		}
		@ModelAttribute("rezerwa")
		public Rezerwa constructtt(){
			
			return new Rezerwa();
		}
		@ModelAttribute("rezerwa1")
		public Rezerwa constructttt(){
			
			return new Rezerwa();
		}
		
		
			@RequestMapping("/users")
			public String index(Model model){
				model.addAttribute("prowadzacy",prowadzacyJDBCTemplate.listProwadzacy());
				return "users";
			}
			
			
		@RequestMapping("/users/{id}")
		public String detail(Model model,@PathVariable int id){
			model.addAttribute("user", prowadzacyJDBCTemplate.znajdzid(id));
			model.addAttribute("rez", rezerwacjeJDBCTemplate.listRezerwacje(id));
			return "prowadzacyszczeg";
		}
		@RequestMapping("/dodajprowadzacego")
		public String showRegistrer() {
			return "dodajprowadzacego";
		}
		
		@RequestMapping(value="/dodajprowadzacego", method=RequestMethod.POST)
		public String doRegistrer(@ModelAttribute("prowadzacy") Prowadzacy prowadzacy){
			prowadzacyJDBCTemplate.create(prowadzacy.getImie(),prowadzacy.getNazwisko(),prowadzacy.getPassword(),prowadzacy.getLogin(),prowadzacy.getTelefon());
			return "redirect:/dodajprowadzacego.html?success=true";
		}
		@RequestMapping("dodajrez")
		public String dodajrez(Model model,Principal principal){
			Prowadzacy erek = prowadzacyJDBCTemplate.znajdzid(principal.getName());
			model.addAttribute("rez",rezerwacjeJDBCTemplate.listRezerwacje(erek.getId()));
			
			return "dodajrez";
		}
		
		@RequestMapping(value="/dodajrez", method=RequestMethod.POST)
		public String dodajrez(@ModelAttribute("rezerwa") Rezerwa rezerwa, Principal principal){
			Prowadzacy erek = prowadzacyJDBCTemplate.znajdzid(principal.getName());
			//java.sql.Date data,java.sql.Time data_roz,java.sql.Time data_zak,int idpr,int idsal,String cel
		//rezerwacjeJDBCTemplate.createrez(java.sql.Date.valueOf("2016-01-01"), java.sql.Time.valueOf("16:10:00"), java.sql.Time.valueOf("16:50:00"), 3, 1, "wyk³ad");
			Sale er=rezerwacjeJDBCTemplate.findid(rezerwa.getSala());
			rezerwacjeJDBCTemplate.createrez(java.sql.Date.valueOf(rezerwa.getData()), java.sql.Time.valueOf(rezerwa.getDataroz()), java.sql.Time.valueOf(rezerwa.getDatazak()), erek.getId(), er.getId(), rezerwa.getCel());

		
			return "redirect:/dodajrez.html";
		}
		
		@RequestMapping("wyszukajrez")
		public String wyszukajrez(Model model){
		model.addAttribute("rez", rezerwacjeJDBCTemplate.listRezerwacjewysz());
			return "wyszukajrez";
		}
		
		@RequestMapping(value="/wyszukajrez", method=RequestMethod.POST)
		public String doRegistrer(@ModelAttribute("rezerwa1") Rezerwa rezerwa, Model model2){
			Sale er=rezerwacjeJDBCTemplate.findid(rezerwa.getSala());
			model2.addAttribute("rez1", rezerwacjeJDBCTemplate.listRezerwacjewysz2(er.getId(),java.sql.Date.valueOf(rezerwa.getData())));
		//model.
			return "wyszukajrez";
		}
		
		
	}