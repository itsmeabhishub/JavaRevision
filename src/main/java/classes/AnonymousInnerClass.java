package classes;

class A{
    public void show(){
        System.out.println("In A show mwthod...");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show() {
                System.out.println("in new show method");
            }
        };
        obj.show();
    }
}
