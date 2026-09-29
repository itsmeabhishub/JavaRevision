package InterfaceQuestion;

interface Employee{
    void calculateSalary();
}

class FullTimeEmployee implements Employee{
    int monthlySal = 97000;
    public void calculateSalary(){
        System.out.println("Monthly salary " + monthlySal);
    }
}

class PartTimeEmployee implements Employee{
    public void calculateSalary(){
        int hour = 7;
        int partTimeSalary = 78 * hour;
        System.out.println("Hourly Salary " + partTimeSalary);
    }
}

public class EmployeeSalaryJQ {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee();
        Employee pte = new PartTimeEmployee();
        fte.calculateSalary();
        pte.calculateSalary();
    }
}
