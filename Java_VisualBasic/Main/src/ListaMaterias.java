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

    public void imprimir() {
        System.out.println("Materias: " + materias);
    }

    public static void main(String[] args) {
        ListaMaterias lista = new ListaMaterias();

        lista.agregar("Matemáticas");
        lista.agregar("Física");
        lista.agregar("Química");
        lista.agregar("Historia");
        lista.agregar("Programación");

        lista.imprimir();

        Scanner sc = new Scanner(System.in);
        System.out.print("Búsqueda (escribe el nombre de la materia o presiona Enter para usar 'Programación'): ");
        String busqueda = sc.nextLine().trim();
        if (busqueda.isEmpty()) {
            busqueda = "Programación";
        }

        System.out.println("Búsqueda: " + busqueda);
        boolean encontrado = lista.contiene(busqueda);
        System.out.println("Resultado: " + (encontrado ? "Materia encontrada" : "Materia no encontrada"));

        sc.close();
    }
}
