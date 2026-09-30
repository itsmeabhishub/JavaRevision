package InterfaceQuestion;

interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();

    default void bankInfo(){
        System.out.println("Welcome to bank");
    }
}

class SBI implements Bank{
    double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}

class HDFC implements Bank{
    double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
}

public class BankInterfaceJQ {
    public static void main(String[] args) {
        Bank customer;
        customer = new SBI();
        customer.bankInfo();
        customer.deposit(7000);
        customer.withdraw(3500);
        System.out.println("SBI Bank "+customer.getBalance());


        customer = new HDFC();
        customer.deposit(8000);
        customer.withdraw(4500);
        System.out.println("HDFC Bank " + customer.getBalance());
    }
}
