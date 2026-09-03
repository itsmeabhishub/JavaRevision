package CollectionAPIJ;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJ {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(6);
        nums.add(7);

        System.out.println(nums.indexOf(9));
        System.out.println(nums.get(2));

        for (int n : nums){
            System.out.println(n*3);
        }
    }
}
