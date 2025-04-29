<h1 align="center">📚 D2 Receitas - Sistema de Gestão de Livros e Receitas</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue.svg" alt="Java Badge">
  <img src="https://img.shields.io/badge/Spring_Boot-3.0-brightgreen.svg" alt="Spring Boot Badge">
  <img src="https://img.shields.io/badge/Projeto-Concluído-success.svg" alt="Status Badge">
</p>

<p align="center">
  Sistema web desenvolvido com Spring Boot para gerenciamento de livros de receitas, ingredientes, categorias e restaurantes.
  <br>
  A aplicação foi pensada para auxiliar equipes gastronômicas a organizarem suas degustações e materiais de referência.
</p>

<hr>

<h2>📋 Descrição do Projeto</h2>

<p>
  O projeto D2 Receitas tem como objetivo centralizar e facilitar o controle de receitas culinárias por meio de uma interface simples para cadastro, edição e consulta de dados relacionados a:
</p>

<ul>
  <li>Livros e receitas</li>
  <li>Ingredientes e medidas</li>
  <li>Categorias</li>
  <li>Referências e Degustações</li>
  <li>Usuários, Funcionários e Restaurantes</li>
</ul>

<h3>🔒 Segurança</h3>
<p>O projeto conta com autenticação, controle de acesso por perfis (roles) e proteção de rotas com Spring Security.</p>

<hr>

<h2>🛠️ Como foi feito</h2>

<ul>
  <li>Estrutura baseada em camadas: <code>Model</code>, <code>Repository</code>, <code>Service</code> e <code>Controller</code></li>
  <li>Spring Security configurado com handlers personalizados</li>
  <li>Geração de relatórios PDF via <code>PDFService</code></li>
  <li>Uso de anotações JPA para persistência em banco de dados relacional</li>
</ul>

<hr>

<h2>🧠 Aprendizados</h2>

<p>
  Este projeto foi fundamental para aplicar conceitos de arquitetura de software, segurança com Spring Security, geração de relatórios e organização modular em um sistema realista de cadastro e gestão.
</p>

<hr>

<h2>📌 Tecnologias Utilizadas</h2>

<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Spring Security</li>
  <li>Thymeleaf</li>
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
  <li>Configure as credenciais do banco de dados em <code>application.properties</code></li>
  <li>Execute a classe <code>D2ReceitasApplication.java</code></li>
  <li>Acesse via navegador em <code>http://localhost:8080</code></li>
</ol>

<hr>

<h2>🤝 Contato</h2>

<p>
  Feito com 💙 por Juliano Oliveira. Entre em contato pelo <a href="https://github.com/julidos">GitHub</a>!
</p>
