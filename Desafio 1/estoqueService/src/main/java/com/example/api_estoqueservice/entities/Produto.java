package com.example.api_estoqueservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    private Long id;

    private String nome;
    private int quantidade;

    public void entrada(int quantidade){
        this.quantidade += quantidade;
    }
    public void saida(int quantidade){
        this.quantidade -= quantidade;
    }
}
