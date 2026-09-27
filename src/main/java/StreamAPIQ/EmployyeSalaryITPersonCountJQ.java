package StreamAPIQ;

import java.util.Arrays;
import java.util.List;

public class EmployyeSalaryITPersonCountJQ {
    public static void main(String[] args) {
        List<Employee> empp = Arrays.asList(
                new Employee("Abhishek", 5000, "IT"),
                new Employee("Ankit", 98000, "IT"),
                new Employee("Abhay", 78000, "IT"),
                new Employee("Manas", 88000, "Finance"),
                new Employee("Neha",60000, "HR")
        );

        long res = empp.stream()
                .filter(n -> n.department.equals("IT")).count();
        System.out.println(res);
    }
}
