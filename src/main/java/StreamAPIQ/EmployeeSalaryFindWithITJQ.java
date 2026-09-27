package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalaryFindWithITJQ {
    public static void main(String[] args) {
        List<Employee>  emplye= Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000,"HR")
        );

        emplye.stream()
                .filter(n -> n.department.equals("IT"))
                .forEach(n -> System.out.println(n.name + " " + n.salary + " " + n.department));
    }
}
