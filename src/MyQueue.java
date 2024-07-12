public class MyQueue<T> {
    private T[] array;
    private int front;
    private int rear;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public MyQueue() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(T value) {
        if (size == array.length) {
            resize();
        }
        rear = (rear + 1) % array.length;
        array[rear] = value;
        size++;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[front];
    }

    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removed = array[front];
        front = (front + 1) % array.length;
        size--;
        return removed;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];
        int j = front;
        for (int i = 0; i < size; i++) {
            newArray[i] = array[j];
            j = (j + 1) % array.length;
        }
        array = newArray;
        front = 0;
        rear = size - 1;
    }
}