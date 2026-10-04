class Calculate{
    int a=10;
    int b=20;
    void calculate()
    {
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a%b;
        int g=a/b;
        System.out.println("ADD: " + c);
        System.out.println("SUB: " + d);
        System.out.println("MUL: " + e);
        System.out.println("DIV: " + f);
        System.out.println("MOD: " + g);
    }

    public static void main(String[] args) {
        Calculate obj =new Calculate();
        obj.calculate();

    }
}

