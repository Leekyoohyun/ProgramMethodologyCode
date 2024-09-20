package week2;

import javax.swing.*;

public class Mi2Km {
    public static void main(String[] args) {
        String mile = JOptionPane.showInputDialog("거리가 몇 마일입니까?");

        double km = Double.parseDouble(mile)*1.60934;

        JOptionPane.showMessageDialog(null,mile+" 마일은 "+String.format("%.1f",km)+" 킬로미터 입니다.");
    }
}
