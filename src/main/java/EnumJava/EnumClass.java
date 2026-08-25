package EnumJava;

enum Laptop {
    Macbook(2000), DellIs(1500), Surface, ThinkPad(1800);

    private int price;

    private Laptop(){
    }

    private Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }


}

public class EnumClass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;

        System.out.println(lap + " : "+lap.getPrice());


        for (Laptop lap1 : Laptop.values()){
            System.out.println(lap1 + " : " + lap1.getPrice());
        }

    }
}
