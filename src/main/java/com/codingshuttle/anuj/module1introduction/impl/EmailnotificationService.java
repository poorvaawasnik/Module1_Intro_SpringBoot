package com.codingshuttle.anuj.module1introduction.impl;

import com.codingshuttle.anuj.module1introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotif")
@ConditionalOnProperty(name = "notification.type", havingValue = "email" )
public class EmailnotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sending..."+message);
    }
}
