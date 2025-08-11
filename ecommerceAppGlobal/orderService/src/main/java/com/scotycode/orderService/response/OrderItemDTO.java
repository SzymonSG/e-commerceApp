package com.scotycode.orderService.response;

import com.scotycode.order_service.enums.OrderItemsStatus;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private String productPublicId;
    private String productName;
    private long quantity;
    private BigDecimal price;
    private OrderItemsStatus status;
}

