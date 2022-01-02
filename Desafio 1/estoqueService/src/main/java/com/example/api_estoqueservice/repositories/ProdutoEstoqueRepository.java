package com.example.api_estoqueservice.repositories;

import com.example.api_estoqueservice.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoEstoqueRepository extends JpaRepository<Produto, Long> {

}
