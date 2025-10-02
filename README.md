# Microservices  – Storefront & Warehouse

## 🏗️ Descrição do Projeto

Este projeto é um laboratório de microsserviços desenvolvido em **Java** com **Spring Boot**, demonstrando uma arquitetura modularizada com **dois módulos principais**:

1. **Storefront** – Responsável pelo front-end de produtos, operações de cadastro, listagem e integração com o módulo Warehouse.
2. **Warehouse** – Responsável pelo gerenciamento de estoque, fornecendo endpoints REST para criar, atualizar e consultar produtos.

O projeto foi desenvolvido com foco em boas práticas de **arquitetura de microsserviços**, **Spring Boot**, **RESTful APIs**, e **integração entre serviços**.

---

## 💻 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.11-SNAPSHOT**
- **Spring Web (REST API)**
- **Spring Data JPA**
- **H2 Database (em memória para testes)**
- **Git/GitHub**
- **Maven/Gradle**
- **IDE:** IntelliJ IDEA ou qualquer IDE compatível com Java/Spring Boot

---

## 📂 Estrutura do Projeto

```text
microservices-lab/
│
├── storefront-lab/          # Módulo Storefront
│   ├── src/main/java/com/example/storefrontlab
│   │   ├── Application.java
│   │   ├── controller/
│   │   ├── model/
│   │   ├── repository/
│   │   └── service/
│   └── src/main/resources/application.properties
│
└── warehouse-lab/           # Módulo Warehouse
    ├── src/main/java/com/example/warehousenovo
    │   ├── Application.java
    │   ├── controller/
    │   ├── model/
    │   ├── repository/
    │   └── service/
    └── src/main/resources/application.properties


## ⚙️ Como Rodar o Projeto

### Clone o repositório:
```bash
git clone https://github.com/Debora0Martins/microservices-dio.git
cd microservices-lab

cd storefront-lab
./gradlew clean build
./gradlew bootRun

cd ../warehouse-lab
./gradlew clean build
./gradlew bootRun


estar endpoints usando Postman, cURL ou navegador:

Storefront: http://localhost:8080/produtos

Warehouse: http://localhost:8081/estoque

Observação: as portas podem ser configuradas em application.properties.

## 📝 Funcionalidades ##
Storefront

CRUD de produtos (Create, Read, Update, Delete)

Integração com módulo Warehouse via RestTemplate

API RESTful

Warehouse

CRUD de estoque

Endpoints REST para adicionar, atualizar, consultar e listar produtos

Armazenamento em H2 Database para testes

## 🔗 Endpoints Principais ##

Storefront
Método	Endpoint	Descrição
GET	/produtos	Lista todos os produtos
POST	/produtos	Cria um novo produto
PUT	/produtos/{id}	Atualiza produto existente
DELETE	/produtos/{id}	Remove produto
Warehouse
Método	Endpoint	Descrição
GET	/estoque	Lista todos os produtos
GET	/estoque/{id}	Consulta produto por ID
POST	/estoque	Adiciona produto no estoque
PUT	/estoque	Atualiza produto no estoque

## 🧪 Testes ##

O projeto contém testes unitários para validação das entidades e serviços.

Para executar os testes:

./gradlew test

Fork do repositório

Criação de branch para novas funcionalidades:

git checkout -b feature/nome-feature


📜 Licença

MIT License © 2025 – Débora Martins

Permissão é concedida para uso, cópia, modificação e distribuição do projeto.

## 👩‍💻 Contato ##

Débora Martins – GitHub

Email: ddeboraf.mar@gmail.com
