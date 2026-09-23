package StreamAPIQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FilterEvenNumQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,15,20,25,30,35,40);
         nums.stream()
                .filter(n -> n%2 == 0)
                 .forEach(n -> System.out.println(n));
    }
}
