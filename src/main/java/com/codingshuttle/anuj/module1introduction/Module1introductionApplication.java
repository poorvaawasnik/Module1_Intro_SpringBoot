package com.codingshuttle.anuj.module1introduction;

import com.codingshuttle.anuj.module1introduction.impl.EmailnotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner {

   // @Autowired
   final NotificationService notificationService;

    public Module1introductionApplication( NotificationService notificationService){
        this.notificationService = notificationService;
    }


	public static void main(String[] args) {
        SpringApplication.run(Module1introductionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        NotificationService notificationServiceObj = new EmailnotificationService();
        notificationServiceObj.send("hello");



    }
}
