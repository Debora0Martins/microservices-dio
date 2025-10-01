package com.example.warehouse.repository;

import com.example.warehouse.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {}
