package ExceptionHandlingQuestionJ;

public class NumberFormatExceptionJ {
    public static void main(String[] args) {
        String value = "123abc";

        try {
            int abc = Integer.parseInt(value);
            System.out.println(abc);
        } catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
