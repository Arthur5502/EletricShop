// Salve em: EletricShop/src/br/com/eletricshop/service/Carrinho.java
package br.com.eletricshop.service;

import br.com.eletricshop.model.Computador;
import br.com.eletricshop.model.Mercadoria;
import java.util.ArrayList;

public class Carrinho {
    private int codigo_cliente;
    private String nome_cliente;
    private ArrayList<Mercadoria> mercadorias;

    public Carrinho(int codigo_cliente, String nome_cliente) {
        this.codigo_cliente = codigo_cliente;
        this.nome_cliente = nome_cliente;
        this.mercadorias = new ArrayList<>();
    }

    public Mercadoria procurar(int codigo) {
        for (Mercadoria m : mercadorias) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

    public void cadastrar(Mercadoria m) {
        if (m == null) {
            System.out.println("Erro: Mercadoria não pode ser nula.");
            return;
        }
        if (procurar(m.getCodigo()) != null) {
            System.out.println("Erro: Já existe uma mercadoria com o código " + m.getCodigo() + ".");
        } else {
            mercadorias.add(m);
            System.out.println("'" + m.getNome() + "' cadastrado com sucesso!");
        }
    }

    public void remover(Mercadoria m) {
        if (m == null) {
            System.out.println("Erro: Mercadoria não pode ser nula.");
            return;
        }
        boolean foiRemovido = mercadorias.remove(m);
        if (foiRemovido) {
            System.out.println("'" + m.getNome() + "' removido com sucesso!");
        } else {
            System.out.println("Erro: Mercadoria não encontrada no carrinho.");
        }
    }

    public void conteudo() {
        if (mercadorias.isEmpty()) {
            System.out.println("O carrinho de " + nome_cliente + " está vazio.");
            return;
        }
        System.out.println("\n===== Carrinho de " + nome_cliente + " =====");
        double preco_total = 0;
        double preco_total_a_vista = 0;
        for (Mercadoria m : mercadorias) {
            System.out.println("Código: " + m.getCodigo());
            System.out.println("Nome: " + m.getNome());
            if (m instanceof Computador) {
                System.out.println("Configuração: " + ((Computador) m).getConfiguracao());
            }
            System.out.printf("Preço: R$ %.2f\n", m.getPreco());
            System.out.printf("Preço à vista: R$ %.2f\n", m.preco_a_vista());
            System.out.println("--------------------");
            preco_total += m.getPreco();
            preco_total_a_vista += m.preco_a_vista();
        }
        System.out.println("Resumo do Carrinho:");
        System.out.println("Total de Itens: " + mercadorias.size());
        System.out.printf("Valor Total (sem desconto): R$ %.2f\n", preco_total);
        System.out.printf("Valor Total (à vista): R$ %.2f\n\n", preco_total_a_vista);
    }
}