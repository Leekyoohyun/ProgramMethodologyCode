package week5.work3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GrowingEgg extends JPanel {
    private int net_size;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x;
    private int y;

    public GrowingEgg(int frame_size) { // 인풋 받음
        this.net_size = frame_size;
        this.x = (net_size-egg_width)/2;
        this.y = (net_size-egg_height)/2;

        JFrame f = new JFrame();
        f.setTitle("Egg");
        f.setSize(net_size, net_size);
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
                x = (net_size-egg_width)/2;
                y = (net_size-egg_height)/2;
                repaint(); // paintComponent 메소드를 호출하여 다시 그리기
            }
        });
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(0,0,net_size,net_size);
        g.setColor(Color.yellow);
        g.fillOval(x+30,y+20,egg_width-60,egg_height-40);
    }

    public static void main(String[] args) {
        new GrowingEgg(600); // 여기서 NET_SIZE 입력받는다.
    }
}
