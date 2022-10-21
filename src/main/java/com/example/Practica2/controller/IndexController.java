package com.example.Practica2.controller;

import com.example.Practica2.service.IServicio;
import com.example.Practica2.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    @Qualifier("miServicioComplejo")
    private IServicio servicio;

    @GetMapping({"/","","/index"})
    public String index(Model model){

        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }


}
