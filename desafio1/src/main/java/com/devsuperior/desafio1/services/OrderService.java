package com.devsuperior.desafio1.services;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountOrder = order.getBasic() * order.getDiscount() / 100;
        return order.getBasic() - discountOrder
                + shippingService.shipment(order.getBasic());

    }

}