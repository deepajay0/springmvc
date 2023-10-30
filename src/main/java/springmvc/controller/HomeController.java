package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path = "/home",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Ajay Deep");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView model = new ModelAndView();
		model.addObject("name", "Ajay Deep Upadhyay");
		model.setViewName("help");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2345);
		model.addObject("marks", list);
		return model;
	}
}
