package org.example;

public class LogicalOperator {
    public static void main(String[] args) {
        // Logical operator

        // && , ||


        // in && operator               in || operator          in ! operator
        // a   b                        a    b
        // T   T => T                   T    T =>  T                F => T
        // T   F => F                   T    F =>  T                T => F
        // F   T => F                   F    T =>  T
        // F   F => F                   F    F =>  F

        int a = 5;
        int b = 6;

        int x = 6;
        int y = 8;

        boolean res = (a>b) || (x>y);

        System.out.println(!res);

    }
}
