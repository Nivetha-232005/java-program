package exception;
import java.io.FileNotFoundException;
import java.io.FileReader;

class ExceptionTypes {

    static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader("src/exception/test.txt");
        System.out.println("File opened successfully");

    }

    static void check(int number) {
        if (number >= 100) {
            throw new ArithmeticException("The number is  greater than 100");
        }
    }

    static void check1() {
        check(200);
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found or file error");
        }

        try {
            check1();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[24]);

            // int a = 9;
            // int b = 0;
            // int c = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");

        } catch (Exception e) {
            System.out.println("Some other exception");
        } finally {
            System.out.println("complete the process");
        }

        String name1 = "Java";
        System.out.println(name1.charAt(2));

        System.out.println("ArrayIndexOutOfBoundsException");

        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("ArrayIndexOutOfBounds");
        }

        System.out.println("NullPointerException");

        String name = null;

        try {
            System.out.println(name.length());

        } catch (NullPointerException n) {
            System.out.println("The value is null");
        }

        System.out.println("ArithmeticException");

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("0 cannot be used as a divisor");
        }

        System.out.println("hi");

        System.out.println("NumberFormatException");

        String value = "abc";

        try {
            int number = Integer.parseInt(value);
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("This is not a number");
        }


    }
}

