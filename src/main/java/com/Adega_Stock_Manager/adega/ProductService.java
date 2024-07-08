package com.Adega_Stock_Manager.adega;

import com.Adega_Stock_Manager.adega.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product findById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product, Long id);
    void deleteProduct(Product product);
}
