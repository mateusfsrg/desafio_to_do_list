# 📝 Desafio To-Do List - Spring Boot

## 📌 Descrição do Projeto

Este projeto consiste em uma aplicação simples de **To-Do List** parão para uma vaga de desenvolvedor jr, 
onde o usuário pode criar, listar, atualizar e deletar uma lista. 
O objetivo do desafio é desenvolver a aplicação utilizando boas práticas de programação, 
manipulação de estados e interface intuitiva através do Spring Boot.

---

## 🚀 Tecnologias Utilizadas

- Java
- MySQL
- Spring Boot
- Diversas bibliotecas entre elas: Hibernate(JPA), Starter Web, H2, DevTools, entre outras.

---

## 📂 Estrutura do Projeto

```bash
desafio-to-do-list/
├── .gitattributes           # Atributos de controle de versão do Git
├── .gitignore               # Arquivos ignorados pelo Git
├── HELP.md                  # Documentação de ajuda
├── mvnw                     # Script do Maven para execução no Linux/Mac
├── mvnw.cmd                 # Script do Maven para execução no Windows
├── pom.xml                  # Arquivo de configuração do Maven
├── README.md                # Documentação principal
├── .mvn/                    # Diretório de configuração do Maven Wrapper
│   └── wrapper/
│       └── maven-wrapper.properties  # Propriedades do Maven Wrapper
├── src/                     # Código-fonte do projeto
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── desafio_to_do_list/
│   │   │               ├── DesafioToDoListApplication.java  # Arquivo principal da aplicação
│   │   │               ├── controller/
│   │   │               │   └── TodoController.java        # Lógica do controlador de tarefas
│   │   │               ├── entity/
│   │   │               │   └── Todo.java                  # Entidade da tarefa
│   │   │               ├── repository/
│   │   │               │   └── TodoRepository.java        # Interface de repositório para operações no banco
│   │   │               └── service/
│   │   │                   └── TodoService.java           # Lógica de serviços para as tarefas
│   │   └── resources/
│   │       ├── application.properties  # Configurações do Spring Boot
│   │       └── static/                 # Arquivos estáticos (CSS, imagens, etc.)
│   │       └── templates/              # Templates Thymeleaf (se houver)
│   ├── test/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── desafio_to_do_list/
│   │                   └── DesafioToDoListApplicationTests.java  # Testes de integração da aplicação
│   └── resources/
│       └── application.properties  # Configurações para o ambiente de teste
├── target/                   # Diretório gerado pelo Maven com classes compiladas
│   ├── classes/              # Classes compiladas do projeto
│   ├── generated-sources/    # Fontes geradas automaticamente
│   ├── generated-test-sources/ # Fontes de testes geradas automaticamente
│   └── test-classes/         # Classes de teste compiladas
```
---

## 🌟 Considerações Finais

Esse projeto tem como objetivo mostrar as boas práticas de desenvolvimento, utilizando o **Spring Boot** para criar uma aplicação robusta e escalável de **To-Do List**. Ao longo do desenvolvimento, buscamos implementar não apenas a funcionalidade esperada, mas também garantir a manutenibilidade e a qualidade do código por meio de testes e uma arquitetura bem estruturada.

Fico feliz em compartilhar esse desafio com você, e espero que tenha gostado de acompanhar o processo de construção dessa aplicação. Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato ou contribuir para o projeto.

---

## 📱 Minhas Redes Sociais

- [LinkedIn](https://www.linkedin.com/in/mateusfsrgsouza/)
- [GitHub](https://github.com/mateusfsrg)



