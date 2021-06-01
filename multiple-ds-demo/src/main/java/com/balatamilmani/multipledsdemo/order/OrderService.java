package com.balatamilmani.multipledsdemo.order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<Order> getOrders();
    Optional<Order> getOrderById(Long id);

    Optional<Order> addOrder(Order order);
}
