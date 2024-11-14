package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository implements Repository {

    // Lista para armazenar os produtos
    private List<Produto> livros = new ArrayList<>();

    @Override
    public void adicionarLivro(Produto produto) {
        if (produto != null) {
            livros.add(produto);
            System.out.println("Produto adicionado: " + produto.getNome());
        } else {
            System.out.println("Produto inválido!");
        }
    }

    @Override
    public void visualizarLivro(Produto produto) {
        if (livros.contains(produto)) {
            System.out.println("Produto encontrado: " + produto);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    @Override
    public void atualizarCarrinho(String nome, Produto produtoAtualizado) {
        for (int i = 0; i < livros.size(); i++) {
            Produto livro = livros.get(i);
            if (livro.getNome().equals(nome)) {
                livros.set(i, produtoAtualizado);
                System.out.println("Produto atualizado: " + produtoAtualizado.getNome());
                return;
            }
        }
        System.out.println("Produto não encontrado para atualização!");
    }

    @Override
    public void removerLivro(String nome) {
        for (Produto livro : livros) {
            if (livro.getNome().equals(nome)) {
                livros.remove(livro);
                System.out.println("Produto removido: " + nome);
                return;
            }
        }
        System.out.println("Produto não encontrado para remoção!");
    }

    @Override
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
