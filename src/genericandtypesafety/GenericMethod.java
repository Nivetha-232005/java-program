package genericandtypesafety;

 class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }
}

public class GenericMethod {
 //GenericMethod and bounded type parameter
        public static <T > void display(T value) {
            System.out.println(value);

        }

        public static void main(String[] args) {

            display(100);
            display("Java");
            display(25.5);

        }

}
