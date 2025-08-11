package com.example.productServiceEcomm.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String publicId;
    private String productName;
    private long price;
    private long quantity;
    private String category;
}
