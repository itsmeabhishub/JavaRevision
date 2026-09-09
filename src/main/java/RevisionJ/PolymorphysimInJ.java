package RevisionJ;

class M{
    public void show(){
        System.out.println("In M show");
    }
}

class N extends M{
    public void show(){
        System.out.println("In N show");
    }
}

class O extends M{
    public void show(){
        System.out.println("In O show");
    }
}

public class PolymorphysimInJ {
    public static void main(String[] args) {
        M obj9 = new M();
        obj9.show();

        obj9 = new N();
        obj9.show();

        obj9 = new O();
        obj9.show();

    }
}
