public class ArrayStack<T> implements iStack<T> {
    private Object[] data;
    private int top;

    public ArrayStack(){
        this(10);
    }

    public ArrayStack(int initialCapacity){
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        data[top++] = (T) element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no se puede hacer pop.");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null; // Evitar fugas de memoria
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía, no se puede hacer peek.");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public void clear() {
        for (int i = 0; i < top; i++) {
            data[i] = null;
        }
        top = 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = top-1; i >= 0; i--){
            sb.append(data[i]);
            if(i != 0){
                sb.append("->"); // separador mientras sea diferente de 0
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
