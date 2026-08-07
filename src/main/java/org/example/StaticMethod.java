package org.example;


class Mobile{

    String phoneName;
    String maker;
    int price;
    static String type;

    public void display(){
        System.out.println( phoneName + " " + maker + " " + price + " " + type);
    }
        }

public class StaticMethod {
    public static void main(String[] args) {
        Mobile s1 = new Mobile();
       s1. phoneName= "S56";
       s1.maker= "Samsung";
       s1.price= 56000;
       s1.type = "Smart Phone";

       Mobile s2 = new Mobile();
       s2.phoneName="iPhone 16";
       s2.maker = "Apple";
       s2.price = 75000;
       s2.type = "Smart phone";

       s1.type= "Phone";

       s1.display();
       s2.display();
    }

}
