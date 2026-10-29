package genericandtypesafety;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Example {

        public static void main(String[] args) {
//            // Without Generics
//            ArrayList values = new ArrayList();
//
//            values.add("Java");
//            values.add(100);
//
//            String name = (String) values.get(1);
//            System.out.println(name.toUpperCase());
////            // With Generics
            List<String> values1 = new ArrayList<>();

            values1.add("Java");
            // values1.add(100); // Compile-time error

            String name1 = values1.get(0);

            System.out.println(name1);
        }
    }

