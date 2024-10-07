package week5.work2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GrowingEgg extends JPanel {
    private final int NET_SIZE = 400;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;

    public GrowingEgg() {
        JFrame f = new JFrame();
        f.setTitle("Egg");
        f.setSize(NET_SIZE, NET_SIZE);
        f.getContentPane().add(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 윈도우 활성화 이벤트 리스너 추가
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                // 알의 크기를 증가시킴
                egg_width += 60; // 너비 증가
                egg_height += 40; // 높이 증가
                x -= 30;
                y -= 20;
                repaint(); // paintComponent 메소드를 호출하여 다시 그리기
            }
        });
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(0,0,NET_SIZE,NET_SIZE);
        g.setColor(Color.yellow);
        g.fillOval(x+30,y+20,egg_width-60,egg_height-40);
    }

    public static void main(String[] args) {
        new GrowingEgg();
    }
}
