package com.test.catalog.repo.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AbstractDao<T> {

  @Autowired
  private SessionFactory sessionFactory;

  protected Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  public void persist(T entity) {
    getSession().persist(entity);
  }

  public void delete(T entity) {
    getSession().delete(entity);
  }
}
