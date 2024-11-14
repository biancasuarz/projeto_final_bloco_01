package model;

public abstract class Produto {

    private String nome;
    private String autor;
    private double preco;
    private int estoque;

    public Produto(String nome, String autor, double preco, int estoque) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean verificarDisponibilidade(int quantidade) {
        return this.estoque >= quantidade;
    }

    public void atualizarEstoque(int quantidade) {
        if (verificarDisponibilidade(quantidade)) {
            this.estoque -= quantidade;
        } else {
            System.out.println("\nEstoque insuficiente para o produto: " + this.nome);
        }
    }

    public abstract void visualizarDetalhes();
}
