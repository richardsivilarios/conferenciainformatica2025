package com.irojas.demojwt.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.irojas.demojwt.entity.dto.Consulta1;
import com.irojas.demojwt.service.Consulta1Service;

import lombok.RequiredArgsConstructor;

import com.irojas.demojwt.mapper.Consulta1Mapper;
@Service
@RequiredArgsConstructor
public class Consulta1ServiceImpl implements Consulta1Service {
    private final Consulta1Mapper consulta1mapper;
    @Override
    public List<Consulta1> listaConsulta1() {
        return consulta1mapper.consulta1();
    }

}
