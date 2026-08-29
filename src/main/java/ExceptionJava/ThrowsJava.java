package ExceptionJava;

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("calc");
    }
}

public class ThrowsJava {
    public static void main(String[] args) {
        A obj = new A();

        try {
            obj.show();
        }catch (ClassNotFoundException e){
            System.out.println("Class not found " + e);
        }

    }
}
