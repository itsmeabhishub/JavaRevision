package QuestionInJava;

class Employeee{
    private String name;
    private int salary;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
            this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}
class Manager extends Employeee{
    public int bonousAdd(int bonus){
        int salary = getSalary();
        return bonus + salary;
    }
}
public class EmployeeManagerJQ {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setSalary(2000);
        manager.setName("Ankit");
        int i = manager.bonousAdd(200);
        String s = manager.getName();
        System.out.println( s + " and salary is " + i);
    }
}
