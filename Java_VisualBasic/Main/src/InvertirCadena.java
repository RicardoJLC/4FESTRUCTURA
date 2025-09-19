public class InvertirCadena {
    // Con esto se imprimre la cadena al revés usando substring
    // el metodo subtraing es una operacion del String que no es un tipo de dato
    // primitivo sino una clase o objeto
    public static void invertir(String s) {
        if (s == null || s.length() == 0) return;   // <-- caso base
        System.out.print(s.charAt(s.length() - 1));  // <-- imprime último carácter
        invertir(s.substring(0, s.length() - 1));   // <-- recursión con resto de la cadena
    }

    public static void main(String[] args) {
        String texto = "hola";
        invertir(texto);         
        System.out.println();    // <-- salto de línea al final
    }
}
