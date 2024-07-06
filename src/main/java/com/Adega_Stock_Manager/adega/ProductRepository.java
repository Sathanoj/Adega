package com.Adega_Stock_Manager.adega;

import com.Adega_Stock_Manager.adega.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Long, Product> {
}
