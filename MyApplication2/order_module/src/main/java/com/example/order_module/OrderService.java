package com.example.order_module;

import com.example.order.module.api.IOrder;

public class OrderService implements IOrder {
    @Override
    public String getOrderMsg() {
        return "你有新的订单啦!!!";
    }
}