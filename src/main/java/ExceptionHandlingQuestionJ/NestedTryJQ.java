package ExceptionHandlingQuestionJ;

public class NestedTryJQ {
    public static void main(String[] args) {
        int a = 18;
        int b = 1;
        try {
            int c = a/b;
            System.out.println(c);
            try {
                int[] arr = {1,2,3};
                System.out.println(arr[3]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
