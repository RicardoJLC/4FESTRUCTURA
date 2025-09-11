import java.util.Deque;
import java.util.ArrayDeque;

public class Stack2 {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();

        System.out.println("🔵 Iniciando historial de navegación...\n");

        addPage(history, "Google", "https://www.google.com");
        addPage(history, "GitHub", "https://www.github.com");
        addPage(history, "Stack Overflow", "https://stackoverflow.com");

        System.out.println("\nEstado actual del historial:");
        printHistory(history);

        System.out.println("\n⤴ Retrocediendo una página...");
        String retrocedida = goBack(history);
        if (retrocedida != null) {
            System.out.println("Has retrocedido desde: " + retrocedida);
        }

        String actual = currentPage(history);
        System.out.println("\n📌 Página en la que estás ahora:");
        System.out.println(actual != null ? actual : "— No hay página (historial vacío)");

        System.out.println("\n➕ Visitando una nueva página (añadiendo al historial):");
        addPage(history, "Reddit", "https://www.reddit.com");

        System.out.println("\n📚 Historial completo (de cima a base):");
        printHistoryIndexed(history);
    }

    private static void addPage(Deque<String> history, String name, String url) {
        String entry = name + " — " + url;
        history.push(entry);
        System.out.println("Visitando: " + entry);
    }

    private static String goBack(Deque<String> history) {
        if (history.isEmpty()) {
            System.out.println("No hay páginas para retroceder.");
            return null;
        }
        return history.pop();
    }

    private static String currentPage(Deque<String> history) {
        return history.peek();
    }

    private static void printHistory(Deque<String> history) {
        if (history.isEmpty()) {
            System.out.println("[vacío]");
            return;
        }
        for (String page : history) {
            System.out.println(" - " + page);
        }
    }

    private static void printHistoryIndexed(Deque<String> history) {
        if (history.isEmpty()) {
            System.out.println("[vacío]");
            return;
        }
        int i = 1;
        for (String page : history) {
            System.out.println(i + ". " + page);
            i++;
        }
    }
}
