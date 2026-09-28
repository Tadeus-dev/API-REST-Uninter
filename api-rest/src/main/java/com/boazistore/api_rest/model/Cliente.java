package com.boazistore.api_rest.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table (name="cliente") 
public class Cliente {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String nome;

    private LocalDate clienteDesde;
    
    //Construtor vazio
    public Cliente() {};
    
    //Construtor com atributos
    public Cliente(Long id, String nome, LocalDate clienteDesde) {
    	this.id= id;
    	this.nome = nome;
    	this.clienteDesde = clienteDesde;
    	}
    
    //Evitar que a data fique vazia
    @PrePersist
    public void prePersist() {
    	if(this.clienteDesde == null) {
    		this.clienteDesde = LocalDate.now();
    	}
    }

    //Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getClienteDesde() {
		return clienteDesde;
	}

	public void setClienteDesde(LocalDate clienteDesde) {
		this.clienteDesde = clienteDesde;
	}
    
    

}
