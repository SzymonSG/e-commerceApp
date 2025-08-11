package com.example.productServiceEcomm.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDTO {
    private String productName;
    private BigDecimal price;
    private long quantity;
    private String category;
}
