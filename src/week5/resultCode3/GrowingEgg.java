package week5.resultCode3;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    private int net_size;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x;
    private int y;

    public GrowingEgg(int frame_size) {
        this.net_size = frame_size;
        this.x += this.net_size/2 -30;
        this.y += this.net_size/2 -20;
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setTitle("Egg");
        f.setSize(this.net_size, this.net_size);
        f.getContentPane().add(this);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0,0,this.net_size,this.net_size);
        g.setColor(Color.YELLOW);
        g.fillOval(this.x, this.y, egg_width, egg_height);
        egg_width += 60;
        egg_height += 40;
        this.x -= 30;
        this.y -= 20;

    }


    public static void main(String[] args) {
        new GrowingEgg(600);
    }
}
