package com.Adega_Stock_Manager.adega;


import com.Adega_Stock_Manager.adega.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductController {

    @Autowired
    private ProductService productService;

    public void saveNewProduct(Product product) {
        productService.saveProduct(product);
    }
}
