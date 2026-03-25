import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        ArrayList<Integer> intersecao = new ArrayList<>();

        for (int i = 0; i < 10; i++) a[i] = sc.nextInt();
        for (int i = 0; i < 10; i++) b[i] = sc.nextInt();

        for (int i : a) {
            for (int j : b) {
                if (i == j && !intersecao.contains(i)) {
                    intersecao.add(i);
                }
            }
        }

        System.out.println("Interseção: " + intersecao);
    }
}