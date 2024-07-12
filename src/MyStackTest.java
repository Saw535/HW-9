public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("Елемент 1");
        stack.push("Елемент 2");
        stack.push("Елемент 3");


        System.out.println("Розмір стека: " + stack.size());


        System.out.println("Верхній елемент (peek): " + stack.peek());


        System.out.println("Верхній елемент (pop): " + stack.pop());


        System.out.println("Розмір стека після видалення: " + stack.size());


        stack.remove(0);


        System.out.println("Розмір стека після видалення за індексом: " + stack.size());


        stack.clear();


        System.out.println("Розмір стека після очищення: " + stack.size());
    }
}