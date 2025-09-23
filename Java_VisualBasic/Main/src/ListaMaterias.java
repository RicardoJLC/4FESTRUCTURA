import java.util.ArrayList;
import java.util.Scanner;

public class ListaMaterias {
    private ArrayList<String> materias = new ArrayList<>();

    public void agregar(String materia) {
        if (materia != null && !materia.isBlank()) {
            materias.add(materia);
        }
    }

    public boolean contiene(String materia) {
        if (materia == null) return false;
        String buscada = materia.trim();
        return materias.stream()
                .anyMatch(m -> m.equalsIgnoreCase(buscada));
    }

    // Imprime las materias en consola
    public void imprimir() {
        System.out.println("Materias: " + materias);
    }

    // Programa principal: inserta materias, solicita la búsqueda y muestra el resultado
    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();

        // 1) Insertar al menos 5 materias
        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Química");
        lista.agregar("Historia");
        lista.agregar("Programación");

        // Mostrar lista
        lista.imprimir();

        // 2) Solicitar/definir una materia a buscar
        Scanner sc = new Scanner(System.in);
        System.out.print("Búsqueda (escribe el nombre de la materia o presiona Enter para usar 'Programación'): ");
        String busqueda = sc.nextLine().trim();
        if (busqueda.isEmpty()) {
            busqueda = "Programación"; // valor por defecto si el usuario no escribe nada
        }

        // 3) Usar contiene() y mostrar el resultado
        System.out.println("Búsqueda: " + busqueda);
        boolean encontrado = lista.contiene(busqueda);
        System.out.println("Resultado: " + (encontrado ? "Materia encontrada" : "Materia no encontrada"));

        sc.close();
    }
}
