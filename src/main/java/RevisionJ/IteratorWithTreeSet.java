package RevisionJ;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class IteratorWithTreeSet {
    public static void main(String[] args) {

        Collection<Integer> obj5 = new TreeSet<>();
        obj5.add(23);
        obj5.add(83);
        obj5.add(93);
        obj5.add(33);
        obj5.add(43);

        Iterator<Integer> it = obj5.iterator();

        while (it.hasNext()){
            Integer num = it.next();
            System.out.println(num);

        }

    }
}
