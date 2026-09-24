package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6);
        nums.stream()
                .map(n -> n*n)
                .forEach(n -> System.out.println(n));
    }
}
