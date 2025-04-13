package com.example.LivroDevOps.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LivroDevOps.model.domain.Livro;
import com.example.LivroDevOps.model.service.LivroService;


@RestController
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping(value = "/livro/lista")
	public Collection<Livro> obterLista(){
		return livroService.obterLista();
	}
	@GetMapping(value = "/livro/{id}")
	public Livro obterPorId(@PathVariable Integer id) {
		return livroService.obterPorId(id);
	}
	@PostMapping(value = "/livro/incluir")
	public void incluir(@RequestBody Livro livro) {
		livroService.incluir(livro);
	}
	@GetMapping(value = "/livro/lista/{autor}")
	public Collection<Livro> obterPorAutor(@PathVariable String autor) {
		return livroService.obterPorAutor(autor);
	}
	@DeleteMapping(value = "/livro/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		livroService.excluir(id);
	}
}
