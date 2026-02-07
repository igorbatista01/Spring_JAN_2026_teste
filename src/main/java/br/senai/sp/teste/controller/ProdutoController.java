package br.senai.sp.teste.controller;
 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.teste.model.Produto;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@GetMapping("/novo")
	public String novo(Model model) {
		
		model.addAttribute("produto", new Produto());
		return "produto/frm-produto";
	}
	
	@PostMapping("/gravar")
	public String gravar(Produto produto) {
		System.out.println("O seu produto é o "+produto.getNome()+" e o valor é de R$ "+produto.getPreco());
		return "home/index";
	}
	
}
