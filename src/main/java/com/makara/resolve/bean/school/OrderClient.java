package com.makara.resolve.bean.school;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
//@Configuration
 //@AllArgsConstructor
//@RequiredArgsConstructor
@Setter
public class OrderClient {

   // @Qualifier("serviceA") and we can use @Qualifier("orderService123") make sur a @component and @Service about implement A ....
    //@Qualifier("orderServiceA")
    //@Autowired
    //@Resource(name = "orderServiceA")
    //@Autowired
    //private final OrderService orderService;
    @Autowired
    private   OrderService orderService;
    private int age;
//    public OrderClient(OrderService orderService) {
//        this.orderService = orderService;
//    }
    //@Qualifier("b")// called method bean
   // @Autowired


    //inject send point
    //@Autowired Noted:for java version 4 we can't use autowired
//    public OrderClient(OrderService orderService){
//        this.orderService = orderService;
//    }
//    @Autowired
//    public void setOrderService(OrderService os){
//        this.orderService=os;
//    }


    public void displayOrder() {

        System.out.println(orderService.Order());
    }
}
