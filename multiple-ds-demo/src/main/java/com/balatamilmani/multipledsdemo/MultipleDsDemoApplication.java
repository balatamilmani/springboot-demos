package com.balatamilmani.multipledsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MultipleDsDemoApplication {

    @Autowired
    private DataInitializer dataInitializer;

    public static void main(String[] args) {
        SpringApplication.run(MultipleDsDemoApplication.class, args);
    }

    @PostConstruct
    public void init() {
        //Tables and Sequence are not getting created automatically and this fails
    	//System.out.println(dataInitializer.createCustomer());
    }

}
