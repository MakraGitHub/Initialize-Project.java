package com.makara.resolve.bean.school;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service("serviceA")
//@Service("orderService123")
public class OrderServiceA implements OrderService{
    @Override
    public String Order() {
        return "Order from service A";
    }
}
