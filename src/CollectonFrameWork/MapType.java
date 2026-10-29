package CollectonFrameWork;
import java.util.HashMap;
import java.util.Map;


public class MapType {
   public static void main() {
        Map<Integer,String> names =new HashMap<>();
        names.put(31,"nivetha");
        names.put(32,"priya");
        names.put(21,"dharshini");
        names.put(12,"arun");
       System.out.println(names);

       for(Map.Entry<Integer,String> entry: names.entrySet())
       {
           System.out.println("RollNo:"+entry.getKey()+"Name:"+entry.getValue());

           System.out.println(names.containsKey(21));
           System.out.println(names.putIfAbsent(31, "nivetha"));
           System.out.println(names.isEmpty());
           System.out.println(names.entrySet());//Get all key-value pairs
           names.clear();
       }
    }
}
