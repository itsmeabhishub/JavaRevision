package abstractClasses;

abstract class Car {
    public abstract void engine();

    public void music() {
        System.out.println("Playing Music....");
    }
}

class WagnoR extends Car {
    public void engine() {
        System.out.println("Engine starting...");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        //Car obj = new Car(); //Now as car class is abstract class we cannot create the object of it.
        Car obj = new WagnoR();
        obj.engine();
        obj.music();

    }
}
