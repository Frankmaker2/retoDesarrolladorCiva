package com.example.demoapi.service;

import java.util.List;

import com.example.demoapi.model.Futbolista;

public interface IFutbolistaService {
	Futbolista findFutbolistaById(int idFutbolista);
    List<Futbolista> listar();
}
