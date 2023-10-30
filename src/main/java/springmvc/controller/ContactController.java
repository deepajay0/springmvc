package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	//adding common data to model
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Code with ajay");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}
	@RequestMapping(path = "/processForm",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		//model.addAttribute("user", user);
		this.userService.createUser(user);
		return "success";
	}
	/*
	@RequestMapping(path = "/processForm",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email,
			@RequestParam("name") String name,@RequestParam("password") String password,Model model) {
		
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		
		System.out.println(user);
		
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
		model.addAttribute("user", user);
		return "success";
	}*/
}
