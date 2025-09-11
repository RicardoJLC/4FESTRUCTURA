import java.util.ArrayList;
import java.util.List;

public class Promedio {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(1, "Rigoberto", 1200));
        workers.add(new Worker(2, "Luis Angel", 1200));
        workers.add(new Worker(3, "Ricardo Jaciel", 1200));
        workers.add(new Worker(4, "Orlando Luna", 1200));
        workers.add(new Worker(5, "Getsai Angulo", 1200));
        workers.add(new Worker(6, "Carlos Villalba", 1200));

        // Mostrar lista original
        System.out.println("Lista original:");
        workers.forEach(System.out::println);
        System.out.println();

        // Calcular promedio de sueldos
        double sum = 0.0;
        for (Worker w : workers) {
            sum += w.getSueldo();
        }
        double promedio = workers.isEmpty() ? 0.0 : sum / workers.size();
        System.out.printf("Promedio de los sueldos: %.2f%n", promedio);
        System.out.println();

        // Eliminar sueldos menores a 1000 (< 1000) <--- Importante
        // removeIf evita ConcurrentModificationException y es claro y conciso
        workers.removeIf(w -> w.getSueldo() < 1000);

        // Mostrar la lista actualizada
        System.out.println("Lista actualizada (sueldos >= 1000):");
        workers.forEach(System.out::println);
    }
}

class Worker {
    private int id;
    private String nombre;
    private double sueldo;

    public Worker(int id, String nombre, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Worker{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", sueldo=" + sueldo +
               '}';
    }
}
