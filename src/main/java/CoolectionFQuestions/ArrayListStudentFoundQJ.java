package CoolectionFQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student1{
    String name;
    int rollNo;
    int marks;
    public Student1(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class ArrayListStudentFoundQJ {
    public static void main(String[] args) {

        List<Student1> stdFound = new ArrayList<>();
        stdFound.add(new Student1("Abhishek", 1, 97));
        stdFound.add(new Student1("Manas", 1, 87));
        stdFound.add(new Student1("Ankit", 1, 97));
        stdFound.add(new Student1("Abhay", 1, 77));
        stdFound.add(new Student1("Anuj", 1, 67));
            int findRoll = 103;
            stdFound.contains(103);

    }
}
