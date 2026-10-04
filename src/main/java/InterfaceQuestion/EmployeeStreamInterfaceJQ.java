package InterfaceQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface EmployeeStream {
    String getName();

    double getSalary();
}

class DeveloperStream implements EmployeeStream {
    String name;

    public DeveloperStream(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return 78000;
    }
}

class ManagerStream implements EmployeeStream {
    String name;

    ManagerStream(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return 159780;
    }
}

class TesterStream implements EmployeeStream {
    String name;

    TesterStream(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return 57800;
    }
}

public class EmployeeStreamInterfaceJQ {
    public static void main(String[] args) {
        List<EmployeeStream> empStream = Arrays.asList(
                new DeveloperStream("Abhishek"),
                new ManagerStream("Ankit"),
                new TesterStream("Deepak")
        );
        Optional<Object> n = empStream.stream()
                .filter(e -> e.getSalary() > 65000)
                .max((m1, m2) -> Double.compare(m1.getSalary(), m2.getSalary()))
                .map(e -> e.getName());

        System.out.println(n.get());

    }
}
