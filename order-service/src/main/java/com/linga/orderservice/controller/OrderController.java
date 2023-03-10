package com.linga.orderservice.controller;

import com.linga.orderservice.dto.OrderRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  String placeOrder( @RequestBody  OrderRequest orderRequest){
        return "Order placed Successfully";
    }
}
