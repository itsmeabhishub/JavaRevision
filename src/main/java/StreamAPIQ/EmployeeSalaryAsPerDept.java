package StreamAPIQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class EmployeeSalaryAsPerDept {
    public static void main(String[] args) {
        List<Employee> empDept = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000, "HR")
        );

        Map<String, List<String>> res = empDept.stream()
                .collect(Collectors.groupingBy(e -> e.department, Collectors.mapping(e -> e.name, toList())));

        System.out.println(res);
    }
}
