package week5.resultCode1;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    public GrowingEgg() {
        JFrame f = new JFrame();
        f.getContentPane().add(this);   //Contents 영역에 추가
        f.setTitle("Egg");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  //종료 방법 지정
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 400,400);
        g.setColor(Color.YELLOW);
        g.fillOval(170, 180, 60, 40);
    }

    public static void main(String[] args) {
        new GrowingEgg();
    }
}
