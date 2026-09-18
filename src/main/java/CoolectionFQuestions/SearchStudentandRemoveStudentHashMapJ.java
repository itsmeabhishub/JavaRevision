package CoolectionFQuestions;
import java.util.HashMap;

class StudentObj{
    String name;
    int marks;
    public StudentObj(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class SearchStudentandRemoveStudentHashMapJ {
    public static void main(String[] args) {
        HashMap<Integer, StudentObj> stdRem = new HashMap<>();
        stdRem.put(1,new StudentObj("Abhishek", 97));
        stdRem.put(2,new StudentObj("Ankit", 97));
        stdRem.put(3,new StudentObj("Anuj", 97));
        stdRem.put(4,new StudentObj("Abhay", 97));
        stdRem.put(5,new StudentObj("Manas", 97));

         StudentObj s= stdRem.get(3);
        System.out.println(s.name + " " + s.marks);
        stdRem.remove(4);



    }
}
