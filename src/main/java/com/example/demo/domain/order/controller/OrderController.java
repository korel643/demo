package com.example.demo.domain.order.controller;

import com.example.demo.domain.order.service.OrderService;
import com.example.demo.domain.order.service.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping(value = "order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public Collection<OrderDTO> getOrders() {
        System.out.println("getOrders()");

        return orderService.getOrders();
    }
}
