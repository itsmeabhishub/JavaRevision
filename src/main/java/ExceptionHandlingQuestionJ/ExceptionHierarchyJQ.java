package ExceptionHandlingQuestionJ;

public class ExceptionHierarchyJQ {
    public static void main(String[] args) {
        int a = 1;
        String number = "123abc";
        try {
            int b = 18/a;
            System.out.println(b);
            int num = Integer.parseInt(number);
            System.out.println(num);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
