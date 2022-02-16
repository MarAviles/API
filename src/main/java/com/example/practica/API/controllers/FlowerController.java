package com.example.practica.API.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.practica.API.models.Flower;
import com.example.practica.API.services.FlowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flores")
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

    @GetMapping("/{id}")
    public Optional<Flower> obtenerPorid(@PathVariable Long id){
        return flowerService.Obtenerid(id);
    }

    @PostMapping("search")
    public List<Flower> BuscarFlor(@RequestParam("query") String query){
        var nombre = flowerService.Buscarporpalabra(query);
        System.out.println(nombre);
        return nombre;
    }
}
