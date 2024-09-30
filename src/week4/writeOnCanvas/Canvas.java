package week4.writeOnCanvas;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas");
        frame.setSize(300,200);
        frame.getContentPane().add(this); //객체 자신을 가리키는 이름
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.drawString("HEY",100,60);
    }

    public static void main(String[] args) {
        new Canvas();
    }
}
