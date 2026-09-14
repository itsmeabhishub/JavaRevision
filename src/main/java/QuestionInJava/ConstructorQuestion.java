package QuestionInJava;

class Student{
    public String name;
    public int age;
    public int marks;

    public Student(String name, int age, int marks){
        this.name = name;
        this.age= age;
        this.marks = marks;
    }

    public void display(){
        System.out.println(name + " " + age + " "+ marks);
    }
}

public class ConstructorQuestion {
    public static void main(String[] args) {
        Student std = new Student("Abhishek", 26, 99);
        std.display();

    }
}
