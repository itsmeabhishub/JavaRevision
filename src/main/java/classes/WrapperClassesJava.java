package classes;

public class WrapperClassesJava {
    public static void main(String[] args) {

        int a = 10;

        Integer b= 10;
        System.out.println(a + "  " + b);

        int c = 5;
        Integer d = c; // auto-boxing

        System.out.println(d);

        int e = d; //auto-unboxing

        System.out.println(e);

        String str = "12";

        int num1 = Integer.parseInt(str);

        System.out.println(num1*2);

    }
}
