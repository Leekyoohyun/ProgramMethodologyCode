package mid_reviews.chap4.clock;

import javax.swing.*;
import java.awt.*;

public class ClockWriter extends JPanel {

    public ClockWriter() {
        JFrame f = new JFrame();
        f.setTitle("Clock");
        f.setSize(300,400);
        f.setVisible(true);
        f.getContentPane().add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Hello", 0, 200);
    }

    public static void main(String[] args) {
        new ClockWriter();
    }
}

