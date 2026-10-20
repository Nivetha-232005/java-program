package genericandtypesafety;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcard {
    //Wildcard and Upper-bounded wildcard
        public static void display(List<?> values) {// extends Number
            for (Object value : values) {
                System.out.println(value);
            }
        }
    public static void display1(List<? super Number> values) {//lower bounded wildcard
        values.add(22);
        values.add(55d);
        values.add(22f);
        values.add(5.5);
    }

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10, 20);
            List<String> names = Arrays.asList("Arun", "Priya");
            List<Float> num = Arrays.asList(10.0f,70.9f);
            display(numbers);
            display(names);
            display(num);
            List<Number> values = new ArrayList<>();
            display1(values);

        }
    }
