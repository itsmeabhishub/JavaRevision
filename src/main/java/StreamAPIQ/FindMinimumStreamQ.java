package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FindMinimumStreamQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 50, 30, 90, 40);

        int res = nums.stream()
                .min((n,m) -> Integer.compare(n,m)).orElse(0);

        System.out.println(res);
    }
}
