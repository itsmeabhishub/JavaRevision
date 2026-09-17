package CoolectionFQuestions;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int rollNo;
    int marks;
    public Student(String name, int rollNo, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
public class ArrayListStudentQJ {
    public static void main(String[] args) {
        List<Student> stdMark = new ArrayList<>();
        stdMark.add(new Student("Abhishek", 1, 97));
        stdMark.add(new Student("Shubham", 2, 67));
        stdMark.add(new Student("Ankit", 3, 77));
        stdMark.add(new Student("Divesh", 4, 91));
        stdMark.add(new Student("Manas", 5, 83));

        for (Student s : stdMark){
            System.out.println("Name is "+ s.name + " and his roll no is " + s.rollNo + " and his marks is " + s.marks);
        }
    }
}
