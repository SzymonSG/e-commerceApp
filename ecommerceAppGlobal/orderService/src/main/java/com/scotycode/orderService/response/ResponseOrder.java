package com.scotycode.orderService.response;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseOrder {
    private String publicId;
    private LocalDateTime orderDate;
    private List<OrderItemDTO> items;
}