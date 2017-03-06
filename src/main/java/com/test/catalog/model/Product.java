package com.test.catalog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Product {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "productname")
  private String productName;

  @Column(name = "productCode", nullable = false, unique = true)
  private String productCode;

  @Column(name = "productImage")
  private String productImage;

  @OneToMany(targetEntity = ProductPrice.class)
  @JoinColumn(name = "productCode")
  @Column(name = "productPrice")
  private List<ProductPrice> productPrice;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getProductImage() {
    return productImage;
  }

  public void setProductImage(String productImage) {
    this.productImage = productImage;
  }

  public List<ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  @Override
  public String toString() {
    return this.productName;
  }
}
