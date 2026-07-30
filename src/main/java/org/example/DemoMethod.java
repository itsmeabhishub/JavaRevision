package org.example;

class Computer {

    public void music() {
        System.out.println("Playing Music");
    }

    public String getMePen(int cost) {
        if (cost >= 10)
            return "Pen";
        return "nothing";

    }
}

public class DemoMethod {
    public static void main(String[] args) {

        Computer comp = new Computer();

        comp.music();
        String res = comp.getMePen(0);

        System.out.print(res);

    }
}
