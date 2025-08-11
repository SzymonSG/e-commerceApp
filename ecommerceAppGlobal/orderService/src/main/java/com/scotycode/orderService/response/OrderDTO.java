package com.scotycode.orderService.response;

import com.scotycode.order_service.request.OrderItemCreateDTO;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String publicId;
    private LocalDateTime orderDate;
    private List<OrderItemDTO> items;
}