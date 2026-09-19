package ExceptionHandlingQuestionJ;

public class GenericExceptionJQ {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        String name = "123abc";

        try {
            int c = a/b;
            System.out.println(c);
            int d = Integer.parseInt(name);
            System.out.println(d);
        } catch (Exception e){
            System.out.println("Exception catch please check");
        }
    }
}
