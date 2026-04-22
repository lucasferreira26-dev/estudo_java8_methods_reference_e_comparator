# 📦 Estudo: Method References e Comparator no Java 8

Este projeto foi desenvolvido com o objetivo de praticar conceitos importantes introduzidos no Java 8, com foco em:

- Method References (`::`)
- Referência a construtores
- Interfaces funcionais (`BiFunction`)
- Ordenação com `Comparator`
- Encadeamento de critérios com `thenComparing`

---

## 🚀 Conceitos Praticados

### 🔹 Method Reference
Utilização de referências a métodos para tornar o código mais limpo e expressivo, evitando o uso desnecessário de expressões lambda.

Exemplos aplicados:
- Referência a método de instância → `Produto::getPreco`
- Referência a método de instância → `Produto::getNome`
- Referência a método estático → `System.out::println`
- Referência a construtor → `Produto::new`

---

### 🔹 Interface Funcional `BiFunction`

Foi utilizada para instanciar objetos da classe `Produto` de forma mais funcional.

**Ideia central:**
- Recebe dois parâmetros (`String`, `Double`)
- Retorna um objeto `Produto`

Isso permite desacoplar a lógica de criação de objetos.

---

### 🔹 Ordenação com Comparator

#### ✔ Ordenação por preço
- Utilização de `comparingDouble`
- Evita autoboxing
- Melhor performance

#### ✔ Ordenação por nome
- Uso de `comparing`
- Aproveita a ordem natural de `String`

#### ✔ Ordenação composta
- Primeiro critério: preço
- Segundo critério (desempate): nome
- Utilização de `thenComparing`

---

## 🧩 Estrutura do Projeto

### Classe `Produto`

Representa um produto com:
- Nome
- Preço

Também sobrescreve o método `toString()` para facilitar a visualização dos dados.

---

### Classe `Main`

Responsável por:

- Criar objetos utilizando referência a construtor
- Armazenar os produtos em uma lista
- Aplicar diferentes tipos de ordenação
- Exibir os resultados no console

---

## 🧠 Aprendizados

Durante o desenvolvimento deste exercício, foi possível consolidar:

- Como substituir lambdas por method references
- Como utilizar `Comparator` de forma mais expressiva
- Como encadear critérios de ordenação
- Como utilizar interfaces funcionais para criar objetos
- A importância de escrever código mais limpo e reutilizável
