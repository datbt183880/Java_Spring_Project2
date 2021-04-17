package com.example_component_autowired.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        Outfit outfit = context.getBean(Outfit.class);

        System.out.println("Instance: " + outfit);

        outfit.wear();

        Girl girl = context.getBean(Girl.class);

        System.out.println("Girl Instance:" + girl);

        System.out.println("Girl Outfit:" + girl.outfit);

        girl.outfit.wear();
    }


}
