package StreamAPIQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryDeptCountWise {
    public static void main(String[] args) {
        List<Employee> empCount = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000, "HR")
        );

        Map<Object, Long> res = empCount.stream()
                .collect(Collectors.groupingBy(e -> e.department, Collectors.mapping(e -> e.name, Collectors.counting())));

        System.out.println(res);
    }
}
