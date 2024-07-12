public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Один", 1);
        map.put("Два", 2);
        map.put("Три", 3);


        System.out.println("Розмір мапи: " + map.size());


        System.out.println("Значення за ключем 'Два': " + map.get("Два"));

        map.remove("Два");


        System.out.println("Розмір мапи після видалення ключа 'Два': " + map.size());


        System.out.println("Значення за ключем 'Два' після видалення: " + map.get("Два"));

        map.clear();

        System.out.println("Розмір мапи після очищення: " + map.size());
    }
}