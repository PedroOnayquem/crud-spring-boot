# CRUD de Usuários – Spring Boot

API REST simples para cadastro de usuários (CRUD), desenvolvida com **Spring Boot**, **Spring Data JPA** e **MySQL**.

## Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Funcionalidades
- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Atualizar usuário
- Deletar usuário

## Endpoints
- POST `/usuarios`
- GET `/usuarios`
- GET `/usuarios/{id}`
- PUT `/usuarios/{id}`
- DELETE `/usuarios/{id}`

## Executar o projeto
1. Configurar o MySQL no `application.properties`
2. Rodar a aplicação:
mvn spring-boot:run
API disponível em: `http://localhost:8081`

Os endpoints foram testados utilizando:
- **Thunder Client**
- **Swagger UI**
Documentação Swagger

Após subir a aplicação, acesse:
`http://localhost:8081/swagger-ui.html`
ou
`http://localhost:8081/swagger-ui/index.html`


## Autor

Pedro Onayquen  
https://github.com/PedroOnayquen

