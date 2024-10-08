package week5.resultCode2;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    private final int NET_SIZE = 400;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;


    public GrowingEgg(){
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Egg");
        f.setSize(NET_SIZE, NET_SIZE);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 종료 액션
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(0,0,NET_SIZE,NET_SIZE);
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,egg_width,egg_height);
        egg_width += 60;
        x -=30;
        egg_height += 40;
        y -= 20;
    }


    public static void main(String[] args) {
        new GrowingEgg();
    }
}
