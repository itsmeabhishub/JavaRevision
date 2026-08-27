package ExceptionJava;

class AbhishekException extends RuntimeException{
    public AbhishekException(String string){
        super(string);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int t = 20;
        int u = 0;

        try {
            u = 18 / t;
            if (u==0)
                throw new AbhishekException("We don't want to return 0");
        } catch (AbhishekException e){
            u =18/1;
            System.out.println("This will be default output" + e);
        }

        System.out.println(u);

        System.out.println("Bye");
    }
}
