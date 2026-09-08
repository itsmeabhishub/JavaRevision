package RevisionJ;

import java.util.HashSet;
import java.util.Set;

public class HashSetJ {
    public static void main(String[] args) {
        Set<Integer> obj2 = new HashSet<>();

        obj2.add(6);
        obj2.add(6);
        obj2.add(7);
        obj2.add(8);
        obj2.add(6);

        System.out.println(obj2);

        for (int n : obj2){
            System.out.println(n);
        }
    }
}
