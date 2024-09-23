package week3.temparature;

import javax.swing.*;

public class View {
    double getTemperature() {
        String message = "섭씨 온도를 정수로 입력하세요";
        String input = JOptionPane.showInputDialog(null, message);
        double c = Double.parseDouble(input);
        return c;
    }

    void showTemperature(double c, double f){
        JOptionPane.showMessageDialog(null, "섭씨 온도 "+c+"는");
        JOptionPane.showMessageDialog(null, "화씨로 "+f+"도 입니다.");
    }
}
