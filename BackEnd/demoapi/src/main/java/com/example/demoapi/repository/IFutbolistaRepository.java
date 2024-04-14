package com.example.demoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoapi.model.Futbolista;

@Repository
public interface IFutbolistaRepository extends JpaRepository<Futbolista,Integer> {

}
