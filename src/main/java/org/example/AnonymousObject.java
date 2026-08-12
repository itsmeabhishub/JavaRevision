package org.example;

class A{
    public A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("Show method call");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {

//        A obj22 = new A();  Normal object
//        obj22.show();

        new A().show(); //Anonymous object we cant reuse it, every time it create new object in heap memory
        new A().show();

    }
}
