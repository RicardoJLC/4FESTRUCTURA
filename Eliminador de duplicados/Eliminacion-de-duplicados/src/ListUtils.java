public class ListUtils {

    public static Node buildList(int[] vals) {
        if (vals == null || vals.length == 0) return null;

        Node head = new Node(vals[0]);
        Node current = head;

        for (int i = 1; i < vals.length; i++) {
            current.next = new Node(vals[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" -> null");
    }
}
