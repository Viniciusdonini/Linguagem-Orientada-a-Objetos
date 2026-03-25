import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < 15; i++) {
            numeros[i] = sc.nextInt();
        }

        ArrayList<Integer> unicos = new ArrayList<>();

        for (int num : numeros) {
            if (!unicos.contains(num)) {
                unicos.add(num);
            }
        }

        System.out.println("Valores únicos: " + unicos);
    }
}