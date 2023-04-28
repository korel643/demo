package com.example.demo.domain.order.service;

import com.example.demo.domain.order.service.dto.OrderDTO;

import java.util.Collection;

public interface OrderService {

    Collection<OrderDTO> getOrders();
}
