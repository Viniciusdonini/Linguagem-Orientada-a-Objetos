import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            lista.add(num);

            if (num % 2 == 0) pares.add(num);
            else impares.add(num);
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
