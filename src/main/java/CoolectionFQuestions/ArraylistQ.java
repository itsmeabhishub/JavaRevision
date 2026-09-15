package CoolectionFQuestions;

import java.util.ArrayList;


public class ArraylistQ {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Amit");
        obj.add("Saurav");
        obj.add("Ashu");
        obj.add("Rahul");
        obj.add("Dibesh");
        obj.add("Deepak");
        obj.add("chotu");
        obj.add("Sachin");
        obj.add("Damo");
        obj.add("Anshu");

        for (String s : obj){
            System.out.println(s);
        }
        obj.remove("Rahul");
        boolean t = obj.contains("Amit");
        System.out.println(t);
        System.out.println(obj.size());
        for (String s : obj){
            System.out.println(s);
        }
    }
}
