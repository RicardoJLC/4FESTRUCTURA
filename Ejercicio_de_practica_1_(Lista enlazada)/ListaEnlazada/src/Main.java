public class Main {
    public static void main(String[] args) {
        SinglyLinkedList lista = new SinglyLinkedList();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("Lista inicial:");
        lista.printList();

        System.out.println("Ocurrencias de 2 (antes): " + lista.countOccurrences(2));

        lista.remove(2);

        System.out.println("-----------");
        System.out.println("Lista después de remove(2):");
        lista.printList();

        System.out.println("Ocurrencias de 2 (después): " + lista.countOccurrences(2));

        System.out.println("-----------");
        // Dividir en pares e impares
        SinglyLinkedList[] splitted = lista.splitEvenOdd();
        SinglyLinkedList pares = splitted[0];
        SinglyLinkedList impares = splitted[1];

        System.out.println("Pares:");
        pares.printList();

        System.out.println("Impares:");
        impares.printList();
    }
}
