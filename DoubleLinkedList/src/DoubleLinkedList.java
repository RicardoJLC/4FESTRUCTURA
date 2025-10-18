public class DoubleLinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // usar tail para agregar al final
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void remove(int value) {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Node current = head;
        // buscar el primer nodo con el valor
        while (current != null && current.data != value) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Valor no encontrado: " + value);
            return;
        }

        // Caso a) nodo a eliminar es head
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                // lista quedó vacía
                tail = null;
            }
            System.out.println("Eliminado (head): " + value);
            return;
        }

        // Caso c) nodo a eliminar es tail
        if (current == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            System.out.println("Eliminado (tail): " + value);
            return;
        }

        // Caso b) nodo en medio
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Eliminado (medio): " + value);
    }

    public void printForward() {
        if (head == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printBackward() {
        if (tail == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }
}
