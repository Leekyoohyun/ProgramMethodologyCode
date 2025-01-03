package week6.bank;

import javax.swing.*;

public class BankAccount {
    private int balance;

    /* 계좌계설
    * @param initial_amount - 초기 입금금액(0 이상)
     */
    public BankAccount(int initial_amount){
        if(initial_amount >= 0)
            balance = initial_amount;
        else balance = 0;
    }

    /* deposit - 입금
    * @param amount = 입금액
    * @return 입금 성공하면 true, 실패하면 false
     */
    public boolean deposit(int amount) {
        boolean result = false;
        if (amount >= 0) {
            balance += amount;
            result = true;
        } else
            JOptionPane.showMessageDialog(null, "입금액에 문제가 있어서 입금취소");
        return result;
    }

    /* withdraw - 출금(잔고가 있는 경우에만)
     * @param amount = 출금액
     * @return 출금 성공하면 true, 실패하면 false
     */
    public boolean withdraw(int amount) {
        boolean result = false;
        if(amount < 0) {
            JOptionPane.showMessageDialog(null,"입금액에 문제가 있어서 출금이 취소됨");
        }else if(amount > balance){
            JOptionPane.showMessageDialog(null,"출금액이 잔고액보다 많아서 출금이 취소됨");
        }else{
            balance -= amount;
            result = true;
        }
        return result;
    }

    /*
    getBalance - 잔액 확인
    * @return 잔액
     */
    public int getBalance() {
        return balance;
    }

}
