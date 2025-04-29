<h1 align="center">📚 D2 Receitas - Sistema de Gestão de Livros e Receitas</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue.svg" alt="Java Badge">
  <img src="https://img.shields.io/badge/Spring_Boot-3.0-brightgreen.svg" alt="Spring Boot Badge">
  <img src="https://img.shields.io/badge/Projeto-Concluído-success.svg" alt="Status Badge">
</p>

<p align="center">
  Sistema web desenvolvido com Spring Boot para gerenciamento de livros de receitas, ingredientes, categorias e restaurantes.
  <br>
  Projeto final do curso de Análise e Desenvolvimento de Sistemas - Faculdade Senac DF 🎓.
</p>

<hr>

<h2>🧠 Aprendizados</h2>

<p>
  Este projeto foi essencial para consolidar diversos conhecimentos de back-end Java em um contexto de aplicação realista.
</p>

<ul>
  <li>Compreensão aprofundada de <strong>relacionamentos JPA</strong> e mapeamentos complexos</li>
  <li>Domínio sobre a estruturação de projetos Spring Boot em camadas limpas</li>
  <li>Criação de rotinas assíncronas e uso de <strong>Data Transfer Objects (DTOs)</strong></li>
  <li>Implementação de segurança robusta com Spring Security e perfis de usuários</li>
  <li>Trabalho com <strong>relatórios PDF</strong> e exportação de dados</li>
</ul>

<hr>

<h2>📋 Descrição do Projeto</h2>

<p>
  O D2 Receitas é uma aplicação Java com foco no gerenciamento culinário profissional. A ideia surgiu da necessidade de organizar diversas receitas, ingredientes e livros em um só lugar, permitindo fácil acesso a informações, geração de relatórios e controle de degustações e categorias por restaurante.
</p>

<h3>🔍 Funcionalidades principais:</h3>

<ul>
  <li>Cadastro e gerenciamento de receitas, ingredientes e suas medidas</li>
  <li>Organização de livros e páginas contendo receitas</li>
  <li>Relacionamento de receitas com categorias e restaurantes</li>
  <li>Cadastro de degustações associadas a funcionários</li>
  <li>Geração de relatórios PDF com dados organizados e filtrados</li>
  <li>Autenticação de usuários com níveis de acesso (admin e funcionário)</li>
</ul>

<h3>🔒 Segurança</h3>

<ul>
  <li>Integração com <strong>Spring Security</strong> para controle de autenticação</li>
  <li>Handlers personalizados para tratamento de erros de login</li>
  <li>Proteção de rotas e perfis de acesso diferenciados</li>
</ul>

<hr>

<h2>🛠️ Como foi feito</h2>

<ul>
  <li>Arquitetura em camadas: <code>Controller</code>, <code>Service</code>, <code>Repository</code>, <code>Model</code></li>
  <li>Spring Data JPA com relacionamentos complexos entre entidades (OneToMany, ManyToMany)</li>
  <li>Thymeleaf como motor de templates para renderização das páginas</li>
  <li>Geração de relatórios PDF usando <code>PDFService</code> customizado</li>
  <li>Mensagens de feedback para o usuário usando Thymeleaf + Bootstrap</li>
</ul>

<hr>

<h2>📌 Tecnologias Utilizadas</h2>

<ul>
  <li><a href="https://www.java.com/">Java 17</a></li>
  <li><a href="https://spring.io/projects/spring-boot">Spring Boot</a></li>
  <li><a href="https://spring.io/projects/spring-security">Spring Security</a></li>
  <li><a href="https://spring.io/projects/spring-data-jpa">Spring Data JPA</a></li>
  <li><a href="https://www.thymeleaf.org/">Thymeleaf</a></li>
  <li>Maven</li>
</ul>

<hr>

<h2>📁 Estrutura do Projeto</h2>

<pre>
├── controller/
├── model/
├── repository/
├── security/
├── service/
├── D2ReceitasApplication.java
└── resources/
</pre>

<hr>

<h2>🚀 Como Executar</h2>

<ol>
  <li>Clone o repositório</li>
  <li>Importe como projeto Maven em sua IDE (IntelliJ, Eclipse, VSCode...)</li>
  <li>Configure as credenciais do banco de dados em <code>src/main/resources/application.properties</code></li>
  <li>Execute a classe <code>D2ReceitasApplication.java</code></li>
  <li>Acesse <code>http://localhost:8080</code> para utilizar o sistema</li>
</ol>

<hr>

<h2>🤝 Contato</h2>

<p>
  Feito com 💙 por Juliano Oliveira. Entre em contato pelo <a href="https://github.com/julidos">GitHub</a>!
</p>
