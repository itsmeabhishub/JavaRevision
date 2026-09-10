package RevisionJ;

@java.lang.FunctionalInterface
interface Devil{
    void show();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Devil dev = new Devil() {
            @Override
            public void show() {
                System.out.println("Devil Show");
            }
        };
        dev.show();
    }
}
