package StreamAPIQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeeSalaryFindHighestJQ {
    public static void main(String[] args) {
        List<Employee> empl = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha", 60000,"HR")
        );

         Employee res = empl.stream()
                .max((n,m) -> Double.compare(n.salary,m.salary)).get();
        System.out.println(res.salary);
    }
}
