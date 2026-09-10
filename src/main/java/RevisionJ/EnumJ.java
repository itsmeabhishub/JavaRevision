package RevisionJ;

enum Status{
    running, pending, complete, onHold;
}

public class EnumJ {
    public static void main(String[] args) {
        Status s = Status.onHold;

        System.out.println(s);

        Status[] ss = Status.values();

        for (Status std: ss){
            System.out.println(std+ " : "+ std.ordinal());
        }
    }
}
