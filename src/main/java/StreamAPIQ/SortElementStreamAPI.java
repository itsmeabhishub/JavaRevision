package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class SortElementStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(50, 10, 40, 20, 30);
        nums.stream()
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
