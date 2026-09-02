import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        Vetor bau = new Vetor();
        int opcao;

        System.out.println("=================================================");
        System.out.println("   Bau de itens: Welcome");
        System.out.println("=================================================");

        do {
            exibirMenu();
            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1:
                    catalogo.listar();
                    break;

                case 2:
                    catalogo.listar();
                    System.out.print("\nDigite o nome exato do item que deseja pegar: ");
                    String nomeParaAdicionar = scanner.nextLine();
                    Item itemDoCatalogo = catalogo.buscarPorNome(nomeParaAdicionar);

                    if (itemDoCatalogo == null) {
                        System.out.println("Item nao encontrado no catalogo.");
                    } else {
                        System.out.print("Quantidade que deseja pegar: ");
                        int qtd = lerInteiro(scanner);
                        itemDoCatalogo.setQuantidade(qtd);
                        int custoTotal = itemDoCatalogo.getCustoPecetas() * qtd;
                        System.out.println("Custo total: " + custoTotal + " pecetas.");
                        bau.incluir(itemDoCatalogo);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do item que deseja pesquisar: ");
                    String nomePesquisa = scanner.nextLine();
                    Item encontrado = bau.pesquisar(nomePesquisa);
                    if (encontrado == null) {
                        System.out.println("Item nao encontrado no bau.");
                    } else {
                        System.out.println("Encontrado: " + encontrado);
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do item que deseja alterar: ");
                    String nomeAlterar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQtd = lerInteiro(scanner);
                    bau.alterar(nomeAlterar, novaQtd);
                    break;

                case 5:
                    System.out.print("Digite o nome do item que deseja excluir: ");
                    String nomeExcluir = scanner.nextLine();
                    bau.excluir(nomeExcluir);
                    break;

                case 6:
                    bau.listar();
                    break;

                case 0:
                    System.out.println("Saindo... Ate a proxima sobrevivencia!");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }

            System.out.println();

        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("----------------- MENU -----------------");
        System.out.println("1 - Ver catalogo de itens");
        System.out.println("2 - Adicionar item ao bau");
        System.out.println("3 - Pesquisar item no bau");
        System.out.println("4 - Alterar quantidade de um item");
        System.out.println("5 - Excluir item do bau");
        System.out.println("6 - Listar itens do bau");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static int lerInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Digite um numero valido: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); 
        return valor;
    }
}