package com.example.api_estoqueservice.entities;

import javax.persistence.*;

@Entity
public class ProdutoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @OneToOne
    private Estoque estoque;
    @OneToOne
    private Produto produto;
    private int quantidadeEmEstoque;

    public ProdutoEstoque(Estoque estoque, Produto produto, int quantidadeEmEstoque) {
        this.estoque = estoque;
        this.produto = produto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public ProdutoEstoque() {

    }

    public void entradaProduto(int quantidade){
        this.quantidadeEmEstoque += quantidade;
    }
    public void saidaProduto(int quantidade){
        this.quantidadeEmEstoque -= quantidade;
    }
}
