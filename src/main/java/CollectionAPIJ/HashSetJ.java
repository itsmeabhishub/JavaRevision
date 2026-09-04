package CollectionAPIJ;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSetJ {
    public static void main(String[] args) {

        Set<Integer> numb= new HashSet<Integer>();

        numb.add(88);
        numb.add(88);
        numb.add(75);
        numb.add(65);
        numb.add(91);
        numb.add(9);

        for (int n : numb){
            System.out.println(n);
        }
    }
}
