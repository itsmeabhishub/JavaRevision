package ExceptionHandlingQuestionJ;

class SalaryThroughInbuilt{
    public void salaryInbuilt(double salary){
        if(salary > 0){
            System.out.println("Salay credited");
        } else{
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
    }
}

public class SalaryExceptionThroughInbuiltClass {
    public static void main(String[] args) {
        SalaryThroughInbuilt newSala = new SalaryThroughInbuilt();
        try {
            newSala.salaryInbuilt(-78.01);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
