package OOPSIntQJ;

import java.util.HashMap;
import java.util.Map;

class Employees{
    int id;
    String name;
    double salary;
    String department;

    Employees(int id, String name, double salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}

public class HashMapObjectJQ {
    public static void main(String[] args) {
        Map<Integer, Employees> empMap = new HashMap<>();
        empMap.put(1 , new Employees(1, "Abhishek", 78000, "SEAEM"));
        empMap.put(2 , new Employees(2, "Deepak", 48000, "QEA"));
        empMap.put(3 , new Employees(3, "Shurti", 28000, "HR"));
        empMap.put(4 , new Employees(4, "Ankit", 98000, "SEAEM"));

        int eID= 1;
        double maxSal=0;

        double totalSal = 0;
        double count = 0;
        for(Employees emp : empMap.values()){
            if(emp.id == eID){
                System.out.println(emp.name);
            }
            if(emp.salary > maxSal){
                maxSal = emp.salary;
            }

            if(emp.department.equals("QEA")){
                System.out.println(emp.name);
            }

            totalSal += emp.salary;
            count++;
        }
        empMap.remove(1);
        System.out.println(maxSal);
        System.out.println(totalSal/count);

    }
}
