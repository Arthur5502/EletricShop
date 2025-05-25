<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EletricShop - Sistema de Carrinho de Compras</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Inter', sans-serif;
        }
        .content-section {
            background-color: #ffffff;
            border-radius: 0.75rem; /* 12px */
            padding: 2rem; /* 32px */
            margin-bottom: 1.5rem; /* 24px */
            box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px rgba(0, 0, 0, 0.06);
        }
        .content-section h2 {
            font-size: 1.5rem; /* 24px */
            font-weight: 600;
            color: #1f2937; /* gray-800 */
            margin-bottom: 1rem; /* 16px */
            border-bottom: 2px solid #e5e7eb; /* gray-200 */
            padding-bottom: 0.5rem; /* 8px */
        }
        .content-section p, .content-section li {
            color: #4b5563; /* gray-600 */
            line-height: 1.6;
        }
        .content-section ul {
            list-style-type: disc;
            padding-left: 1.5rem; /* 24px */
            margin-top: 0.5rem; /* 8px */
        }
        .code-block {
            background-color: #1f2937; /* gray-800 */
            color: #d1d5db; /* gray-300 */
            padding: 1rem; /* 16px */
            border-radius: 0.5rem; /* 8px */
            overflow-x: auto;
            font-family: 'Courier New', Courier, monospace;
            font-size: 0.875rem; /* 14px */
        }
        .badge {
            display: inline-block;
            padding: 0.25rem 0.75rem;
            font-size: 0.875rem;
            font-weight: 600;
            border-radius: 0.375rem;
        }
        .java-badge {
            background-color: #ED8B00;
            color: white;
        }
        .footer {
            text-align: center;
            padding: 1.5rem;
            color: #6b7280; /* gray-500 */
            font-size: 0.875rem; /* 14px */
        }
    </style>
</head>
<body class="bg-gray-100 text-gray-900 antialiased">

    <div class="container mx-auto p-4 md:p-8 max-w-4xl">

        <header class="text-center mb-10">
            <h1 class="text-4xl font-bold text-gray-800 mb-2">
                EletricShop - Sistema de Carrinho de Compras 🛒
            </h1>
            <span class="badge java-badge">
                <svg xmlns="http://www.w3.org/2000/svg" class="inline-block h-4 w-4 mr-1" viewBox="0 0 20 20" fill="currentColor">
                    <path fill-rule="evenodd" d="M10 18a8 8 0 100-16 8 8 0 000 16zM5.53 5.53a.75.75 0 011.06-1.06l7.88 7.88a.75.75 0 01-1.06 1.06L5.53 5.53zM4.47 14.47a.75.75 0 010-1.06l7.88-7.88a.75.75 0 111.06 1.06L5.53 14.47a.75.75 0 01-1.06 0z" clip-rule="evenodd" />
                </svg>
                Java
            </span>
        </header>

        <section class="content-section">
            <h2>📄 Descrição</h2>
            <p>
                <strong>EletricShop</strong> é um projeto de console (CLI - Command-Line Interface) em Java que simula um sistema de carrinho de compras para uma loja de eletrônicos. O sistema foi desenvolvido como um exercício prático para aplicar e demonstrar os conceitos fundamentais da Programação Orientada a Objetos (POO).
            </p>
        </section>

        <section class="content-section">
            <h2>✨ Funcionalidades</h2>
            <ul>
                <li><strong>Adicionar mercadorias:</strong> Permite inserir diferentes tipos de produtos (Celulares e Computadores) ao carrinho.</li>
                <li><strong>Remover mercadorias:</strong> Remove itens do carrinho através do seu código único.</li>
                <li><strong>Listar conteúdo:</strong> Exibe um relatório detalhado de todos os itens no carrinho, incluindo suas descrições e preços.</li>
                <li><strong>Cálculo de Preços:</strong> Calcula o valor total dos produtos e também o valor final com desconto para pagamento à vista.</li>
                <li><strong>Descontos Polimórficos:</strong> Aplica regras de desconto diferentes para cada tipo de produto (desconto variável para celulares e fixo para computadores).</li>
            </ul>
        </section>

        <section class="content-section">
            <h2>🛠️ Tecnologias Utilizadas</h2>
            <ul>
                <li>Java (JDK 8 ou superior)</li>
            </ul>
        </section>

        <section class="content-section">
            <h2>📂 Estrutura do Projeto</h2>
            <p>O projeto utiliza uma arquitetura em camadas para separar as responsabilidades, um padrão comum no desenvolvimento de software:</p>
            <pre class="code-block mt-4"><code>EletricShop/
└── src/
    └── br/
        └── com/
            └── eletricshop/
                ├── model/          # Classes que representam os dados (Entidades)
                │   ├── Mercadoria.java
                │   ├── Celular.java
                │   └── Computador.java
                │
                ├── service/        # Classes com a lógica de negócio
                │   └── Carrinho.java
                │
                └── ui/             # Classes de interface com o usuário
                    ├── TelaCarrinho.java
                    └── Main.java</code></pre>
        </section>

        <section class="content-section">
            <h2>🚀 Como Executar o Projeto</h2>
            <p>Você precisará ter o <strong>Java Development Kit (JDK)</strong> instalado em sua máquina.</p>
            <ol class="list-decimal pl-5 mt-2 space-y-1">
                <li><strong>Clone ou baixe</strong> este repositório para o seu computador.</li>
                <li><strong>Abra o projeto</strong> em sua IDE preferida (Eclipse, IntelliJ, VS Code, etc.).
                    <ul class="list-disc pl-5">
                        <li>Selecione a opção "Open Project" ou "Import Project" e aponte para a pasta raiz <code>EletricShop</code>. A IDE reconhecerá a estrutura automaticamente.</li>
                    </ul>
                </li>
                <li><strong>Localize o arquivo de entrada:</strong> Navegue até <code>src/br/com/eletricshop/ui/Main.java</code>.</li>
                <li><strong>Execute o programa:</strong> Clique com o botão direito no arquivo <code>Main.java</code> e selecione a opção <strong>"Run"</strong> ou <strong>"Executar"</strong>. O menu da aplicação aparecerá no console da IDE.</li>
            </ol>
        </section>

        <section class="content-section">
            <h2>🧠 Conceitos de POO Demonstrados</h2>
            <p>Este projeto serve como um exemplo prático dos seguintes pilares da POO:</p>
            <ul class="space-y-1">
                <li><strong>Abstração:</strong> A classe <code>Mercadoria</code> define um modelo genérico de produto, com os atributos e métodos essenciais, sem se preocupar com os detalhes de cada tipo.</li>
                <li><strong>Herança:</strong> As classes <code>Celular</code> e <code>Computador</code> herdam de <code>Mercadoria</code>, reutilizando sua estrutura e adicionando comportamentos específicos.</li>
                <li><strong>Polimorfismo:</strong> No método <code>conteudo()</code> da classe <code>Carrinho</code>, a chamada <code>m.preco_a_vista()</code> executa a lógica de cálculo correta dependendo se <code>m</code> é um <code>Celular</code> ou um <code>Computador</code>.</li>
                <li><strong>Encapsulamento:</strong> Os atributos das classes são <code>private</code>, e o acesso a eles é controlado por métodos públicos (<code>getters</code> e <code>setters</code>), garantindo a integridade dos dados.</li>
                <li><strong>Composição:</strong> A classe <code>Carrinho</code> <em>tem uma</em> lista (<code>ArrayList</code>) de <code>Mercadoria</code>, demonstrando a relação de composição entre objetos.</li>
            </ul>
        </section>

        <footer class="footer">
            <p>Projeto desenvolvido por <strong>Arthur</strong>.</p>
            <p><em>Atualizado em: 25 de maio de 2025</em></p>
        </footer>

    </div>

</body>
</html>
