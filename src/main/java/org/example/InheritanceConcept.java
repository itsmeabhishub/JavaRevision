package org.example;

class calctt{
    public int add1(int a, int b){
        return a+b;
    }

    public int sub1(int a , int b){
        return a-b;
    }
}

class AdvCalc extends calctt{
    public int multi1(int a, int b){
        return a*b;
    }
    public  int division(int a, int b){
        return  a/b;
    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        AdvCalc newObt = new AdvCalc();
        int r = newObt.add1(5,6);
        int l = newObt.division(6,2);
        System.out.println(r + " " + l);
    }
}
