package com.test.catalog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.catalog.model.Product;
import com.test.catalog.repo.ProductRepository;
import com.test.catalog.services.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public List<Product> list() {
    return productRepository.list();
  }

  @Override
  public Product byCode(String productCode) {
    return productRepository.byCode(productCode);
  }

}
