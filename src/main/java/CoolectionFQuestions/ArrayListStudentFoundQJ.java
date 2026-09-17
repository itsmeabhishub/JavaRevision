package CoolectionFQuestions;

import java.util.ArrayList;
import java.util.List;

class Student1 {
    String name;
    int rollNo;
    int marks;

    public Student1(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class ArrayListStudentFoundQJ {
    public static void main(String[] args) {
        List<Student1> stdFound = new ArrayList<>();
        stdFound.add(new Student1("Abhishek", 1, 97));
        stdFound.add(new Student1("Manas", 2, 87));
        stdFound.add(new Student1("Ankit", 3, 97));
        stdFound.add(new Student1("Abhay", 4, 77));
        stdFound.add(new Student1("Anuj", 5, 67));
        int findRoll = 1;
        boolean found = false;
        for (Student1 s : stdFound) {
            if (findRoll == s.rollNo) {
                System.out.println("Student found " + s.name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }
}
