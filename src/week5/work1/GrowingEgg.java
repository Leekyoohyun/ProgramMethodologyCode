package week5.work1;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    private final int WIDTH=400;

    public GrowingEgg() {
        JFrame frame = new JFrame();
        frame.setTitle("Egg");
        frame.setSize(WIDTH, WIDTH);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        int ovalWidth = 60;
        int ovalHeight = 40;
        g.setColor(Color.green);
        g.fillRect(0,0,WIDTH,WIDTH);
        int x = (WIDTH-ovalWidth)/2;
        int y = (WIDTH-ovalHeight)/2;
        g.setColor(Color.yellow);
        g.fillOval(x,y,ovalWidth,ovalHeight);
    }

    public static void main(String[] args) {
        new GrowingEgg();
    }
}
