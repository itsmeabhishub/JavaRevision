package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersStreamQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        int res = nums.stream()
                .reduce(0,(c,e) -> c+e);

        System.out.println(res);
    }
}
