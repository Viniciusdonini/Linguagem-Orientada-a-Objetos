public class Ex9 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxAtual = arr[0];
        int maxGlobal = arr[0];
        int inicio = 0, fim = 0, tempInicio = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxAtual + arr[i]) {
                maxAtual = arr[i];
                tempInicio = i;
            } else {
                maxAtual += arr[i];
            }

            if (maxAtual > maxGlobal) {
                maxGlobal = maxAtual;
                inicio = tempInicio;
                fim = i;
            }
        }

        System.out.print("Sublista: ");
        for (int i = inicio; i <= fim; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSoma: " + maxGlobal);
    }
}