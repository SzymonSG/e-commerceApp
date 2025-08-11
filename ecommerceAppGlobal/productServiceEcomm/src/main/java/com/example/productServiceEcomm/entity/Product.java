package com.example.productServiceEcomm.entity;

import com.example.productServiceEcomm.enums.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column(nullable = false, unique = true, updatable = false)
    private String publicId;

    private String productName;

    @Enumerated(EnumType.STRING)
    private Category category;

    private BigDecimal price;

    private  long quantity;

}
