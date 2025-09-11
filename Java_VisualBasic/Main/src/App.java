import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicializacion de lista
        /*List<String> fruits =new ArrayList<>(); */

        // Agregar elementos ala lista
        /*fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mangoo");
        fruits.add("Apple"); */

        // Recorrer
        /*for (String fruit : fruits) {
         System.out.println(fruit);
        }
        System.out.println(fruits.get(2));
        fruits.remove(2);
        // System.out.println("Lista despues de eliminar: " + fruits);
        fruits.remove("Apple");
        System.out.println("Lista: " + fruits);
        fruits.add("Grape");
        System.out.println("Nueva lista: " + fruits);*/

        // Inicializacion
        Set<String> fruits=new HashSet<>(); // <--- hash no asegura un orden
        // Agregar elementos al conjunto
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mangoo");
        fruits.add("Apple");// omision por conjunto
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.remove("Banana");
        System.out.println("Set: " + fruits);

        fruits.add("Grape");
        System.out.println("Set " + fruits);

    }
}
