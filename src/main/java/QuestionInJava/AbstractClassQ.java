package QuestionInJava;
abstract class Shape{
    public abstract double calculateArea();
}

class Rectangle extends Shape{
    int l;
    int b;

    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    public double calculateArea() {
        return l*b;
    }
}

class Circle extends Shape{
    int r;
    public Circle(int r){
        this.r = r;
    }
    public double calculateArea() {
        return Math.PI *r*r;
    }
}

public class AbstractClassQ {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(7,8);
        int p =(int) rec.calculateArea();
        Circle cir = new Circle(7);
         double c = cir.calculateArea();
        System.out.println(p + " " +c);
    }
}
