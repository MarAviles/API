package com.example.practica.API.models;

import javax.persistence.*;

@Entity
@Table(name="flor")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false )

    private Long id;
    private String nombre;
    private String especie;
    private String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color
        ;
    }


}