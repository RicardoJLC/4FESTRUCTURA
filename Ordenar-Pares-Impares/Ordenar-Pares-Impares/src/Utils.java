public class Utils {

    public static int[] filtrarPares(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) count++;
        }

        int[] resultado = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                resultado[index++] = num;
            }
        }

        return resultado;
    }

    public static int[] filtrarImpares(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 != 0) count++;
        }

        int[] resultado = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                resultado[index++] = num;
            }
        }

        return resultado;
    }

    public static void imprimirArreglo(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
