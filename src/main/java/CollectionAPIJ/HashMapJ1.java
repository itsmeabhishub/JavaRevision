package CollectionAPIJ;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapJ1 {
    public static void main(String[] args) {
        Map<String ,Number> student1 = new HashMap<>();

        student1.put("Abhishek", 27);
        student1.put("Ankit", 26);
        student1.put("Abhay", 26);
        student1.put("Manas", 26);
        student1.put("Abhishek", 26);

        System.out.println(student1);
    }
}
