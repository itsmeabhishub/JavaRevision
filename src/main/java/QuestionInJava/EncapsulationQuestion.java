package QuestionInJava;

class BankAccount{
    private int accountNumber;
    private String holderName;
    private int checkBalance;



    public void deposite(int balance){
        checkBalance = checkBalance+ balance;
    }
    public String withdrawMoney(int money){
        if(checkBalance>= money) {
            checkBalance = checkBalance - money;
            return "Money debited";
        } else {
            return "Money not sufficient";
        }
    }
    public int getCheckBalance(){
        return checkBalance;
    }

}

public class EncapsulationQuestion {

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.deposite(500);
        obj.withdrawMoney(250);
        int s = obj.getCheckBalance();
        System.out.println(s);

    }
}
