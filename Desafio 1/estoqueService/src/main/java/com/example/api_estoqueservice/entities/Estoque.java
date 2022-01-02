package com.example.api_estoqueservice.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<Produto> prosutos = new LinkedHashSet<>();

    public Estoque() {
    }


}
