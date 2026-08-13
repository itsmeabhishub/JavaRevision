package org.example;

class DemoCalc1{

    public int add2(int a, int b){
        return a+b;
    }
    public int sub2(int a, int b){
        return a-b;
    }
}

class DemoAdvClc1 extends DemoCalc1{
    public int multipl2(int a, int b){
        return a*b;
    }

    public int div2(int a, int b){
        return a/b;
    }
}

class DemoSyntCalc extends DemoAdvClc1{
    public double power(int a, int b){
        return Math.pow(a,b);
    }
}

public class MultiInheritenceFeat {
    public static void main(String[] args) {
        DemoSyntCalc demoObj22 = new DemoSyntCalc();
        int r1 =demoObj22.add2(2,2);
        int r2 =demoObj22.sub2(2,2);
        int r3 =demoObj22.multipl2(3,3);
        int r4 =demoObj22.div2(4,2);
        double r5 =demoObj22.power(4,2);
        System.out.println(r1 + ", "+r2+ ", "+r3+ ", "+r4+ ", "+r5);
    }
}
