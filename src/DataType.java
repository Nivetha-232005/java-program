import java.lang.reflect.Array;

public class DataType {
    String name="nivetha";

   public static void main(String[] args) {
       byte a =100;//8-bit -128 to 127
       short b=500;//16-bit -32,768 to 32,767
       int c=123422;//34-bit -2^31 to 2^31 - 1
       long d=1111112222222224567L;//64bit   -2^63 to 2^63-1
       float e =2342.6678822324232f;//32 bit ±3.4 × 10³⁸
       double f = 122.1234567893456784567;//64 bit ±1.7 × 10³⁰⁸
       boolean g =true;
       char c1='t';
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(f);
       System.out.println(g);

       DataType object =new DataType();
       System.out.println(object.name);

       int  [] number={1, 2, 3, 4, 5};
       System.out.println("Number:"+number[2]);


       double b1 = a;
       System.out.println(b1);
       short c2 =a;
       System.out.println(c2);
       byte b2 = (byte) c;
       System.out.println(b2);

       System.out.println("byte : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
       System.out.println("short : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
       System.out.println("int : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
       System.out.println("long : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

       System.out.println("float : " + Float.MAX_VALUE + " to " + Float.MAX_VALUE);
       System.out.println("double: " + Double.MAX_VALUE + " to " + Double.MAX_VALUE);

       System.out.println("char: " + (int) Character.MIN_VALUE + " to "
               + (int) Character.MAX_VALUE);

   }


}
