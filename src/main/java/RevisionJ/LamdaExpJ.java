package RevisionJ;

interface LamdaExp{
    void show(int i);
}

public class LamdaExpJ {
    public static void main(String[] args) {
        LamdaExp obj9 = i -> System.out.println("Lamda exp " + i);

        obj9.show(5);
    }
}
