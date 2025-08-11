package com.example.productServiceEcomm.service;

import com.example.productServiceEcomm.request.ProductCreateDTO;

public interface ProductService {
    String saveProduct(ProductCreateDTO product);
}
