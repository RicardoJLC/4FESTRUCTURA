import java.util.ArrayDeque;
import java.util.Queue;

public class Student {
    public static void main(String[] args) {
        // Inicializacion
        Queue<String> fila = new ArrayDeque<>();
        // add
        fila.offer("Cliente1");
        fila.offer("Cliente2");
        fila.offer("Cliente3");
        // Recorrido
        for (String f : fila) {
            System.out.println(f);
        }
        System.out.println("Atendiendo a cliente: " + fila.poll());
        //System.out.println("Fila: " + fila);
        fila.offer("NuevoCliente"); // Agregr elemento de la fila
        fila.poll(); // Quita elemento de la fila
        System.out.println("Fila: " + fila);
        System.out.println("Siguiente: " + fila.peek()); // primero en fila
     
    }

}
