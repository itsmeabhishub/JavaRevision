package classes;

abstract class X{
    public abstract void show();
    public abstract void config();
}

public class AbstractandAnonymousInnerClass {
    public static void main(String[] args) {
        X obj = new X() {
            public void show(){
                System.out.println("In new show method");
            }

            public void config(){
                System.out.println("In new config method");
            }
        };
        obj.config();
        obj.show();
    }
}
