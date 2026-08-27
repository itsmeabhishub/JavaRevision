package ExceptionJava;

public class ThrowException {
    public static void main(String[] args) {
        int m = 40;
        int n = 0;


        try {
            n = 18 / m;
            if (n == 0)
                throw new ArithmeticException("Default can be zero");
        } catch (ArithmeticException e) {
            n = 18 / 1;
            System.out.println("Default will be this" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong....");
        }

        System.out.println(n);

        System.out.println("Bye");
    }
}
