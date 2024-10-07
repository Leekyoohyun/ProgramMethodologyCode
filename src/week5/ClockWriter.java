package week5;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class ClockWriter extends JPanel {
    public ClockWriter() {
        int width = 200;
        JFrame frame = new JFrame();
        frame.setTitle("Clock");
        frame.setSize(width, width);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        int width = 200;
        g.setColor(Color.WHITE);
        g.fillRect(0,0,width, width);
        LocalTime now = LocalTime.now();
        int minutes_angle = 90 - now.getMinute()*6; //1분에 6도씩
        int hours_angle = 90 - now.getHour()*30;
        int x = 50;
        int y = 50;
        int diameter = 100;
        g.setColor(Color.BLACK);
        g.drawOval(x,y,diameter,diameter);

        g.setColor(Color.RED);
        g.fillArc(x+5, y+5, diameter - 10, diameter - 10,minutes_angle,5);
        g.setColor(Color.blue);
        g.fillArc(x+25, y+25, diameter-50, diameter-50, hours_angle, -8);

    }
    public static void main(String[] args) {
        new ClockWriter();
    }
}
