package com.example.productServiceEcomm.service;

import com.example.productServiceEcomm.entity.Product;
import com.example.productServiceEcomm.enums.Category;
import com.example.productServiceEcomm.repository.ProductRepository;
import com.example.productServiceEcomm.request.ProductCreateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public String saveProduct(ProductCreateDTO product) {

        String prefix = switch (product.getCategory()) {
                case "ELECTRONICS" -> "ELEC-";
                case "BOOKS" -> "BOOK-";
                case "CLOTHING" -> "CLOT-";
                default -> "GEN-";
            };

        Product sampleProduct = Product.builder()
                .publicId(prefix.concat(UUID.randomUUID().toString()))
                .productName(product.getProductName())
                .category(Category.valueOf(product.getCategory().toUpperCase()))
                .quantity(1000)
                .price(new BigDecimal(product.getPrice().toString()))
                .build();


        Product save = productRepository.save(sampleProduct);

        return save.getPublicId();
    }
}
