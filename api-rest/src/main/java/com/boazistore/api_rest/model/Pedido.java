package com.boazistore.api_rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name="cliente", nullable = false)
    private Long clienteId;
    
	@Column(name="produto", nullable = false)
    private Long produtoId;
    
	@Column(nullable = false)
    private Integer quantidade;
    
	public Pedido() {}
	
	public Pedido(Long id, Long clienteId, Long produtoId, Integer quantidade) {
		this.id = id;
		this.clienteId = clienteId;
		this.produtoId = produtoId;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getClienteId() {
		return clienteId;
	}
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
