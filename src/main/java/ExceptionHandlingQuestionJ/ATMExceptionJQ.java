package ExceptionHandlingQuestionJ;

class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String string){
        super(string);
    }
}

class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String string){
        super(string);
    }
}

class ATM{
    private double balance;
    public void setAmount(double balance){
        this.balance = balance;
    }

    public double checkBalance(){
        return balance;
    }

    public double withdraw(double amount){
        if(amount < 0){
            throw new InvalidAmountException("Please enter valid amount");
        }
        if(balance < amount){
            throw new InsufficientBalanceException("Don't have enough balance in your account");
        }
        balance = balance - amount;
        return amount;
    }

    public double deposite(double amount){
        if(amount < 0){
            throw new InvalidAmountException("Please enter correct amount to deposite");
        }
        balance = balance + amount;
        return amount;
    }
}

public class ATMExceptionJQ {
    public static void main(String[] args) {
        ATM newCustomer = new ATM();
        newCustomer.setAmount(5000);

        try {
            double amount = newCustomer.deposite(-700);
            System.out.println("Desposite amount is "+ amount +" and your update balance is " + newCustomer.checkBalance());
        } catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        try {
            double amount = newCustomer.withdraw(10000);
            System.out.println("You'r withdrawal amount is "+ amount + " and your current balance is " + newCustomer.checkBalance());
        } catch (InsufficientBalanceException | InvalidAmountException e){
            System.out.println(e.getMessage());
        }
    }
}
