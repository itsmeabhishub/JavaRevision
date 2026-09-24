package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class CountElementStreamAPIQ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        long numb = nums.stream().count();
        System.out.println(numb);
    }
}
