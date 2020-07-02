package com.mano.ms.core.productservice.controller;

import com.mano.ms.core.productservice.vo.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController{

    @GetMapping(
            value    = "/product/{productId}",
            produces = "application/json")
    Product getProduct(@PathVariable int productId){
        Product product = new Product(1,"Apple MacBook Pro",120000);
        return product;
    }
}
