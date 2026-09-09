package RevisionJ;

abstract class X{
    public abstract void show();
}

public class AbstractInerClass {
    public static void main(String[] args) {
        X obj8 = new X() {
            public void show() {
                System.out.println("Abstract show");
            }
        };

        obj8.show();
    }
}
