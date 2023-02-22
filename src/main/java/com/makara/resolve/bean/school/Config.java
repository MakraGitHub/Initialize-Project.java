package com.makara.resolve.bean.school;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages =  {"com.makara.resolve.bean.school"})
public class Config {
    private OrderService orderService;

//    public void displayOrder(){
//        System.out.println(orderService.Order());
//    }
    @Bean
    public int a(){
        return 5;
    }

    //@Bean(name = "age")
    @Bean
    public int b(){
        return 3;
    }
    @Bean(autowire = Autowire.BY_TYPE)
    public OrderClient order(){
        return new OrderClient();
    }

}
