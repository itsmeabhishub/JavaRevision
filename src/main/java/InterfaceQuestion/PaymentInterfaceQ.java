package InterfaceQuestion;

interface Payment{
    void pay(double amount);
}

class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid through upi amount is : " + amount);
    }
}

class  CreditCard implements Payment{
    public void  pay(double amount){
        System.out.println("Paid through credit card amount is " + amount);
    }
}

public class PaymentInterfaceQ {
    public static void main(String[] args) {
        UPIPayment upiPay = new UPIPayment();
        CreditCard credPay = new CreditCard();
        upiPay.pay(97);
        credPay.pay(977.98);
    }
}
