package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FindNamesWithACountQ {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek", "Amit", "Rahul", "Ankit", "Rohit");

        long res = names.stream()
                .filter(n -> n.startsWith("A")).count();

        System.out.println(res);
    }
}
