package com.boazistore.api_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table (name="produto")
public class Produto {

    private Long id;

    private Long clienteId;

    private Long produtoId;

    private int quantidade;
}
