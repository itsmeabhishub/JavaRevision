package ExceptionHandlingQuestionJ;

public class InterviewQuestion1J {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int A = 18/0;
            System.out.println("B");
        } catch (ArithmeticException e){
            System.out.println("C");
        }finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
