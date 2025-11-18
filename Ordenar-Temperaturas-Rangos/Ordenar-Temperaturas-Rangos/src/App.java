import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas temperaturas vas a ingresar? : ");
        int n = Integer.parseInt(sc.nextLine().trim());
        if (n <= 0) {
            sc.close();
            return;
        }

        double[] temps = new double[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Temperatura [" + (i + 1) + "]: ");
                String linea = sc.nextLine().trim();
                try {
                    temps[i] = Double.parseDouble(linea);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Valor inválido.");
                }
            }
        }
        sc.close();

        double[] original = temps.clone();

        System.out.println("Arreglo original:");
        InsertionSort.printArray(original);

        InsertionSort.insertionSort(temps);

        System.out.println("Arreglo ordenado:");
        InsertionSort.printArray(temps);

        double minimo = temps[0];
        double maximo = temps[temps.length - 1];
        double rango = maximo - minimo;

        System.out.printf("Mínimo: %.2f%n", minimo);
        System.out.printf("Máximo: %.2f%n", maximo);
        System.out.printf("Rango: %.2f%n", rango);

        int countHigh = Math.min(3, temps.length);
        System.out.println("Top 3 temperaturas más altas:");
        for (int i = 0; i < countHigh; i++) {
            System.out.printf("%.2f%n", temps[temps.length - 1 - i]);
        }

        int countLow = Math.min(3, temps.length);
        System.out.println("Top 3 temperaturas más bajas:");
        for (int i = 0; i < countLow; i++) {
            System.out.printf("%.2f%n", temps[i]);
        }

        System.out.print("Arreglo original: ");
        InsertionSort.printArrayInline(original);
        System.out.print("Arreglo ordenado: ");
        InsertionSort.printArrayInline(temps);
    }
}
