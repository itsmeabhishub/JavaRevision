package InterfaceQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface PaymentList{
    void pay();
}

class UPIL implements PaymentList{
    public void pay() {
        System.out.println("UPI payment successful");
    }
}

class CardPaymentL implements PaymentList{
    public void pay() {
        System.out.println("Card payment successful");
    }
}

class CashPaymentL implements PaymentList{
    public void pay() {
        System.out.println("Cash payment successful");
    }
}

public class PaymentListInterfaceJQ {
    public static void main(String[] args) {
        List<PaymentList> np = new ArrayList<PaymentList>();
        np.add(new UPIL());
        np.add(new CardPaymentL());
        np.add(new CashPaymentL());

        for(PaymentList n : np){
            n.pay();
        }
    }
}
