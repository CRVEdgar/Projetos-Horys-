package com.example.api_pagamentoservice.services;

import com.example.api_pagamentoservice.repositories.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class PagamentoServcie {

    private final PagamentoRepository repository;

    public PagamentoServcie(PagamentoRepository repository) {
        this.repository = repository;
    }


}
