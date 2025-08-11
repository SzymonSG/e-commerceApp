package com.scotycode.orderService.request;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateDTO {
    private List<OrderItemCreateDTO> items;
}
