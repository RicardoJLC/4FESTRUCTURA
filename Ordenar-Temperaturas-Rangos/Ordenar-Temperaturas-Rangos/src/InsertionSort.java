public class InsertionSort {

    public static void insertionSort(double[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            double actual = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > actual) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = actual;
        }
    }

    public static void printArray(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void printArrayInline(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
