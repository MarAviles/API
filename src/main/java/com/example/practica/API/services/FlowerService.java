package com.example.practica.API.services;

import com.example.practica.API.models.Flower;
import com.example.practica.API.repositories.FlowerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class FlowerService {
    @Autowired
    FlowerRepository FlowerRepo;
    
    public ArrayList<Flower> todasLasFlores(){
        return (ArrayList<Flower>) FlowerRepo.findAll();
    }

    public String guardar(Flower flower){
        FlowerRepo.save(flower);
        return "guardado correctamente";
    }
}