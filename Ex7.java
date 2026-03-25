import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,3,5));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2,4,6,8));

        ArrayList<Integer> resultado = new ArrayList<>();

        int i = 0;
        while (i < l1.size() || i < l2.size()) {
            if (i < l1.size()) resultado.add(l1.get(i));
            if (i < l2.size()) resultado.add(l2.get(i));
            i++;
        }

        System.out.println(resultado);
    }
}
