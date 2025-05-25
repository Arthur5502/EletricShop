EletricShop - Sistema de Carrinho de Compras 🛒
📄 Descrição
EletricShop é um projeto de console (CLI - Command-Line Interface) em Java que simula um sistema de carrinho de compras para uma loja de eletrônicos. O sistema foi desenvolvido como um exercício prático para aplicar e demonstrar os conceitos fundamentais da Programação Orientada a Objetos (POO).

✨ Funcionalidades
Adicionar mercadorias: Permite inserir diferentes tipos de produtos (Celulares e Computadores) ao carrinho.
Remover mercadorias: Remove itens do carrinho através do seu código único.
Listar conteúdo: Exibe um relatório detalhado de todos os itens no carrinho, incluindo suas descrições e preços.
Cálculo de Preços: Calcula o valor total dos produtos e também o valor final com desconto para pagamento à vista.
Descontos Polimórficos: Aplica regras de desconto diferentes para cada tipo de produto (desconto variável para celulares e fixo para computadores).
🛠️ Tecnologias Utilizadas
Java (JDK 8 ou superior)
📂 Estrutura do Projeto
O projeto utiliza uma arquitetura em camadas para separar as responsabilidades, um padrão comum no desenvolvimento de software:

EletricShop/
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
                    └── Main.java
🚀 Como Executar o Projeto
Você precisará ter o Java Development Kit (JDK) instalado em sua máquina.

Clone ou baixe este repositório para o seu computador.
Abra o projeto em sua IDE preferida (Eclipse, IntelliJ, VS Code, etc.).
Selecione a opção "Open Project" ou "Import Project" e aponte para a pasta raiz EletricShop. A IDE reconhecerá a estrutura automaticamente.
Localize o arquivo de entrada: Navegue até src/br/com/eletricshop/ui/Main.java.
Execute o programa: Clique com o botão direito no arquivo Main.java e selecione a opção "Run" ou "Executar". O menu da aplicação aparecerá no console da IDE.
🧠 Conceitos de POO Demonstrados
Este projeto serve como um exemplo prático dos seguintes pilares da POO:

Abstração: A classe Mercadoria define um modelo genérico de produto, com os atributos e métodos essenciais, sem se preocupar com os detalhes de cada tipo.
Herança: As classes Celular e Computador herdam de Mercadoria, reutilizando sua estrutura e adicionando comportamentos específicos.
Polimorfismo: No método conteudo() da classe Carrinho, a chamada m.preco_a_vista() executa a lógica de cálculo correta dependendo se m é um Celular ou um Computador.
Encapsulamento: Os atributos das classes são private, e o acesso a eles é controlado por métodos públicos (getters e setters), garantindo a integridade dos dados.
Composição: A classe Carrinho tem uma lista (ArrayList) de Mercadoria, demonstrando a relação de composição entre objetos.
✒️ Autor
Projeto desenvolvido por Arthur.

Atualizado em: 25 de maio de 2025
