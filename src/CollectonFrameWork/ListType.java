package CollectonFrameWork;

import java.util.*;

public class ListType  {
   public static void main(String[] args) {

       List<String> names =new ArrayList<>();
       names.add("nivetha");
       names.add("priya");
       names.add("dharshini");
       names.add(1,"arun");
       Collections.swap(names, 2, 1);
       System.out.println(names);
       System.out.println(names.get(2));
       names.set(1,"arun");
       names.indexOf("nivetha");
       names.remove(3);
       names.remove("nivetha");
       names.clear();
       System.out.println(names.size());
       System.out.println(names.contains("ravi"));
       System.out.println(names.isEmpty());
       System.out.println(names);

       Collections.sort(names);
       System.out.println(names);
       Collections.reverse(names);
       System.out.println(names);
       Collections.shuffle(names);

       List<Integer> num =new ArrayList<>();
       num.add(22);
       num.add(55);
       num.add(23);
       num.add(45);


       System.out.println("LinkedList");
       LinkedList<String> names1 = new LinkedList<>();
       names1.add("nivetha");
       names1.add("priya");
       names1.add("dharshini");
       System.out.println(names1.peek());
       names1.removeFirst();
       names1.removeLast();
       names1.addFirst("Meena");
       names1.addLast("Kavi");
       names1.getFirst();
       System.out.println(names1.getLast());
       System.out.println(names1);
       System.out.println(names1.poll());
       System.out.println(names1.pop());

       System.out.println("Vector");
       Vector<String> names2 = new Vector<>();

       System.out.println("Initial size: " + names2.size());
       System.out.println("Initial capacity: " + names2.capacity());
       names2.addElement("Nivetha");
       names2.addElement("Priya");
       names2.addElement("Ravi");
       System.out.println("After addElement(): " + names2);
       System.out.println("Size: " + names2.size());
       System.out.println("Capacity: " + names2.capacity());
       names2.insertElementAt("Arun", 1);
       System.out.println("After insertElementAt(): " + names2);
       names2.removeElement("Priya");
       System.out.println("After removeElement(): " + names2);
       names2.removeElementAt(1);
       System.out.println("After removeElementAt(): " + names2);
       names2.removeAllElements();
       System.out.println("After removeAllElements(): " + names2);
       System.out.println("Final size: " + names2.size());
       System.out.println("Final capacity: " + names2.capacity());
       System.out.println("Stack");

       Stack<String> names3 = new Stack<>();
       names3.push("Nivetha");
       names3.push("Priya");
       names3.push("Dharshini");
       System.out.println(names3);
       System.out.println(names3.peek());
       System.out.println(names3.pop());
       System.out.println(names3);
       System.out.println(names3.size());
       System.out.println(names3.empty());
       System.out.println(names3.search("Nivetha"));
   }

}





