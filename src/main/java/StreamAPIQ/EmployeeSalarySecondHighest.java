package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class EmployeeSalarySecondHighest {
    public static void main(String[] args) {
        List<Employee> empSecond = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000, "HR")
        );

        Employee res = empSecond.stream()
                .distinct()
                .sorted((e1,e2)-> Double.compare(e2.salary, e1.salary))
                .skip(1)
                .findFirst().get();
        System.out.println(res.name + " " + res.salary);
    }
}
