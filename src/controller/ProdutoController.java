package controller;

import repository.Repository;

    public class ProdutoController {

        private Repository repository;

        public ProdutoController(Repository repository) {
            this.repository = repository;
        }

        public void cadastrarProduto(String nome, String autor, double preco) throws Exception {
            if (nome == null || nome.trim().isEmpty()) {
                throw new Exception("Erro, digite novamente.");
            }
            if (preco <= 0) {
                throw new Exception("Preço do produto deve ser maior que zero.");
            }
            System.out.println("Livro adicionado com sucesso!");
        }

        @Override
        public String toString() {
            return "Controller [repository=" + repository + "]";
        }
    }
