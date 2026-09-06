package CollectionAPIJ;

import java.util.*;

public class ComparatorJ {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> obj3 = new ArrayList<>();

        obj3.add(43);
        obj3.add(39);
        obj3.add(65);
        obj3.add(72);

        Collections.sort(obj3,comp);
        System.out.println(obj3);
    }
}
