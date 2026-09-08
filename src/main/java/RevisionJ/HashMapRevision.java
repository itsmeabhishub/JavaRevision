package RevisionJ;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapRevision {
    public static void main(String[] args) {

        Map<Integer, String> obj = new HashMap<>();

        obj.put(26,"Abhishek");
        obj.put(25,"Abhay");
        obj.put(27,"Ankit");
        obj.put(28,"Manas");

        System.out.println(obj);

        System.out.println(obj.get(28));
    }
}
