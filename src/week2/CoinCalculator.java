package week2;

public class CoinCalculator {
    public static void main(String[] args) {
        int quarters = 9;
        int dimes = 2;
        int nickels = 0;
        int pennies = 6;
        int sum = quarters*25+dimes*10+nickels*5+pennies*1;
        int dollar = sum/100;
        int cent = sum%100;
        System.out.println("$"+ dollar+"."+cent);
        // 문자 이어붙이기 + 연산자 중복 사용 overloading
    }
}
