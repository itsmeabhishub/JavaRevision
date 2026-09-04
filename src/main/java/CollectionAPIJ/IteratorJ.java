package CollectionAPIJ;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class IteratorJ {
    public static void main(String[] args) {
        Collection<Integer> numbo = new TreeSet<>();
        numbo.add(56);
        numbo.add(46);
        numbo.add(49);
        numbo.add(76);
        numbo.add(56);
        numbo.add(66);

        Iterator<Integer> it = numbo.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
