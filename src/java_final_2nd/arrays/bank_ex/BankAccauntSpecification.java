package java_final_2nd.arrays.bank_ex;

public interface BankAccauntSpecification {
    //deposit
    public void deposit(int amount);//입금액: 0이상 정수

    //withdraw (잔고가 있다면 출금 가능)
    //true, false로 출금 가능 여부를 반환
    public boolean withdraw(int amount);
}
