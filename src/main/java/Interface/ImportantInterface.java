package Interface;

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Write, commit, run");
    }
}

class Dekstop implements Computer{
    public void  code(){
        System.out.println("write, code, run :faster");
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}

public class ImportantInterface {
    public static void main(String[] args) {

        Computer lap =  new Laptop();
        Computer desk = new Dekstop();

        Developer abhi = new Developer();
        abhi.devApp(desk);

    }
}
