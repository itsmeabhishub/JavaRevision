package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FindLengthNamesGraFiveJQ {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek", "Amit", "Rahul", "Rohit", "Alexander");
        names.stream()
                .filter(n -> n.length() > 5)
                .forEach(n -> System.out.println(n));
    }
}
