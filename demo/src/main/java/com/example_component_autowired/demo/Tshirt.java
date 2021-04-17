package com.example_component_autowired.demo;

import org.springframework.stereotype.Component;

/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/

@Component
public class Tshirt implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mac T-shirt");
    }
}
