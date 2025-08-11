package com.scotycode.orderService.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemCreateDTO {
    private String productPublicId;
    private long quantity;
    private BigDecimal price;
}

