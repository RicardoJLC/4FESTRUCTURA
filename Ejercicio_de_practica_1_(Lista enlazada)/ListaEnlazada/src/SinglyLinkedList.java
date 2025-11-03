public class SinglyLinkedList {

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public int countOccurrences(int data) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Imprimir lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public SinglyLinkedList[] splitEvenOdd() {
        SinglyLinkedList evens = new SinglyLinkedList();
        SinglyLinkedList odds = new SinglyLinkedList();

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) {
                evens.add(current.data);
            } else {
                odds.add(current.data);
            }
            current = current.next;
        }

        return new SinglyLinkedList[] { evens, odds };
    }
}
