
<h1>Projeto de Estruturas de Dados - Java Swing</h1>

    <h2>Índice</h2>
    <ul>
        <li><a href="#introducao">Introdução</a></li>
        <li><a href="#objetivos">Objetivos</a></li>
        <li><a href="#estruturas-de-dados-utilizadas">Estruturas de Dados Utilizadas</a>
            <ul>
                <li><a href="#arvore">Árvore</a></li>
                <li><a href="#lista-encadeada">Lista Duplamente Encadeada</a></li>
            </ul>
        </li>
        <li><a href="#requisitos">Requisitos</a></li>
        <li><a href="#instalacao-e-execucao">Instalação e Execução</a></li>
        <li><a href="#funcionalidades">Funcionalidades</a></li>
        <li><a href="#autores">Autores</a></li>
    </ul>

    <h2 id="introducao">Introdução</h2>
    <p>Este projeto foi desenvolvido como parte da avaliação da disciplina de Estruturas de Dados na Faculdade de Engenharia de Sorocaba (Facens). O objetivo principal é implementar e demonstrar o uso de uma Árvore e de uma Lista Duplamente Encadeada em uma aplicação Java Swing.</p>
    <p>A aplicação desenvolvida é uma Lista de Estudos (To-do List) que permite o CRUD (Create, Read, Update, Delete) de matérias e tarefas. As matérias foram implementadas utilizando uma Árvore Binária de Busca, enquanto as tarefas foram gerenciadas através de uma Lista Duplamente Encadeada, associadas às matérias.</p>

    <h2 id="objetivos">Objetivos</h2>
    <ul>
        <li>Implementar uma Árvore e uma Lista Duplamente Encadeada em Java.</li>
        <li>Integrar essas estruturas de dados em uma interface gráfica utilizando Java Swing.</li>
        <li>Demonstrar as operações básicas dessas estruturas (inserção, remoção, busca, etc.).</li>
    </ul>

    <h2 id="estruturas-de-dados-utilizadas">Estruturas de Dados Utilizadas</h2>

    <h3 id="arvore">Árvore</h3>
    <p>A árvore implementada no projeto é uma Árvore Binária de Busca (BST - Binary Search Tree). As principais operações implementadas são:</p>
    <ul>
        <li>Inserção de elementos</li>
        <li>Remoção de elementos</li>
        <li>Busca de elementos</li>
        <li>Travessia (in-order, pre-order, post-order)</li>
    </ul>

    <h3 id="lista-encadeada">Lista Duplamente Encadeada</h3>
    <p>A Lista Duplamente Encadeada implementada é uma lista onde cada nó possui referências para o próximo e para o nó anterior. As operações básicas incluem:</p>
    <ul>
        <li>Inserção de elementos no início e no fim</li>
        <li>Remoção de elementos do início e do fim</li>
        <li>Busca de elementos</li>
        <li>Exibição da lista completa</li>
    </ul>

    <h2 id="requisitos">Requisitos</h2>
    <p>Para executar este projeto, você precisará ter o seguinte software instalado em seu sistema:</p>
    <ul>
        <li>Java Development Kit (JDK) 8 ou superior</li>
        <li>IDE Java (recomendado: IntelliJ IDEA, Eclipse, NetBeans)</li>
    </ul>

    <h2 id="instalacao-e-execucao">Instalação e Execução</h2>
    <ol>
        <li>Clone o repositório do projeto:
            <pre><code>git clone https://github.com/seu-usuario/seu-repositorio.git</code></pre>
        </li>
        <li>Navegue até o diretório do projeto:
            <pre><code>cd seu-repositorio</code></pre>
        </li>
        <li>Importe o projeto em sua IDE Java preferida.</li>
        <li>Compile e execute a aplicação.</li>
    </ol>

    <h2 id="funcionalidades">Funcionalidades</h2>
    <p>A aplicação possui uma interface gráfica construída com Java Swing que permite ao usuário interagir com a Árvore e a Lista Duplamente Encadeada. As principais funcionalidades incluem:</p>

    <h3>Operações na Árvore</h3>
    <ul>
        <li><strong>Inserir:</strong> Adiciona uma nova matéria à árvore.</li>
        <li><strong>Remover:</strong> Remove uma matéria existente na árvore.</li>
        <li><strong>Buscar:</strong> Pesquisa por uma matéria na árvore e destaca-a se encontrada.</li>
        <li><strong>Travessia:</strong> Exibe as matérias da árvore em diferentes ordens de travessia (in-order, pre-order, post-order).</li>
    </ul>

    <h3>Operações na Lista Duplamente Encadeada</h3>
    <ul>
        <li><strong>Inserir no Início:</strong> Adiciona uma nova tarefa no início da lista.</li>
        <li><strong>Inserir no Fim:</strong> Adiciona uma nova tarefa no final da lista.</li>
        <li><strong>Remover do Início:</strong> Remove a primeira tarefa da lista.</li>
        <li><strong>Remover do Fim:</strong> Remove a última tarefa da lista.</li>
        <li><strong>Buscar:</strong> Pesquisa por uma tarefa na lista e destaca-a se encontrada.</li>
        <li><strong>Exibir Lista:</strong> Exibe todas as tarefas associadas a uma matéria.</li>
    </ul>

    <h2 id="autores">Innovatrix</h2>
    <p>Este projeto foi desenvolvido pelo grupo Innovatrix: Ana Júlia Paifer, Brenda Miranda, Lauren Barbosa,
    Milene Micheloti, Sarah Oliveira</p>
    <ul>
    </ul>

    <h2>Licença</h2>
    <p>Este projeto é licenciado sob os termos da licença MIT. Consulte o arquivo <code>LICENSE</code> para obter mais informações.</p>

    <p>Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato com qualquer um dos autores. Agradecemos por utilizar nosso projeto!</p>
