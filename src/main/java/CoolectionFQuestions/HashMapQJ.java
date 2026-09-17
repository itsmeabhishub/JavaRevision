package CoolectionFQuestions;

import java.util.HashMap;

public class HashMapQJ {
    public static void main(String[] args) {
        HashMap<Integer, String> std = new HashMap<>();
        std.put(101, "Abhishek");
        std.put(102, "Rahul");
        std.put(103, "Amit");
        std.put(104, "Rohit");

        System.out.println(std);
        String s = std.get(103);
        System.out.println(s);
        std.put(105,"Sumit");
        std.remove(102);

        System.out.println(std);
    }
}
