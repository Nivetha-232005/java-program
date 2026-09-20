
import java.util.Scanner;

public class MethodTypes {
static int value1=20;//static variable
float value2 =30;//instance variable

    /**
     *
     * @param a
     * @param b
     * @return c
     */
    int add(int a,int b) {//instance method

       int c =a+b;
        return c;
    }

    /**
     * @Deprecated add
     * the method old
     */

    int add(int a,int b,int value1) {//instance method

        int c =a+b+value1;
        return c;
    }
    static void sub(int a,int b){//static method
        int d =a-b;
        System.out.println("sub:"+d);
    }

    void mul() {//instance method

        float value3=value1*value2;
        System.out.println("multiply"+value3);
    }



    public static void main(String[] args) {

       Scanner sc =new Scanner(System.in);
        System.out.print("enter the a:");
        int a = sc.nextInt();
        System.out.print("enter the b:");
        int b = sc.nextInt();

        MethodTypes method =new MethodTypes();
        int add1=method.add(a,b);
        System.out.println("add method 1"+add1);
        int add=method.add(a,b,value1);
        System.out.println("ADD method 2:"+add);
        method.mul();
        sub(a,b);



    }
}
