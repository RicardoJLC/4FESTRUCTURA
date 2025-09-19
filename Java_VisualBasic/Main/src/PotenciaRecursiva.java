public class PotenciaRecursiva {

    public static long potencia(long a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Este método solo acepta exponentes >= 0. Usa potenciaDouble para negativos.");
        }
        if (b == 0) return 1L;
        return a * potencia(a, b - 1);  // <-- recursión
    }
    public static double potenciaDouble(double a, int b) {
        if (b == 0) return 1.0;
        if (b > 0) return a * potenciaDouble(a, b - 1);  // <-- b positivo
        // b < 0: a^b = 1 / a^{-b}
        return 1.0 / potenciaDouble(a, -b);
    }

    public static void main(String[] args) {
        System.out.println("2^5 = " + potencia(2, 5));           // <-- 32
        System.out.println("3^0 = " + potencia(3, 0));           // <-- 1
        System.out.println("(-2)^3 = " + potencia(-2, 3));       // <-- -8

        System.out.println("2^-3 = " + potenciaDouble(2, -3));   // <-- 0.125
        System.out.println("5^-1 = " + potenciaDouble(5, -1));   // <-- 0.2
    }
}
