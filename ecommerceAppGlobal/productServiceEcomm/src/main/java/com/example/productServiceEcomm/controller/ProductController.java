package com.example.productServiceEcomm.controller;



import com.example.productServiceEcomm.request.ProductCreateDTO;

import com.example.productServiceEcomm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping
    public String createProduct(@RequestBody ProductCreateDTO product){

        String s = productService.saveProduct(product);

        return s;

    }

}
