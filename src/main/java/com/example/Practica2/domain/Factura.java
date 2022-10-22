package com.example.Practica2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Factura {

    @Value("{factura.descripcion}")
    private String descripcion;
    @Autowired
    private Cliente cliente;
    private List<ItemFactura> itmes;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItmes() {
        return itmes;
    }

    public void setItmes(List<ItemFactura> itmes) {
        this.itmes = itmes;
    }
}
