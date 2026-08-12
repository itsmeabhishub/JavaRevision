package org.example;

class ParameterizedConstructor{

    private int age;
    private String name;
    public ParameterizedConstructor(){    // Default constructor
        age = 25;
        name = "Abhi";
    }

    public ParameterizedConstructor(int age, String name){ // Parameterized constructor
        this.age = age;
        this.name = name;
    }

    public void setAge2(int age){
        this.age = age;
    }

    public  int getAge2(){
        return age;
    }

    public  String getName2(){
        return name;
    }
}

public class ConstructorParameterized {
    public static void main(String[] args) {

        ParameterizedConstructor demoObj12 = new ParameterizedConstructor();
        ParameterizedConstructor demoObj13 = new ParameterizedConstructor(30, "Abhishek");

        System.out.println(demoObj12.getAge2() + " : " + demoObj12.getName2());
        System.out.println(demoObj13.getAge2()+ " : " + demoObj13.getName2());
    }
}
