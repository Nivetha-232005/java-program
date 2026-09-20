package constructor;
    public class Constructor {
        String name;
        int age;

        Constructor() {//default constructor and no-argument constructor
            System.out.println(" parent default constructor and no-argument constructor");
        }

        Constructor(String name, int age) {//parameterizedConstructor
            System.out.println("parent parameterized Constructor");
            this.name = name;
            this.age = age;
        }

        Constructor(Constructor s) {//copyConstructor
            System.out.println("parent copy Constructor");
            name = s.name;
            age = s.age;
        }
        void show(){
            System.out.println("hi i am parent method");
        }

    }
    class Child extends Constructor{
    Child() {
        super();
        System.out.println("child default constructor");
    }
    void show(){
        System.out.println("hi i am child  method");
    }

    void display(){
        this.show();
        show();
        super.show();
    }

}
