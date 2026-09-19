package ExceptionHandlingQuestionJ;

public class ArthmeticAndArrayOutBondException {
    public static void main(String[] args) {
        String name ="ABC123";
        int a = 10;
        int b = 0;

        try {
            int length = Integer.parseInt(name);
            System.out.println(length);
            int c = a / b;

            System.out.println(c);
        } catch (NumberFormatException e){
            System.out.println("Please enter the number format");
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
