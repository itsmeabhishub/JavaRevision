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
        System.out.println(empMap.get(2).department);
        empMap.remove(1);
    }
}
