package classes;

class Car{
    int num1 = 10;

    public void music(){
        System.out.println("Playing Music..");
    }

    class Engine{
        public void engineStrat(){
            System.out.println("Starting Engine..");
        }
    }
}

public class InnerClassess {
    public static void main(String[] args) {

        Car obj1 = new Car();
        obj1.music();
        Car.Engine obj2 = obj1.new Engine();
        obj2.engineStrat();
    }
}
