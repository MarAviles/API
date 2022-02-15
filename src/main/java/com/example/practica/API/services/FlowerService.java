package com.example.practica.API.services;

import com.example.practica.API.models.Flower;
import com.example.practica.API.repositories.FlowerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional<Flower> Obtenerid(Long id){
        return FlowerRepo.findById(id);
    }

    public List<Flower> buscarPorPalabra(String query){
        List <Flower> flor = FlowerRepo.encontrarPorPalabra(query);
        return flor;
    }
}