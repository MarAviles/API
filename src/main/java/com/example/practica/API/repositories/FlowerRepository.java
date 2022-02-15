package com.example.practica.API.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.practica.API.models.Flower;

@Repository
public interface FlowerRepository extends CrudRepository<Flower,Long> {
    

    @Query(value = "select * from flowers fo where fo.nombre like %:keyword% or fo.especie like %:keyword%", nativeQuery = true)
    List<Flower> encontrarPorPalabra(@Param("keyword") String keyword);
}