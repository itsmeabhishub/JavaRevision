package InterfaceQuestion;

interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    public void start(){
        System.out.println("Engine starting of car");
    }

    public void stop(){
        System.out.println("Shutting down the engine of car");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Starting the engine of bike");
    }

    public void stop(){
        System.out.println("Shutting down the engine of bike");
    }
}

class Truck implements Vehicle{
    public void start(){
        System.out.println("Starting the engine of truck");
    }
    public void stop(){
        System.out.println("Shutting down the engine of truck");
    }
}

public class VechileInterfaceJQ {
    public static void main(String[] args) {

        Car v1 = new Car();
        Bike v2 = new Bike();
        Truck v3 = new Truck();
        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
        v3.start();
        v3.stop();
    }
}
