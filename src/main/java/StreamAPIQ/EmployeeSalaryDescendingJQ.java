package StreamAPIQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSalaryDescendingJQ {
    public static void main(String[] args) {
        List<Employee> empName = Arrays.asList(
             new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000,"HR")
        );

        empName.stream()
                .sorted((e1,e2) -> Double.compare(e2.salary, e1.salary))
                .forEach(e -> System.out.println(e.name + "     " +e.salary));
    }
}
