package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class PosstiveNumberStreamQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        boolean res = nums.stream()
                .allMatch(n -> n>0);


        System.out.println(res);
    }
}
