package ExceptionHandlingQuestionJ;

public class MultipleExceptionQJ {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int a = 10;
        int b = 0;
        String name = null;
        try {
            System.out.println(arr[4]);
            int c = a/b;
            System.out.println(c);
            System.out.println(name);
        } catch (ArithmeticException e){
            System.out.println("cannot divided by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please try fetch inside the Array length");
        } catch (NullPointerException e){
            System.out.println("Please do not try to fetch the null string ");
        }
    }
}
