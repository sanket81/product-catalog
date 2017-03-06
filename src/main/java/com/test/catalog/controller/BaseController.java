package com.test.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.catalog.model.Product;
import com.test.catalog.services.ProductService;

@Controller
public class BaseController {

  @Autowired
  private ProductService productService;

  @RequestMapping(value = "/products")
  public ModelAndView listProducts() {

    List<Product> products = productService.list();

    ModelAndView model = new ModelAndView("products");

    model.addObject("productList", products);

    return model;
  }

  @RequestMapping(value = "/product-details-{productCode}")
  public ModelAndView listProductById(
      @PathVariable("productCode") String productCode) {

    Product product = productService.byCode(productCode);

    ModelAndView model = new ModelAndView("product-details");
    model.addObject("product", product);
    product.getProductPrice().get(0);

    return model;
  }

}
