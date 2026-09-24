package StreamAPIQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInDescending {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(50, 10, 40, 20, 30);
        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));
    }
}
