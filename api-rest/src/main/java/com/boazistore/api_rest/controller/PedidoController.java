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

import com.boazistore.api_rest.model.Pedido;
import com.boazistore.api_rest.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@PostMapping
	public Pedido criar(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	@GetMapping
	public List<Pedido> listarTodos(){
		return pedidoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Pedido listarPorId(@PathVariable Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		pedidoRepository.deleteById(id);
	}
	
}
