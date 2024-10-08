package week5.classSampleCode;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas");
        frame.setSize(300,200);
        frame.getContentPane().add(this); // 자기자신(this)를 Canvas에 집어넣어라
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g); 상속받았다?
        g.setColor(Color.BLACK);
        g.drawString("Java!", 100, 60);
    }

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        Canvas c = new Canvas();
    }
}
