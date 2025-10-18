public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        System.out.println("Imprimiendo lista (inicial):");
        list.printForward();

        // Agregar elementos <---
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("\nDespués de agregar elementos (printForward):");
        list.printForward();
        System.out.println("----Imprimir backWard-----");
        list.printBackward();

        // Eliminar varios casos // <---
        System.out.println("\nEliminando 1 (head):");
        list.remove(1);
        list.printForward();

        System.out.println("\nEliminando 3 (nodo en medio):");
        list.remove(3);
        list.printForward();

        System.out.println("\nEliminando 5 (tail):");
        list.remove(5);
        list.printForward();

        System.out.println("\nIntentando eliminar 42 (no existe):");
        list.remove(42);
        list.printForward();
    }
}
