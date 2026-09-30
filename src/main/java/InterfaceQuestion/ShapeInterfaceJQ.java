package InterfaceQuestion;
interface Shape{
    double shape();
}

class Circle implements Shape{
    public double shape(){
        int r = 7;
        return Math.PI * r * r;
    }
}

class Rectangle implements Shape{
    public double shape() {
        int w = 5;
        int h = 7;
        return w * h;
    }
}

class Square implements  Shape{
    public double shape(){
        int a = 7;
        return 7*7;
    }
}

public class ShapeInterfaceJQ {
    public static void main(String[] args) {
        Shape dev;
        dev = new Circle();
        double a = dev.shape();
        dev  = new Rectangle();
        double b = dev.shape();
        dev = new Square();
        double c = dev.shape();

        System.out.println(a + " " + b + " " + c);
    }
}
