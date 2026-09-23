package CollectionAPIJ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ForEachJ {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,7,9,8,5);

        nums.forEach(n -> System.out.println(n));
    }
}
