package RevisionJ;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {

        try {
            Set<Integer> obj4 = new java.util.TreeSet<>();

            obj4.add(0);
            obj4.add(1);
            obj4.add(4);
            obj4.add(8);
            obj4.add(6);
            obj4.add(9);
            obj4.add(5);

            for (int n : obj4) {
                System.out.println(n);
            }


        } catch (NullPointerException e) {
            System.out.println("Null is not allowed in TreeSet");
        }
    }
}
