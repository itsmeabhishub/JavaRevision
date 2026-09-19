package ExceptionHandlingQuestionJ;

class IntAgeException extends RuntimeException{
    public IntAgeException(String string){
        super(string);
    }
}

public class AgeExceptionJQ {
    public static void main(String[] args) {
         int age = 17;
        try {
            if (age >= 18) {
                System.out.println("Eligibble");
            } else {
                throw new IntAgeException("Not eligible");
            }
        } catch ( IntAgeException e){
            System.out.println(e);
        }

    }
}
