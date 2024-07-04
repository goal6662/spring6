package com.goal.spring6.service;

import com.goal.spring6.dao.OrderDao;
import lombok.Setter;

@Setter
public class OrderService {

    private OrderDao orderDao;

    public void generate() {
        System.out.println("订单正在生成...");
        orderDao.insert();
    }

}
