package EnumJava;

enum Status{
    Running, Failed, Success, Onhold;
}

public class EnumJ {
    public static void main(String[] args) {
        Status s = Status.Success;

        System.out.println(s.ordinal());

        Status [] ss = Status.values();

        for (Status sin : ss){
            System.out.println(sin + " : " + sin.ordinal());
        }
    }
}
