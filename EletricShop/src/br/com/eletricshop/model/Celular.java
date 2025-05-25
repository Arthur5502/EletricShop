// Salve em: EletricShop/src/br/com/eletricshop/model/Celular.java
package br.com.eletricshop.model;

public class Celular extends Mercadoria {
    public Celular(int codigo, String nome, double preco, double desconto) {
        super(codigo, nome, preco, desconto);
    }

    @Override
    public double preco_a_vista() {
        double valorDoDesconto = getPreco() * (getDesconto() / 100);
        return getPreco() - valorDoDesconto;
    }
}