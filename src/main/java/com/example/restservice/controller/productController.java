package com.example.restservice.controller;

import com.example.restservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restservice.product.Product;

import java.util.List;



@RestController
public class productController {

    private ProductService productService;

    public productController(ProductService productService) {
         this.productService = productService;
    }


    @GetMapping("/Products")
    public List<Product>  getProducts(){
        return productService.getproducts();
    }



}
