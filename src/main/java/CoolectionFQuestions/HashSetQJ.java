package CoolectionFQuestions;

import java.util.HashSet;

public class HashSetQJ {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Patna");
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Patna");
        city.add("Kolkata");
        city.add("Delhi");

        System.out.println(city.contains("Mumbai"));

        for (String s : city) {
            System.out.println(s);
        }
        System.out.println(city.toArray().length);
    }
}
