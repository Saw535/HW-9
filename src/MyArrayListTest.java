public class MyArrayListTest {
    public static void main(String[] args) {
        // Створення екземпляру
        MyArrayList<String> list = new MyArrayList<>();

        // Додавання елементів
        list.add("Елемент 1");
        list.add("Елемент 2");
        list.add("Елемент 3");

        // Виведення розміру списку
        System.out.println("Розмір списку: " + list.size());

        // Виведення елемента за індексом
        System.out.println("Елемент на індексі 1: " + list.get(1));

        // Видалення елемента за індексом
        list.remove(1);
        System.out.println("Розмір списку після видалення: " + list.size());

        // Очищення списку
        list.clear();
        System.out.println("Розмір списку після очищення: " + list.size());
    }
}