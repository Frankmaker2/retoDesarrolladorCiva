package com.example.demoapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoapi.model.Futbolista;
import com.example.demoapi.repository.IFutbolistaRepository;
import com.example.demoapi.service.IFutbolistaService;

import jakarta.transaction.Transactional;

@Service
public class FutbolistaServiceImpl implements IFutbolistaService {
	
	@Autowired
	private IFutbolistaRepository rFutbolista;

	@Override
	@Transactional()
	public Futbolista findFutbolistaById(int idFutbolista) {
		return rFutbolista.findById(idFutbolista).orElse(null);
	}

	@Override
	@Transactional()
	public List<Futbolista> listar() {
		return rFutbolista.findAll();
	}

}
