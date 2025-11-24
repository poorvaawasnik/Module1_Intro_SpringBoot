package com.codingshuttle.anuj.module1introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Component


public class PayementService {

    public void pay() {
        System.out.println("Paying...");
    }
    @PostConstruct
    public void afterInitaaaaa() {
        System.out.println("Before paying.");
    }
    @PreDestroy
        public void beforeDestroyed(){
            System.out.println("After payment is done");
        }
    }

