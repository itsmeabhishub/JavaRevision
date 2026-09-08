package RevisionJ;

public class ExceptionJRevision {
    public static void main(String[] args) {
        int j = 0;
        int k = 0;

        try {
            k = 18/j;
            System.out.println(k);
        }catch (Exception e){
            System.out.println("Can divide by 0");
        }
    }
}
