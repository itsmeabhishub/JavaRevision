package ExceptionHandlingQuestionJ;

class BankAccount{
    private double balance;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Please enter amount in positive value");
        }
        balance = balance + amount;
        return balance;
    }
    public double withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("Amount is not present in account");
        }
        balance = balance - amount;
        return balance;
    }
}

public class BankAccountJQ {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount();
        customer.setBalance(10000.09);
        try {
            customer.deposit(-750);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            customer.withdraw(50000);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        double c = customer.getBalance();
        System.out.println(c);
    }
}
