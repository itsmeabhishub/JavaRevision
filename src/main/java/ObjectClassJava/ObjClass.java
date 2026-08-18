package ObjectClassJava;

class Laptop {
    int price;
    String model;

    public String toString(){
        return price + " " + model;
    }
}

public class ObjClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.price= 1000;
        obj.model ="Lenovo yoga";

        System.out.println(obj.toString());
    }
}
