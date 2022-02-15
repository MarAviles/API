package com.example.practica.API.controllers;

import java.util.ArrayList;

import com.example.practica.API.models.Flower;
import com.example.practica.API.services.FlowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    @Autowired
    FlowerService flowerService;


    @GetMapping()
    public ArrayList<Flower> obtenerFlores(){
        return flowerService.todasLasFlores();
    }

    @PostMapping()
    public String guardar(@RequestBody Flower flower){
        return flowerService.guardar(flower);
    }
}
