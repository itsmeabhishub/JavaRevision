package org.example;

public class ArthemicOperation {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int resAdd = a + b;
        int resMul = a * b;
        int resDev = b / a;
        int resSub = b - a;
        int resMod = a % b;

        System.out.println(resAdd + " " + resDev + " " + resMod + " " + resMul + " " + resSub);

        //    a += 2;
        //    a -= 2;
        //a++; post increment
        //++a pre increment
         a--;
        System.out.println(a);
    }
}
