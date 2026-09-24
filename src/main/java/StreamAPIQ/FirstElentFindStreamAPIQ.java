package StreamAPIQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElentFindStreamAPIQ {
    public static void main(String[] args) {
        List<String> firstEle = Arrays.asList("Abhi", "Rahul", "Amit", "Rohit");

        System.out.println(firstEle.stream().findFirst().get());
    }
}
