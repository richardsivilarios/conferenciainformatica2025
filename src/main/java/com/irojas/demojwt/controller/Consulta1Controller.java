package com.irojas.demojwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irojas.demojwt.entity.dto.Consulta1;
import com.irojas.demojwt.service.Consulta1Service;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/consulta1")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://locahost:8081"})

public class Consulta1Controller {
     private final Consulta1Service consulta1Service;
    @GetMapping
    public List<Consulta1> getAll() {
        return consulta1Service.listaConsulta1();

    }

}
