// Salve em: EletricShop/src/br/com/eletricshop/model/Computador.java
package br.com.eletricshop.model;

public class Computador extends Mercadoria {
    private String configuracao;

    public Computador(int codigo, String nome, double preco, String configuracao) {
        super(codigo, nome, preco, 10.0); // Desconto fixo de 10%
        this.configuracao = configuracao;
    }

    public String getConfiguracao() { return configuracao; }
    public void setConfiguracao(String configuracao) { this.configuracao = configuracao; }

    @Override
    public double preco_a_vista() {
        return getPreco() * 0.90;
    }
}