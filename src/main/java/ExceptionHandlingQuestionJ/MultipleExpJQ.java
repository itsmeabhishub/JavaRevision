package ExceptionHandlingQuestionJ;

public class MultipleExpJQ {
    public static void main(String[] args) {
        String number = "123abc";
        int[] arr = {10,20,30};
        int a = 1;
        try {
            int c = 18/a;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        try {
            int num = Integer.parseInt(number);
            System.out.println(num);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
