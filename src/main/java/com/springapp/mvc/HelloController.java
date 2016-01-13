package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String departments() {

		return "departments";
	}
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public String employees(@PathVariable Integer id, Model model) {
		model.addAttribute("id", id);
		return "employees";
	}
}