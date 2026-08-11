package org.example;

class Encap{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }


}

public class EncapsulationJava {
    public static void main(String[] args) {
        Encap dataObj = new Encap();
        dataObj.setAge(30);
        dataObj.setName("Abhishek");

        System.out.println(dataObj.getName() + " " + dataObj.getAge());
    }
}
