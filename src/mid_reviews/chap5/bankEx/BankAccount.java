package mid_reviews.chap5.bankEx;

public class BankAccount {
    //Model
    private int balance;

    public BankAccount(int initialAmount){
        if(initialAmount >= 0){
            balance = initialAmount;
        }else {
            balance = 0;
        }
    }

    boolean deposit(int amount) {
        return false;
    }

    boolean withdraw(int amount) {
        return false;
    }

    int getBalance(){
        return 0;
    }
}
