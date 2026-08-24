package Interface;

interface A{
    String name = "Abhishek"; //final and static

    void show();
}

class B implements A{
    public void show(){
        System.out.println("In show method");
    }
}

public class InterfaceJava {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        System.out.println(A.name);
    }
}
