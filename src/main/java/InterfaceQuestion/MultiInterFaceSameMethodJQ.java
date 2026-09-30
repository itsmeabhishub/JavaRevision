package InterfaceQuestion;

interface A{
    void show();
}

interface B{
    void show();
}

class Test implements A, B{
    public void show() {
        System.out.println("Show");
    }
}


public class MultiInterFaceSameMethodJQ {
    public static void main(String[] args) {

        Test test = new Test();
        B obj2 = test;
        A obj1 = test;
        obj1.show();
        obj2.show();
    }
}
