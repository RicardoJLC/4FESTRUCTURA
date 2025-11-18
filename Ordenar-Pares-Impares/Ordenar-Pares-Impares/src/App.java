import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? (deben ser enteros): ");
        int n = Integer.parseInt(sc.nextLine().trim());

        if (n <= 0) {
            System.out.println("Cantidad inválida.");
            sc.close();
            return;
        }

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa número [" + (i + 1) + "]: ");
            numeros[i] = Integer.parseInt(sc.nextLine().trim());
        }

        // Imprime el arreglo original
        System.out.println("\n=== ARREGLO ORIGINAL ===");
        Utils.imprimirArreglo(numeros);

        // Divide números en pares e impares
        int[] pares = Utils.filtrarPares(numeros);
        int[] impares = Utils.filtrarImpares(numeros);

        // Objeto para aplicar Selection Sort
        SelectionSort sorter = new SelectionSort(pares, impares);

        sorter.ordenarPares();
        sorter.ordenarImpares();

        // Impresiones finales
        System.out.println("\n=== ARREGLOS ORDENADOS ===");

        System.out.print("Pares ordenados   : ");
        Utils.imprimirArreglo(sorter.pares);

        System.out.print("Impares ordenados : ");
        Utils.imprimirArreglo(sorter.impares);

        sc.close();
    }
}