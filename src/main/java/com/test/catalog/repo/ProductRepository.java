package com.test.catalog.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.catalog.model.Product;



@Repository
public interface ProductRepository {

  public List<Product> list();

  public Product byCode(String productCode);
}
