import java.util.Scanner;

public class SumaRecursiva {
    public static long suma(long n) {
        if (n <= 0) return 0;
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese N (número natural): ");
        long n = sc.nextLong();
        long resultado = suma(n);
        System.out.println("La suma de los primeros " + n + " números es: " + resultado);
        sc.close();
    }
}
