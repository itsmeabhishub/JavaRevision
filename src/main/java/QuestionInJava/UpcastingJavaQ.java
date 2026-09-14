package QuestionInJava;
class Employee{
    String name;
    int employeedId;
    public Employee(String name, int employeedId){
        this.name = name;
        this.employeedId=employeedId;
    }
    public void show(){
        System.out.println(name + " " + employeedId);
    }
}
class Developer extends Employee{
    String role = "Developer";
    public Developer(String name, int employeedId) {
        super(name, employeedId);
    }
    public void show() {
        System.out.println(name + " " + employeedId + " " + role);
    }
}
public class UpcastingJavaQ {
    public static void main(String[] args) {
        Employee emp = new Developer("Abhishek", 2345);
        emp.show();

    }
}
