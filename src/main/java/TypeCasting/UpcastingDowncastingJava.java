package TypeCasting;

class A {
    public void show1(){
        System.out.println("in A");
    }
}

class B extends A {
    public void show2(){
        System.out.println("in B");
    }
}

public class UpcastingDowncastingJava {
    public static void main(String[] args) {

        A obj = new B(); //upcasting
        obj.show1();

        B obj1 = (B) obj; //downcasting
        obj1.show2();

    }
}
