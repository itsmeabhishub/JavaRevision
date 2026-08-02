package org.example;

class Student {
    int roll;
    String name;
    int marks;
}

public class ArrayOfObj {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Abhishek";
        s1.marks = 85;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Rahul";
        s2.marks = 97;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Ananya";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }


    }
}
