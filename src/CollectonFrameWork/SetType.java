package CollectonFrameWork;

import java.util.*;



public class SetType {
    static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("Nivetha");
        names.add("Priya");
        names.add("Dharshini");
        names.add("Nivetha");
        System.out.println(names);
        //normal for loop
        for(int i =0;i< names.size();i++){
            System.out.println(names.toArray()[i]);

        }
        //enhanced for-each loop
        for(String s:names){
            System.out.println(s);

        }
        //Lambda expression with forEach() and method references
        names.forEach(name -> System.out.println(name));
        //itertor
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println( names.size());
        System.out.println( names.contains("Priya"));
        names.remove("Priya");

        System.out.println( names.isEmpty());
        Set<String> moreNames = new HashSet<>();
       moreNames.add("Arun");
        moreNames.add("Meena");
        names.addAll(moreNames);
        System.out.println(" addAll(): " + names);
        HashSet<String> removeNames = new HashSet<>();
        removeNames.add("Arun");
        removeNames.add("Nivetha");
        names.removeAll(removeNames);
        System.out.println("removeAll(): " + names);

        HashSet<String> keepNames = new HashSet<>();
        keepNames.add("Meena");
        keepNames.add("Dharshini");

        names.retainAll(keepNames);
        System.out.println(" retainAll(): " + names);



        Object[] arr = names.toArray();
        System.out.println(" toArray(): " + Arrays.toString(arr));
        names.clear();
        System.out.println( names);
        System.out.println(names.isEmpty());
        System.out.println("Tree set");

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(15);
        numbers.remove(20);
        System.out.println( numbers.contains(40));
        System.out.println( numbers.first());
        System.out.println(numbers.last());
       numbers.higher(30);
        numbers.lower(20);
        numbers.pollFirst();
        numbers.pollLast();
        System.out.println(numbers);

    }
}
