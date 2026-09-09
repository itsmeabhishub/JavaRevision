package RevisionJ;

class A{
    public void show(){
        System.out.println("In class");
    }
}

public class AnonymousInnerClassRev {
    public static void main(String[] args) {
        A obj7 = new A()
        {
            public void show() {
                System.out.println("In inner class");
            }
        };
        obj7.show();
    }
}
