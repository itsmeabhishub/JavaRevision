package StreamAPIQ;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryDepertmentWise {
    public static void main(String[] args) {
        List<Employee> empDeptSal = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000, "HR")
        );
        Map<String, Optional<Employee>> res = empDeptSal.stream()
                .collect(Collectors.groupingBy(e -> e.department , Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))));

        res.forEach((dept, emp) -> System.out.println(dept + " : " + emp.get().name + " " + emp.get().salary));
    }
}
