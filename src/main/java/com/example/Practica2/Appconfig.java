package com.example.Practica2;

import com.example.Practica2.service.IServicio;
import com.example.Practica2.service.MiServicio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Appconfig {

    @Bean("MiServicio")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("MiServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo(){
        return new MiServicio();
    }
}
