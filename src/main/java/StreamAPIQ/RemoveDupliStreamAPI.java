package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class RemoveDupliStreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 10, 30, 20, 40, 30, 50);

        nums.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
    }
}
