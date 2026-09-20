public class Constructor {
    String name;
    int age;

    Constructor() {//default constructor and no-argument constructor
        System.out.println("hi, I collect student details");
    }

    Constructor(String name, int age) {//parameterizedConstructor
        this.name = name;
        this.age = age;
    }

    Constructor(Constructor s) {//copyConstructor
        name = s.name;
        age = s.age;
    }
    void display(){
        System.out.println("hi i am use this in method call");
    }


    public static void main(String[] args) {
        Constructor constructor = new Constructor();

        Constructor parameterizedConstructor = new Constructor("Nivetha", 20);
        Constructor copyConstructor = new Constructor(parameterizedConstructor);
        System.out.println(constructor.name);
        System.out.println(constructor.age);
        System.out.println(parameterizedConstructor.name);
        System.out.println(parameterizedConstructor.age);
        System.out.println(copyConstructor.name);
        System.out.println(copyConstructor.age);

    }

}


