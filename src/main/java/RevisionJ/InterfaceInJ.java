package RevisionJ;

interface Swim{
    void swin();
}

interface Fly{
    void fly();
}

class Duck implements Swim, Fly{
    @Override
    public void swin() {
        System.out.println("Duck can swim");
    }
    @Override
    public void fly(){
        System.out.println("Duck also able to fly");
    }
}

class Areoplane implements Fly{
    @Override
    public void fly() {
        System.out.println("Areoplane only fly");
    }
}

public class InterfaceInJ {
    public static void main(String[] args) {
        Duck duckObj = new Duck();
        duckObj.swin();
        duckObj.fly();

        Areoplane areoObj = new Areoplane();
        areoObj.fly();
    }
}
