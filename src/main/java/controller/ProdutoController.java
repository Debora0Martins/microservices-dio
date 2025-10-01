package com.example.storefrontlab.controller;

import com.example.storefrontlab.model.Produto;
import com.example.storefrontlab.repository.ProdutoRepository;
import com.example.storefrontlab.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repository;
    private final WarehouseService warehouseService;

    public ProdutoController(ProdutoRepository repository, WarehouseService warehouseService) {
        this.repository = repository;
        this.warehouseService = warehouseService;
    }

    // Criar produto no storefront e enviar para warehouse
    public Produto criarProduto(@RequestBody Produto produto) {
        Produto salvo = repository.save(produto);
        warehouseService.enviarProdutoParaWarehouse(produto); // envia para warehouse
        return salvo;
    }

    // Listar produtos
    @GetMapping
    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    // Obter produto por ID
    @GetMapping("/{id}")
    public Produto obterProduto(@PathVariable Long id) {
        Optional<Produto> produto = repository.findById(id);
        return produto.orElse(null);
    }

    // Atualizar produto
    @PutMapping
    public Produto atualizarProduto(@RequestBody Produto produto) {
        if (produto.getId() != null && repository.existsById(produto.getId())) {
            Produto atualizado = repository.save(produto);
            warehouseService.atualizarProdutoNoWarehouse(produto); // atualiza no warehouse
            return atualizado;
        }
        return null;
    }

    // Deletar produto
    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Produto deletado com sucesso!";
        }
        return "Produto não encontrado!";
    }
}
