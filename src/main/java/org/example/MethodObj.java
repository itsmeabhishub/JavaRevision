package org.example;

class Mobile1{
    String brandName;
    String model;
    int price;
    static String typePhone;

    static void objMethod(Mobile1 obj1){
        System.out.println(obj1.brandName + " " + obj1.model + " " + obj1.price + " "+ typePhone);
    }

}

public class MethodObj {
    public static void main(String[] args) {

        Mobile1 objtest = new Mobile1();
        objtest.brandName="Samsung";
        objtest.model="A56";
        objtest.price=60000;

        Mobile1 objtest1 = new Mobile1();
        objtest1.brandName="Iphone";
        objtest1.model="17";
        objtest1.price=76000;

        Mobile1.typePhone="Smart Phone";

        Mobile1.objMethod(objtest);
        Mobile1.objMethod(objtest1);
    }
}
