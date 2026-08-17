package Variables;

//final keyword for variables, class and method

final class A{
    public final void show(){
        System.out.println("Abhishek");
    }
}

//class B extends A{  //prevent class inheritance
//    public void show(){  //prevent method overriding
//        System.out.println("Ankit");
//    }
//}

public class FinalKeyword {
    public static void main(String[] args) {

         final int a = 8;

       // a= 9; prevent reassigning
        System.out.println(a);

        A obj = new A();
        obj.show();

    }
}
