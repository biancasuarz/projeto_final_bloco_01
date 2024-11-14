import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                LIVRARIA ÁGUA VIVA                   ");
            System.out.println("   Livros que edificam, palavras que transformam.    ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Listar Livros                        ");
            System.out.println("            2 - Adicionar Livros no Carrinho         ");
            System.out.println("            3 - Visualizar Carrinho                  ");
            System.out.println("            4 - Confirmar Pedido                     ");
            System.out.println("            5 - Cancelar Pedido                      ");
            System.out.println("            6 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            opcao = sc.nextInt();

            if (opcao == 7) {
                System.out.println("\nLivraria Água Viva - Livros que edificam, palavras que transformam.!");

                sc.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Listar Livros\n\n");

                    break;
                case 2:
                    System.out.println("Adicionar Livros no Carrinho\n\n");

                    break;
                case 3:
                    System.out.println("Visualizar Carrinho\n\n");

                    break;
                case 4:
                    System.out.println("Confirmar Pedido\n\n");

                    break;
                case 5:
                    System.out.println("Cancelar Pedido\n\n");

                    break;
                case 6:
                    System.out.println("Sair\n\n");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}
