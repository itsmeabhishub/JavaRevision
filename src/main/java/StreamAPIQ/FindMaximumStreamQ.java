package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class FindMaximumStreamQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 50, 30, 90, 40);

         int res = nums.stream().max((n,m) -> Integer.compare(n,m)).get();

        System.out.println(res);
    }
}
