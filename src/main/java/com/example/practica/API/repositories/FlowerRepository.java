package com.example.practica.API.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.practica.API.models.Flower;

@Repository
public interface FlowerRepository extends CrudRepository<Flower,Long> {
    
}