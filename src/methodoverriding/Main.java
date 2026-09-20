package methodoverriding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the a:");
        int a = sc.nextInt();
        System.out.print("enter the b:");
        int b = sc.nextInt();
        System.out.println("=======parent class=====");

        MethodTypes parent = new MethodTypes();//parent class
        int add1 = parent.add(a, b);
        System.out.println("========Method overloading======");
        System.out.println("add method 1:" + add1);
        int add = parent.add(a, b, MethodTypes.value1);
        System.out.println("ADD method 2:" + add);
        parent.mul();
        MethodTypes.sub(a, b);
        System.out.println("=======child class=======");
        Method child = new Method();//child class object creation
        int div = child.div(a, b);
        System.out.println("division:" + div);
        System.out.println("child add method:" + child.add(a, b));//calling child inside method using child
        System.out.println("=====inheritance======");
        System.out.println("parent add method:" + child.add(a, b, MethodTypes.value1));//calling parent inside method using child
        MethodTypes.sub(a, b);//calling parent inside method using child
        System.out.println("=====upcasting====");
        MethodTypes parent1 = new Method();
        parent1.mul();
        System.out.println("======downcasting======");
        Method child1 = (Method) parent1;
        System.out.println("division:" + child1.div(a, b));

    }
}
