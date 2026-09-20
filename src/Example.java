public class Example {

    private static String word = "hi i am private variable";

    private class Sum extends Example {

        int b = 10;
        int c = 1;

        private void display() {
            System.out.println("hi i am private class");
            System.out.println(word);
        }

        public static void main(String[] args) {

            Example example = new Example();

            Sum s = example.new Sum();

            System.out.println(s.b);
            System.out.println(s.c);

            s.display();
        }
    }
}