package CollectionAPIJ;

import com.sun.jdi.Value;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        Map<String, Integer> student = new java.util.HashMap<>();

        student.put("Abhishek", 26);
        student.put("Ankit", 25);
        student.put("Dibesh", 27);
        student.put("Abhay", 26);

        System.out.println(student);
    }
}
