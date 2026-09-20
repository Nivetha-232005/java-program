import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class WrapperClass {
    public static void main(String[] args) {
        int a=10;//primitive datatype
        Integer b=20;//wrapper class
        System.out.println("=====autoboxing======");
        float c=23.4f;
        Float d=c;
        System.out.println(c);
        System.out.println("====unboxing======");
        Double e =12.34;
        double f=e;
        System.out.println(f);
        System.out.println("====== manual boxing=====");
        char g='n';
        Character ch= Character.valueOf(g);
        System.out.println(ch);
        System.out.println("===== manual unboxing======");
        Long l=1234l;
        System.out.println(l.longValue());
        String s="789";
        int n=Integer.parseInt(s);// string to integer
        System.out.println(n);
        int n1=123;
        String s1 =Integer.toString(n);//integer to string
        System.out.println(s1);
        String s2="789";
        float n2 =Float.parseFloat(s);// string to float
        System.out.println(n2);
         Long  l2=null;
        System.out.println(l2);
        int[] a2={1,2,3,3,4,4,5,5};
        System.out.println(a2[2]);
        a2[2]=10;
        System.out.println(a2[2]);
        System.out.println(a2.length);

        ArrayList<Integer>number=new ArrayList<>();
        number.add(121);
        number.add(14);
        number.add(190);
        System.out.println(number);
        Collections.sort(number);
        System.out.println(number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println(number);



        ArrayList<String>name=new ArrayList<>();
        name.add("NIVETHA");
        name.add("priya");
        name.add("nive");
        System.out.println(name);
        System.out.println("get the value from array:"+name.get(0));
        System.out.println(name);
        System.out.println("change the value of array:"+name.set(0,"dharshini"));
        System.out.println(name);
        System.out.println("remove the value of array:"+name.remove(0));
        System.out.println(name);
        System.out.println("size of array:"+name.size());
        System.out.println("check  array:"+name.contains("dharshini"));
        System.out.println("array is empty :"+name.isEmpty());
        name.clear();

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        System.out.println(" remove the duplicate "+numbers);

        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("Nivetha", 90);
        marks.put("Priya", 85);
        marks.put("kumar", 95);
        System.out.println(marks.get("kumar"));
        System.out.println(marks.containsKey("Priya"));
        System.out.println(marks.containsValue(90));

    }
}
