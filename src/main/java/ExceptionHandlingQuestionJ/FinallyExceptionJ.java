package ExceptionHandlingQuestionJ;

public class FinallyExceptionJ {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Divided by zero is not possible");
        } finally {
            System.out.println("program execution completed");
        }
    }
}
