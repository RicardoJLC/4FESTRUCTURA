public class SelectionSort {

    public int[] pares;
    public int[] impares;

    public SelectionSort(int[] pares, int[] impares) {
        this.pares = pares;
        this.impares = impares;
    }

    public void ordenarPares() {
        selection(this.pares);
    }

    public void ordenarImpares() {
        selection(this.impares);
    }

    private void selection(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
