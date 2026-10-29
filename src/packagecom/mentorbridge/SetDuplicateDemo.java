package packagecom.mentorbridge;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetDuplicateDemo {
   public static void main() {


         /*Set<String> names=new HashSet<>();
        names.add("Murugan");
        names.add("Murugan");

        for(String name:names)
        {
            System.out.println("Name :" +name);
        }*/


    Student student1=new Student();
        student1.setAge(17);
        student1.setfName("Dhil");
        student1.setlName("Dhanapal");

    Student student2=new Student();

        student2.setAge(17);
        student2.setfName("Dhil");
        student2.setlName("Dhanapal");
       System.out.println(Objects.equals(student1,student2));//object class method
       Set<Student> students=new HashSet<>();
        students.add(student1);
        students.add(student2);
       System.out.println(students.size());

//       String s=student1.toString();
//       String s1 =student2.toString();
//      System.out.println(s);
//       System.out.println(s1);
//       if (s.equals(s1)) {
//           System.out.print(s);
//       } else {
//           System.out.println(s);
//           System.out.println(s1);
//       }


        for(Student student:students)
    {
        System.out.println("Name :" +student);
    }



}
}
