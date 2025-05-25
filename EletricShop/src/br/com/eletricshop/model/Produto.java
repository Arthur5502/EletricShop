// Salve em: EletricShop/src/br/com/eletricshop/model/Produto.java
package br.com.eletricshop.model;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Código deve ser um número positivo.");
        }
        this.codigo = codigo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }
}