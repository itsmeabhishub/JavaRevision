package org.example;

public class TypeConversion {
    public static void main(String[] args) {

        //Type conversion

        int a = 256;
        byte b = 120;

        b = (byte) a;
        System.out.println(b);

        int x = 10;
        float f = 5.6f;

        x = (int) f;

        System.out.println(x);

        // Type Promotion

        byte i = 20;
        byte j = 20;

        int result = i * j;

        System.out.println(result);


    }
}
