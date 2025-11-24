![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

> Um sistema robusto de cadastro e gestão de dados via console, demonstrando domínio de POO e Estruturas de Dados em Java.

Este projeto é uma aplicação **CRUD (Create, Read, Update, Delete)** desenvolvida inteiramente em **Java**, focada na manipulação eficiente de objetos em memória e na interação via terminal. O objetivo principal é demonstrar a aplicação prática de conceitos como Herança, Polimorfismo, Encapsulamento e manipulação de `ArrayList`.

---

## ✨ Funcionalidades

O sistema oferece um menu interativo e intuitivo para o gerenciamento completo dos registros.

### 🚀 Funcionalidades Principais
- [x] **Cadastro Dinâmico**: Inserção de novos registros com validação de dados (mínimo de 5 atributos por objeto).
- [x] **Listagem Tabular**: Visualização organizada de todos os registros cadastrados.
- [x] **Busca Detalhada**: Localização de registros específicos por ID ou atributo chave.
- [x] **Seed de Dados**: Inicialização automática com 7 registros pré-carregados para testes rápidos.

### ⚙️ Funcionalidades Avançadas
- [x] **Herança de Classes**: Implementação de classes especializadas (Filha/Pai) estendendo as funcionalidades do objeto base.
- [x] **Ordenação Personalizada**: Algoritmo para listar registros ordenados por critérios específicos (ex: Nome, Valor).
- [x] **Remoção Segura**: Exclusão de registros com etapa de confirmação para evitar erros.
- [x] **Edição de Registros**: Possibilidade de atualizar atributos de objetos já persistidos em memória.

---

## 🧱 Estrutura do Projeto

A arquitetura foi pensada para separar responsabilidades, facilitando a manutenção e a escalabilidade.

```text
src/
├── ☕ Programa.java              # Entry point: Gerencia o menu e o loop principal.
├── 📦 ObjetoBase.java            # Model: Classe pai (ex: Produto, Pessoa).
├── 📦 ObjetoDerivado.java        # Model: Especialização (ex: Eletronico, Aluno).
└── ⚙️ GerenciadorRegistros.java  # Controller: Lógica de negócio e operações CRUD.
