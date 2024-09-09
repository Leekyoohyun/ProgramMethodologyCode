import javax.swing.*;

public class DivisibleBy9 {
    public static void main(String[] args) {
        String message = "정수를 주세요.";
        String input = JOptionPane.showInputDialog(message);
        boolean result = Integer.parseInt(input)%9 ==0;
        JOptionPane.showMessageDialog(null, "정수 "+input+" 은(는) 9로 나누어 떨어지나?"+result);


    }
}
