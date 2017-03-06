package com.test.catalog.repo.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.test.catalog.model.Product;
import com.test.catalog.repo.ProductRepository;

@Component
public class ProductRepositoryImpl extends AbstractDao<Product>
    implements
      ProductRepository {

  @Override
  @SuppressWarnings("unchecked")
  public List<Product> list() {
    Query<Product> query = getSession().createQuery("from Product");
    return query.list();
  }

  @Override
  @SuppressWarnings("unchecked")
  public Product byCode(String productCode) {
    Query<Product> query = getSession()
        .createQuery("from Product P where P.productCode = :productCode");
    query.setParameter("productCode", productCode);
    Product product = query.getSingleResult();
    product.getProductPrice().get(0);
    return query.getSingleResult();
  }

}
