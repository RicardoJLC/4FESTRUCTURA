import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Clase {
    public static void main(String[] args) {
        // Inicializacion
        Stack <String> Stack2= new Stack<>(); // Vector
        Deque <String> libros=new ArrayDeque<>(); // Esta es la recomendada
        // Agregar
        libros.push("Libro1");
        libros.push("Libro2");
        libros.push("Libro3");
        // Recorrido
        for (String l : libros) {
            System.out.println(1);
        }
        // Quitar
        System.out.println("Quitando a: " + libros.pop());

        libros.push("Nuevo Libro");
        libros.pop();
        System.out.println("Stack: " + libros);
        libros.remove("Libro1"); // eliminar por su valor
    }

}
