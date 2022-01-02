package com.example.api_estoqueservice.controllers;

import com.example.api_estoqueservice.services.ProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private final ProdutoService service;

    public EstoqueController(ProdutoService service) {
        this.service = service;
    }
}
