package org.example;

class Calculator1 {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(int n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        double res = calc.add(5, 4.5);
        int res1 = calc.add(8, 8);
        System.out.println(res + " "+ res1);
    }
}
