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

        lista.remove(2); // <--- elimina solo la primera ocurrencia

        System.out.println("-----------");
        System.out.println("Lista después de remove(2):");
        lista.printList();

        System.out.println("Ocurrencias de 2 (después): " + lista.countOccurrences(2));
    }
}
