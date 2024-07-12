public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Елемент 1");
        list.add("Елемент 2");
        list.add("Елемент 3");


        System.out.println("Розмір списку: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Елемент " + i + ": " + list.get(i));
        }

        list.remove(1);


        System.out.println("Розмір списку після видалення: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Елемент " + i + ": " + list.get(i));
        }

        list.clear();


        System.out.println("Розмір списку після очищення: " + list.size());
    }
}