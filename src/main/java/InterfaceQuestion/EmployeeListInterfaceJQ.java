package InterfaceQuestion;

import java.util.ArrayList;
import java.util.List;

interface EmployeeL{
    double calculateBonus();
    String getName();
}

class Developer implements EmployeeL{
    String name;
    public double calculateBonus() {
        double basicSal = 7500;
        double bonusCalc = basicSal * 8.33 /100;
        double month = 9;
        return bonusCalc * month;
    }

    public Developer (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager implements EmployeeL{
    String name;
    public double calculateBonus() {
        double basicSal = 17500;
        double bonusCalc = basicSal * 8.33 /100;
        double month = 9;
        return bonusCalc * month;
    }

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Tester implements EmployeeL{
    String name;
    public double calculateBonus() {
        double basicSal = 5500;
        double bonusCalc = basicSal * 8.33 /100;
        double month = 9;
        return bonusCalc * month;
    }

    public Tester(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeListInterfaceJQ {
    public static void main(String[] args) {
        List<EmployeeL> empList = new ArrayList<EmployeeL>();
        empList.add(new Developer("Abhishek"));
        empList.add(new Manager("Ankit"));
        empList.add(new Tester("Amit"));

        for (EmployeeL e : empList){
            System.out.println(e.getName()+" " +e.calculateBonus());
        }
    }
}
