package com.example.api_estoqueservice.services;

import com.example.api_estoqueservice.repositories.ProdutoEstoqueRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoEstoqueRepository repository;

    public ProdutoService(ProdutoEstoqueRepository repository) {
        this.repository = repository;
    }
}
