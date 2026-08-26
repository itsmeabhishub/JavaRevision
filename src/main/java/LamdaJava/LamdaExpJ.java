package LamdaJava;

interface A {
    void show(int i);
}

public class LamdaExpJ {
    public static void main(String[] args) {

        A obj = i -> System.out.println("In Void Show " + i);

        obj.show(5);
    }
}
