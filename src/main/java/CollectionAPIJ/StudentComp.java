package CollectionAPIJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student age is "+ age +" and name is " + name+" ";
    }


}

public class StudentComp {
    public static void main(String[] args) {

        Comparator<Student> studes = new Comparator<Student>() {

            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Student> stud = new ArrayList<>();

        stud.add(new Student(26, "Abhishek"));
        stud.add(new Student(27, "Abhay"));
        stud.add(new Student(28, "Ankit"));
        stud.add(new Student(25, "Manas"));

        Collections.sort(stud, studes);

        for (Student std: stud){
            System.out.println(std);
        }

    }
}
