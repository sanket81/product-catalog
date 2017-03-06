package com.test.catalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Currency {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "currencyCode", nullable = false, unique = true)
  private String currencyCode;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Override
  public String toString() {
    return this.currencyCode;
  }



}
