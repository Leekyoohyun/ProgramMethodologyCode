package mid_reviews.chap2;

import javax.swing.*;

public class Mi2Km {
    public static void main(String[] args) {
        String message = "거리가 몇 마일입니까?";
        String input = JOptionPane.showInputDialog(null, message);
        int mile = Integer.parseInt(input);
        double km = mile * 1.60934;
        JOptionPane.showMessageDialog(null, mile+" 마일은 "+String.format("%.1f",km)+"킬로미터 입니다.");
    }

}
