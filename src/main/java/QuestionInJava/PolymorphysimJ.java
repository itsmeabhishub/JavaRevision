package QuestionInJava;
class Calculator{
    public int add (int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
}

public class PolymorphysimJ {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = calc.add(8,9);
        int b = calc.add(9,9,9);
        double c = calc.add(9.8, 7.8);

        System.out.println("2 integer add = " + a + ", 3 integer add = " + b + " and 2 double addition is " + c);
    }
}
