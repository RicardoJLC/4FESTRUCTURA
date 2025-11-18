public class ArrayUtils {

    public static void imprimirArreglo(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] copiarArreglo(int[] a) {
        int[] copia = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copia[i] = a[i];
        }
        return copia;
    }
}
