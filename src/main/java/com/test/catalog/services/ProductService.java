package com.test.catalog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.catalog.model.Product;

@Service
public interface ProductService {

  public List<Product> list();

  public Product byCode(String productCode);
}
