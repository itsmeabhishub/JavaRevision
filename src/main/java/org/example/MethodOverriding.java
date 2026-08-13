package org.example;

class DesiCalc{
    public int add(int a, int b){
        return  a+ b;
    }
}

class DesiAdvCalc extends DesiCalc{
    public int add (int a, int b){
        return a+b+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        DesiCalc DesiBhao = new DesiAdvCalc();
        int r = DesiBhao.add(3,4);
        System.out.println(r);

    }
}
