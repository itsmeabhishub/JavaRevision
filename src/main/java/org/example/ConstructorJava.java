package org.example;

class DemoConstructor{
    private int age;
    private String name;

    public DemoConstructor(){
        age = 25;
        name = "Abhi";
    }

    public void setAge1(int age){
        this.age=age;
    }
    public int getAge1(){
        return age;
    }
}

public class ConstructorJava {
    public static void main(String[] args) {
        DemoConstructor demoObj = new DemoConstructor();
        DemoConstructor demoObj1 = new DemoConstructor();
        System.out.println(demoObj.getAge1());
        System.out.println(demoObj1.getAge1());

    }
}
