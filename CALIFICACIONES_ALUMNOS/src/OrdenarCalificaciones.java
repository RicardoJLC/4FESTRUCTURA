import java.util.Scanner;

public class OrdenarCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas registrar? ");
        int n;
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sc.nextLine();
                if (n > 0) break;
                System.out.print("Ingresa un número mayor que 0: ");
            } else {
                sc.nextLine();
                System.out.print("Entrada inválida. Ingresa un número entero: ");
            }
        }

        String[] nombres = new String[n];
        double[] calificaciones = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Alumno %d - Nombre: ", i + 1);
            nombres[i] = sc.nextLine().trim();

            System.out.printf("Alumno %d - Calificación: ", i + 1);
            while (true) {
                if (sc.hasNextDouble()) {
                    calificaciones[i] = sc.nextDouble();
                    sc.nextLine();
                    break;
                } else {
                    sc.nextLine();
                    System.out.print("Entrada inválida. Ingresa una calificación numérica: ");
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < n; j++) {
                if (calificaciones[j] > calificaciones[idxMax]) {
                    idxMax = j;
                }
            }
            if (idxMax != i) {
                double tmpCal = calificaciones[i];
                calificaciones[i] = calificaciones[idxMax];
                calificaciones[idxMax] = tmpCal;

                String tmpNom = nombres[i];
                nombres[i] = nombres[idxMax];
                nombres[idxMax] = tmpNom;
            }
        }

        System.out.println("\nResultados ordenados (calificación - nombre):");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f - %s%n", calificaciones[i], nombres[i]);
        }

        sc.close();
    }
}
