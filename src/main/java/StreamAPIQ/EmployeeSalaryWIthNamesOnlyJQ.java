package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalaryWIthNamesOnlyJQ {
    public static void main(String[] args) {
        List<Employee> emppt = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000, "HR")
        );

        List<String> res = emppt.stream()
                .map(n -> n.name).toList();
        System.out.println(res);
    }
}
