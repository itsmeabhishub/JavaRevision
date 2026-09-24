package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30, 35);

        nums.stream()
                .filter(n -> n%2 ==0)
                .map( n -> n*n)
                .forEach(n -> System.out.println(n));
    }
}
