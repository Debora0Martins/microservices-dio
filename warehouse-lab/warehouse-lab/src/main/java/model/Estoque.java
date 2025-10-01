package com.example.warehouse.model;

import jakarta.persistence.*;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private Integer quantidade;

    public Estoque() {}

    public Estoque(String nomeProduto, Integer quantidade) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}
