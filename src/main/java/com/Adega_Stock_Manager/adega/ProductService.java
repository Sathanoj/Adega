package com.Adega_Stock_Manager.adega;

import com.Adega_Stock_Manager.adega.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct();
    List<Product> getAllProducts();
}
