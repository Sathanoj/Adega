package com.Adega_Stock_Manager.adega.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cod_barra;
    private float valor_compra;
    private float valor_venda;
    private String validade;

}