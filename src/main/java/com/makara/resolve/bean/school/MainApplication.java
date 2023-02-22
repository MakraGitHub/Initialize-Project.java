package com.makara.resolve.bean.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       // OrderClient2 orderClient = context.getBean(OrderClient2.class);
        //called object order 1
        OrderClient orderClient = context.getBean(OrderClient.class);
        orderClient.displayOrder();

        //OrderClient ab = new


    }
}