package CollectionAPIJ;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapAdv {
    public static void main(String[] args) {

        Map<String, Integer> student2 = new HashMap<>();

        student2.put("Abhishek", 26);
        student2.put("Abhay", 26);
        student2.put("Ankit", 26);
        student2.put("Manas", 26);

        System.out.println(student2.keySet());

        for (String key : student2.keySet()){
            System.out.println(key + " : " + student2.get(key));
        }
    }
}
