package RevisionJ;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRevision {
    public static void main(String[] args) {
        List<Integer> obj1 = new ArrayList<>();

        obj1.add(26);
        obj1.add(27);
        obj1.add(28);
        obj1.add(29);
        obj1.add(30);
        obj1.add(26);

        System.out.println(obj1);
        System.out.println(obj1.get(2));
        System.out.println(obj1.indexOf(29));
    }
}
