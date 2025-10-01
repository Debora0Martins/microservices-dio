package com.example.warehouse.controller;

import com.example.warehouse.model.Estoque;
import com.example.warehouse.repository.EstoqueRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private final EstoqueRepository repository;

    public EstoqueController(EstoqueRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Estoque adicionarProduto(@RequestBody Estoque produto) {
        return repository.save(produto);
    }

    @PutMapping
    public Estoque atualizarProduto(@RequestBody Estoque produto) {
        if (produto.getId() != null && repository.existsById(produto.getId())) {
            return repository.save(produto);
        }
        return null;
    }

    @GetMapping("/{id}")
    public Estoque obterProduto(@PathVariable Long id) {
        Optional<Estoque> produto = repository.findById(id);
        return produto.orElse(null);
    }

    @GetMapping
    public List<Estoque> listarProdutos() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Produto deletado com sucesso!";
        }
        return "Produto não encontrado!";
    }
}
