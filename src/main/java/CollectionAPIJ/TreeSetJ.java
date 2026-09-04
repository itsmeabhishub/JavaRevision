package CollectionAPIJ;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetJ {
    public static void main(String[] args) {

        Collection<Integer> num = new TreeSet<>();

        num.add(75);
        num.add(95);
        num.add(97);
        num.add(83);
        num.add(85);
        num.add(69);
        num.add(75);

        for (int n : num){
            System.out.println(n);
        }
    }
}
