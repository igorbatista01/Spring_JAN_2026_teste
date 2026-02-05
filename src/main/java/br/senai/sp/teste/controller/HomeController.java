package br.senai.sp.teste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String home () {
		System.out.println("index");
		return "home/index";
	}
	
	@GetMapping("/params")
	public String homeParams (@RequestParam(name="nome") String nome, Model model) {
		
		model.addAttribute("attr", nome);
		System.out.println(nome);
		return "home/index2";
	}
}
