package com.example.demoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoapi.model.Futbolista;
import com.example.demoapi.service.IFutbolistaService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"*"})
public class FutbolistaController {
	
	@Autowired
    private IFutbolistaService fService;

    @GetMapping("/futbolista")
    public List<Futbolista> listar() {
        return fService.listar();
    }

    @GetMapping("/futbolista/{id}")
    public Futbolista show(@PathVariable Integer id) {
        return fService.findFutbolistaById(id);
    }
}
