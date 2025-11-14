public class Util {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] eliminarDuplicados(int[] arr) {
        int n = arr.length;
        int contador = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                contador++;
            }
        }

        int[] resultado = new int[contador];
        resultado[0] = arr[0];

        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                resultado[index++] = arr[i];
            }
        }

        return resultado;
    }

    public static void imprimir(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
