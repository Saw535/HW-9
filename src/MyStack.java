public class MyStack<T> {
    private T[] array;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public MyStack() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T value) {
        if (top == array.length - 1) {
            resize();
        }
        array[++top] = value;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + (top + 1));
        }
        System.arraycopy(array, index + 1, array, index, top - index);
        top--;
    }

    public void clear() {
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}