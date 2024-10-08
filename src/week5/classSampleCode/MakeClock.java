package week5.classSampleCode;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class MakeClock extends JPanel {
    int min = LocalTime.now().getMinute();
    int hour = LocalTime.now().getHour();
    int min_angle = 90-min*6;
    int hour_angle = 90-hour*30;

    public MakeClock() {
        JFrame f = new JFrame();
        f.setTitle("Circle");
        f.setVisible(true);
        f.setSize(300,300);
        f.getContentPane().add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0,0,300,300);
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100,100);
        g.setColor(Color.RED);
        g.fillArc(110,110,80,80,min_angle,5); // 분침
        g.setColor(Color.BLUE);
        g.fillArc(110, 110, 80,80,hour_angle,-8);
    }

    public static void main(String[] args) {
        new MakeClock();
    }
}
