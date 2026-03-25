import java.util.*;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(sc.nextInt());
        }

        double soma = 0;
        for (int num : lista) soma += num;
        double media = soma / lista.size();

        lista.removeIf(num -> num < media);

        System.out.println("Lista após remoção: " + lista);
    }
}
