package InterfaceQuestion;

import java.util.ArrayList;
import java.util.List;
interface PaymentPoly{
    void pay(double amount);
}
class UPIPolyPayment implements PaymentPoly{
    public void pay(double amount){
        System.out.println("received UPI payment of " + amount + "  .....Thank you!!");
    }
}
class CardPloyPayment implements PaymentPoly{
    public void pay(double amount){
        System.out.println("received card payment of " + amount + "  .....Thank you!!");
    }
}
class CashPolyPayment implements PaymentPoly{
    public void pay(double amount){
        System.out.println("received cash payment of "+ amount + "  ....Thank you!!");
    }
}
public class PaymentInterfacePolymorJQ {
    public static void main(String[] args) {
        List<PaymentPoly> payPoly = new ArrayList<PaymentPoly>();
        payPoly.add(new UPIPolyPayment());
        payPoly.add(new CardPloyPayment());
        payPoly.add(new CashPolyPayment());

        for (PaymentPoly p : payPoly){
            p.pay(200);
        }
    }
}
