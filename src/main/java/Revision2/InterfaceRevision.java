package Revision2;

interface Payment{
    void paymentUPI();
    void paymentCash();
}

class Shopkeeper implements Payment{
    public void paymentCash(){
        System.out.println("Received cash payment");
    }

    public void paymentUPI(){
        System.out.println("Received UPI payment");
    }
}

public class InterfaceRevision {
    public static void main(String[] args) {
        Shopkeeper shop = new Shopkeeper();
        shop.paymentCash();
        shop.paymentUPI();
    }
}
