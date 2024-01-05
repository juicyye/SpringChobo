package com.example.practice.order;

public interface OrderService {
    Order createOrder(Long id, String itemName, int itemPrice);
}
