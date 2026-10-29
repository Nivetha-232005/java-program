package packagecom.mentorbridge;

import java.util.Objects;

public class Student {
    private int age;
    private  String fName;
    private  String lName;

    public boolean equals(Object ob) {
      Student s= (Student) ob;
        return this.age == s.age && this.fName.equals(s.fName) && this.lName.equals(s.lName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, fName, lName);
    }



    public  String toString() {
        return "Student{age=" + age
                + ", fName='" + fName
                + "', lName='" + lName + "'}";
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
