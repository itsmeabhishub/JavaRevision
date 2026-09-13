package RevisionJ;

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalc extends Calc{
    public int multi(int a, int b){
        return a*b;
    }

    public int dive(int a, int b){
        return a/b;
    }

}

public class InheritanceJava {
    public static void main(String[] args) {

        AdvCalc obj13 = new AdvCalc();
        int c = obj13.add(13,14);
        int d = obj13.dive(8,2);

        System.out.println(c + "   " + d);

    }
}
