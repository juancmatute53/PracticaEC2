package com.example.Practica2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class MiServicio implements IServicio {

    @Override
    public String operacion(){

        return "Ejucuta un proceso";
    }
}
