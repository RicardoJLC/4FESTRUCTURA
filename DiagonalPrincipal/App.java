public class App {
    public static void main(String[] args) throws Exception {
         int[][] arrTest={
            {1,3,7,8},
            {0,6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9,0}
        };
        // Imprime la sumatoria del arreglo, menos la diagonal principal
        System.out.println("La sumatoria del arreglo menos la diagonal principal es: "+sumatoria(arrTest));

    }

    public static int sumatoria(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j) { // Ignora la diagonal principal
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }
}
