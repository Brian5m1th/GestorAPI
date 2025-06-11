# GestorAPI

## Visão Geral

O **GestorAPI** é uma aplicação Spring Boot projetada para gerenciar funcionários de forma simples e eficiente. Ela expõe uma API RESTful para criação, consulta, atualização e remoção de funcionários. A aplicação usa um banco de dados em memória (H2) e inclui documentação automática da API via Swagger (OpenAPI 3).

## Funcionalidades

- Criar um novo funcionário
- Listar todos os funcionários
- Consultar funcionário por ID
- Atualizar parcialmente os dados de um funcionário
- Deletar funcionário por ID
- Validação de dados com Jakarta Validation

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.0
- Spring Data JPA
- Springdoc OpenAPI (Swagger)
- Maven
- Lombok
- H2 Database
- Jakarta Bean Validation

## Começando

### Pré-requisitos

- Java 21 ou superior
- Maven 4.0.0 ou superior
- Docker (opcional, caso deseje usar banco externo no futuro)

### Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/GestorAPI.git
   cd GestorAPI

2. Execute a aplicação localmente:


   ```bash
   ./mvnw spring-boot:run
   ```
   
3. Acesse a documentação da API gerada automaticamente via Swagger em:


   ```bash
   http://localhost:8080/gestorAPI/api/swagger
   ```

4. Acesse o console do banco H2 (modo dev):
 
    ```bash
   http://localhost:8080/gestorAPI/api/h2-console
   ```
#### Use as credenciais:

```bash
JDBC URL: jdbc:h2:mem:demodb

Usuário: sa

Senha: (deixe em branco)   
```

### Executando Testes

   ```bash
  ./mvnw test
   ```
 
