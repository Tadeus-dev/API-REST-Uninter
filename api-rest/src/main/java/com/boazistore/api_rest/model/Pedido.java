package com.boazistore.api_rest.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name = "pedido")
public class Pedido {

    private Long id;

    private String nome;

    private BigDecimal preco;

    private Boolean estoque;
    
}
