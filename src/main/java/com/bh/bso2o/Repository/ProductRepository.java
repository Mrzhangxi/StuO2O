package com.bh.bso2o.Repository;

import com.bh.bso2o.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findAll();

//    List<>
}
