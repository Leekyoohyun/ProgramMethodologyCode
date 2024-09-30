package week4.CircleOnCanvas;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Circle In Rectangle");
        frame.setSize(300,200);
        frame.getContentPane().add(this); //객체 자신을 가리키는 이름
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,300,200);
        g.setColor(Color.red);
        g.drawRect(100,60,90,60);
        g.fillOval(100,60,50,50);
    }

    public static void main(String[] args) {
        new Canvas();
    }
}
