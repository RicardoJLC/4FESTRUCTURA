public class App {
    public static void main(String[] args) throws Exception {
        int[][] arregloEntrada = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        int[][] arregloSalida = new int[arregloEntrada.length][];

        for (int i = 0; i < arregloEntrada.length; i++) {
            int[] fila = arregloEntrada[i];
            int longitudNueva = fila.length + 1;
            arregloSalida[i] = new int[longitudNueva];

            // Copiar los elementos originales
            System.arraycopy(fila, 0, arregloSalida[i], 0, fila.length);

            // Verificar si la longitud es par o impar
            if (fila.length % 2 == 0) {
                // Longitud par: agregar la suma del primer y último elemento
                arregloSalida[i][longitudNueva - 1] = fila[0] + fila[fila.length - 1];
            } else {
                // Longitud impar: agregar 0
                arregloSalida[i][longitudNueva - 1] = 0;
            }
        }

        // Imprimir el arreglo de salida
        System.out.println("Salida:");
        for (int[] fila : arregloSalida) {
            System.out.print("{");
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j]);
                if (j < fila.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}
