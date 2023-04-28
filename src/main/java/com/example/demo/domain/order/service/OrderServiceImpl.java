package com.example.demo.domain.order.service;

import com.example.demo.domain.order.entity.TOrder;
import com.example.demo.domain.order.repository.OrderJpaRepository;
import com.example.demo.domain.order.service.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderJpaRepository orderJpaRepository;

    @Override
    public Collection<OrderDTO> getOrders() {

        List<TOrder> tOrderList = orderJpaRepository.findAll();

        List<OrderDTO> orderDTOList = tOrderList.stream()
                .map(OrderDTO::of)
                .collect(Collectors.toList());

        return orderDTOList;
    }
}
