package com.example.storefrontlab.service;

import com.example.storefrontlab.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WarehouseService {

    private final RestTemplate restTemplate;
    private final String warehouseUrl = "http://localhost:8083/estoque";

    public WarehouseService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Envia produto para o warehouse (POST)
    public Produto enviarProdutoParaWarehouse(Produto produto) {
        return restTemplate.postForObject(warehouseUrl, produto, Produto.class);
    }

    // Atualiza produto no warehouse (PUT)
    public void atualizarProdutoNoWarehouse(Produto produto) {
        restTemplate.put(warehouseUrl, produto);
    }

    // Consulta produto por ID no warehouse (GET)
    public Produto buscarProdutoNoWarehouse(Long id) {
        return restTemplate.getForObject(warehouseUrl + "/" + id, Produto.class);
    }
}
