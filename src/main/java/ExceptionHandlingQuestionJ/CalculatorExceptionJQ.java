package ExceptionHandlingQuestionJ;

class Calcu{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot be zero");
        }
        return a/b;
    }
}

public class CalculatorExceptionJQ {
    public static void main(String[] args) {
        Calcu calcu = new Calcu();
        try {
            System.out.println(calcu.divide(2,0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(calcu.add(2,0));
    }
}
