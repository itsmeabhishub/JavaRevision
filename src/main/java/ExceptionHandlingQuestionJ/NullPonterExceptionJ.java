package ExceptionHandlingQuestionJ;

public class NullPonterExceptionJ {
    public static void main(String[] args) {
        String name = null;
        int[] arr = null;

        try {

            int l = name.length();
            System.out.println(l);
            System.out.println(arr.length);
        } catch (NullPointerException e){
            System.out.println("Please have a length before you try to get the length of String");
        }
    }
}
