import java.lang.reflect.Array;
import java.util.*;


public class DemoProgram {
    public static void main() {
//        ArrayList<String> fruits =new ArrayList<>();
//        fruits.add("orange");
//        fruits.add("Apple");
//        fruits.add("apple");
//        fruits.add("banana");
//        fruits.add("mango");
//        for(String fruit :fruits){
//            if(fruit)
//                System.out.println(fruits);
//            break;
//        }
        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(6);
        number.add(77);
        number.add(29);
        number.add(20);
        number.add(87);
        number.add(67);
        number.add(77);
        number.add(29);
        number.add(2);
        number.add(77);
        number.add(20);
        Collections.sort(number);
        System.out.println(number);
        int num = 0;

        for (Integer integer : number) {
            num = num + integer;

        }
        System.out.println("sum" + num);

        System.out.println("max" + Collections.max(number));//collection class method
        System.out.println("min" + Collections.min(number));
        int min = number.get(0);
        int max = number.get(0);
        for (Integer integer : number) {
            if (integer < min) {
                min = integer;

            }
            if (integer > max) {
                max = integer;

            }

        }
        System.out.println("min" + min);
        System.out.println("max" + max);


        List<Integer> even = new ArrayList<>(number);
        List<Integer> odd = new ArrayList<>(number);
        even.removeIf(n -> n % 2 != 0);
        odd.removeIf(n -> n % 2 == 0);
        System.out.println("even" + even);
        System.out.println("odd" + odd);

        for (Integer integer : number) {
            if (integer % 2 == 0) {

                System.out.println(integer + "even");

            } else {

                System.out.println(integer + "odd ");
            }
        }


        Set<Integer> unique = new LinkedHashSet<>(number);
        System.out.println("remove duplicate" + unique);//remove duplicate

        List<Integer> list1 = new ArrayList<>();


        for (int i = 0; i < number.size(); i++) {
            if (number.indexOf(number.get(i)) != i) {
                list1.add(number.get(i));
            }
        }

        System.out.println("Duplicate values: " + list1);
        System.out.println( Collections.frequency(number, 3));
        Collections.sort(number);
//       System.out.println(Collections.min(number));
//        List<Character> chr =new ArrayList<>();
//        chr.add('q');
//        chr.add('y');
//        chr.add('q');
//        chr.add('a');
//        chr.add('d');
//        chr.add('a');
//       for( Character chra :chr){
//
//
//        }
        }
    }













