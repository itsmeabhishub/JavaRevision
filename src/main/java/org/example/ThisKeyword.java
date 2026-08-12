package org.example;

class Human {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class ThisKeyword {
    public static void main(String[] args) {

        Human newHumanObj = new Human();
        newHumanObj.setAge(30);
        newHumanObj.setName("Abhi");
        System.out.println(newHumanObj.getName() + " : " + newHumanObj.getAge());

    }
}
