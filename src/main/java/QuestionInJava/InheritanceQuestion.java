package QuestionInJava;
class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking..");
    }
}


public class InheritanceQuestion {
    public static void main(String[] args) {

        Dog kutta = new Dog();

        kutta.eat();
        kutta.bark();

    }
}
