package com.example;

import org.springframework.stereotype.Component;

@Component

public class NotificationService {
    public String imprimirSaludo(){
        return "Hola desde la clase NotificationService!";
    }
}
