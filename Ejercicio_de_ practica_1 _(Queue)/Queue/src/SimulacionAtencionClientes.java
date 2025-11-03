public class SimulacionAtencionClientes {
    public static void main(String[] args) {
        ArrayQueue<Customer> cola = new ArrayQueue<>(5);


        cola.enqueue(new Customer(1, "Ana"));
        cola.enqueue(new Customer(2, "Luis"));
        cola.enqueue(new Customer(3, "Maya"));

        System.out.println("Antes de invertir:");
        System.out.println(cola);

        int antes = cola.size();

        // Invertir la cola
        cola.reverse();

        System.out.println("Después de invertir:");
        System.out.println(cola);

        int despues = cola.size();
        System.out.printf("Elementos antes = %d, elementos después = %d%n", antes, despues);
    }
}
