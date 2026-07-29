package org.example;

class calculator{

    public int add(int num1, int num2){

        int res= num1+num2;
        return res;
    }
}

public class DemoClass {
    public static void main(String[] args) {

        calculator calc = new calculator();

        int result = calc.add(4,5);

        System.out.println(result);

    }
}
