public class ArrayQueue<T> {
    private Object[] data;
    private int head; // <-- índice del primer elemento
    private int tail; // <-- índice libre para insertar
    private int size; // <-- número de elementos

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int capacity) {
        data = new Object[Math.max(2, capacity)];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(T item) {
        ensureCapacity();
        data[tail] = item;
        tail = (tail + 1) % data.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Cola vacía");
        T item = (T) data[head];
        data[head] = null;
        head = (head + 1) % data.length;
        size--;
        return item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Cola vacía");
        return (T) data[head];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size < data.length) return;
        int newCap = data.length * 2;
        Object[] newData = new Object[newCap];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(head + i) % data.length];
        }
        data = newData;
        head = 0;
        tail = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            Object elem = data[(head + i) % data.length];
            sb.append(elem);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public void reverse() {
        if (size <= 1) return;
        @SuppressWarnings("unchecked")
        T first = (T) dequeue();
        reverse();
        enqueue(first);
    }
}
