package com.scotycode.orderService.controller;

import com.scotycode.orderService.request.RequestOrder;
import com.scotycode.orderService.response.ResponseOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    public ResponseEntity<ResponseOrder> orderProducts(@RequestBody RequestOrder requestOrder){


    }
}
