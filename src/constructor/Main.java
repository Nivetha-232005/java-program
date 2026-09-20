package constructor;

public class Main {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor parameterizedConstructor = new Constructor("Nivetha", 20);
        Constructor copyConstructor = new Constructor(parameterizedConstructor);
        Child child=new Child();
        System.out.println(constructor.name);
        System.out.println(constructor.age);
        System.out.println(parameterizedConstructor.name);
        System.out.println(parameterizedConstructor.age);
        System.out.println(copyConstructor.name);
        System.out.println(copyConstructor.age);
        child.display();


    }
}
