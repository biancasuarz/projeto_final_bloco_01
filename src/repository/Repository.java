package repository;

import model.Produto;

    public interface Repository {

        void adicionarProduto(Produto produto);
        void visualizarProduto(String nome);
        void atualizarProduto(String nome, Produto produtoAtualizado);
        void removerProduto(String nome);

        void listarProdutos();
    }

