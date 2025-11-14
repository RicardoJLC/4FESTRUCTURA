public class App {
    public static void main(String[] args) {

        int[] arreglo = {4, 2, 9, 2, 4, 7, 1};

        System.out.print("Arreglo original: ");
        Util.imprimir(arreglo);

        Util.bubbleSort(arreglo);
        System.out.print("Arreglo ordenado: ");
        Util.imprimir(arreglo);

        int[] sinDuplicados = Util.eliminarDuplicados(arreglo);
        System.out.print("Arreglo sin duplicados: ");
        Util.imprimir(sinDuplicados);
    }
}
