package org.example;

class G{
    public G(){
        System.out.println("In G");
    }
    public G(int n){
        System.out.println("In G : int");
    }
}

class H extends G{
    public H(){
        super();
        System.out.println("In H");
    }
    public H(int n){
        this();
        System.out.println("In H : int");
    }
}

public class SuperAndThisMet {
    public static void main(String[] args) {

        H desi = new H(5);

    }
}
