public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();


        queue.add("Елемент 1");
        queue.add("Елемент 2");
        queue.add("Елемент 3");


        System.out.println("Розмір черги: " + queue.size());


        System.out.println("Перший елемент (peek): " + queue.peek());


        System.out.println("Перший елемент (poll): " + queue.poll());


        System.out.println("Розмір черги після видалення: " + queue.size());


        queue.clear();


        System.out.println("Розмір черги після очищення: " + queue.size());
    }
}