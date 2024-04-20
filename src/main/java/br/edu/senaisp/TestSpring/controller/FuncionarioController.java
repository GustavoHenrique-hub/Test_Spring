package br.edu.senaisp.TestSpring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.TestSpring.model.Funcionario;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	// 
	
	@PostMapping
	public String get(@RequestBody Funcionario f) {
		return "POST " + f.getNome()+ " '" + f.getCpf() + "'";
	}
	
	
	//	

	@GetMapping("/busca/{id}")
	public String buscaPorId(@PathVariable Integer id) {
		return "Buscado";
	}
	
	
	//	

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		return "Deletado";
	}
	
	// 
	
	@PutMapping("/put/{id}")
	public String put(@RequestBody Funcionario f, @PathVariable Integer id) {
		return "POST " + f.getNome()+ " '" + f.getCpf() + "'";
	}
}
