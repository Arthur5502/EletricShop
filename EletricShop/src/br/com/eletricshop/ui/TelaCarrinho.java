// Salve em: EletricShop/src/br/com/eletricshop/ui/TelaCarrinho.java
package br.com.eletricshop.ui;

import br.com.eletricshop.model.Celular;
import br.com.eletricshop.model.Computador;
import br.com.eletricshop.model.Mercadoria;
import br.com.eletricshop.service.Carrinho;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaCarrinho {
    private Carrinho carrinho = new Carrinho(1, "Arthur");
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        String op = "";
        while (!op.equals("4")) {
            System.out.println("\n=== Meu Carrinho de Compras ===");
            System.out.println("1 - Inserir Mercadoria");
            System.out.println("2 - Remover Mercadoria");
            System.out.println("3 - Listar Conteúdo do Carrinho");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextLine();
            switch (op) {
                case "1": inserir(); break;
                case "2": remover(); break;
                case "3": carrinho.conteudo(); break;
                case "4": System.out.println("Obrigado por usar o sistema EletricShop!"); break;
                default: System.out.println("Opção inválida. Tente novamente."); break;
            }
        }
    }

    private void inserir() {
        System.out.println("\n--- Inserir Mercadoria ---");
        System.out.print("Qual produto deseja inserir? (1 - Celular, 2 - Computador): ");
        String op = scanner.nextLine();
        try {
            System.out.print("Digite o código do produto: ");
            int cod = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();
            Mercadoria mercadoria;
            if (op.equals("1")) {
                System.out.print("Digite o desconto do celular (%): ");
                double desconto = scanner.nextDouble();
                scanner.nextLine();
                mercadoria = new Celular(cod, nomeProduto, precoProduto, desconto);
                carrinho.cadastrar(mercadoria);
            } else if (op.equals("2")) {
                System.out.print("Digite a configuração do computador: ");
                String descricao = scanner.nextLine();
                mercadoria = new Computador(cod, nomeProduto, precoProduto, descricao);
                carrinho.cadastrar(mercadoria);
            } else {
                System.out.println("Opção de produto inválida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira os dados no formato correto.");
            scanner.nextLine();
        }
    }

    private void remover() {
        System.out.println("\n--- Remover Mercadoria ---");
        try {
            System.out.print("Digite o código da mercadoria que deseja remover: ");
            int cod = scanner.nextInt();
            scanner.nextLine();
            Mercadoria mercadoria = carrinho.procurar(cod);
            carrinho.remover(mercadoria);
        } catch (InputMismatchException e) {
            System.out.println("Erro: O código deve ser um número inteiro.");
            scanner.nextLine();
        }
    }
}