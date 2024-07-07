package com.Adega_Stock_Manager.adega.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cod_barra;
    private float valor_compra;
    private float valor_venda;
    private String validade;

    public Product(){}

    public Product(String nome, String cod_barra, String validade) {
        this.nome = nome;
        this.cod_barra = cod_barra;
        this.validade = validade;
    }
}