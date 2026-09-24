package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FindHighestNumberQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 25, 55, 70, 30, 90, 45);
        nums.stream()
                .filter(n -> n>50)
                .forEach(n -> System.out.println(n));
    }
}
