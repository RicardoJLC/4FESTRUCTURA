import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String name;
    private Deque<String> docs;

    public Cliente(int id, String name) {
        this.id = id;
        this.name = name;
        this.docs = new ArrayDeque<>();
    }

    public void addDocument(String doc) {
        docs.push(doc);
    }

    public List<String> attended() {
        List<String> retirados = new ArrayList<>();
        while (!docs.isEmpty()) {
            String doc = docs.pop();
            System.out.println("Documento retirado: " + doc);
            retirados.add(doc);
        }
        return retirados;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
