package org.example;

class MobileD{
    String MobileBrand12;
    int paisa;
    static String TypePhne;

    static {
        TypePhne="nonDesi";
        System.out.println("Static block");
    }
    public MobileD(){
        MobileBrand12="";
        paisa=120;
        System.out.println("Non-static block");
    }

    public void DemoMethod(){
        System.out.println(MobileBrand12 + " " + paisa + " " + TypePhne) ;
    }
}

public class StaticBlock {
    public static void main(String[] args) {

        MobileD newTest = new MobileD();
        newTest.MobileBrand12="Sung";
        newTest.paisa=120;
        newTest.TypePhne="desi";

        MobileD newTest2 = new MobileD();

    }
}
