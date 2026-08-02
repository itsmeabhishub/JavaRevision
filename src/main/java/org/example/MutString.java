package org.example;

public class MutString {
    public static void main(String[] args) {

        String name1 = "abhishek";
        String name2 = new String("abbhishek");

        String s12 = "abhishek";

        name1 = name1 + " Anand";

        System.out.println(name1 == name2);
        System.out.println(name1 == s12);
        System.out.println(name1);
    }
}
