public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Character> stack = new ArrayStack<>();
        stack.print();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        stack.pop();
        stack.print();
    }
}
