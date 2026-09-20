package ExceptionHandlingQuestionJ;

class Calc{
    public void divide(int a, int b){

        if(b == 0){
            throw new ArithmeticException("Can't be 0");
        } else {
            int c = a/b;
            System.out.println(c);
        }
    }
}

public class ThrowQJ {
    public static void main(String[] args) {
        Calc calc = new Calc();
        try {
            calc.divide(18,0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
