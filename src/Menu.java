import controller.ProdutoController;
import model.Produto;
import repository.ProdutoRepository;
import repository.Repository;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Repository repository = new ProdutoRepository();
        ProdutoController produtoController = new ProdutoController(repository);

        int opcao;
        String nome, autor;
        double preco;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                LIVRARIA ÁGUA VIVA                   ");
            System.out.println("   Livros que edificam, palavras que transformam     ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Livros                     ");
            System.out.println("            2 - Visualizar Livros no Carrinho        ");
            System.out.println("            3 - Atualizar Carrinho                   ");
            System.out.println("            4 - Remover Livro                        ");
            System.out.println("            5 - Listar Todos os Livros               ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            opcao = sc.nextInt();

            if (opcao > 7) {
                System.out.println("\nLivraria Água Viva - Livros que edificam, palavras que transformam!");

                sc.close();
                System.exit(0);
            }
            try{

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do Livro: ");
                        nome = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Digite o autor do Livro: ");
                        autor = sc.nextLine();
                        System.out.print("Digite o preço do Livro: ");
                        preco = sc.nextDouble();
                        sc.nextLine();

                        break;
                    case 2:
                        System.out.print("Livros adicionados no Carrinho: ");
                        repository.listarProdutos();

                        break;
                    case 3:
                        System.out.println("Atualizar Carrinho\n");
                        System.out.print("Digite o nome do Livro a ser atualizado:\n ");
                        nome = sc.nextLine();

                        break;
                    case 4:
                        System.out.print("Digite o nome do Livro a ser removido: ");
                        String nomeRemover = sc.nextLine();
                        repository.removerProduto(nomeRemover);

                        break;
                    case 5:
                        repository.listarProdutos();
                        System.out.println("Lista Atualizada com sucesso!");

                        break;
                    case 6:
                        System.out.println("Aplicação encerrada com sucesso!");

                        break;
                    default:
                        System.out.println("\nOpção Inválida!\n");

                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
