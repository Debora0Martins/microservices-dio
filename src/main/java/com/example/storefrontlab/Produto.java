package com.example.storefrontlab;

public class Produto {
    private Long id;
    private int quantidade;

    // Construtores
    public Produto() {}
    public Produto(Long id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
