package com.boazistore.api_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boazistore.api_rest.model.Produto;
import com.boazistore.api_rest.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	//Controla as entradas no H2
	@Autowired
	private ProdutoRepository produtoRepository;
	
	// Cria um novo produto
	@PostMapping
	public Produto criar(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	// Retorna todos os produtos
	@GetMapping
	public List<Produto> listarTodos(){
		return produtoRepository.findAll();
	}
	
	// Buscar produto por Id
	@GetMapping("/{id}")
	public Produto listarPorId(@PathVariable Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	// Deleta um produto
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtoRepository.deleteById(id);
	}
	
}
