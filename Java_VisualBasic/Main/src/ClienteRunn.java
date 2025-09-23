import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ClienteRunn {
    public static void main(String[] args) {
        Queue<Cliente> queue = new LinkedList<>();

        Cliente c1 = new Cliente(1, "Carlos");
        c1.addDocument("Doc2");
        c1.addDocument("Doc1");

        Cliente c2 = new Cliente(2, "María");
        c2.addDocument("Doc2");
        c2.addDocument("Doc1");

        Cliente c3 = new Cliente(3, "José");
        c3.addDocument("Doc2");
        c3.addDocument("Doc1");

        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);

        while (!queue.isEmpty()) {
            Cliente actual = queue.poll();
            System.out.println("Cliente en atención: " + actual.getName());

            List<String> docsRetirados = actual.attended();

            if (docsRetirados.isEmpty()) {
                System.out.println("Documentos retirados: Ninguno");
            } else {
                System.out.println("Documentos retirados: " + String.join(", ", docsRetirados));
            }

            List<String> nombresCola = new ArrayList<>();
            for (Cliente cl : queue) {
                nombresCola.add(cl.getName());
            }
            System.out.println("Cola restante: " + nombresCola);
            System.out.println();
        }
    }
}
