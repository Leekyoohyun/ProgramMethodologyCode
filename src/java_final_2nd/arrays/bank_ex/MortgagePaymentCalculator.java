package java_final_2nd.arrays.bank_ex;

public class MortgagePaymentCalculator implements BankAccauntSpecification {
    private int balance;
    private int interestRate;
    private int monthlyPayment;

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
