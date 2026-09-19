package ExceptionHandlingQuestionJ;

public class ReturnWithFinallyJQ {
    public static int test(){
        try {
            return 10;
        } finally {
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {
        System.out.println(test());

    }
}
