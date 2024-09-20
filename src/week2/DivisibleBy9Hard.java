package week2;

import javax.swing.*;

public class DivisibleBy9Hard {
    public static void main(String[] args) {
        String message = "정수를 주세요.";
        String input = JOptionPane.showInputDialog(message);
        int n = Integer.parseInt(input);
        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;
        int d = (n/1000)%10;
        int e = n/10000;

        boolean result = ((a+b+c+d+e)%9 ==0);

        JOptionPane.showMessageDialog(null, "정수 "+n+" 은(는) 9로 나누어 떨어지나? "+result);
    }
}
