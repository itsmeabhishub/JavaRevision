package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

class Employee{
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department){
        this.salary = salary;
        this.name = name;
        this.department = department;
    }
}

public class EmployeeSalaryJQ {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000,"HR")
        );
        emp.stream()
                .filter(n -> n.salary > 60000)
                .forEach(n -> System.out.println(n.name +" "+ n.salary+ " "+n.department));
    }
}
