package com.makara.resolve.bean.school;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class OrderServiceB implements OrderService{

    @Override
    public String Order() {
        return "Order from service B";
    }
}
