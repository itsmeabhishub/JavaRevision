package QuestionInJava;

class Vachile{
    public void start(){
        System.out.println("Starting Engine..");
    }
}
class Car extends Vachile{
    public void start(){
        System.out.println("Starting car Engine..");
    }
}
class Bike extends Vachile{
    public void start() {
        System.out.println("Starting bike engine...");
    }
}
class Truck extends Vachile{
    public void start(){
        System.out.println("Starting truck engine...");
    }
}
public class PolymorphysimJQ {
    public static void main(String[] args) {
        Vachile v;
        v = new Bike(); v.start();
        v = new Car(); v.start();
        v = new Truck(); v.start();
    }
}
