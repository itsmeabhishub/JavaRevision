package ExceptionHandlingQuestionJ;

public class InterviewQuestionJ {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            return;
        } catch (ArithmeticException e){
            System.out.println("Catch");
        } finally {
            System.out.println("finally");
        }
    }
}
