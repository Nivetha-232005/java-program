import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a=33;
        int b=19;
        //arithmetic operator
        System.out.println("addtion:"+ (a+b));
        System.out.println("subtraction:" +(a-b));
        System.out.println(("multiple:"+a*b));
        System.out.println("division:"+(a/b));
        System.out.println("modulus:"+(a%b));
        //unary operator
        int c=10;
       for(int i=1;i<=c;i++){
           System.out.println( "increment the value :"+i);
       }
        for(int i=c;i>=1;i--){
            System.out.println("decrement the value "+i);
        }
//assingment operator
        System.out.println("Assingment operator");
        System.out.println(a+=2);
        System.out.println(a-=2);
        System.out.println(a*=2);
        System.out.println(a/=2);
        System.out.println(a%=2);
        //relational operator
        System.out.println("Relational operator");
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
//logical operator
        System.out.println("logical operator");
        int age =10;
        boolean age10=true;

        if(age<=1 && age>=10){
            System.out.println("two value is ture");
        } else if (age<=1 || age>=10) {
            System.out.println("any one is true");

        }else{
            System.out.println("value is ot 1 to 10");
        }
        System.out.println(!age10);
        //ternary operator
        int value =100;
        System.out.println(value>=50? "value is match":"value is not match");
        //bitwise operator
        System.out.println("bitwise operator");
        System.out.println("binary value of a:"+Integer.toBinaryString(a));
        System.out.println("binary value of a:"+Integer.toBinaryString(b));
        System.out.println("AND:"+Integer.toBinaryString(a&b));
        System.out.println("OR:"+Integer.toBinaryString(a|b));
        System.out.println("XOR:"+Integer.toBinaryString(a^b));
        System.out.println("NOT of a:"+Integer.toBinaryString(~a));

       //instanceof operator

                String str = "Hello";
                System.out.println(str instanceof String);

                Object obj = 10;
                System.out.println(obj instanceof Integer);
                System.out.println(obj instanceof String);



    }
}
