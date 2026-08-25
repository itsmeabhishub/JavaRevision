package AnnotationJ;
class A{
    public void showInPublicMethodBelongs(){
        System.out.println("In A Method");
    }
}

class B extends A{
    @Override
    public void showInPublicMethodBelongs(){
        System.out.println("In B method");
    }
}


public class AnnotationJava {
    public static void main(String[] args) {

        B obj = new B();

        obj.showInPublicMethodBelongs();

    }
}
