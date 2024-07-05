package com.Adega_Stock_Manager.adega.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Product {
    private String nome;
    private String cod_barra;
    private float valor;
}
