package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProductController {
	
	@RequestMapping("/home")
	public String index(Model model) {
		return "index";
	}
}
