package com.Adega_Stock_Manager.adega;

import com.Adega_Stock_Manager.adega.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplement implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        Product forUpdate = findById(id);
        forUpdate.setNome(product.getNome());
        forUpdate.setCod_barra(product.getCod_barra());
        forUpdate.setValidade(product.getValidade());
        return productRepository.save(forUpdate);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

}
