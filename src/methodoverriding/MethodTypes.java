package methodoverriding;

public class MethodTypes {
    static int value1=20;//static variable
    float value2 =30;//instance variable
    int add(int a,int b) {//instance method

        int c =a+b;
        return c;
    }
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
        System.out.println("multiply:"+value3);
    }




    }

