# Todo List API

Uma API simples para gerenciamento de tarefas com funcionalidades CRUD.

## Tecnologias Utilizadas

- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **OpenAPI 3 (via SpringDoc)**
- **MySQL**

## Boas Práticas Implementadas

- **Princípios SOLID** para um design de código mais flexível e manutenível
- **DRY (Don't Repeat Yourself)** para evitar duplicação desnecessária
- **YAGNI (You Aren't Gonna Need It)** para manter o foco no que é essencial
- **KISS (Keep It Simple, Stupid)** para soluções simples e eficientes
- **API RESTful** para uma interface de comunicação bem estruturada
- **Injeção de Dependências** com Spring para maior flexibilidade e testabilidade
- **Tratamento centralizado de erros** para respostas mais claras
- **Documentação Automática** usando Swagger e OpenAPI 3

## Como Rodar a Aplicação

- Clonar repositório git
- Construir o projeto:

```bash 
$ ./mvnw clean package
```
- Executar aplicação:

```bash 
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

## Acesse a API

- API Base URL: http://localhost:8080
- Documentação Swagger: http://localhost:8080/swagger-ui.html

## API Endpoints

### 1. Criar Tarefa
- **Método:** `POST`
- **URL:** `/todos`
- **Descrição:** Cria uma nova tarefa.
- **Exemplo de Requisição (Insomnia ou Swagger UI):**
  - No **Insomnia** ou **Swagger UI**, escolha o método **POST** e insira a URL: `http://localhost:8080/todos`.
  - Envie o seguinte payload no **Body** (em formato JSON):
    ```json
    {
      "nome": "Estudar Java e Spring",
      "descricao": "Aprofundar no Java",
      "realizado": false,
      "prioridade": 1
    }
    ```

    - **Exemplo de Resposta:**
    ```json
    {
      "id": 1,
      "nome": "Estudar Java e Spring",
      "descricao": "Aprofundar no Java",
      "realizado": false,
      "prioridade": 1
      
    }
    ```

### 2. Listar Tarefas
- **Método:** `GET`
- **URL:** `/todos`
- **Descrição:** Lista todas as tarefas criadas.
- **Exemplo de Resposta:**
    ```json
    [
      {
        "id": 1,
        "nome": "Estudar Java e Spring",
        "descricao": "Aprofundar no Java",
        "realizado": false,
        "prioridade": 1
      }
    ]
    ```

### 3. Atualizar Tarefa
- **Método:** `PUT`
- **URL:** `/todos/{id}`
- **Descrição:** Atualiza uma tarefa existente com base no ID.
- **Exemplo de Requisição:**
    ```json
    {
      "nome": "Estudar Java Avançado",
      "descricao": "Estudar conceitos avançados de Java",
      "realizado": true,
      "prioridade": 2
    }
    ```
- **Exemplo de Resposta:**
    ```json
    {
      "id": 1,
      "nome": "Estudar Java Avançado",
      "descricao": "Estudar conceitos avançados de Java",
      "realizado": true,
      "prioridade": 2
    }
    ```

### 4. Remover Tarefa
- **Método:** `DELETE`
- **URL:** `/todos/{id}`
- **Descrição:** Remove uma tarefa existente com base no ID.
- **Exemplo de Requisição:**
    - No **Insomnia** ou **Swagger UI**, escolha o método **DELETE** e insira a URL:
    ```json
    http://localhost:8080/todos/1

    [ ]
    ```



