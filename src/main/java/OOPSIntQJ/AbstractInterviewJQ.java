package OOPSIntQJ;

import java.util.Arrays;
import java.util.List;

abstract class Employee{
    String name;
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name){
        this.name = name;
    }
    public double calculateSalary(){
        int month = 1;
        double amount = 78000.;
        return amount * month;
    }
}

class PartTimeEmployee extends Employee{

    PartTimeEmployee(String name){
        this.name = name;
    }
    public double calculateSalary(){
        int days = 20;
        double amount = 800;
        return amount * days;
    }

}

class  ContractEmployee extends Employee{

    ContractEmployee(String name){
        this.name = name;
    }

    public double calculateSalary(){
        double amount =45000.76;
        return amount;
    }

}

public class AbstractInterviewJQ {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new FullTimeEmployee("Abhishek"),
                new PartTimeEmployee("Dines"),
                new ContractEmployee("David")
        );

        for (Employee e :emp){
            double res = e.calculateSalary();
            System.out.println(e.name + " -> "+ res);
        }
    }
}
