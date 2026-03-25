import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1-Inserir 2-Buscar 3-Atualizar 4-Remover 5-Listar 0-Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    nomes.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Buscar: ");
                    String busca = sc.nextLine();
                    System.out.println(nomes.contains(busca) ? "Encontrado" : "Não encontrado");
                    break;

                case 3:
                    System.out.print("Nome antigo: ");
                    String antigo = sc.nextLine();
                    if (nomes.contains(antigo)) {
                        System.out.print("Novo nome: ");
                        nomes.set(nomes.indexOf(antigo), sc.nextLine());
                    }
                    break;

                case 4:
                    System.out.print("Remover: ");
                    nomes.remove(sc.nextLine());
                    break;

                case 5:
                    System.out.println(nomes);
                    break;
            }

        } while (opcao != 0);
    }
}