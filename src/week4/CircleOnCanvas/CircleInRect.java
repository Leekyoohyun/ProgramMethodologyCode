package week4.CircleOnCanvas;

import javax.swing.*;
import java.awt.*;

public class CircleInRect extends JPanel {

    public CircleInRect() {
        JFrame frame = new JFrame();
        frame.setTitle("Circle In Rect");
        frame.setSize(300,200);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.white);
        g.drawRect(0, 50, 100, 50);
        g.setColor(Color.blue);
        g.fillOval(0, 50, 50, 50);
    }

    public static void main(String[] args) {
        new CircleInRect();
    }

}
