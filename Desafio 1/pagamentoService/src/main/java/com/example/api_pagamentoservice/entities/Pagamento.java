package com.example.api_pagamentoservice.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoPagamento tipoPagamento;

    @OneToMany
    private List<Produto> produto = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Pagamento() {
    }

    public Pagamento(TipoPagamento tipoPagamento, List<Produto> produto, Usuario usuario) {
        this.tipoPagamento = tipoPagamento;
        this.produto = produto;
        this.usuario = usuario;
    }
}
