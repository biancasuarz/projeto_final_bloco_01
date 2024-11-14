package model;

    public class Livro extends Produto {

        public Livro(String nome, String autor, double preco, int estoque) {
            super(nome, autor, preco, estoque);
        }

        @Override
        public void visualizarDetalhes() {
            System.out.println("\n***********************************************************");
            System.out.println("Livro: " + getNome());
            System.out.println("Autor: " + getAutor());
            System.out.println("Preço: R$ " + getPreco());
            System.out.println("Estoque disponível: " + getEstoque());
            System.out.println("***********************************************************");
        }
    }
