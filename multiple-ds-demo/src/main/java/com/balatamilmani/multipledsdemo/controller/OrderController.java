package com.balatamilmani.multipledsdemo.controller;

import com.balatamilmani.multipledsdemo.order.Order;
import com.balatamilmani.multipledsdemo.order.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/order/{id}")
    public Order getOrderById(@PathVariable Long id){
        Optional<Order> orderOptional = orderService.getOrderById(id);
        return orderOptional.get();
    }

    @PostMapping(value = "/order")
    public Order addOrder(@RequestBody Order order){
        Optional<Order> orderOptional = orderService.addOrder(order);
        return orderOptional.get();
    }
}
