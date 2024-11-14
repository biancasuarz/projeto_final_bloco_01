package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository implements Repository
{
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    @Override
    public void visualizarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.visualizarDetalhes();
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
    }

    @Override
    public void atualizarProduto(String nome, Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.set(i, produtoAtualizado);
                System.out.println("Produto atualizado: " + nome);
                return;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
    }

    @Override
    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
        System.out.println("Produto removido: " + nome);
    }

    @Override
    public void listarProdutos() {
        System.out.println("\nLista de Produtos:");
        for (Produto produto : produtos) {
            produto.visualizarDetalhes();
        }
    }
}

