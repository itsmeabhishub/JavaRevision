package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FindNamesWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek", "Amit", "Rahul", "Ankit", "Rohit");
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(n -> System.out.println(n));
    }
}
