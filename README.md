## Desafio técnico — API de Atendimento e Chamados
### Contexto

Uma empresa precisa de uma API para registrar e acompanhar chamados de suporte técnico.

Um chamado pertence a um cliente, possui uma categoria, prioridade, status e histórico de alterações.

Seu objetivo é desenvolver o backend REST utilizando Java e Spring Boot.

## Configuracação Inicial

## Docker-compose
```yaml

services:
  postgres:
    image: postgres:18
    container_name: postgres-istm-db
    ports:
      - "5432:5432"
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: admin
      POSTGRES_DB: itsmapiDB
    volumes:
      - postgres_data:/var/lib/postgresql

volumes:
  postgres_data:
```
- para subir o container com o postgres
```bash
docker compose up -d
```
- execute um docker ps para confirmar com container com a imagem do postgres:18 com o nome *postgres-istm-db*

## Application.properties

```
spring.application.name=itsm-api

server.port=9090

spring.datasource.url=jdbc:postgresql://localhost:5432/itsmapiDB
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.username=postgres
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update
```