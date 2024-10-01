package week4.CircleOnCanvas;

import javax.swing.*;
import java.awt.*;

public class CircleInRect extends JFrame {

    public CircleInRect() {
        JFrame frame = new JFrame();
        frame.setTitle("Circle In Rect");
        frame.setSize(500, 400);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 400);
        g.setColor(Color.red);
        g.drawRect(250, 200, 100, 50);
        g.setColor(Color.blue);
        g.fillOval(250, 200, 50, 50);
    }

    public static void main(String[] args) {
        new CircleInRect();
    }

}
