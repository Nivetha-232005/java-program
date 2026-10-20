//package genericandtypesafety;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Generic class - T (Type)
//class Box<T> {
//    private T value;
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        return value;
//    }
//}
//
//// E - Element
//class MyList<E> {
//    private E value;
//
//    public void setValue(E value) {
//        this.value = value;
//    }
//
//    public E getValue() {
//        return value;
//    }
//
//    public void add(E value) {
//        this.value = value;
//    }
//}
//
//// K - Key, V - Value
//class MyMap<K, V> {
//    private K key;
//    private V value;
//
//    public void setValue(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//}
//
//public class Generic {
//    public static void main(String[] args) {
//
//        // T - Type
//        Box<Integer> numberBox = new Box<>();
//        numberBox.setValue(100);
//
//        Box<String> textBox = new Box<>();
//        textBox.setValue("Java");
//
//        System.out.println(numberBox.getValue());
//        System.out.println(textBox.getValue());
//
//        // E - Element
//        MyList<String> names = new MyList<>();
//        names.add("Java");
//        System.out.println(names.getValue());
//
//        names.add("Python");
//        System.out.println(names.getValue());
//
//        // K - Key, V - Value
//        MyMap<Integer, String> students = new MyMap<>();
//        students.setValue(101, "Nivetha");
//
//        System.out.println("Key: " + students.getKey());
//        System.out.println("Value: " + students.getValue());
//
//        students.setValue(102, "Priya");
//
//        System.out.println("Key: " + students.getKey());
//        System.out.println("Value: " + students.getValue());
//
//        // Raw type
//        List names1 = new ArrayList();
//        names1.add("Nivetha");
//        names1.add(100);
//
//        for (Object value : names1) {
//            System.out.println(value);
//        }
//    }
//}
