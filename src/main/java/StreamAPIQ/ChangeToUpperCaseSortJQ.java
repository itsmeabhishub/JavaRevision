package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class ChangeToUpperCaseSortJQ {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "abhishek", "amit", "rohit");

        names.stream()
                .map(n -> n.toUpperCase())
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
