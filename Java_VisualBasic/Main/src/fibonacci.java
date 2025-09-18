public class fibonacci {
    public static void main(String[] args) {
        // aqui le asigno yo un valor y dependiendo del valor
        // me muestra el numero de elementos de la serie de fibonacci
        int n = 5;
        System.out.println("Mostrar " + n + " elementos de la serie Fibonacci:");
        printFibonacci(n);
    }

    static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("n debe ser mayor que 0"); // <--- importante
            return;
        }

        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : " "));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // salto de línea
        System.out.println("Número de elementos: " + n);
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
