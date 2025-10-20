public class Main {
    public static void main(String[] args) {
        int[] entrada = {5, 3, 5, 7, 3, 9};

        Node head = ListUtils.buildList(entrada);

        System.out.print("Entrada: ");
        ListUtils.printList(head);

        head = RemoveDuplicates.removeDuplicates(head);

        System.out.print("Salida:  ");
        ListUtils.printList(head);
    }
}
