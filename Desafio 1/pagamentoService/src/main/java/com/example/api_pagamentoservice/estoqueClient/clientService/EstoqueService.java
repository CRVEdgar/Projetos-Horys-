package com.example.api_pagamentoservice.estoqueClient.clientService;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "trello-service")
public interface EstoqueService {


}
