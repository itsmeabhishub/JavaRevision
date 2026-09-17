package CoolectionFQuestions;

import java.util.HashMap;

public class HashMapStdQ {
    public static void main(String[] args) {
        HashMap<String, Integer> studentObj = new HashMap<>();
        studentObj.put("Abhi", 95);
        studentObj.put("Rahul", 72);
        studentObj.put("Amit", 97);
        studentObj.put("Rohit", 65);

        int highest = 0;
        String student = "";
        for (String n : studentObj.keySet()) {
            int mark = studentObj.get(n);
            if(mark > highest){
                highest = mark;
                student = n;
            }
        }
        System.out.println(highest +" "+ student);
    }
}
