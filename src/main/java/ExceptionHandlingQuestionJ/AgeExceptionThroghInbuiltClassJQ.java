package ExceptionHandlingQuestionJ;

public class AgeExceptionThroghInbuiltClassJQ {
    public static void main(String[] args) {
        int age = 17;
        try{
            if(age>=18){
                System.out.println("Eligible");
            } else {
                throw new IllegalArgumentException("Age must be 18 or greater");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
