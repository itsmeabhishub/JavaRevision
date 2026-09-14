package QuestionInJava;
interface Payment{
    void pay(double amount);
}
class UPIPayment implements Payment{
    public void pay(double amount){
        System.out.println(amount +" Pay through UPI");
    }
}
class CreditCardPayment implements Payment{
    public void pay(double amount) {
        System.out.println(amount + " Paid through card");
    }
}
class CashPayment implements Payment{
    public void pay(double amount) {
        System.out.println(amount + " Paid through cash");
    }
}
public class InterFaceQ {
    public static void main(String[] args) {
        Payment payment;
        payment = new CashPayment();
        payment.pay(99);
        payment = new CreditCardPayment();
        payment.pay(77);
        payment = new UPIPayment();
        payment.pay(88);
    }
}
