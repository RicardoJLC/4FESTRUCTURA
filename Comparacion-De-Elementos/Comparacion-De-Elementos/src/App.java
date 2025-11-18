import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos (deben ser enteros y mayor que cero): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese elemento [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int[] original = ArrayUtils.copiarArreglo(arr);

        System.out.println("\nArreglo original:");
        ArrayUtils.imprimirArreglo(original);

        BubbleSort.ordenar(arr);

        System.out.println("\nArreglo ordenado:");
        ArrayUtils.imprimirArreglo(arr);

        int minimo = arr[0];
        int maximo = arr[n - 1];
        int diferencia = maximo - minimo;

        System.out.println("\nValor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Diferencia (máximo - mínimo): " + diferencia);

        sc.close();
    }
}
