package repository;

import model.Produto;

    public interface Repository {

        void adicionarLivro(Produto nome);
        void visualizarLivro(Produto nome);
        void atualizarCarrinho(String nome, Produto produtoAtualizado);
        void removerLivro(String nome);

        void listarLivros();
    }

