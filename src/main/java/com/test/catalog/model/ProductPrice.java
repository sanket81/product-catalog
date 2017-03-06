package com.test.catalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductPrice {


  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "productCode")
  private String productCode;

  @Column(name = "currencyCode")
  private String currencyCode;

  @Column(name = "amount")
  private double amount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return this.id + " " + amount + " = " + currencyCode + "";
  }
}
