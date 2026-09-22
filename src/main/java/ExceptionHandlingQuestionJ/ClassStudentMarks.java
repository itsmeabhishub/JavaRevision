package ExceptionHandlingQuestionJ;

class Student{
     String name;
     int marks;
    public void setName(String name){
        this.name = name;
    }
     public void setMarks(int marks){
         if(marks < 0){
             throw new IllegalArgumentException("Marks cannot be less than zero");
         }
         if(marks > 100){
             throw new IllegalArgumentException("Marks cannot be grater than 100");
         }
         this.marks = marks;
     }
     public void showStudent(){
        if(marks <= 100 && marks >= 0 ){
            System.out.println(" name is " + name + " and marks is " +marks);
        }}
}
public class ClassStudentMarks {
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "Abhishek";
        try {
            std.setMarks(197);
        }  catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        std.showStudent();
    }
}
