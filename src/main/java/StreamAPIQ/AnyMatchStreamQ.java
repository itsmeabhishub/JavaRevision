package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class AnyMatchStreamQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 150, 40, 50);
         boolean res = nums.stream()
                            .anyMatch(n -> n>100);
        System.out.println(res);
    }
}
