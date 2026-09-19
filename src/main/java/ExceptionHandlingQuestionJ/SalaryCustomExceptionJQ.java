package ExceptionHandlingQuestionJ;

class SalaryException extends RuntimeException{
    SalaryException (String string){
        super(string);
    }
}

class Salary{
    public void salary(double sal){
        if(sal>0){
            System.out.println("Valid Salary");
        }else {
            throw new SalaryException("Salary can't be 0 or negative");
        }
    }
}

public class SalaryCustomExceptionJQ {
    public static void main(String[] args) {
        Salary newSal = new Salary();
        try {
            newSal.salary(-76);
        } catch (SalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
